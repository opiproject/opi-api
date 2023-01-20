# Open Programmable Infrastructure API and Behavioral Model Group

---
Minutes 7/7/2022

Agenda:

- Continue Storage Discussion
  - NVIDIA K8s oriented diagram
- Discuss the Split between Network and Storage (create two weekly meetings)
Other Topics (time depending)
- Discuss API Gateway and Security (common authentication)
- Circle back on Network APIs, OVS, other networking stacks (SONiC, etc.)

Notes:

- Storage Discussion deferred to a later date when diagram is ready
  - Boris provided upate and call to action related to the PoC aspects.

- Split the API meetings between Networking and Storage
  - Options
    - Two meetings per week - One on Networking, One on Storage
    - Alternating weeks with Networking and Storage as topics
  - Make the meetings not overlapping.

- Deep dive on the diagram for the API Gateway.
  - Look through the Authentication and Authorization aspects of the layer.
  - Expand the view of the details
    - Monitoring
    - Hosting
    - Tracing
    - Authentication and Authorization
    - Streaming
  - Review the security needs for the VFs that are provided to the VM/Container environment in the host.
  - Look at the ORAN data and CNCF information on similar capabilities
    - <https://oranalliance.atlassian.net/wiki/spaces/SFG/pages/2534834394/ORA-2022.07.04-SFG-CR-0021-OCLOUD-Risk-Assessment>
    - <https://oranalliance.atlassian.net/wiki/spaces/SFG/pages/2512781323/Security+Requirements+Specification+v4.0> (membership in ORAN is required)

- Service Chaining discussion on the linkage between various services.  This will likely need to be a focused area to delve into the details on the flow interconnects.

- A configuration model is needed using OpenConfig to be applied to the basic network use case.  This can identify some of the basic missing capabilities such as:
  - Programmability Interface
  - IPSec
  - eBPF
- Extend OpenConfig to support missing capabilities or use other available models
- OpenConfig addresses the Control Plane aspects.  Do we need someting for Data Plane interaction or does that really fall into the existing SDKs such as DPDK, SPDK, etc?

Actions:

- (Mark) Queuery the API workgroup related to meeting preference.
- (Boris) Create initial API gateway diagram to start the dialogue.
- Produce a configuration model using OpenConfig that aligns with the networking basic Use case

Upcoming Topics:

- Storage Discussion wrt NVIDIA K8s diagram

---
Minutes 7/14/2022

Agenda:

- Continue Storage Discussion with K8s Diagram from NVIDIA (if available)
- API Gateway discussion

Notes:

- Discussed the API gateway expanded diagram.
  - Define the Gateway vs Service Mesh view of the diagram
  - A load balancer may be needed to address performance - Traffik is an option brought forth by Juniper
  - A connection to the Open Telemetry is needed
  - The OTEL API needs to be included in the API definitions for allowing its subscription and configuration.

- A direct connection to the SDKs is needed for some user services was part of the discussion.

- The API needs to work similar to a Shim layer on top of the vendor SDKs in many cases; however when there are offload service functions similar to OVS, SONiC, Firewalls (maybe), there may need to be more stacking considered in the layout.

- A view of multiple user interactions needs to be taken into account for the config path so that some level of lockout may be needed from one user to another or segmentation of service.  This needs to be considered at some point in the concepts.

- The ability of a higher layer service to determine if underlying functions of the specific xPU can support the required operation is needed.  This would be a capabilities advertisement or capabilities queuery operation that is needed.

Actions:

- Add Authorization and Authentication to the API Gateway view

---
Minutes 7/21/2022

Agenda:

- Storage Update - NVIDIA K8s topic (if available)
- Continue API Gateway and Abstraction Layer discussion

Notes:

- Continued discussions with the updated API Gateway diagram.

- The need for insuring there is vendor extensions from the client is needed in the diagram.
- The networking service block needs to take into account that there is the possible use of OVS, SONiC, VPP, etc. as a capability that would reside above the vendor SDKs.
- The diagrams need to clarify what is running on the DPU (local operation) and what is/can be running outside of the DPU.

Actions:

- Review and Refine the view of the API gateway diagram.
- Need a survey or inputs from the vendors on what is the interface that is exposed to the control path service.

---
Minutes 7/28/2022

Agenda:

- Continue API Gateway refinement discussion
- Overview of Storage API additions

Notes:

- Discussed the updated API Gateway diagram and the Stacking view with the Network and Storage service blocks.
  - The stacking view showed the simplified view of what is needed by the API workstream
  - Focus of the API workstream should be to define the Gateway/Fan-out mechanism and the protobuf definitions
  - Protobuf definitions are the key element of the API.

- Authentication and Authorization needs to be on both the user flow with REST/gRPC and on the direct flow path
- Need to define the consumer and producer of the protbufs
- An effort is needed to work the datapath operations to include the Service Chaining
- API vendor extensions are needed with the Authentication and Authorization service.  This also needs to address the IPSec as well as other capabilities as there are vendor specific capabilities that vary by xPU being utilized.

Actions:

- Update the diagrams to indicate that this is the control/config path.
- Plan for future discussions on the datapath flows and Service Chaining.
- Include the updated Diagrams in the Usecases file.
