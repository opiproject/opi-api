# OPI Networking Workshop 1 - 9/19/2023

Recording at: <https://zoom.us/rec/share/Z5yU8gqCX_7Y49aDHKu7HpE-QuwPql8QoFifpwAh61cF__JYcrdJaeFd2Wg2lgou.Vn8ZBNGp1s5n5YXH>

Notes:

Utilized the Agenda as a collection point for key areas to discuss.

- Agenda for Workshop Meeting (Planned 9/19/23 from 8:00 - 10:00am PT)
  - > What is the Approach for the Networking API Protobuf definitions?
    - > Goal is to utilize existing standards as a reference model to create a common API model
      - > What are the behaviors that we need?
      - > How do we utilize them?
      - > What is leveraged from existing and define the new?
  - > APIs are connecting into the control that is running on the DPU/IPU
    - > Ability to present VFs to the host.
  - Key Use Cases (and Config Parameters)
    - Basic Networking
      - Port/Interface
        - > Physical
        - > Virtual
      - VLAN
      - Routing
        - > Physical Switching and Routing
          - > LAG
          - > ECMP
          - > Multipath
        - > Virtual Switching and Routing
      - QoS
      - Access Control (ACL)
      - Tunnel Encap/Decap
        - > VXLAN
        - > IPSec
        - > Geneve
    - Cloud Configuration
    - EVPN Configuration
    - Security (IPSec)
    - > K8s Networking (L3 Routing, Load Balancing, Policy)
    - > Accelerators
  - Architecture View (**Granularity of parameters that are exposed?**)
    - Northbound Interface (gRPC)
      - > Models for the calling on Northbound IF (Event, Stream, ...) - Guidance for the options in the API
        - > Normal Operation Guidance
        - > Maintenance Guidance
        - > Support/Debug Guidance
    - Southbound Interface (Hardware Facing)
    - Interface Layers
      - IPDK - implementation of the behaviors
      - DPDK
      - DOCA - implementation of the behaviors
      - TDI
      - P4 TC
      - RTE-flow
      - etc.
  - Interface Configuration/Parameter Alignment
    - Netlink
    - CNI
    - OpenConfig
    - OVS
    - SAI
    - etc.
  - Counters and Statistics Gathering

Examination of the Behavior question "What are the behaviors that we need?", we identified the following:

1. Look like a NIC for the parameters
    1. MTU
    2. RMON
    3. Netdev/netlink
2. Look like a virtual switch/router for setting traffic flows
    1. Openconfig
    2. OVS/SONiC+DASH/OVN
    3. Linux Bridge/VRF
    4. EVPN
    5. Cloud
    6. K8s - Calico (Dataplane API), OpenShift
3. Link Redundancy
   1. LAG
   2. ECMP
4. Load Balancing/NAT
5. Present VFs to the Host Infrastructure
6. Policy
   1. QoS
      1. Rate Limiting
      2. Policing
      3. Scheduling
   2. Security Groups
   3. K8s Policy
   4. IP Tables
7. Tunneling
   1. VXLAN
   2. IPSec
   3. VLAN
   4. Geneve

Other important aspects to track:

- From a K8s perspectinve we need to insure that both NIC role and Switch role are addressed.
- We need to keep service chaining in mind as we interconnect network driven capabilities.

In order to begin addressing the Networking behaviors and parameters that are required in the API we need to identify the key use cases that are needed.

## Use Cases

- Tunnel Gateway
- IaaS (OVN)
- K8s
  - Offload K8s
  - Offload Secondary Network
- Security
  - Firewall Offload
- TLS Offload/Termination/Policy
- EVPN Gateway
- Cloud

### We need to identify the priority for the use cases to align in the API

We can't do all of the use cases and behaviors at the same time so we need to look at how to prioritize the efforts based on the interest from customers who are looking for solutions.

Currently we have EVPN Gateway use case underway.
Indicated high interest in TLS Offload & Termination and Tunnel Gateway solutions.
