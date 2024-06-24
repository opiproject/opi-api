# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

APIVER = v2alpha1

all: buflint apilint bufgen doc

doc:
	rm -rf ./google
	rm -f ./${APIVER}/autogen.md
	mkdir -p  ./${APIVER}

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh \
		-v "${PWD}/${APIVER}":/out \
		-v "${PWD}/../network/opinetcommon":/opinetcommon \
		-w /out \
		-v "${PWD}":/protos \
		pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /protos -I /opinetcommon --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto"

	rm -rf "${PWD}"/google

apilint:
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	docker run --user=$(id -u):$(id -g) --rm --entrypoint=sh -v "${PWD}":/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.56.1 -c "api-linter -I /common /out/*.proto --output-format github --disable-rule=core::0192 --disable-rule=core::0191 --disable-rule=core::0140 --disable-rule=core::0123 --disable-rule=core::0142 --disable-rule=core::0126 --disable-rule=core::0127 --disable-rule=core::0141 --disable-rule=core::0203 --disable-rule=core::0216 --set-exit-status"
	rm -rf "${PWD}"/google

buflint:
	docker run --rm -v "${PWD}":/out -w /out bufbuild/buf lint

bufgen:
	docker run --rm -v "${PWD}/..":/base -v "${PWD}":/out -w /out msandersdell/bufbuild-go-gen:1.1.0 generate --template /base/buf.gen.yaml -o ${APIVER}
