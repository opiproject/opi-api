# Open Programmable Infrastructure API and Behavioral Model Group

---
Minutes 4/07/2022

Attendees: Mark Sanders, Gene Bagwell, Venkat Pullela, Yuval Caduri, Wayne Hineman, Shafiq Abedin, Navad Haklai, R Sarma Burugula, Ted Streete, Satananda Burla, Jerin Jacob Kollanukkaran, Kyle Mestery, Fabrizio D’Angelo, Venkatesan Mahalingam, Tim Michels, Boris Glimcher, Matthew Jean, Stefan Chulski

Agenda:

- Update on GitHub location <https://github.com/opiproject/opi-api>
  - Re-setting the github tie-ins for notifications to the Slack channel
- DPDK Interface walk-through – Jerin Jacob Kollanukkaran (Marvell)

Notes:

- DataPlane Workload Acceleration (DWA) in DPDK.
  - This was pushed to the DPDK as the recommended proposal by Marvell.  Will upload the deck as reference material

- Prioritization of the specific APIs
  - Networking basis – Utilize OpenConfig mechanisms?
  - Security with the Firewall Use Case
  - Storage capabilities – Boris, can you provide some configuration thoughts around primitives
  - AI/ML – High level ideas around the configuration – Stefan is this something that you can contribute toward
- Infrastructure needs to be the first step in the API definition.
  - Payload will vary
  - User Plane API definition – Async in nature
    - Packet delivery into Buffer and have a memory delivery mechanism.  Minimize the memory copy method as possible.
    - VF/PF path for data transfer and mechanism
    - gRPC may be used for some capabilities; but, needs to be examined for specific cases vs others to improve
  - Control Plane API definition – gRPC
- Examine the options for transport on the Control Plane and Data/User Plane
  - Control Plane traffic requirements
    - gRPC
    - Configuration requirements
  - Data/User Plane traffic requirements
    - Requirements for the Data/User Plane
      - Request / Response Structure
      - DMA mechanism?
      - TLV?
    - Vendor specifics on the data movement of the data-plane traffic may be the deciding factor as it may be different between vendors that feed into the Data plane traffic

Upcoming Meeting Topics:

- TBD

---
Minutes 4/21/2022

Attendees:  Mark Sanders, Dan Daly, Ted Streete, Boris Glimcher, Jerin Jacob Kollanukkaran, Steven Royer, Venkatesan Mahalingam, Umesh Deshpande, Tim Michels, Shafiq Abedin, Fabrizio D’Angelo, Matthew Jean, Venkat Pullela

Agenda

- General Updates
- Discuss where we can begin to prototype a base API – Networking Support using OpenConfig?
- Discussion on Storage API

Notes:

- Define the OpenConfig areas that need to configure.
- Define a Use case that we can use for the basis to align toward.
  - Application based (OpenStack Ironic, Tinkerbell, Smart Fabric Director)

- Security Models are important across the APIs

- Storage API
  - Model Perspective
    - Host Facing Interfaces
      - How to configure Emulated Devices?  NVMe Target/VirtIO Block.
    - Networking Facing Interfaces
      - NVMe over whatever
      - Connecting to external Storage
        - IP, Port, Subsystem names, Namespaces, IPSec, TLS
    - Storage Services on DPU
      - How we interconnect the Host Facing to Network Facing Devices?
      - Bridging the virtual to the network hashing, compression, resiliency.
  - Similarity to the Kubernetes CSI model
    - CSI and Cinder as an example
    - gRPC with Protobuf, GraphQL
  - Security Checking and Services
    - Have an East-West configuration for the untrusted host and have a proxy mechanism

  - Configuration APIs vs Dataplane (Consumption) APIs
    - Dataplane APIs will have the chaining paths in the flow of traffic

  - Define the API information independent of the transport.  The transport can be SMA, gRPC, GraphQL, etc.

  - Virtual Device information of IPDK reference:  <https://ipdk.io/documentation/Interfaces/TargetAbstraction/>
  - We need to handle different device mechanisms for Networking, Storage, etc.

Actions:

- Define a Use Case that is Application Based such as OpenStack Ironic, Tinkerbell, Smart Fabric Director that we can use as a basis to begin prototyping a Network case.
- Define a Virtual Storage Device use case for the Storage API basis build an API framework. – Boris will post a PR for review and discussion.

Upcoming Meeting Topics:

- Trust Model in D/IPU and how it relates to the Root of Trust on the Host (Crosses over into Provisioning and Management possibly)
- Others

---
Minutes 4/28/2022

Attendees:  Mark Sanders, Boris Glimcher, Wayne Hineman, Steven Royer, Liron Himi, Shafiq Abedin, Fabrizio D’Angelo, Jerin Jacob Kollanukkaran, Kyle Mestery, Ted Streete, R Sarma Burugula, Matthew Jean, Michal Kalderon, Navad Haklai, Satananda Burla, Senthil Kumar Ganesan, Tim Michels, Yuval Caduri, Dan Daly

Agenda:

- General Updates
- Use Case Initial Discussion

Notes:

- Use Case Discussion
  - Virtualized Network (OVS) with Security Groups (VxLAN / Geneve) topology
    - OVN or Kubernetes type of infrastructure
    - Virtual Routing
  - Start with a software based solution first with 2 servers, KVM, etc.
  - Base Use case agreed to on two physical servers (example redhat blog) <https://www.redhat.com/en/blog/optimizing-server-utilization-datacenters-offloading-network-functions-nvidia-bluefield-2-dpus>
  - Begin working the Diagram for the base use case
  - Begin with Configuration API
  - DataPlane (Consumption) API
    - Use of different models like virt-io, nvme, other models.
    - Present specific device functions to the host can be vendor specific
    - Can we standardize the device data models?
    - Abstract the interface with port/device information
  - Develop initial diagram for review in Draw.io <https://app.diagrams.net/>
  - Use to begin concept creation to identify any gaps in OpenConfig (ex. Virtual Switching gaps)

Actions:

- Dan Daly (Intel) to provide initial view of Use case Diagram to the github site.
- Fabrizio provided RHEL files for OCP concept and config
- Intel, Marvell to provide device data model views for Dataplane/Consumption Interface
- Michal Kalderon agreed to upload the Marvell scripts

Upcoming Topics:

- Review Use Case concept diagram
