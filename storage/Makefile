# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	rm -rf ./proto/{autogen.md,*.pb.go}
	docker run -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d proto -l go -o ./proto/  --go-source-relative
	docker run --rm -v "${PWD}"/proto/:/out -v "${PWD}"/proto:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md
