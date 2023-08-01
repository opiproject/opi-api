# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	rm -rf ./v1alpha1/{autogen.md,gen,google}
	mkdir -p  ./v1alpha1/gen/{go,cpp,python,java}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l go -o ./v1alpha1/gen/go/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l cpp -o ./v1alpha1/gen/cpp/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l python -o ./v1alpha1/gen/python/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/v1":/common namely/protoc-all:1.47_2 -i /common --lint -d v1alpha1 -l java -o ./v1alpha1/gen/java/  --go-source-relative

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	mv google "${PWD}"/v1alpha1/
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/v1":/common -v "${PWD}"/v1alpha1/:/out -w /out -v "${PWD}"/v1alpha1:/protos pseudomuto/protoc-gen-doc -c "protoc -I /common -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto /common/*.proto"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/v1":/common -v "${PWD}"/v1alpha1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter -I /common /out/*.proto --output-format summary"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/v1":/common -v "${PWD}"/v1alpha1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter -I /common /out/*.proto --output-format github --disable-rule=core::0192::has-comments --disable-rule=core::0156 --set-exit-status"
	rm -rf "${PWD}"/v1alpha1/google
