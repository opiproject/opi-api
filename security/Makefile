# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	# Build root security protos

	rm -rf ./v1/{autogen.md,gen}
	mkdir -p  ./v1/gen/{go,cpp,python}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2 --lint -d v1 -l go -o ./v1/gen/go/ --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2 --lint -d v1 -l cpp -o ./v1/gen/cpp/ --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2 --lint -d v1 -l python -o ./v1/gen/python/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1/:/out -v "${PWD}"/v1:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	mv google "${PWD}"/v1/
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/v1":/common -v "${PWD}"/v1/:/out -w /out -v "${PWD}"/v1:/protos pseudomuto/protoc-gen-doc -c "protoc -I /common -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto /common/*.proto"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/v1":/common -v "${PWD}"/v1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter -I /common /out/*.proto --output-format summary"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/v1":/common -v "${PWD}"/v1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter -I /common /out/*.proto --output-format github --disable-rule=core::0192 --disable-rule=core::0191 --disable-rule=core::0140 --disable-rule=core::0123 --disable-rule=core::0142 --disable-rule=core::0126 --disable-rule=core::0127 --disable-rule=core::0141 --set-exit-status"
	rm -rf "${PWD}"/v1/google
