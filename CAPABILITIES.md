# API Capabilities and Requirements

## Desired (Must Have) Capabilities

- Define a common northbound APIs between client controllers (e.g., Provisioner/Orchestrator, K8s CNI/CSI, Ansible/Terraform, etc.) and DPU, which allows the client controllers to support multi-vendor DPUs with no/minimal change
- Provide the following high level features:
  - Network
    - Provision VPC
      - VLAN, VXLAN, BGP/EVPN, ...
    - Provision vNIC
      - Static or Dynamic vNICs, SR-IOV, S-IOV, IPAM, Routing, ...
    - Configure Physical Ports
    - Configure Stateful Firewall (ACL)
    - Configure Load-Balancer
  - Storage
    - Configure NVMe-of connection to storage target
    - Provision NVMe/PCIe volumes
  - Security
    - Provision IPSec, MACSec
    - Provision TLS/kTLS
- Define a common run-time API for additional applications to run on the DPU

## Application API Requirements

Application API requirements center around the ability to provide service chaining for the capabilities leveraged in the DPU devices.  Service chains can consist of:

- A firewall application that resides between the network service and the host compute where you have
  - physical port <--> network service <--> firewall <--> vf/pf <--> VM/Container

### Background

For network applications such as firewalls and load balancers to use DPUs there needs to be significant performanance benefits. Therefore this set of requriements focuses on the areas that require a significant amount of x86 CPU for these type of applications. Ideally the performance improvemenst should be in the range of at least one order of magnitude as there is both a CAPEX and OPEX costs for the end customers.

### SSL Acceleration

As more and more traffic is SSL/TLS encrypted more network applications need to encrypt and decrypt SSL/TLS streams. This is significant load on the CPU of the host. The ability of DPUs to encrypt/decrypt in-line is a significant advantage. In addition the ability to support a wide range of algorithims is required and the ability to achieve various levels of federal standards is also important. To perform the encrypt/decrypt operations the ability to securely manage public and private keys is required.

### IPSec Acceleration

Several application areas use IPSec to encrypt communication channels, 4/5G, SDWAN, etc. IPSec puts a significant load on the CPU of the host. The ability of the DPUs to encrypt/decrypt in-line is a significant advantage. In addition the ability to support a wide range of algorithims is required and the ability to achieve various levels of federal standards is also important. To perform the encrypt/decrypt operations the ability to securely manage public and private keys is required.

One of the challenges of IPSec is interoperatiblity between end points as they can frequenctly be from different vendors.

### DPI Acceleration

Application and threat identification relies heavily on DPI, so any support the DPU brings is an advantage to network applications. As applications and threats are constantly being added and updated it is important that the DPU infrastructure takes into account the lifecycle of the DPI engine to enable as close as possible realtime updates with minimal disruption on the traffic being inspected. So it is not sufficient to just have a common API there also needs to be a common REGEX language to define the applications and threats.

### Network Processing

The embedded switch on the DPU is performing packet processing up to L4. If this information could be efficiently shared with the application it would remove this work from the host CPU and hence accelerate the overall application. This is also very useful to do hairpin offloading of traffic.
