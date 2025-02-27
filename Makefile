# SPDX-License-Identifier: Apache-2.0
# Copyright (C) 2022 Intel Corporation
# Copyright (c) 2022 - 2025 Dell Inc, or its subsidiaries.

APIVER = v1

all: buflint bufgen

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
