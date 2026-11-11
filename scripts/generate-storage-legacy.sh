#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0
set -euo pipefail

root="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
temporary="$(mktemp -d)"
trap 'rm -rf -- "$temporary"' EXIT

cd "$root"
buf export . --path storage --output "$temporary"
shopt -s nullglob
sources=("$temporary/storage/"*.proto)
if [[ ${#sources[@]} == 0 ]]; then
    echo "No storage protobuf sources were exported." >&2
    exit 1
fi
mv -- "${sources[@]}" "$temporary/"
sources=("$temporary/"*.proto)
# Freeze legacy descriptor and Go-package identities independently of root layout.
sed -i \
    -e 's|import "storage/|import "|g' \
    -e 's|^option go_package = ".*";|option go_package = "github.com/opiproject/opi-api/storage/v1alpha1/gen/go";|' \
    "${sources[@]}"
paths=()
for source in "${sources[@]}"; do
    paths+=(--path "${source##*/}")
done
cd "$temporary"
buf generate . --config '{"version":"v2"}' \
    --template "$root/buf.storage-legacy.gen.yaml" \
    --output "$root/storage/v1alpha1" "${paths[@]}"
