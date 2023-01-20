# Open Programmable Infrastructure API and Behavioral Model Group

Meeting: Every Thursday at 12:00 - 1:00 ET (9:00 -10:00 PT) for 60
minutes

---
Minutes 2/24/2022

Attendees: Joe White, Prasun Kapoor, Ted Streete, Boris Glimcher, Gokul
Kandiraju, Ian Smith, Kyle Mestery, Tim Michels, Mark Sanders

Agenda

- Review Charter
  - Define the object models for each of the components and services on the D/IPU
  - Layering of the D/IPU capabilities that are abstracted
  - Define Both host system facing and control/management facing
    - Discovery and Service Advertisement API
    - Capabilities/Capacity Advertisement API (ARM Cores, Bandwidth, ...)
  - Create Taxonomy: network, security, storage, ai/ml, gateway, telemetry, ...
  - Create/Define the Backend/Southbound facing
- Discuss Capabilities Classification

Notes:

- Do we need a middleware API to abstract the HAL? Vendor neutral abstraction
- Configuration Interface (comes from the outside)
- Interface Abstractions (sets of APIs that are available at the bound
    interface)
  - Host-bound -- Interfaces provided to the Host (exposed interfaces -- VFs, SRIOV, ...)
  - Network bound
  - Local bound
  - Peer bound
- Security and Access Model around the Interface Abstractions.

Actions:

- Define a Layering diagram for the D/IPU elements
- Define an Interface diagram view for the D/IPU
- Prioritize to the top set of APIs to define aligned to the Taxonomy set.
