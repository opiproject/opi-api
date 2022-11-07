# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	rm -rf ./v1alpha1/{autogen.md,gen,google}
	mkdir -p  ./v1alpha1/gen/{go,cpp,python}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l go -o ./v1alpha1/gen/go/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l cpp -o ./v1alpha1/gen/cpp/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l python -o ./v1alpha1/gen/python/  --go-source-relative

	# protoc-gen-doc doesn't support proto include paths parameter so we have to copy
	# common included files to the proto directory
	cp ../common/v1/uuid.proto "${PWD}"/v1alpha1
	cp ../common/v1/object_key.proto "${PWD}"/v1alpha1
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	mv google "${PWD}"/v1alpha1/

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1alpha1/:/out -v "${PWD}"/v1alpha1:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1alpha1/:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter /out/*.proto --output-format summary"

# remove common included files from the proto directory
	rm "${PWD}"/v1alpha1/uuid.proto
	rm "${PWD}"/v1alpha1/object_key.proto
	rm -rf "${PWD}"/v1alpha1/google