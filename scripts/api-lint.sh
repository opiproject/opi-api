#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0
set -euo pipefail

cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.."
schema_list="$(buf ls-files)"
if [[ -z "$schema_list" ]]; then
    echo "No protobuf schemas found; refusing to skip API lint." >&2
    exit 1
fi
mapfile -t schemas <<< "$schema_list"

descriptor="$(mktemp)"
trap 'rm -f -- "$descriptor"' EXIT
buf build --as-file-descriptor-set -o "$descriptor"
echo "Linting ${#schemas[@]} protobuf schemas."
api-linter --descriptor-set-in "$descriptor" --set-exit-status \
    --output-format summary "${schemas[@]}"
