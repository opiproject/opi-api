# OPI Network Cloud APIs

Cloud infrastructure requires strict isolation between tenants and cloud infrastructure.
The cloud API is used by the cloud provider in a multi-tenant shared cloud infrastructure.
The cloud API exposed by xPU is used by a cloud controller that manages xPUS attached to the
hosts that run tenant's workloads.

## Overview

Each tenant in the cloud gets its own virtual private cloud (VPC), that is instantiated alongside
other VPCs belonging to the same and/or other tenants.
The isolation provided by the cloud infrastructure ensures that each tenant only see the workloads and
inter-connectivity as if it were to be its own private cloud. The cloud is virtual because physical
resources, such as servers or switches are not dedicated - instead are pooled among multiple tenants.
API driven resource allocation is layered logically on top of the physical pool of resources, creating
a notion of elasticity.

## Tenant's View

A tenant (administrative entity, or an organization) can have multiple VPCs that are isolated from
each other (e.g. different departments). However, VPCs within a tenant can be inter-connected if desired.
Following diagram describes various objects used by a tenant within the virtual private cloud.
They are typically requested by a tenant and subsequently provisioned by cloud controller on xPUs.

```text
Tenant
  |
  +--- VPCs (virtual private cloud)
        |
        |
        |--- Subnets (IP networks)
        |
        |--- Routes (forward traffic within VPC, to peer VPCs (same tenant), and to/from Internet
        |
        |--- Network Security Policy (Security Groups)
        |
        |--- Peer VPCs
        |
        .--- Etc.

```

Above objects are instantiated within the xPU for various tenants depending on their individual
configuration, and tenant specific functions are scoped by the tenant (or VPC) in the xPU datapath.

## Physical Infrastructure

The physcial infrastructure on which VPCs are created, can be thought of as a set of servers that
are interconnected via a physical netwwork infrastructure. Each server is assumed to be equipped with
an xPU that intercepts any tenant traffic going to, and coming from, the physical infrastructure.

Following diagram describes the physical layout of the cloud infrastructure

```text

  .-----------Bare Metal Server ----------.             .----- Bare Metal Server -----.
  |  .----.   .----.             .----.   |             |                             |
  |  | VM |   | VM |             | VM |   |             |                             |
  |  .____.   .____.    . . .    .____.   |             |                             |
  |    |        |                  |      |             |                             |
  .____|________|__________________|______.  . . .      ._____________________________.
       |        |                  |                         |        |        |
       \        |                  /                         \        |        /
        \       |                 /                           \       |       /
         \      |                /                             \      |      /
          \     |     __________/                               \     |     /
           \    |    /                                           |    |    |
            |   |   |                                            |    |    |
      .-------------------.                                 .-------------------.
      |        xPU        |                                 |        xPU        |
      |                   |                                 |                   |
      .___________________.                                 .___________________.
                 \                                                    /
                  \                                                  /
                   \__________                             _________/
                              \                           /
                               \                         /
                        .------------------.    .------------------.
                        |  Network Switch  |    |  Network Switch  |
                        .__________________.    .__________________.
                                    \                /
                                     \              /
                                      \            /
                                   .------------------.
                                   |  Network Switch  |
                                   .__________________.
                                            \
                                             \
                                            To Internet (via gateway devices)

```

Each workload (VM, BM or a container) is identified by the xPU as a vNIC (virtual NIC).
A VNIC could be a physical pcie device (PF/VF) or a virtual identifier (e.g. a VLAN-id
tagged by the hypervisor that runs on the host. Once xPU identifes the workload, it then
maps its traffic into a relevant VPC. Of course, the

## Bringing it all together in XPU's datapath pipeline

In order to manage the tenant's traffic xPU needs to identify workload's VNICs, its IP addresses
and uplink connectivity to the netwrok switches. Following diagram specifies various
objects as seen by the xPU to help manage tenant's connectivity and offer network services.

```text
                                    .-------------- Bare Metal Node ----------------.
                                    |                                               |
                                    |  .----------------------------------------.   |
                                    |  |                  VM                    |   |
                                    |  |                                        |   |
  VNIC object (Guest VM's I/F) -----+--|--> Eth Device 1        Eth Device 2    |   |
  Subnet object (I/F's subnet/mask) |  |  (netdev eth if)      (netdev eth if)  |   |
  Mapping object (I/F's IP/MAC)     |  |         |                              |   |
                                    |  ._________|______________________________.   |
                                    |            |                                  |
                                    |          [ | Hypervisor, if any   ]           |
                                    .____________|__________________________________.
                                                *|*
                                                *|*
  Interface object (physical) ----------------->*|*
                                                *|*
                                     .-----------+--------- xPU ----------------------------.
                                     |           |                                          |
  Device object (global config)----->|           |                                          |
                                     |           v                                          |
  VNIC object and VPC object --------+-----> [VPC identification based on VNIC]             |
                                     |           |                                          |
                                     |           v                                          |
  Policy object (permit/deny) -------+-----> [apply network services]                       |
                                     |           |                                          |
                                     |           v                                          |
  Route object (configured routes)---+-----> [route/forward traffic to next-hop]            |
  NextHop object                     |           |                                          |
                                     |           v                                          |
  Tunnel object (encap/decap)--------+-----> [tunnel traffic, insert vpc-id                 |
                                     |           |                                          |
                                     |           v                                          |
  CPRoute object (underlay routing)--+-----> [route based on underlay static routing/bgp]   |
  BGP object                         |           |                                          |
                                     |           v                                          |
                                     |       [Send out on uplink port to Network Switch]    |
                                     |           |                                          |
  Port object (physical port)--------+---------> |                                          |
                                     |           |                                          |
                                     .___________|__________________________________________.
                                                 |
                                                 v
                                          To Underlay Network Switch

```

The above diagram specifies typical order in which various services are performed in egress direction.
A similar forwarding is done for ingress direction. However the objects used by the pipeline is similar.
