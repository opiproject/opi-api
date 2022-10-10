# Cloud Services APIs

Cloud Service APIs define the objects to manage cloud infrastructure APIS that could be offered by an xPU. These APIs are expected to be called by a cloud controller (definition of which is out of scope of this document).

## Overview

The APIs covers various aspects of a functional xPU in cloud deployment, ranging from the device configuration to network datapath and control protocols.

- Platform: xPU level Network configuration of platform and device specific APIs
- Link: APIs to create and manage port, interface, and vnics on the DPU (facing host, or network)
- Network: Define network constructs such as VPC, subnet, routing, next-hops, endpoints, etc.
- Network Protocols: most common protocols in cloud deployment such as bgp, evpn, and dhcp
- Network Services: network firewall, NAT, IPSec, mirroring, service load balancing, etc.
- Operations: network events, flow monitoring, upgrade, flow management, external logging, etc.
- QoS: rate limiter, policer, metering, and QoS marking
- Misc: batching, commong types, etc.

These APIs can be called from over the network or another processes (controller's agent) running alongside other processes on the xPU. The distribution and coordination of the objects across multiple xPUs is out fo the scope of the document.

Metrics, etc. can be exposed for these network and network services objects using mechanism described outside

## Objects, their structure and relationships

Most of the objects are well known in any public/private cloud deployment; here is a small description of various objects defined

- VPC: Virtual Private Cloud is the key concept in network virutalization, referring to a segregated (from other tenants) networks defining overlapping subnets, routes, interfaces, service mappings, etc. for a given tenant
- Subnets: An IPv4/v6 network, typically defined by the tenant, but instantiated in the VPC
- VNIC: Virtual NIC, an interface offered to a tenant, provisioned by the cloud controller on behalf of an instance definition
- Routing Table: these are static routes, for a given tenant within a VPC describing how traffic forwarding works within and in/out of a VPC
- Interfaces: L3 interfaces on xPU peering with the rest of the physical underlay network infrastructure
- Network Security Policy: equivalent of security groups, or permit/deny policies within and in/out of a VPC
- Mapping: defines mapping of a compute instance (VM, BM or a pod) to the network e.g. its IPv4/v6 address, MAC address, VPC association, and adminstrative controls)
- Mirror: helps define if a copy of a packet should be sent for specific traffic for debugging, or observability use cases
- DHCPolicy: this is the IPAM policy of the subnet, if there is a need for dynamic IP allocation
- Policer: rate limiting on specific VNICs to ensure isolation among multiple tenants
- Metering: identify (match), and associate the traffic for various classes for billing/accounting purposes
- QoS: classification, marking for outbound traffic for a network wide behavior
- Tunnel: overlay tunnels make up virtualization of the network within a VPC
- NAT: network address translation for any traffic going in/out of a VPC to public domain or to another VPC
- NextHop: defines routing peers (adjacencies) for L3 traffic routing/ecmp

Object structure is inspired by Kubernetes object model

- Type: either an object or a list
- Meta: common fields to all the objects e.g. name and UUID
- Spec: specifices the desired configuration from cloud control plane
- Status: Runtime state of the object
