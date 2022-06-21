# OPI Storage Interface

Authors:
* Boris Glimcher <<boris.glimcher@dell.com>> (@glimchb)
* tbd...

## Documentation for reference

* https://github.com/spdk/spdk/blob/master/doc/sma.md
* https://github.com/container-storage-interface/spec/blob/master/spec.md
* https://spdk.io/doc/jsonrpc.html
* https://github.com/linux-nvme/nvme-cli

## Terminology

| Term              | Definition                                       |
|-------------------|--------------------------------------------------|
| Block Volume      | A volume that will appear as a block device inside the host OS.                                                     |
| tbd               | tbd                                              |

## Objective

To define an industry standard “OPI Storage Interface” for IPUs/DPUs that will enable DPU vendors to develop a plugin once and have it work across a number of orchestration systems.

### Goals in MVP

tbd..

### Non-Goals in MVP

tbd...

## Solution Overview

tbd...

### Architecture

![Storage Services Offload Use Case](../doc/minutes/images/API-Storage-Use-Case.png)
![Storage APIs High Level Diagram](DPU-API-Storage.png)

Following CRUD API (CREATE, READ, UPDATE, and DELETE)

We do want this to be gRPC with protobuf based...

We do want to include statistics for observability on every level...

tbd...

### Front End (host-facing)

This DPU emulated devices representation to the host.
It should have all the correct controllable parameters according to NVMe spec.


Q: do we need same for VirtIO ?


![NVMe examplained](nvme-sub-ctrl-ns.png)

3 Objects are identified on this layer:
- NVMe Subsystem - holding all other objects in NVMe world.
- NVMe Controller - responsible for Queues and Commands handlings. Have to belong to some subsystem.
- NVMe Namespace - representing remote namespace. Belongs to a apecific controller (private NS) or shared between controllers (usually for Multipathing).


#### `NVMe Subsystem Create`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | SN                  | Subsystem Serial Number                      |
| string         | Model               | Subsystem Model Number                       |
| string         | Max NS              | Maximum namespaces allowed in this subsystem |

#### `NVMe Subsystem Delete`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Subsystem Update`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | SN                  | Subsystem Serial Number                      |
| string         | Model               | Subsystem Model Number                       |
| string         | Max NS              | Maximum namespaces allowed in this subsystem |

#### `NVMe Subsystem List`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|

#### `NVMe Subsystem Get`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Subsystem Stats`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Controller Create`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |
| string         | PCIe ID             | Controller PCIe ID (bus, device, PF, VF)     |
| number         | MaxIOQPs            | Max IO queue pairs (SQ/CQ) supported         |
| number         | MaxNS               | Max number of namespaces for this controller |

#### `NVMe Controller Delete`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |

#### `NVMe Controller Update`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |
| string         | PCIe ID             | Controller PCIe ID (bus, device, PF, VF)     |
| number         | MaxIOQPs            | Max IO queue pairs (SQ/CQ) supported         |
| number         | MaxNS               | Max number of namespaces for this controller |

#### `NVMe Controller List`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |

#### `NVMe Controller Get`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |

#### `NVMe Controller Stats`

| Type           | Parameter           | Details                                      | 
|----------------|---------------------|----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                         |
| string         | Controller ID       | Unique controller ID                         |

#### `NVMe Namespace Create`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |
| string         | BDEV                | Block device that backing this namespace      |
| number         | BlockSize           | Block Size of each block (Defaults to 4KiB)   |
| number         | NumBlocks           | Size/Capacity of the namespace in blocks      |
| string         | NGUID               | namespace globally unique identifier          |
| string         | EUI64               | namespace EUI-64 identifier                   |
| string         | UUID                | namespace UUID                                |
| string         | Multipath           | TBD RESERVED                                  |
| string         | Security/Auth       | TBD RESERVED                                  |

#### `NVMe Namespace Delete`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |

#### `NVMe Namespace Update`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |
| string         | BDEV                | Block device that backing this namespace      |
| number         | BlockSize           | Block Size of each block (Defaults to 4KiB)   |
| number         | NumBlocks           | Size/Capacity of the namespace in blocks      |
| string         | NGUID               | namespace globally unique identifier          |
| string         | EUI64               | namespace EUI-64 identifier                   |
| string         | UUID                | namespace UUID                                |
| string         | Multipath           | TBD RESERVED                                  |
| string         | Security/Auth       | TBD RESERVED                                  |

#### `NVMe Namespace List`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |

#### `NVMe Namespace Get`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |

#### `NVMe Namespace Stats`

| Type           | Parameter           | Details                                       | 
|----------------|---------------------|-----------------------------------------------|
| string         | Subsystem NQN       | NVMe subsystem (NQN)                          |
| string         | Controller ID       | Unique controller ID                          |
| string         | NSID                | namespace ID                                  |

### Back End (network-facing)

#### `NVMf Remote Controller Connect`

| Type           | Parameter           | Details                                             | 
|----------------|---------------------|-----------------------------------------------------|
| string         | trtype              | NVMe-oF target trtype: rdma or tcp or pcie          |
| string         | traddr              | NVMe-oF target address: ip or BDF                   |
| string         | adrfam              | NVMe-oF target adrfam: ipv4, ipv6, ib, fc           |
| string         | trsvcid             | NVMe-oF target trsvcid: port number                 |
| string         | subnqn              | NVMe-oF target subnqn                               |
| bool           | hdgst               | Enable TCP header digest                            |
| bool           | ddgst               | Enable TCP data digest                              |
| string         | multipath           | Multipathing behavior: disable, failover, multipath |
| number         | num_io_queues       | The number of IO queues to request on connect       |
| number         | queue_size          | The number of io queue elements to use (def 128)    |

#### `NVMf Remote Controller Disconnect`

tbd

#### `NVMf Remote Controller Reset`

tbd

#### `NVMf Remote Controller List`

tbd

#### `NVMf Remote Controller Get`

tbd

#### `NVMf Remote Controller Stats`

tbd

Q: do we need same for iSCSI, AIO, NULL, MEM ?
Q: security authentication (chap) ?
Q: auto-discovery ?
Q: custom plugins for custom storage protocols ?

### Middle End (Storage Services)

Examples: compression, encryption, EC/Raid, lvm, ...

tbd...
