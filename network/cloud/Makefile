# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all: buflint bufgen doc

doc:
	rm -rf ./google
	rm -rf ./v1alpha1/{autogen.md}
	mkdir -p  ./v1alpha1

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon":/opinetcommon -v "${PWD}"/v1alpha1/:/out -w /out -v "${PWD}":/protos pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /common -I /opinetcommon -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto /common/*.proto"

	rm -rf "${PWD}"/google


buflint:
	docker run --rm -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon":/opinnetcommon -v "${PWD}":/out -w /out bufbuild/buf lint

bufgen:
	docker run --rm -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon":/opinnetcommon -v "${PWD}/../..":/base -v "${PWD}":/out -w /out msandersdell/bufbuild-go-gen:1.1.0 generate --template /base/buf.gen.yaml -o v1alpha1
