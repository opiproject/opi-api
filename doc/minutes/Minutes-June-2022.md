# Open Programmable Infrastructure API and Behavioral Model Group

---
Minutes 6/2/2022

Attendees: Mark Sanders, Frode Nordahl, Kyle Mestery, Shachar Tal, Shafiq Abedin, Steven Royer, Venkatesan Mahalingam, Wayne Hineman, Matthew Jean, R Sarma Burugula

Agenda:

- Revisit Networking and OpenConfig APIs
- Discuss API model view

Notes:

- Reviewed OpenConfig Model diagram that is posted in the network folder
- Identified areas that need to be augmented/extended
  - IPSec
  - Crypto Selection (for IPSec or TLS)
  - TLS (TLS 1.2/1.3)
  - Does it make sense to have a "Network Security" area that defines the TLS, IPSec?
  - Do we need to chain the IPSec or TLS on top of the Network config?
  - Do we add/chain the Crypto Selection as a chain to the Network Security component?

- Discussed the API definition aspects where we need to consider:
  - Traditional Software APIs where you have the Initialization function, API functions, and Data formats.  This would be the typical software APIs where you call the functions after initialization of the library
  - Data Primitive APIs where you define the parameter sets, text description files (protobuf, yaml file, etc.) that are used by a management agent to configure the operations of the target.
  - The latter (Data Primitive API) would seem to be what is desired since it defines what an orchastration application would use to configure the target operations and functions.

Actions:

- Get Test Driven develpment info from Dan Daly to upload

Upcoming Topics:

- Revisit Storage APIs
- Overview of DASH/Synergy with DASH effort
- Begin discussions around the Behavioral Model views (P4 DPDK, DPDK, SPDK)

---
Minutes 6/9/2022

Attendees: Mark Sanders, Ted Streete, Tim Michels, Anh Thu Vo, Nadav Haklai, Patty Driever, Raja Kommula, Shachar Tal, Shafiq Abedin, Wayne Hineman, Satananda Burla, Yuval Caduri

Agenda:

- Review minutes from previous 6/2/22
- Discussed Security Implications

Notes:

- Security Model
  - Identity and Access Management to verify user/process and access to config services.
    - Potentially utilize/re-use some existing models from REST Standard Services
- CNCF - utilize concepts that have been developed from CNCF
  - Secure Provider Identity Framework for Everyone <https://spiffe.io/>

- With the basis of gRPC exchange, we need to decide on Transaction vs Session Based exchanges
  - Advantages and Dis-advantages of each
    - Concerns around Privilege Escalation, session caching, session scope, session timeouts, mutual TLS/Tokens, etc.

- ORAN Security Meeting June 14-16.  Anh Thu Vo will be attending and provide any feedback on the Secure Boot and Provisioning view from meetings.

- Configuration API - gRPC method of exchange with security model above being discussed.
- Consumption API
  - Network - currently this is a VF exposed to the Host with traffic flows defined
  - Storage - Virtual Disks exposed to the Host
    - Security level for Container environments and their associated storage area
    - Self encrypting drives and crypto key handling
    - Anh and Ted Streete to begin looking at this interface for security aspects

Actions:

- Get Test Driven develpment info from Dan Daly to upload

Upcoming Topics:

- Revisit Storage APIs
- Overview of DASH/Synergy with DASH effort
- Begin discussions around the Behavioral Model views (P4 DPDK, DPDK, SPDK)

---
Minutes 6/16/2022

Attendees: Mark Sanders, Ted Streete, Boris Glimcher, Anh Thu Vo, Matthew Jean, Raja Kommula, Shachar Tal, Shafiq Abedin, Wayne Hineman, Satananda Burla, Yuval Caduri, Steven Royer, Senthil Kumar Ganesan, Jerin Jacob Kollanukkaran

Agenda:

- Quick view of USECASES addition to github site
- Test Driven Concept deck submitted by Dan Daly for access by the team
- Revisit Storage APIs
- No meeting on 6/23/22 - corresponds with the Open Source Summit and LF announcement
- Discuss pre-announcing agenda of meeting prior to allow the right set of attendees - Good Idea Steven Royer.

Notes:

Storage API Review/Discussion

- Protobuf definitions need to be worked for the Storage Actions (refer to the Storage Diagram)
  - Front End APIs
    - What can be shared from the vendors (NVIDIA, Marvell)
    - Satananda provided header file with parameter set
  - Back End APIs
    - NVMe and iSCSI devices
    - null, AIO, and Memory devices for debugging

- Emulated devices

- Defer/delay the security aspects for now
  - Make sure we put placeholder for the security in the protobuf definition

- Initial phase should be to flush out the basics, add TLS and Security aspects with encryption, compression, etc at a later time
  - Example NVMe-oSSL patches are not yet published

- Need to understand the parameters for storage that provide
  - IP
  - Protocol
  - Security keys
  - etc

Currently we are missing Storage Services in the Storage API (Boris will add to the diagram)

- Covers Encryption, Compression, RAID protection
- APIs with parameter settings

Upcoming Topics:

- Overview of DASH/Synergy with DASH effort
- Begin discussions around the Behavioral Model views (P4 DPDK, DPDK, SPDK)
