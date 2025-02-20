# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 - 2025 Dell Inc, or its subsidiaries.

APIVER = v1

all: buflint apilint bufgen doc

doc:
	rm -rf ./google
	rm -f ./${APIVER}/autogen.md
	mkdir -p  ./${APIVER}

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh \
		-v "${PWD}"/${APIVER}/:/out \
		-w /out \
		-v "${PWD}":/protos \
		pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto"

	rm -rf "${PWD}"/google

apilint:
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	docker run --user=$(id -u):$(id -g) --rm --entrypoint=sh \
		-v "${PWD}":/out \
		-w /out \
		ghcr.io/docker-multiarch/google-api-linter:1.56.1 -c "api-linter /out/*.proto --output-format github --set-exit-status"
	rm -rf "${PWD}"/google

buflint:
	docker run --rm -v "${PWD}":/out -w /out bufbuild/buf:1.50.0 lint

bufgen:
	docker run --rm \
		-v "${PWD}":/base \
		-v "${PWD}":/out \
		-w /out \
		ghcr.io/sandersms/bufbuild-go-gen:latest generate --template /base/buf.gen.yaml -o ${APIVER}

bufformat:
	# format the protobuf using buf industry standard
	buf format --diff -w
