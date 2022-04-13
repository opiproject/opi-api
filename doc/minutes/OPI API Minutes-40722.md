# Open Programmable Infrastructure API and Behavioral Model Group

---
Minutes 4/07/2022

Attendees: Mark Sanders, Gene Bagwell, Venkat Pullela, Yuval Caduri, Wayne Hineman, Shafiq Abedin, Navad Haklai, R Sarma Burugula, Ted Streete, Satananda Burla, Jerin Jacob Kollanukkaran, Kyle Mestery, Fabrizio D’Angelo, Venkatesan Mahalingam, Tim Michels, Boris Glimcher, Matthew Jean, Stefan Chulski

Agenda:

- Update on GitHub location https://github.com/opiproject/opi-api 
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
