#!/usr/bin/env bash
set -euo pipefail
#
# This assumes 'bluefield_provision.sh' has already been run.

BASE_URL="${BLUEFIELD_KERNEL_BASE_URL:-https://file.rdu.redhat.com/~bnemeth/poc_kernel}"
if [[ ! "$BASE_URL" =~ ^https://[a-zA-Z0-9._:/~%+-]+$ ]]; then
	echo "BLUEFIELD_KERNEL_BASE_URL must be an HTTPS URL without shell metacharacters." >&2
	exit 2
fi
VER=4.18.0-287.el8.bz1926098.bf2.poc.v2.dt3.aarch64

SUBNET="172.31.100"
if [ ! -f bluefield_key ]; then
	ssh-keygen -t rsa -N "" -f bluefield_key
fi

for I in $(seq 10 20); do
	ping -w 1 ${SUBNET}.${I} >/dev/null 2>&1 || continue

	sed -i "/${SUBNET}.${I}/d" .ssh/known_hosts
	ssh-keyscan ${SUBNET}.${I} >> .ssh/known_hosts

	ssh-copy-id -i bluefield_key root@${SUBNET}.${I}

	ssh root@${SUBNET}.${I} -i bluefield_key 'bash -s' < ./ovs_install.sh

	# FIXME: This should be a separate script as it's preparing the host.
	#
	# create VFs
	BF2_PORT1=$(lshw -class network -businfo |grep "BlueField-2" |sort |head -n 1 |awk '{print $2}')
	bash ./vf_setup.sh ${BF2_PORT1} 0
	bash ./vf_setup.sh ${BF2_PORT1} 5

	HOST_PFr=$(ssh root@${SUBNET}.${I} 'ip -d link |grep -B 1 "portname pf0 " |head -n 1 |awk "{print \$2}" |tr -d :')
	ssh root@${SUBNET}.${I} -i bluefield_key ovs-vsctl --if-exists del-br hostpf0 || true
	ssh root@${SUBNET}.${I} -i bluefield_key ovs-vsctl add-br hostpf0
	ssh root@${SUBNET}.${I} -i bluefield_key ovs-vsctl add-port hostpf0 ${HOST_PFr}
	ssh root@${SUBNET}.${I} -i bluefield_key ovs-vsctl add-port hostpf0 p0

	ssh root@${SUBNET}.${I} -i bluefield_key 'echo "ip link set '${HOST_PFr}' up" >> /etc/rc.local'
	ssh root@${SUBNET}.${I} -i bluefield_key 'echo "ip link set p0 up" >> /etc/rc.local'

	# install libreswan on BF2
	ssh root@${SUBNET}.${I} -i bluefield_key dnf --assumeyes \
	                            --setopt=gpgcheck=1 --setopt='*.gpgcheck=1' --setopt=localpkg_gpgcheck=1 \
	                            --setopt=rhel84-baseos.gpgcheck=1 --setopt=rhel84-appstream.gpgcheck=1 \
	                            --repofrompath "rhel84-baseos,https://download.eng.bos.redhat.com/nightly/rhel-8/RHEL-8/latest-RHEL-8.4/compose/BaseOS/aarch64/os/" \
	                            --repofrompath "rhel84-appstream,https://download.eng.bos.redhat.com/nightly/rhel-8/RHEL-8/latest-RHEL-8.4/compose/AppStream/aarch64/os/" \
	                            install libreswan

	# Custom kernel packages must be signed by a key trusted on the target.
	ssh root@${SUBNET}.${I} -i bluefield_key dnf --setopt=gpgcheck=1 --setopt='*.gpgcheck=1' --setopt=localpkg_gpgcheck=1 install -y $BASE_URL/kernel-$VER.rpm \
                               $BASE_URL/kernel-core-$VER.rpm \
							   $BASE_URL/kernel-devel-$VER.rpm \
							   $BASE_URL/kernel-modules-$VER.rpm \
							   $BASE_URL/kernel-modules-extra-$VER.rpm \
							   $BASE_URL/kernel-modules-internal-$VER.rpm
done

# must reboot cards due to new kernel
sh ./reboot_bf.sh
