#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0

# The expected digest must come from a separately trusted publisher manifest.
verified_download() (
    set -euo pipefail
    if [[ $# != 3 ]]; then
        echo "Usage: verified_download HTTPS_URL DESTINATION TRUSTED_SHA256" >&2
        exit 2
    fi
    url="$1"
    destination="$2"
    expected="$3"
    if [[ "$url" != https://* ]]; then
        echo "Artifact downloads require HTTPS." >&2
        exit 2
    fi
    if [[ ! "$expected" =~ ^[[:xdigit:]]{64}$ ]]; then
        echo "A trusted SHA-256 digest is required before downloading an artifact." >&2
        exit 2
    fi
    mkdir -p -- "$(dirname -- "$destination")" || exit $?
    if [[ -f "$destination" ]] &&
        printf '%s  %s\n' "$expected" "$destination" | sha256sum --check --status; then
        return 0
    fi
    temporary="$(mktemp "${destination}.download.XXXXXX")" || exit $?
    trap 'rm -f -- "$temporary"' EXIT
    ca_options=()
    if [[ -n "${CURL_CA_BUNDLE:-}" ]]; then
        ca_options=(--cacert "$CURL_CA_BUNDLE")
    fi
    curl --disable "${ca_options[@]}" --fail --location --silent --show-error \
        --proto '=https' --proto-redir '=https' \
        --output "$temporary" -- "$url" || exit $?
    if ! printf '%s  %s\n' "$expected" "$temporary" | sha256sum --check --status; then
        echo "Artifact checksum verification failed." >&2
        exit 1
    fi
    mv -f -- "$temporary" "$destination" || exit $?
)
