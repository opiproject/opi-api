#!/usr/bin/env bash
# SPDX-License-Identifier: Apache-2.0
set -euo pipefail

root="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")/.." && pwd)"
fixture="$(mktemp -d)"
trap 'rm -rf -- "$fixture"' EXIT
mkdir -p "$fixture/scripts" "$fixture/bin"
cp "$root/scripts/api-lint.sh" "$fixture/scripts/"

cat > "$fixture/bin/buf" <<'STUB'
#!/usr/bin/env bash
set -euo pipefail
case "$1" in
    ls-files)
        [[ "${TEST_CASE:-}" != list-failure ]] || exit 23
        [[ "${TEST_CASE:-}" != empty ]] || exit 0
        printf '%s\n' inventory/inventory.proto network/cloud/cloudrpc.proto
        ;;
    build)
        [[ "${TEST_CASE:-}" != build-failure ]] || exit 24
        [[ "$2" == --as-file-descriptor-set && "$3" == -o ]]
        printf descriptor > "$4"
        ;;
    *) exit 25 ;;
esac
STUB

cat > "$fixture/bin/api-linter" <<'STUB'
#!/usr/bin/env bash
set -euo pipefail
[[ "$1" == --descriptor-set-in && -s "$2" ]]
[[ "$3" == --set-exit-status && "$4" == --output-format && "$5" == summary ]]
[[ "$6" == inventory/inventory.proto && "$7" == network/cloud/cloudrpc.proto ]]
[[ $# == 7 ]]
[[ "${TEST_CASE:-}" != lint-failure ]] || exit 26
STUB
chmod +x "$fixture/bin/buf" "$fixture/bin/api-linter"

for scenario in success empty list-failure build-failure lint-failure; do
    expected=0
    case "$scenario" in
        empty) expected=1 ;;
        list-failure) expected=23 ;;
        build-failure) expected=24 ;;
        lint-failure) expected=26 ;;
    esac
    actual=0
    TEST_CASE="$scenario" PATH="$fixture/bin:$PATH" \
        bash "$fixture/scripts/api-lint.sh" > "$fixture/output" 2>&1 || actual=$?
    if [[ "$actual" != "$expected" ]]; then
        cat "$fixture/output" >&2
        echo "$scenario: expected exit $expected, got $actual" >&2
        exit 1
    fi
done
echo "API lint runner: all five regression cases passed."
