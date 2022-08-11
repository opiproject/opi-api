# OPI API and Behavioral Model Group

[![MarkdownLint](https://github.com/opiproject/opi-api/actions/workflows/markdown.yml/badge.svg)](https://github.com/opiproject/opi-api/actions/workflows/markdown.yml)
[![OPI Storage API CI](https://github.com/opiproject/opi-api/actions/workflows/storage.yml/badge.svg)](https://github.com/opiproject/opi-api/actions/workflows/storage.yml)
[![OPI Security API CI](https://github.com/opiproject/opi-api/actions/workflows/security.yml/badge.svg)](https://github.com/opiproject/opi-api/actions/workflows/security.yml)

## Overview

OPI subgroup dealing with APIs.  The focus of the subgroup is:

- Define the object models for each of the components and services on the platform.
  - Define the layering of the capabilities that are abstracted
- Define both host system facing and control/management facing APIs
  - Discovery and Service Advertisement API
  - Capabilities/Capacity Advertisement API
    - Information such as Processor Cores available, Bandwidth, Memory, etc.
  - Configuration API
  - Consumption API for the data connections to the Host Compute
- Create a Taxonomy for services:
  - [Networking](network/README.md)
  - [Security](security/README.md)
  - [Storage](storage/README.md)
  - Gateway
  - Telemetry
  - [AI/ML](aiml/README.md)
  - others
- Define recommended industry APIs to be used.
  - Examples (OVS DB, OpenConfig, VPP)
- Identify gaps in APIs and recommend extensions for those capabilities
- Create/Define the Backend/Southbound facing interface APIs
- Produce protocol buffer (protobuf) definitions.
- Produce reference orchestration client to support testing of the API.

The API subgroup does not want to re-invent any industry standard APIs that already exist.  Standard APIs such as OVS DB, OpenConfig, VPP, etc. that are used for configuration of service capabilities will be reviewed and examined for gaps.  Gaps in capabilities will be addressed either by defining extensions to existing APIs or new APIs will need to be defined (such as Storage APIs).

The API subgroup does not want to re-invent any industry standard APIs that already exist.  Standard APIs such as OVS DB, OpenConfig, VPP, etc. that are used for configuration of service capabilities will be reviewed and examined for gaps.  Gaps in capabilities will be addressed either by defining extensions to existing APIs or new APIs will need to be defined (such as Storage APIs).

---

- Leader
  - [Mark Sanders](https://github.com/sandersms)
- Meeting Time & Date
  - Thursdays 12:00-13:00 ET
- Slack Channel
  - [open-api-subgroup](https://opi-project.slack.com/archives/C0344KMEAKB)
- Status
  - Active

## I Want To Contribute

This project welcomes contributions and suggestions.  We are happy to have the Community involved via submission of **Issues and Pull Requests** (with substantive content or even just fixes). We are hoping for the documents, test framework, etc. to become a community process with active engagement.  PRs can be reviewed by by any number of people, and a maintainer may accept.

See [CONTRIBUTING](https://github.com/opiproject/opi/blob/main/CONTRIBUTING.md) and [GitHub Basic Process](https://github.com/opiproject/opi/blob/main/doc-github-rules.md) for more details.
