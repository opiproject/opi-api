# Open Programmable Infrastructure API and Behavioral Model Group

---
Minutes 8/4/2022

Agenda:

- Vendor views/proposal for interface to SDK (Intel, Marvell, NVIDIA)
  - Define the boundary on the SDK (RPC, Link Library, etc.)
- Storage - Ceph Storage on DPUs (Red Hat - IBM) - Defer to 8/18

Notes:

- Dan Daly (Intel) discussed the ipu_sdk_opi_api information that was contributed.
- Concerns were expressed that what is provided is beyond the view of the protobuf level as the bottom of the opi api.  Description outlines two possible interface points.  The view was more directed toward Networking and didn't account for other areas (Storage, Security) of API development need.

- Liel (NVIDIA) discussed the NVIDIA view of the API
- The aspects shown seemed to align with the objective of defining the Northbound interface and the protobuf interaction point.
- Request for contributing the view to the repository

- Discussed several views related to the API:
  - The view is that there are essentially three interface views that have to be considered.
    - Configuration Interface - the control plane information for setup and management of the operation, accelerator, data flows, etc.
    - Data Flow Interface - for the data traffic being passed between the host and xPU
    - Application Interface - the service chaining interface between applications/services that are resident on the xPU
  - Performance of the overall api (especially the configuration actions) needs to be included in the view

- Interfaces need to consider
  - Northbound interface - in the case of the configuration/control plane this would be the protobuf definitions
  - SDK interface (Southbound) - The interface to the SDK and how it is consumed by the API.

Actions:

- Expand the use case(s) for Networking
  - Considerations with inclusion of 1) OVS DB, 2) Openflow, 3) Openconfig, 4) P4, others.
  - Define the requirements for each use case
  - Mapping of the use case with the APIs for the consideration
  - Inclusion of application operations such as switching, firewall, etc.
  - Include the scope for ports, links, vnets, etc.
  - Use case needs to be top down as well as bottoms up.

- Agreement on the Objectives for the APIs for Networking, Storage, Security

---
Minutes 8/11/22

Agenda:

- Storage - goals and deliverables
- Marvell - view on API boundary (RPC, Linked Library, etc.) - if ready
- Network - Objectives, goals, deliverables

Notes:

- Continued discussions around the Control Plane (Configuration)

- Reviewed storage goals and deliverables
  - Team will review and comment in github site
  - No comments raised on the initial view

- API boundary for networking presented by Marvell
- Aligned with the working thinking that multiple API's will need to be recommended to address OVS/OVN, VPP, SONiC and translation layer to map to the underlying SDKs
- OpenConfig covers many aspects; but will need extensions.

- Discussed whether the Service Chaining is in the OPI Scope or outside of it.  This is likely a question for the TSC.

Actions:

- Define a PoC that can be done with in existing client
- Define a PR review process that will improve the contribution
  - Address the needs for multiple timezones to review
  - Define the mechanisms for Architecture vs editing, bug fixes, etc.
    - Architecture changes need a longer review cycle
    - Bug fixes need shorter turn to address issues and additional PRs can be opened

---
Upcoming Topics:

- August 18
  - Ceph Storage on DPUs - First Agenda Item for 8/18 meeting
