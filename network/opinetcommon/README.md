# OPI Network Common APIs

The common network capabilities need to build on the general capabilities that exist across various use cases for network operations and configuration. This includes (but is not limited to):

- Physical ports
- Logical ports
- Layer 2 interfaces, switches, bridges
- Layer 3 routing operations

The objective of the network common API is to define the characteristics that are common for the general network operations and capture them in this common API.  These characteristics are the building blocks that can be used across use cases and allow the basic setup of the physical and logical ports, VLANs, LAG interfaces, switches, etc.

## Network tag values

`IPEntry.tag`, `RuleL3Match.src_tag`, and `RuleL3Match.dst_tag` use `uint32`,
matching cloud mapping and policy-lookup tags. The valid application range is
1 through 4294967294; implementations must reject reserved or invalid values.

Regenerate clients when adopting these field-type changes. Existing positive
values through 2147483647 retain their field numbers and protobuf wire encoding,
but older signed-field clients cannot represent larger tag values. Deploy
updated producers and consumers before using the upper half of the tag range.
This is a generated-language API change, not an unrestricted compatibility claim.

Run the schema and ProtoJSON boundary regression tests with Buf and Go on `PATH`:

```bash
go -C tests test ./...
```

Run this command from the repository root.

## Demos

## Clients

## Reference implementations

## Basic Network Tenants

### Port/Interface

## Documentation for reference to other specifications and implementations

- Openconfig <https://openconfig.net/>
- <https://docs.kernel.org/networking/netlink_spec/rt_link.html>
