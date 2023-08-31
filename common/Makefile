# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 Dell Inc, or its subsidiaries.

all:
	rm -rf ./v1/{autogen.md,gen}
	mkdir -p  ./v1/gen/{go,cpp,python,java}

	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2  --lint -d v1 -l go -o ./v1/gen/go/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2  --lint -d v1 -l cpp -o ./v1/gen/cpp/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2  --lint -d v1 -l python -o ./v1/gen/python/  --go-source-relative
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2  --lint -d v1 -l java -o ./v1/gen/java/  --go-source-relative

	# protoc doesn't include the googleapis, so we have to get them here
	curl -kL https://github.com/googleapis/googleapis/archive/master.tar.gz | tar --strip=1 -zxvf - googleapis-master/google/api
	mv google "${PWD}"/v1/
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1/:/out -v "${PWD}"/v1:/protos pseudomuto/protoc-gen-doc --doc_opt=markdown,autogen.md
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1/:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.56.1 -c "api-linter /out/*.proto --output-format summary"
	docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}"/v1/:/out -w /out --entrypoint=sh ghcr.io/docker-multiarch/google-api-linter:1.56.1 -c "api-linter /out/*.proto --output-format github --set-exit-status"
	rm -rf "${PWD}"/v1/google

