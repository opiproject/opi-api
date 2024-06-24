# OPI Security APIs

## Documentation for Reference

* [RFC 9061](https://datatracker.ietf.org/doc/rfc9061/)

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

This version of the OPI Security APIs are based on the IPsec configuration
model from on [RFC 9061](https://datatracker.ietf.org/doc/rfc9061/).

The architecture is seen in the diagram below.

![OPI IPsec Security Architecture](https://github.com/opiproject/opi-strongswan-bridge/blob/main/sec-architecture.drawio.png)

The idea here is that DPU and IPU vendors will implement strongSwan plugins to
offload the tunnels into hardware.
