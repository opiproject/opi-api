# Open Programmable Infrastructure API and Behavioral Model Group

---
Minutes 5/05/2022

Attendees: Mark Sanders, Steven Royer, Wayne Hineman, Raja Kommula, Dan Daly, Patty Driever, Umesh Deshpande, Ted Streete, Satananda Burla, Venkat Pullela, Kyle Mestery, R Sarma Burugula, Shafiq Abedin

Agenda:

- Review Use Case Concept Diagram

Diagrams discussed:
These diagrams are editable by importing into draw.io

Use Case Diagram
![Use Case Diagram](../images/API-Network-Use-Case.png)

High Level Diagram
![High Level View](../images/High-Level.png)

Notes:

- Include the security construct around the services/containers
  - Put a security wrapper around the Control Plane aspect.  The Control plane can be any control aspect such as Networking, Storage, Crypto, etc. functionality.
- Identity Management controls on the security.
- P4 Portable NIC architecture inclusion and review in the context of the frameworks for the API and translation aspects.
- Define a model of Service Chaining for the Infrastructure
  - A line of functions that are sequenced in the flow of the pipeline that goes from the CPU VF to the Network interface processing. – “flow sequence”
  - Sequencing the Data Path – “Data flow sequencing”
  - Independent Control Planes – “Control sequencing”
- ONF Generic gRPC server that was part of Stratum that may be leveraged.  This is open sourced.
- Table driven approach for the primitive definitions with the models of the functionality.
- Translation layer as part of the management block that would move the schema to a table driven interface toward the control plane aspects.

Actions:

- Diagram updates for the draw.io from the meeting are included.
- Build out Generic gRPC server basis.

Upcoming Topics:

- Lifecycle Management API discussion
- Security, Attestation API discussion

---
Minutes 5/12/2022

Attendees: Mark Sanders, Steven Royer, Ted Streete, R Sarma Burugula, Michal Kalderon, Navad Haklai, Prasun Kapoor, Raja Kommula, Satananda Burla, Shafiq Abedin, Tim Michels, Wayne Hineman

Agenda:

1) Lifecycle Management API Discussion - get inputs from the Lifecycle management around the needs for API framework
2) Security, Attestation API
  a. Basis or guidelines from the OpenSSL may be a starting point for the Security API.

Notes:

Use Cases for consumption

- Local Combined Entity access where operator is common
- Remote Entity access where operator is independent and separate Attestation and Security control points.

Attestation

- May want to look into: <https://keylime.dev/>
- Chain of Trust and Attestation
  - should be part of the application view and operating environment.
  - Reporting of Attestation data is the payload data from a queuery.
  - API needs to define the queuery.
    - API would provide the able to collect/queuery the attestation result for a service or capability
    - Need to provide a Joint Attestation/verification between the remote and local service
- Security wrapper around the solution - Identity Access Management and Role Based Access Controls are needed
- Is Attestation an optional capability in the DPU/API view since it relies on a TPM or TPM-like capability in the hardware?

Actions:

- Explore more broadly the requirement for TPMs or TPM-like capability on the DPUs
  - Bring forward the TPM discussion to the larger community meeting
- Security Wrapper should move toward the gRPC aspect to provide the security boundary for the incoming requests

Raja Kommula may be able to assist with the gRPC interface for initial concept

---
Minutes 5/19/2022

Attendees: Mark Sanders, Boris Glimcher, Shachar Tal, Ted Streete, Satananda Burla. Burugula, Dan Daly, fnordahl, Gokul Kandiraju, Jerin Jacob Kollanukkaran, Patty Driever, Raja Kommula, Shafiq Abedin, Steven Royer, Tim Michels

Agenda:

- Brief Review Security and Attestation Discussion from last week
- Revisit Lifecycle Management API discussion

Notes:

Lifecycle Management API Discussion

- Need an inventory set of data - Inventory Queuery mechanism
  - Which DPUs exist
  - Location on Host - Index of DPU in Host (How we will determine this information needs to be identified.)
    - Advertise the virtual locations that is in the host
    - VFs/PFs
    - PCIe Domains that may be available
  - Interfaces that exist
  - Credentials for provisioning
    - How do we initially determine the credentials to secure the transactions?
  - Vendor Information
  - Network reachability information
    - Infrastructure Separation
  - Capabilities
    - Cores
    - Workloads supported
    - Offload Engines
    - Network breakdown/fanout - multiple ports
  - Language for exchange - gRPC, GraphQL, Broadcast Queuery
    - Would Traefik <https://github.com/traefik/traefik> as a load balancer with gRPC be an option for scalability?

Do we need to break the queuery of inventory into multiple stages?

- Initial limited queuery, the later the detailed queuery of information.

Where do we support the Inventory Queuery - is it in the UEFI, OS operation, BMC vs non-BMC solution?

Multiple Phases:

1) Initial phase - Day one provisioning
2) Later phase - Later re-provisioning/re-deploy of provisioning to add services or re-deploy services.

Actions:

- Steven Royer to check with Security team within RedHat for inputs around Attestation and TPM usage.

Topics for Next Week:

- Revisit the Networking and OpenConfig APIs
- Revisit the Storage API

---
Minutes 5/26/2022

Attendees: Mark Sanders, Dan Daly, Fabrizio D'Angelo, Frode Nordahl, Jerin Jacob Kollanukkaran, Kyle Mestery, Patty Driever, Raja Kommula, Satananda Burla, Shachar Tal, Shafiq Abedin, Steven Royer, Venkatesan Mahalingam, Wayne Hineman, Boris Glimcher, Venkat Pullela, Matthew Jean

Agenda:

- Discuss Use Case view from Intel (Dan Daly)

Notes:

- Dan Daly presented the Test Driven Use Case view
  - Includes having a switch in the connection to allow for additional monitoring and checking point
  - Allows for:
    - Multiple netperf
    - Single port and multiple port configurations
- Possible Tools for High Rate connection generation:
  - Congen
  - Cisco TRex
  - IXIA and Smartbits

Actions:

- Dan Daly to upload the Test driven use case view that was presented
- Venkat Pullela to address an overview/summary of DASH view

Upcoming Topics:

- Revisit Storage APIs
- Revisit Networking and OpenConfig APIs
- Overview of DASH/Synergy with DASH effort
- Begin discussions around the Behavioral Model views (P4 DPDK, DPDK, SPDK)
