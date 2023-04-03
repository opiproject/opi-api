# Minutes/Topics March 2023

---

## March 2

Topics Covered:

- Update on the Intel-Ericsson EVPN Demo that was done in the Use Case Group.  Please review and provide feedback and questions in the slack channel for discussion in the future.
- Short Status Readout in the meeting for TSC update on March 9
- Storage Backend Discussion - Please review the discussion in the proj-storage slack channel.
- Demo and Pull Request discussion on traffic generator testbed

Recording at: <https://zoom.us/rec/share/DyahfFeAUwRi-37BnZ02neqMINs74Y0jM-6uB2bx-r0DBbWlTyOmSSmPRjKnhpom.si4eZ7ir1Ju9FqSD>

Actions:

- Request to consider a timeline for Networking APIs
  - While this is a good request from the TSC leads, it may be a difficult item to address given the multitude of network APIs that are available today and the market areas needs such as Cloud, Telco, K8s, etc.
  - The objective is to collect the various market views and work toward a converged set based on the contributions and various available API types.

---

## March 9

Topics Covered:

- CNI Discussion with K8s and how to launch containers in DPU
  - Should we standardize on CRI since the Kublet can interact with CRI APIs and then require that the CRI API is exposed?

Recording at: <https://zoom.us/rec/share/2R2K1isHlPmODIJbJHJ-gPZH3hAe-BwT3_CGeVaMXBfmFIvZEnhtoqXGKmEUlLca.MiTimk3QZu8k6LhU>

Actions:

- Consider the use or CRI interface as a common API exposed for K8s.
- Continue the discussion on this topic next week.

---

## March 16

Topics:

- Storage Backend Discussion - defered to later meeting
- Layering Approach Discussion - deferred to later meeting
- Continue Container Lauch discussion from last week
- Primary and Secondary K8s Networking Offload
- SAI Support for Networking Use Case.

Recording at: <https://zoom.us/rec/share/Y-vCfrhWvle6WCNHXxTabZ0DQPd059qn8gb0XzED9-U_qE11hKjphSuelBbwhuvI.T9tINeit3lh1XId9>

Actions:

- Review the existing layering diagrams and expand the diagrams for the areas discussed.
- Consider the layering where the provisioning has additional granularity around Underlay (Phy, L2, L3 configuration), Overlay (VxLAN), VF allocation.
- Consider how the Tenant can utilize elements of the provisioning for their traffic needs over the exposed interfaces.

---

## March 23

Topics:

- Kubernetes Networking Infrastructure Offload and API specifics around K8s Networking Infra Offload

Recording at: <https://zoom.us/rec/share/vmZu1cvEAZLG5N-3uGfr1EK8OvXHVWT9sMrFW0TurkMa8fvlP8E1yD2S_owwzlMh.dcWnh4G5X_JDWk_5>

---

## March 30

Topics:

- Continue Kubernetes Networking Infrastructure Offload and API discussion

Recording at: <https://zoom.us/rec/share/bHSSlU7E7RtPWK6Kj4esBx0YlMZPPqeWFFUx1QvrIPCc_F0GpCrLkn2jI0ZVWBwv.0n_WWbYudJGPYjDn>

---

Upcoming Topics:

- Storage Backend Discussion
- Layering Approach
- Primary and Secondary K8s Networking Offload
  - Deeper level discussion on Primary Offload
  - Deeper level discussion on Secondary capabilities
