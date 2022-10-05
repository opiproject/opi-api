# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	rm -rf ./v1/{autogen.md,*.py}
	rm -rf ./v1/gen

	docker run -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1 -l go -o ./v1/gen/go/  --go-source-relative
	docker run -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1 -l cpp -o ./v1/gen/cpp/  --go-source-relative
	docker run -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1 -l python -o ./v1/gen/python/  --go-source-relative


	# protoc-gen-doc doesn't support proto include paths parameter so we have to copy
	# common included files to the proto directory
	cp ../common/v1/uuid.proto "${PWD}"/v1

	docker run --rm -v "${PWD}"/v1/:/out -v "${PWD}"/v1:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md
	docker run --rm -v "${PWD}"/v1/:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter /out/*.proto --output-format summary"

# remove common included files from the proto directory
	rm "${PWD}"/v1/uuid.proto