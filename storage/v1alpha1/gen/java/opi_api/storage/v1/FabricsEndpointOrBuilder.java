// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

package opi_api.storage.v1;

public interface FabricsEndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.FabricsEndpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ip address for TCP and RDMA
   * </pre>
   *
   * <code>string traddr = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The traddr.
   */
  java.lang.String getTraddr();
  /**
   * <pre>
   * ip address for TCP and RDMA
   * </pre>
   *
   * <code>string traddr = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for traddr.
   */
  com.google.protobuf.ByteString
      getTraddrBytes();

  /**
   * <pre>
   * port for TCP and RDMA
   * </pre>
   *
   * <code>string trsvcid = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The trsvcid.
   */
  java.lang.String getTrsvcid();
  /**
   * <pre>
   * port for TCP and RDMA
   * </pre>
   *
   * <code>string trsvcid = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for trsvcid.
   */
  com.google.protobuf.ByteString
      getTrsvcidBytes();

  /**
   * <pre>
   * address family
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for adrfam.
   */
  int getAdrfamValue();
  /**
   * <pre>
   * address family
   * </pre>
   *
   * <code>.opi_api.storage.v1.NvmeAddressFamily adrfam = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The adrfam.
   */
  opi_api.storage.v1.NvmeAddressFamily getAdrfam();

  /**
   * <pre>
   * source address (e.g. IP of local NIC)
   * not used for frontend
   * </pre>
   *
   * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTraddr.
   */
  java.lang.String getSourceTraddr();
  /**
   * <pre>
   * source address (e.g. IP of local NIC)
   * not used for frontend
   * </pre>
   *
   * <code>string source_traddr = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for sourceTraddr.
   */
  com.google.protobuf.ByteString
      getSourceTraddrBytes();

  /**
   * <pre>
   * source port (e.g. Port of local NIC)
   * not used for frontend
   * </pre>
   *
   * <code>string source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sourceTrsvcid.
   */
  java.lang.String getSourceTrsvcid();
  /**
   * <pre>
   * source port (e.g. Port of local NIC)
   * not used for frontend
   * </pre>
   *
   * <code>string source_trsvcid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for sourceTrsvcid.
   */
  com.google.protobuf.ByteString
      getSourceTrsvcidBytes();
}
