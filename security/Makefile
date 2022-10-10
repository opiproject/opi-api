# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	# Build root security protos

	rm -rf ./v1/{autogen.md,gen}
	mkdir -p  ./v1/gen/{go,cpp,python}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d v1 -l go -o ./v1/gen/go/ --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d v1 -l cpp -o ./v1/gen/cpp/ --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.47_2 --lint -d v1 -l python -o ./v1/gen/python/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1/:/out -v "${PWD}"/v1:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md

	# Build firewall protos
	rm -rf ./firewall/v1/{autogen.md,gen}
	mkdir -p  ./firewall/v1/gen/{go,cpp,python}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d firewall/v1 -l go -o ./firewall/v1/gen/go/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d firewall/v1 -l cpp -o ./firewall/v1/gen/cpp/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d firewall/v1 -l python -o ./firewall/v1/gen/python/  --go-source-relative

	# protoc-gen-doc doesn't support proto include paths parameter so we have to copy
	# common included files to the proto directory
	cp ../common/v1/uuid.proto "${PWD}"/firewall/v1

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/firewall/v1/:/out -v "${PWD}"/firewall/v1:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md

	# Run linters
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1/:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter /out/*.proto --output-format summary"
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/firewall/v1/:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter /out/*.proto --output-format summary"

	# remove common included files from the proto directory
	rm "${PWD}"/firewall/v1/uuid.proto
