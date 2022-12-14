# Extending OPI APIs

OPI GRPC APIs may be extended to allow an inclusive way to evolve and extend OPI APIs. The use cases for doing vendor extensions
may vary, following guidelines can help determine if a new field/message should be considered for an extension as opposed to a
native OPI field/message.

- Vendor specific feature: If the proposed extension implements a vendor specific feature, then it should be added as an extension.
A generic feature should be considered as part of the native OPI API in the respective areas (network, storage, security, etc.).
Note that all OPI API fields/messages may not be mandatory, allowing vendors to implement them as their product and/or software
release process occurs
- Vendor specific limitation: If the proposed extension exposes a limitation of a product, then it should be added as an extension.
Having limits on many features and scale limits may be generic, however a vendor specific limitation is specific to a product from
a vendor or generically with a vendor. For example, exposing a limitation on the number of VFs a device should expose, is a limitation
of a device. But all xPUs  limit the maximum number of VFs supported. So this limit may qualify as a generic limitation and doesn't
belong in vendor specific extensions. On the other hand, if a vendor's product (say, an older generation of xPU) has a limitation on
supporting VirtIO device emulation onf PF/VFs, then that would be a vendor (specifically vendor's product) specific limitation.
- Experimental feature: If the proposed extension is an experimental feature that a vendor wants to expose but it lacks general
consensus that this is a generic feature. For example, providing deeper IO telemetry (e.g. IO completion time, read/write failure
codes) seems generic enough, but can start as a vendor extension (in Status part of an object), and can make into OPI API as it
gains more adoption/support. On the other hand, supporting a custom programmable compression algorithm is likely goin to be
vendor specific feature.
- The boundaries on generic vs vendor specific extensions may look blur - there are some easy ones to fall on either side i.e.
generic vs. vendor specific. The ones in the middle ground can start as vendor specific extensions making their way into
OPI APIs over time.

All vendor extensions are encouraged to be transparent i.e. not an opaque binary blob of data that is carried in OPI APIs.
Making all extensions public allows the discussion on the use cases and if they prove to be generic, and include them
natively in the OPI APIs. However if for any reason to hide the extension in the OPI repo, one can use an opaque `bytes[]`
protobuf field or use [any](https://developers.google.com/protocol-buffers/docs/proto3#any) construct to achieve that in
a vendor specific message or a field.

## Extending OPI Defined Messages

OPI API objects can be extended by adding `oneof` clause to an existing OPI [grpc proto3 message](https://developers.google.com/protocol-buffers/docs/proto3#oneof). The example below illustrate the extension of a message
and use of the extension in go client library.

### Defining the extension

Define extension in an existing OPI object/message in a proto file, using `oneof`

```diff
diff --git a/storage/v1alpha1/frontend_nvme_pcie.proto b/storage/v1alpha1/frontend_nvme_pcie.proto
index 1e842e6..d5aab77 100755
--- a/storage/v1alpha1/frontend_nvme_pcie.proto
+++ b/storage/v1alpha1/frontend_nvme_pcie.proto
@@ -148,6 +148,34 @@ message NVMeSubsystemSpec {
 
     // maximum namespaces within a subsystem
     int64 max_namespaces = 5;
+
+    // vendor extensions
+    oneof vendor_extensions {
+       NVMeSubsystemSpecAMD amd         = 1024;
+       NVMeSubsystemSpecIntel intel     = 1025;
+       NVMeSubsystemSpecMarvell marvell = 1026;
+       NVMeSubsystemSpecNvidia nvidia   = 1027;
+    }
+}
+
+// NVMeSubsystemSpec AMD Extensions
+message NVMeSubsystemSpecAMD {
+    string new_amd_feature  = 1;
+}
+
+// NVMeSubsystemSpec Intel Extensions
+message NVMeSubsystemSpecIntel {
+    string new_intel_feature  = 1;
+}
+
+// NVMeSubsystemSpec Marvell Extensions
+message NVMeSubsystemSpecMarvell {
+    string new_marvell_feature  = 1;
+}
+
+// NVMeSubsystemSpec Nvidia Extensions
+message NVMeSubsystemSpecNvidia {
+    string new_nvidia_feature  = 1;
 }
```

For improved backward compatibility of the OPI APIs

- Vendor specific messages are enumerated from the values `1024` onwards
- Specific fields are never included directly in the extensions, but a vendor specific messsage is include
- Vendor specific message can have its own (and evolving) fields
- The vendor speific messages are kept in the vendor specific directories, however in the above example, they are kept in the same
file for brevity of diffs.

Note that [proto2 extensions](https://developers.google.com/protocol-buffers/docs/proto#extensions) are not
supported by proto3 compiler, therefore not supported in any of the GRPC OPI APIs.

### Using extension fields

After a proto definition is updated and the API is published, users can use the extension in their client/server code.
For the above example, here is how a [go client library](https://github.com/opiproject/opi-spdk-bridge/tree/main/client) would use
the extensions to encode vendor specific value

```diff
diff --git a/client/frontend.go b/client/frontend.go
index e9a0c2a..04f6888 100644
--- a/client/frontend.go
+++ b/client/frontend.go
@@ -333,6 +333,7 @@ func executeNVMeSubsystem(ctx context.Context, conn grpc.ClientConnInterface) er
                Subsystem: &pb.NVMeSubsystem{
                        Spec: &pb.NVMeSubsystemSpec{
                                Id:  &pbc.ObjectKey{Value: "subsystem-test"},
+                               VendorExtensions: &pb.NVMeSubsystemSpec_Amd{&pb.NVMeSubsystemSpecAMD{NewAmdFeature: "foo"}},
                                Nqn: "nqn.2022-09.io.spdk:opi3"}}})
        if err != nil {
                log.Fatalf("could not create NVMe subsystem: %v", err)
```

Similarly, on the receiving end a [go server](https://github.com/opiproject/opi-spdk-bridge/tree/main/server) would use the
fields as follows

```diff
diff --git a/server/frontend.go b/server/frontend.go
index af514a3..0ac317d 100644
--- a/server/frontend.go
+++ b/server/frontend.go
@@ -29,6 +29,7 @@ func (s *server) CreateNVMeSubsystem(ctx context.Context, in *pb.CreateNVMeSubsy
                AllowAnyHost:  true,
                MaxNamespaces: int(in.Subsystem.Spec.MaxNamespaces),
        }
+       log.Printf("found vendor extensions = %s", in.Subsystem.Spec.GetAmd().NewAmdFeature)
        var result NvmfCreateSubsystemResult
        err := call("nvmf_create_subsystem", &params, &result)
        if err != nil {

```

It is recommended to check if vendor extension is non nil before accessing them. Above example is meant to show the
ease of accessing the vendor extensions within an OPI API.

## Adding Vendor Specific Messages

To add a new vendor specific message to an existing OPI API, add a generic message called VendorExtensions and include
vendor specific message using `oneof` clause like extending any other OPI APIs. For example

```diff
diff --git a/storage/v1alpha1/frontend_nvme_pcie.proto b/storage/v1alpha1/frontend_nvme_pcie.proto
index 1e842e6..4aea86c 100755
--- a/storage/v1alpha1/frontend_nvme_pcie.proto
+++ b/storage/v1alpha1/frontend_nvme_pcie.proto
@@ -124,6 +124,99 @@ service FrontendNvmeService {
         option (google.api.method_signature) = "name";
     }
     rpc NVMeNamespaceStats  (NVMeNamespaceStatsRequest)  returns (NVMeNamespaceStatsResponse)  {}
+
+    rpc CreateNVMeVendorextension (CreateNVMeVendorextensionRequest) returns (NVMeVendorextension) {
+        option (google.api.http) = {
+            post: "/v1/{parent=subsystems}"
+            body: "nv_me_vendorextension"
+        };
+        option (google.api.method_signature) = "parent,nv_me_vendorextension";
+    }
+    rpc DeleteNVMeVendorextension (DeleteNVMeVendorextensionRequest) returns (google.protobuf.Empty) {
+        option (google.api.http) = {
+            delete: "/v1/{name=subsystems}/{vendorextension}"
+        };
+        option (google.api.method_signature) = "name";
+    }
+    rpc UpdateNVMeVendorextension (UpdateNVMeVendorextensionRequest) returns (NVMeVendorextension) {
+        option (google.api.http) = {
+            patch: "/v1/{nv_me_vendorextension.name=subsystems}"
+            body: "nv_me_vendorextension"
+        };
+        option (google.api.method_signature) = "nv_me_vendorextension,update_mask";
+    }
+    rpc GetNVMeVendorextension    (GetNVMeVendorextensionRequest)    returns (NVMeVendorextension)    {
+        option (google.api.http) = {
+            get: "/v1/{name=subsystems}/{vendorextension}"
+        };
+        option (google.api.method_signature) = "name";
+    }
+}
+
+// NVMe Vendor extensions
+// "oneof" can include messages from various vendors as desired
+message NVMeVendorextension {
+    oneof vendor_extensions {
+       // AMD vendor extension: foo
+       NVMeVendorextensionMessageFooAMD foo_amd          = 1024;
+       // AMD vendor extension: bar
+       NVMeVendorextensionMessageBarAMD bar_amd          = 1025;
+    }
+}
+
+message NVMeVendorextensionMessageFooAMD {
+    NVMeVendorextensionMessageFooAMDSpec   spec   = 1;
+    NVMeVendorextensionMessageFooAMDStatus status = 2;
+}
+
+message NVMeVendorextensionMessageFooAMDSpec {
+    common.v1.ObjectKey id = 1;
+    string foo = 2;
+}
+
+message NVMeVendorextensionMessageFooAMDStatus {
+    string foo_status = 1;
+}
+message NVMeVendorextensionMessageBarAMD {
+    NVMeVendorextensionMessageBarAMDSpec   spec   = 1;
+    NVMeVendorextensionMessageBarAMDStatus status = 2;
+}
+
+message NVMeVendorextensionMessageBarAMDSpec {
+    common.v1.ObjectKey id = 1;
+    string foo = 2;
+}
+
+message NVMeVendorextensionMessageBarAMDStatus {
+    string foo_status = 1;
+}
+
+message CreateNVMeVendorextensionRequest {
+    string parent = 1 [
+        (google.api.field_behavior) = REQUIRED,
+        (google.api.resource_reference).type = "opi_api.storage.v1/NVMeVendorextension"
+    ];
+    NVMeVendorextension nv_me_vendorextension = 2 [(google.api.field_behavior) = REQUIRED];
+}
+
+message DeleteNVMeVendorextensionRequest {
+    string name = 1 [
+        (google.api.field_behavior) = REQUIRED,
+        (google.api.resource_reference).type = "opi_api.storage.v1/NVMeVendorextension"
+    ];
+}
+
+message UpdateNVMeVendorextensionRequest {
+    NVMeVendorextension nv_me_vendorextension = 1;
+    // The list of fields to update.
+    google.protobuf.FieldMask update_mask = 2;
+}
+
+message GetNVMeVendorextensionRequest {
+    string name = 1 [
+        (google.api.field_behavior) = REQUIRED,
+        (google.api.resource_reference).type = "opi_api.storage.v1/NVMeVendorextension"
+    ];
 }
 
 message NVMeSubsystem {
```
