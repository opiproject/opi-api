# OPI Lifecycle APIs

The existing lifecycle services initialize the xPU, enumerate devices, configure
virtual functions, and report heartbeat health. `MaintenanceService` adds a
separate graceful-maintenance contract for the xPU served by the endpoint.

## Maintenance sequence

1. Read `GET /v1/lifecycle/maintenance` to obtain state and an optional etag.
2. Call `POST /v1/lifecycle/maintenance:drain`. The server must atomically block
   new allocations before returning `DRAINING`. This gate covers applicable
   storage, network, security, and VF-creation operations, including racing
   requests. An allocation already admitted must be accounted for as a consumer.
3. Keep management, observation, deletion, and resource-release APIs available.
   The caller stops or migrates existing users; this API does not terminate them
   forcibly or shut down the xPU OS.
4. Poll `GetMaintenance`. `DRAINED` is reported only after the implementation
   verifies that all consumers are released. An omitted consumer count means
   unknown, not zero; a zero count alone is not proof of completed draining.
5. After maintenance, call `POST /v1/lifecycle/maintenance:resume`. The server
   verifies readiness before reopening admission and returning `ACTIVE`.
   Resume may also cancel a drain in progress.

New allocations rejected by maintenance return `FAILED_PRECONDITION`, not
success. Unsupported admission gates return `UNIMPLEMENTED`. If readiness checks
fail, Resume returns `FAILED_PRECONDITION` and admission remains closed in
`ERROR`. Failed background draining is visible through `ERROR` and
`status_message`; management access must remain available for recovery.

An optional etag protects transitions against stale state: a mismatch returns
`ABORTED` without changing admission. Without an etag, repeated drain calls while
draining or drained return the current snapshot without resetting progress or
the original reason. Repeated resume calls while active return the current
snapshot. State and etag updates must be consistent across requests.

Maintenance admission state must survive control-service restarts, or the server
must recover with admission closed until it can reconstruct safe state. Heartbeat
health and admission are separate concepts: healthy does not imply allocatable.

## Implementation and tests

This repository supplies the API contract and generated bindings, not the
vendor-specific admission gate, consumer accounting, or drain implementation.
Existing services and their RPCs are unchanged.

With Buf and Go on `PATH`, run the schema, request, and state round-trip tests
from the repository root:

```bash
go -C tests test ./...
```
