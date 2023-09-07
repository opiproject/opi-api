# Minutes/Topics August 2023

---

## August 3

Topics Covered:

- Overview of P4TC - Kernel TC-based software datapath and alighment with OPI

Recording at: <https://zoom.us/rec/share/qLoOMDEcUf7C8u1jmaZTCfS3bqiEp8mVL_B-_uMkFLSyNsKIHBkWFQroUezKZxLH.Ir3gj79GnnnbwaK0>

---

## August 10

Canceled - No topics and many conflicts with summer vacations

---

## August 17

Topics Covered:

- Capabilities Advertisement from the DPU/IPU

Notes:

- Think about how/what should be contained in a "Capabilities Advertisement" API message for the DPU to include the Platform (HW) and Software capabilities.  Some of the things to consider:
  - Utilize the NetConf capabilities advertisement mechanism and how that would map
  - Review the Cloud API Capabilities that is contributed and align/expand
  - Include the view on Netlink models and how it advertises capabilities.
- We are planning to have a Network API workshop in the September timeframe.  
  - Please provide any suggestions related to the timing.  
  - From the earlier poll it seemed a Tuesday would work best.  
  - Also, the workshop(s) will be limited to 2 hours with 1 or more planned to work though the concept of API framework and what should be in the API.  The API needs to consider how the initial configuration is put in place (Day 0) and then how changes are made to the configuration over time (Day N+)

Recording at: <https://zoom.us/rec/share/4Cj4L2ETml2QvocWhBtJKE2EtHAqU7MleQz1IsOwF96ithqL2XROr5uMe8OOMe9B.GUjk8Pzg-WUMtkua>

---

## August 24

Topics Covered:

- Netlink and YNL work from Redhat - Donald Hunter

Recording at: <https://zoom.us/rec/share/Ju4nfYzH1zqtdXVnZIahE1ljsxTfeo4r6KghDQkHEM6vo3D4yS0mgIccAHpSq7q2.ttWeocV42qfDMkAq>

---

## August 31

Topics Covered:

- Discuss Pull Request #343 <https://github.com/opiproject/opi-api/pull/343>
- API versioning bumping - when to change the version number
- Close EVPN GW open questions <https://github.com/opiproject/opi-evpn-bridge/pull/103>

Notes:

- Proposal for version changes to be made to the TSC for approval.
  - Companies need to buy-in and agree to the proposal.
  - Proposal will be done in a .md file for review.
- EVPN Gateway needs to have a persistence layer database.  REDIS and/or Badger are proposed
  - Pub/Sub model needs to be identified
  - Implementation meeting is needed.  This probably should be taken up by the PoC Team (which looks to be defunct currently)
  - This needs to be taken up by the TSC.

Recording at: <https://zoom.us/rec/share/obZmbao_trksrNE7amMncSU9BF9lI7eq6bOuN3l5qAzCLghaG1DGd2itcORtdmDW.eEoaiwyUEQWJqo8C>
