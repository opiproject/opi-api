# Copyright (C) 2022 Intel Corporation
# SPDX-License-Identifier: Apache-2.0

all: proto/backend.pb.go proto/frontend.pb.go proto/middleend.pb.go
	docker run -v ${PWD}:/defs namely/protoc-all -d proto -l go -o ./proto/  --go-source-relative
