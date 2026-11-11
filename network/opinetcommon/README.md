# OPI Network Common APIs

The common network capabilities need to build on the general capabilities that exist across various use cases for network operations and configuration. This includes (but is not limited to):

- Physical ports
- Logical ports
- Layer 2 interfaces, switches, bridges
- Layer 3 routing operations

The objective of the network common API is to define the characteristics that are common for the general network operations and capture them in this common API.  These characteristics are the building blocks that can be used across use cases and allow the basic setup of the physical and logical ports, VLANs, LAG interfaces, switches, etc.

## Demos

## Virtual-interface lifecycle

`CreateNetInterface` creates supported loopback, TAP, SR-IOV VF, or S-IOV
interfaces under `interfaces/{device}/interface/{interface}`. This follows the
existing Get/Update HTTP hierarchy. The legacy `netInterface/{interface}`
resource pattern remains accepted for existing resources.

Use the existing config for MTU, description, and enabled state, and
`ethernet.config.mac_address` for MAC assignment. `virtual_config` carries an
optional positive queue count and hardware-function selection. SR-IOV requires
a backing-interface reference and an explicitly present zero-based VF index.
S-IOV requires a backing-interface reference and a nonempty subfunction ID.
Function selectors do not apply to TAP or loopback interfaces. Backing resources
must belong to the same device scope. Unsupported types/configurations fail
explicitly rather than creating a different kind of interface.

Only the server determines whether an interface is logical and owned by this
API. Ignore caller-supplied output-only state. Create, including Update with
`allow_missing`, must not create physical Ethernet ports. Delete must reject
physical ports, unmanaged interfaces, and interfaces with dependent resources
using `FAILED_PRECONDITION`. `allow_missing` only affects absent resources;
there is no force/cascade option. Implementations without lifecycle support
return `UNIMPLEMENTED`.

The schema and generated bindings define the contract, not vendor-specific
provisioning. Bridge conformance tests must verify physical-port safeguards,
dependency rejection, VF-index-zero handling, queue limits, and cleanup.
Run descriptor tests from the repository root with `go -C tests test ./...`.

## Clients

## Reference implementations

## Basic Network Tenants

### Port/Interface

## Documentation for reference to other specifications and implementations

- Openconfig <https://openconfig.net/>
- <https://docs.kernel.org/networking/netlink_spec/rt_link.html>
