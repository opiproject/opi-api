# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all: buflint bufgen doc

doc:
	rm -rf ./google
	rm -f ./v1/autogen.md
	mkdir -p  ./v1

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}"/v1/:/out -w /out -v "${PWD}":/protos pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto"

	rm -rf "${PWD}"/google

buflint:
	docker run --rm -v "${PWD}":/out -w /out bufbuild/buf lint

bufgen:
	docker run --rm -v "${PWD}/..":/base -v "${PWD}":/out -w /out msandersdell/bufbuild-go-gen:1.1.0 generate --template /base/buf.gen.yaml -o v1
