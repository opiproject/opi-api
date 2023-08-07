# Minutes/Topics July 2023

---

## July 6

Topics Covered:

- Discuss How to use Cloud APIs to do VXLAN

Recording at: <https://zoom.us/rec/share/h1NO7rTIq4pjoNOeNzq-CYQKKAPQKWa8aMQXWPd1wBf2YkGpqrdH1-QYVBoMhDw1.nDtodNpephJmgS5A>

---

## July 13

Topics Covered:

- Discuss Merging EVPN-GW APIs (revisit)

Notes:

- Agreement to merge was approved and PR was merged into repository.

- Networking API workshop to be planned
  - 2 hours maximum
  - Potentially a couple of sessions or more depending on progress
  - Focus on Bottoms-up Use Cases
    - Configuration of Interfaces
    - Add VLANs
    - Add VXLANS
    - Static Routing

Recording at: <https://zoom.us/rec/share/GX0dhfefguQO629GC1RpdDexj8p57Kn1AMkEilAiRD6GAh7KIFQ83kLvabm_vBrL.znsm452I_2IU7j6d>

---

## July 20

Topics Covered:

- Networking API workshop targeted toward September per Slack Channel conversations
  - Targeting will be on a Tuesday
  - Potentially some collective in person location - TBD as well as Video
- Discuss EVPN-GW and proposed changes to the EVPN-GW API

Recording at: <https://zoom.us/rec/share/uc7gmkTDrvdn9VNwsjza6mH7DV4z6NAMAwUoZSzHO021_B1CQlEsNPg7fmXCg2dw.RZJ01ep8QiR-EgTq>

---

## July 27

Topics Covered:

- General Discussion

Notes:

- Consider the need for a DPU abstraction interface/layer which would address the underlying functions provided by the DPU/IPU platforms.  This would potentially be similar to a DPU HAL
- Abstraction Layer would need to address frameworks such as:
  - DASH
  - IPDK
  - DOCA
  - DPDK
  - Netlink
  - OVS/OVN
- The need for a Capabilities protobuf/model is needed in addition to inventory.  Capabilities would advertise information such as:
  - HW Capabilities - Accelerators, Crypto, ...
  - SW Capabilities - OTEL, StrongSwan, Firewall, ...

Recording at: <https://zoom.us/rec/share/u9VOtVNXingBCWulGJ4H6N88tmBQw74VwBoE7DQLAjnhUBj6mraMU9vTN_VlIlF5.RtpwhXTa26ipNr6w>

---
