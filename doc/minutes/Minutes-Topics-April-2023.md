# Minutes/Topics April 2023

---

## April 6

Topics Covered:

- Continue Kubernetes Networking Infrastructure Offload and API discussion
  - Discussed Heterogeneous Environments where there are hosts with and without DPUs
  - Consider how to address these environments?  CNI Delegation?

Recording at: <https://zoom.us/rec/share/c7U7SEc3xNxuui_GaI-Xflje-JsHmCfZ7q8XMr1RDl7-QDN5Co6bodwO2dRN1vAB.Nll6pT2Vps8PrnVv>

Actions:

- Provide updated diagrams on the K8s Infrastructure Offload - Maryam Tahhan - Complete and merged

---

## April 13

Topics Covered:

- How to define a unique identifier for network interface wrt Kubernetes?
  - BDF designation + VF + PF (Marvell), VF + PF + Queue (Intel)
  - UUID and serial number
  - Host uniquely identifed plus bus number
  - From networking perspective - the unique MAC address designation may be an option
- Storage QoS
  - Which OPI layers QoS is supposed to affect (all front-, middle-, and back-end as opposed to just middle-end)?
  - QoS levels we want to support: volume, PF/VF, VM (for aggregated storage and networking traffic)
  - OPI architecture: QoS as an embedded property of an object or QoS as a wrapping object for other objects
  - QoS settings of interest (top priorities)

Recording at: <https://zoom.us/rec/share/D28mW9BMoy5HS9BXGPbAO25oMxXDJ0RTreiXKiNkUA_a4a2cwiwbK4tDuG00kU41.3s7ioF3F_8QFQyis>

Actions:

- Review <https://github.com/opiproject/opi-api/pull/273> proposal for inclusion late next week.

---

Upcoming Topics - Next week:

- Storage Backend Discussion - Vipin/Ben
  - Summary and overview of ongoing Slack discussion.
- Detailed API walkthrough for IPU PoC Demo

Future/Continuing Topics:

- Layering Approach - Venkat
- Primary and Secondary K8s Networking Offload
  - Deeper level discussion on Primary Offload
  - Deeper level discussion on Secondary capabilities
