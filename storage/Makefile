# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

CURRENT_VERSION := v1alpha1
COMMON_VERSION := v1

# Make a variable named ','. Used to pass arguments to functions that contain a comma
, := ,

define protoc_compile
	mkdir -p $(CURRENT_VERSION)/gen/$(1)
	protoc --proto_path=../common/$(COMMON_VERSION) --proto_path=$(CURRENT_VERSION) --proto_path=googleapis \
		--$(1)_out=$(CURRENT_VERSION)/gen/$(1) \
		$(2) \
		$(CURRENT_VERSION)/*.proto
endef

define docker_compile
	rm -rf ./$(CURRENT_VERSION)/gen/$(1)
	mkdir -p ./$(CURRENT_VERSION)/gen/$(1)
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs -v "${PWD}/../common/$(COMMON_VERSION)":/common namely/protoc-all:1.47_2 \
		-i /common --lint -d "$(CURRENT_VERSION)" -l $(1) -o ./$(CURRENT_VERSION)/gen/$(1)/  --go-source-relative
endef

define docker_run
	docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh \
		-v "${PWD}/../common/$(COMMON_VERSION)":/common \
		-v "${PWD}/$(CURRENT_VERSION)/":/out \
		-v "${PWD}/googleapis":/googleapis \
		-w /out \
		$(1) \
		-c "$(2)"
endef

all: python cpp go java doc lint

.PHONY: python cpp go java lint doc

python:
	$(call docker_compile,python)

cpp:
	$(call docker_compile,cpp)

go:
	$(call docker_compile,go)

java:
	$(call docker_compile,java)

lint: googleapis/google
	$(call docker_run,\
		ghcr.io/docker-multiarch/google-api-linter:1.36.0,\
		api-linter -I /common -I /googleapis /out/*.proto --output-format summary)

	$(call docker_run,\
		ghcr.io/docker-multiarch/google-api-linter:1.36.0,\
		api-linter -I /common -I /googleapis /out/*.proto --output-format github --disable-rule=core::0192::has-comments --disable-rule=core::0136 --disable-rule=core::0127 --set-exit-status)

doc: googleapis/google
	$(call docker_run,\
		pseudomuto/protoc-gen-doc,\
		protoc -I /common  -I /googleapis -I /out --doc_out=/out/gen/doc --doc_opt=markdown$(,)autogen.md /out/*.proto /common/*.proto)

googleapis/google:
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	mkdir -p googleapis
	mv google googleapis/

clean:
	rm -rf googleapis

local: python_local cpp_local go_local java_local doc_local

python_local: googleapis/google
	$(call protoc_compile,python,)

cpp_local: googleapis/google
	$(call protoc_compile,cpp,)

go_local: googleapis/google
	$(call protoc_compile,go,)
	mv $(CURRENT_VERSION)/gen/go/github.com/opiproject/opi-api/storage/$(CURRENT_VERSION)/gen/go/* $(CURRENT_VERSION)/gen/go/

java_local: googleapis/google
	$(call protoc_compile,java,)

doc_local: googleapis/google
	$(call protoc_compile,doc,--doc_opt=markdown$(,)autogen.md)
