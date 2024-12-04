# OPI AI/ML APIs

## Overview

The goal of the Open Programmable Infrastructure AI/ML APIs is to define a common interface for the configuration
and management of AI/ML services and network topologies on DPU/IPUs.

The AI network topologies allow for an underlying ethernet connectivity to create a fabric where GPU clusters can interact.

### Network Topology View

### DPU/IPU Network Fabric Path

Following diagram specifies various objects as seen by the DPU/IPU to help manage network fabric connectivity and
offer network services.

``` mermaid
block-beta
  columns 5
  block:T
    S["GPU"]
  end
  space
  space
  space
  block:A
    columns 1
    W["DPU/IPU"]
    block:B
      columns 1
      Z["Policy"]
    end
    block:C
      columns 1
      X["Tunnel"]
    end
    block:D
      columns 1
      Y["IP"]
    end
    block:E
      columns 1
      V["Ethernet"]
    end
    block:F
      columns 1
      U["Port/Interface"]
    end
  end
  space:4
  if(["Physical Interface"])
  T-- "Interface Object" -->A
  A-->if
  style W fill:#0000,stroke:#0000,stroke-width:0
```

The data traffic path from the GPU traverses the through the DPU/IPU from the PCIe interface between the GPU and the DPU/IPU. The
configuration is handled by the interface objects and focuses on the Policy (QoS parameters), the tunnel, the IP address assignment,
the ethernet configuration settings, and any interface object configuration settings to handle items such as RDMA and MTU size.

## Demos

## Clients

## Reference implementations

## Documentation for reference to other specifications and implementations
