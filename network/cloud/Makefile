# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all: buflint apilint bufgen doc

doc:
	rm -rf ./google
	rm -rf ./v1alpha1/{autogen.md}
	mkdir -p  ./v1alpha1

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../opinetcommon":/opinetcommon -v "${PWD}"/v1alpha1/:/out -w /out -v "${PWD}":/protos pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /opinetcommon -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto"

	rm -rf "${PWD}"/google

apilint:
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	docker run --user=$(id -u):$(id -g) --rm --entrypoint=sh -v "${PWD}/../../network/opinetcommon":/common -v "${PWD}":/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.56.1 -c "api-linter -I /common /out/*.proto --output-format github --disable-rule=core::0123 --disable-rule=core::0131 --disable-rule=core::0132 --disable-rule=core::0133 --disable-rule=core::0134 --disable-rule=core::0140 --disable-rule=core::0156 --disable-rule=core::0158 --disable-rule=core::0191 --disable-rule=core::0192 --disable-rule=core::0203 --disable-rule=core::0216 --disable-rule=client-libraries::4232::required-fields --set-exit-status"
	rm -rf "${PWD}"/google

buflint:
	docker run --rm -v "${PWD}/../opinetcommon":/opinnetcommon -v "${PWD}":/out -w /out bufbuild/buf lint

bufgen:
	docker run --rm -v "${PWD}/../opinetcommon":/opinnetcommon -v "${PWD}/../..":/base -v "${PWD}":/out -w /out msandersdell/bufbuild-go-gen:1.1.0 generate --template /base/buf.gen.yaml -o v1alpha1
