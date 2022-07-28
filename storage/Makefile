# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	docker run -v "${PWD}":/defs namely/protoc-all -d proto -l go -o ./proto/  --go-source-relative
	docker run --rm -v "${PWD}"/proto/:/out -v "${PWD}"/proto:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md
