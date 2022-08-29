# OPI Security APIs

## Documentation for Reference

* [strongSwan VICI Protocol](https://www.strongswan.org/apidoc/md_src_libcharon_plugins_vici_README.html)
* [vici API](https://github.com/strongswan/strongswan/blob/master/src/libcharon/plugins/vici/README.md)
* [govici](https://github.com/strongswan/govici)

## Terminology

| Term              | Definition                                       |
|-------------------|--------------------------------------------------|
| IKE               | Internet Key Exchange is the protocol used to setup security associations in the IPsec suite. |
| ESP               | Encapsulating Security Payload provides origin authenticity through source authentication, data integrity through hash functions and confidentiality through encryption protection for IP packets. |

## Objective

To define an industry standard "OPI Security Interface" for DPUs and IPUs that
will enable vendors to use the protobuf files from the security API, and expose
those externally and work across a number of orchestration systems. The Storage
solution is one part of a higher-level architecture API defined for DPUs and
IPUs as shown in the following image:

![OPI Common APIs and SHIM abstraction layer](../doc/images/API-GW-Layers.png/)

This document focuses specifically on the **OPI Security API Service**, and
even more specifically. currently on the IPsec portion of that API.

## Architecture

The OPI Security APIs are currently focusing on implementing an IPsec API which
maps on top of the [strongSwan](https://www.strongswan.org)
[vici Plugin](https://docs.strongswan.org/docs/5.9/plugins/vici.html). For
more details on the vici API, you can look at the strongSwan documentation
found [here](https://github.com/strongswan/strongswan/blob/master/src/libcharon/plugins/vici/README.md).

The architecture is seen in the diagram below.

![OPI IPsec Security Architecture](https://github.com/opiproject/opi-poc/blob/main/security/sec-architecture.drawio.png)

The idea here is that DPU and IPU vendors will implement strongSwan plugins to
offload the tunnels into hardware.

## OPI Security API Spec

The [Security Spec](security-spec.md) is the best place for up to date information on the OPI
Security API.
