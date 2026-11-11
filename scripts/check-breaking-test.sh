#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0
set -euo pipefail

root="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
fixture="$(mktemp -d)"
trap 'rm -rf -- "$fixture"' EXIT
mkdir -p "$fixture/baseline" "$fixture/current/scripts"
cp "$root/scripts/check-breaking.sh" "$fixture/current/scripts/"
printf 'version: v2\n' | tee "$fixture/baseline/buf.yaml" > "$fixture/current/buf.yaml"
cat > "$fixture/baseline/compat.proto" <<'PROTO'
syntax = "proto3";
package compat.v1;
message Example {
  string original = 1;
}
PROTO
cp "$fixture/baseline/compat.proto" "$fixture/current/compat.proto"
buf build "$fixture/baseline" --as-file-descriptor-set -o "$fixture/baseline.binpb"

BUF_BREAKING_AGAINST="$fixture/baseline.binpb" \
    bash "$fixture/current/scripts/check-breaking.sh"
BUF_BREAKING_PATH=compat.proto \
    bash "$fixture/current/scripts/check-breaking.sh" "$fixture/baseline.binpb"

cat > "$fixture/current/compat.proto" <<'PROTO'
syntax = "proto3";
package compat.v1;
message Example {
  string original = 1;
  string added = 2;
}
PROTO
bash "$fixture/current/scripts/check-breaking.sh" "$fixture/baseline.binpb"

cat > "$fixture/current/compat.proto" <<'PROTO'
syntax = "proto3";
package compat.v1;
message Example {}
PROTO
if bash "$fixture/current/scripts/check-breaking.sh" "$fixture/baseline.binpb"; then
    echo "Removing an existing field must fail compatibility checking." >&2
    exit 1
fi
if bash "$fixture/current/scripts/check-breaking.sh" "$fixture/missing.binpb"; then
    echo "An unavailable baseline must fail compatibility checking." >&2
    exit 1
fi
echo "Compatibility runner: all five regression cases passed."
