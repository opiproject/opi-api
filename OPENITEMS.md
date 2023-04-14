# Open Items

---

Pending/Outstanding Open Items and Questions:

- Summarize the Kubernetes Networking Infrastructure
- CNI and OPI problem view and how to address the plumbing for the control and support heterogeneous environments.
  - Do we need a new CNI for the OPI/xPU support?
  - CNI plugin for existing CNIs (that support plugins).
  - OPI xPU library that can be added/linked to the existing CNIs.
- Review the existing layering diagrams and expand the diagrams for the areas discussed.
- Consider the layering where the provisioning has additional granularity around Underlay (Phy, L2, L3 configuration), Overlay (VxLAN), VF allocation.
- Consider how the Tenant can utilize elements of the provisioning for their traffic needs over the exposed interfaces.
- Consider the use or CRI interface as a common API exposed for K8s.
- Continue the discussion on How to launch containers in the DPU?
  - Should we standardize on CRI since the Kublet can interact with CRI APIs and then require that the CRI API is exposed?.
- Work toward detailed architecture/implementation for CNI aspects and OPI Translation Shim layer in the diagrams.
