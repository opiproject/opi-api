#!/usr/bin/env bash
set -euo pipefail

source "$(dirname -- "${BASH_SOURCE[0]}")/../verified-download.sh"
workdir="$(mktemp -d)"
trap 'rm -rf -- "$workdir"' EXIT
verified_download \
    "${BLUEFIELD_NET_RULES_URL:-https://gitlab.cee.redhat.com/egarver/smart-nic-poc/-/raw/master/provision/bf2/bluefield-net-rules.tgz}" \
    "$workdir/bluefield-net-rules.tgz" "${BLUEFIELD_NET_RULES_SHA256:-}"
tar xf "$workdir/bluefield-net-rules.tgz" -C "$workdir" --no-same-owner
cd "$workdir/bluefield-net-rules"
./install.sh
