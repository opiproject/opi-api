# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.
# Copyright (C) 2023 Nordix Foundation.

all:
	rm -rf ./google
	rm -rf ./v1alpha1/{autogen.md,gen,google}
	mkdir -p  ./v1alpha1/gen/{go,cpp,python,java}

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v ${PWD}/google/api:/opt/include/google/api namely/protoc-all:1.51_2 -i /common -i /opinetcommon --lint -d v1alpha1 -l go -o ./v1alpha1/gen/go/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v ${PWD}/google/api:/opt/include/google/api namely/protoc-all:1.51_2 -i /common -i /opinetcommon --lint -d v1alpha1 -l cpp -o ./v1alpha1/gen/cpp/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v ${PWD}/google/api:/opt/include/google/api namely/protoc-all:1.51_2 -i /common -i /opinetcommon --lint -d v1alpha1 -l python -o ./v1alpha1/gen/python/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v ${PWD}/google/api:/opt/include/google/api namely/protoc-all:1.51_2 -i /common -i /opinetcommon --lint -d v1alpha1 -l java -o ./v1alpha1/gen/java/  --go-source-relative

	mv google "${PWD}"/v1alpha1/

	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v "${PWD}"/v1alpha1/:/out -w /out -v "${PWD}"/v1alpha1:/protos pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /common -I /opinetcommon -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto /common/*.proto"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v "${PWD}"/v1alpha1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.58.1 -c "api-linter -I /common -I /opinetcommon /out/*.proto --output-format summary"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../../common/v1":/common -v "${PWD}/../opinetcommon/v1alpha1":/opinetcommon -v "${PWD}"/v1alpha1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.58.1 -c "api-linter -I /common -I /opinetcommon /out/[!oc]*.proto --output-format github --set-exit-status"
	rm -rf "${PWD}"/v1alpha1/google
