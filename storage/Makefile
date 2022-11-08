# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

CURRENT_VERSION := v1alpha1
COMMON_VERSION := v1

all:
	rm -rf ./$(CURRENT_VERSION)/{autogen.md,gen,google}
	mkdir -p  ./$(CURRENT_VERSION)/gen/{go,cpp,python,java}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/$(COMMON_VERSION)":/common namely/protoc-all:1.47_2 -i /common --lint -d "$(CURRENT_VERSION)" -l go -o ./$(CURRENT_VERSION)/gen/go/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/$(COMMON_VERSION)":/common namely/protoc-all:1.47_2 -i /common --lint -d "$(CURRENT_VERSION)" -l cpp -o ./$(CURRENT_VERSION)/gen/cpp/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/$(COMMON_VERSION)":/common namely/protoc-all:1.47_2 -i /common --lint -d "$(CURRENT_VERSION)" -l python -o ./$(CURRENT_VERSION)/gen/python/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/$(COMMON_VERSION)":/common namely/protoc-all:1.47_2 -i /common --lint -d "$(CURRENT_VERSION)" -l java -o ./$(CURRENT_VERSION)/gen/java/  --go-source-relative

	# protoc doesn't include annotation and http googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	mv google "${PWD}"/$(CURRENT_VERSION)/
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/$(COMMON_VERSION)":/common -v "${PWD}"/$(CURRENT_VERSION)/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter -I /common /out/*.proto --output-format summary"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/$(COMMON_VERSION)":/common -v "${PWD}"/$(CURRENT_VERSION)/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.36.0 -c "api-linter -I /common /out/*.proto --output-format github --disable-rule=core::0192::has-comments --disable-rule=core::0136 --disable-rule=core::0127 --set-exit-status"
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}/../common/$(COMMON_VERSION)":/common -v "${PWD}"/$(CURRENT_VERSION)/:/out -w /out -v "${PWD}"/$(CURRENT_VERSION):/protos pseudomuto/protoc-gen-doc -c "protoc -I /common -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto /common/*.proto"
	rm -rf "${PWD}"/$(CURRENT_VERSION)/google
