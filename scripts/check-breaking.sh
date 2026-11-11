#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0
set -euo pipefail

if [[ $# -gt 1 ]]; then
    echo "Usage: $0 [baseline]" >&2
    exit 2
fi
cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.."
against="${1:-${BUF_BREAKING_AGAINST:-https://github.com/opiproject/opi-api.git#branch=main}}"
args=()
if [[ -n "${BUF_BREAKING_PATH:-}" ]]; then
    args+=(--path "$BUF_BREAKING_PATH")
fi
echo "Checking protobuf compatibility against $against"
exec buf breaking --against "$against" "${args[@]}"
