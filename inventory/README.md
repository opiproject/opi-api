# OPI Inventory APIs

## Demos

None

## Clients

see <https://github.com/opiproject/pydpu> and <https://github.com/opiproject/godpu>

## Reference implementations

- <https://github.com/opiproject/opi-smbios-bridge>

_All implementations above are reference only and __not__ meant to be used as-is in production_

## More documentation

see <https://github.com/opiproject/opi-prov-life/tree/main/inventory>

## Implementation

Compile it as:

```bash
docker run --user=$$(id -u):$$(id -g) --rm -v "${PWD}":/defs namely/protoc-all:1.51_2 -i /common --lint -d v1 -l go -o ./v1/gen/go/  --go-source-relative
```

Linter it as:

```bash
docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}"/v1/:/out -w /out ghcr.io/docker-multiarch/google-api-linter:1.57.0 -c "api-linter -I /common /out/*.proto --output-format github --set-exit-status"
```

Additional linter:

```bash
docker run --rm -it -v /etc/pki/ca-trust/extracted/pem/tls-ca-bundle.pem:/etc/ssl/certs/ca-certificates.crt -v "$(pwd):/workspace" -w /workspace bufbuild/buf lint
```

Generate [docs](v1/autogen.md) as:

```bash
docker run --user=$$(id -u):$$(id -g) --rm --entrypoint=sh -v "${PWD}"/v1alpha1/:/out -w /out -v "${PWD}"/v1:/protos pseudomuto/protoc-gen-doc:1.5.1 -c "protoc -I /common -I /protos --doc_out=/out --doc_opt=markdown,autogen.md /protos/*.proto"
```

Test your APIs even if unmerged using your private fork like this:

```bash
chmod a+w go.*
docker run --rm -it -v `pwd`:/app -w /app golang:alpine go mod edit -replace github.com/opiproject/opi-api@main=github.com/YOURUSERNAME/opi-api@main
docker run --rm -it -e GO111MODULE=on -v `pwd`:/app -w /app golang:alpine go get -u github.com/YOURUSERNAME/opi-api/inventory/v1/gen/go@a98ca449468a
```

## Documentation for reference of other specs

- <https://www.dmtf.org/standards/smbios>
- <https://linux.die.net/man/8/dmidecode>
- <https://github.com/jaypipes/ghw>
