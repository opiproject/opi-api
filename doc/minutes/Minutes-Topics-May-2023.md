# Minutes/Topics May 2023

---

## May 4 (May the 4th be with you)

Topics Covered:

- Storage Backend Discussion - Summary and overview of ongoing Slack discussion.
  - Consensus from the discussion is to use the first option presented.
  - PR to be submitted/updated for the proposal for review and comments.
- EVPN Gateway Repo and contribution.

Recording at: <https://zoom.us/rec/share/5YsB0kNdBsKynYLYwkKOBtIjYUZRgvTDHMVnbyMsD3hjMSpePW_PfiFWBs2XJlsy.H_Q-fb5t4eyidzaX>

Please Review PRs for:

- Transaction Support <https://github.com/opiproject/opi-api/pull/212>
  - Updates on this PR will follow based on discussion today
- EVPN Gateway API <https://github.com/opiproject/opi-api/pull/276>
  - This API set may feed into the new repository for the EVPN Gateway Bridge

---

## May 11

Topics

- EVPN GW API PR #276 Feedback Discussion.

Recording at: <https://zoom.us/rec/share/rRpZAvvuhqrn99fsBAWXjrIUrfUmLP1XjuYBZ1N6FQyjOVl0fh2zAOnCVomxnAS-.bKnoKm9CIb1gsFK_>

Actions:
Update the API Readme with guidelines for API creation to include unique identifier - Opaque field as a common aspect
--> Opaque string is used as identifier to allow for any information to be identity for whatever is desired for the solution.
--> Unique ID can be provided by user or server (hybrid approach) depending on the use case.
--> Uniqueness is left to implementation

---

## May 18

Topics

- DASH and OPI Synergies and Alignment Discussion
- API Object Field Naming Convention

Recording at: <https://zoom.us/rec/share/3nS8OrYR5YGzE2VYNZqWDkrVS8_wdPDx1q8XJ91Fo33_rn14FbWmftCysrbVtjT6.5DWsX2TK969MY-OH>

Actions:

- Resolve object field naming convvention in Slack channel discussion.

---

## May 25

Topics

- EVPN PR Update
- Object field naming - "string name" as Opaque Object
- Queuery on the CNI Update for defining the API in the CNI Aspect

Recording at: <https://zoom.us/rec/share/d0Z1pgR8cPF4Dm3I2AFNpLLY7IYqF85pufitr7oueR1BzzaYoKMRmk24ahrHHNjb.gLBjMKmPXpyiwrLC>

---

Future Topics:

- Layering Approach - Venkat
- Revisit API Diagrams and Discuss updates
- Primary and Secondary K8s Networking Offload
  - Deeper level discussion on Primary Offload
  - Deeper level discussion on Secondary capabilities
- Initial Configuration of the DPU before the operational configurations begin.
