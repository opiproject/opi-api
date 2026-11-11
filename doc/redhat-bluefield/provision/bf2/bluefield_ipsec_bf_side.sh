#!/usr/bin/env bash
set -euo pipefail

if [[ ! "${IPROUTE2_COMMIT:-}" =~ ^[[:xdigit:]]{40}$ ]]; then
    echo "Set IPROUTE2_COMMIT to a full commit ID obtained from a trusted source." >&2
    exit 2
fi

ovs-vsctl --if-exists del-br hostpf0
dnf --setopt=gpgcheck=1 --setopt='*.gpgcheck=1' --setopt=localpkg_gpgcheck=1 install -y iproute-tc
dnf --setopt=gpgcheck=1 --setopt='*.gpgcheck=1' --setopt=localpkg_gpgcheck=1 install -y NetworkManager-config-server
rm -f /var/run/NetworkManager/system-connections/*
systemctl restart NetworkManager

dnf --setopt=gpgcheck=1 --setopt='*.gpgcheck=1' --setopt=localpkg_gpgcheck=1 install -y libmnl-devel
env -u GIT_SSL_NO_VERIFY git -c http.sslVerify=true clone --no-checkout https://github.com/huynguyen85/iproute2
cd iproute2
git checkout --detach "$IPROUTE2_COMMIT"
make -j20
make -j20 install

cp /usr/bin/connectx_eswitch_mode_config.sh{,.orig}
head -n -1 /usr/bin/connectx_eswitch_mode_config.sh > /tmp/a.sh
echo "devlink dev eswitch set pci/\${pdev} ipsec-mode full" >> /tmp/a.sh
tail -n 1 /usr/bin/connectx_eswitch_mode_config.sh >> /tmp/a.sh
mv /tmp/a.sh /usr/bin/connectx_eswitch_mode_config.sh

devlink dev eswitch set  pci/0000:03:00.0 mode legacy
devlink dev eswitch set  pci/0000:03:00.0 ipsec-mode full
devlink dev eswitch set  pci/0000:03:00.0 mode switchdev
devlink dev eswitch show pci/0000:03:00.0
