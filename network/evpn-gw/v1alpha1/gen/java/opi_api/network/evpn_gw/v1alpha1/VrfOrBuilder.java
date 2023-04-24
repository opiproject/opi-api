// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface VrfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.Vrf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Key, also used as name of the Linux vrf device (max 9 chars)
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Key, also used as name of the Linux vrf device (max 9 chars)
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * VXLAN VNI for L3 EVPN. Also used as EVPN route target
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vni cannot be negative number. --)                  
   * </pre>
   *
   * <code>uint32 vni = 2;</code>
   * @return The vni.
   */
  int getVni();

  /**
   * <pre>
   * Linux routing table number (range 1001-3999). Defaults to vni
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: routing_table cannot be negative number. --)
   * </pre>
   *
   * <code>uint32 routing_table = 3;</code>
   * @return The routingTable.
   */
  int getRoutingTable();

  /**
   * <pre>
   * IPv4 or IPv6 loopback address. Also serves as basis for RD in FRR
   * </pre>
   *
   * <code>string loopback_ip = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The loopbackIp.
   */
  java.lang.String getLoopbackIp();
  /**
   * <pre>
   * IPv4 or IPv6 loopback address. Also serves as basis for RD in FRR
   * </pre>
   *
   * <code>string loopback_ip = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for loopbackIp.
   */
  com.google.protobuf.ByteString
      getLoopbackIpBytes();

  /**
   * <pre>
   * IPv4 or IPv6 IP address for the VXLAN TEP
   * </pre>
   *
   * <code>string vtep_ip = 5;</code>
   * @return The vtepIp.
   */
  java.lang.String getVtepIp();
  /**
   * <pre>
   * IPv4 or IPv6 IP address for the VXLAN TEP
   * </pre>
   *
   * <code>string vtep_ip = 5;</code>
   * @return The bytes for vtepIp.
   */
  com.google.protobuf.ByteString
      getVtepIpBytes();

  /**
   * <pre>
   * Read-only: Local AS configured for VRF
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: local_as cannot be negative number. --)
   * </pre>
   *
   * <code>uint32 local_as = 6;</code>
   * @return The localAs.
   */
  int getLocalAs();

  /**
   * <pre>
   * Read-only: Route distinguisher chosen by FRR
   * </pre>
   *
   * <code>string rd = 7;</code>
   * @return The rd.
   */
  java.lang.String getRd();
  /**
   * <pre>
   * Read-only: Route distinguisher chosen by FRR
   * </pre>
   *
   * <code>string rd = 7;</code>
   * @return The bytes for rd.
   */
  com.google.protobuf.ByteString
      getRdBytes();

  /**
   * <pre>
   * Read-only: Router MAC address of the VRF
   * </pre>
   *
   * <code>string rmac = 8;</code>
   * @return The rmac.
   */
  java.lang.String getRmac();
  /**
   * <pre>
   * Read-only: Router MAC address of the VRF
   * </pre>
   *
   * <code>string rmac = 8;</code>
   * @return The bytes for rmac.
   */
  com.google.protobuf.ByteString
      getRmacBytes();

  /**
   * <pre>
   * Read-only: List of import RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string import_rts = 9;</code>
   * @return A list containing the importRts.
   */
  java.util.List<java.lang.String>
      getImportRtsList();
  /**
   * <pre>
   * Read-only: List of import RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string import_rts = 9;</code>
   * @return The count of importRts.
   */
  int getImportRtsCount();
  /**
   * <pre>
   * Read-only: List of import RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string import_rts = 9;</code>
   * @param index The index of the element to return.
   * @return The importRts at the given index.
   */
  java.lang.String getImportRts(int index);
  /**
   * <pre>
   * Read-only: List of import RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string import_rts = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the importRts at the given index.
   */
  com.google.protobuf.ByteString
      getImportRtsBytes(int index);

  /**
   * <pre>
   * Read-only: List of export RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string export_rts = 10;</code>
   * @return A list containing the exportRts.
   */
  java.util.List<java.lang.String>
      getExportRtsList();
  /**
   * <pre>
   * Read-only: List of export RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string export_rts = 10;</code>
   * @return The count of exportRts.
   */
  int getExportRtsCount();
  /**
   * <pre>
   * Read-only: List of export RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string export_rts = 10;</code>
   * @param index The index of the element to return.
   * @return The exportRts at the given index.
   */
  java.lang.String getExportRts(int index);
  /**
   * <pre>
   * Read-only: List of export RTs chosen by FRR
   * </pre>
   *
   * <code>repeated string export_rts = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the exportRts at the given index.
   */
  com.google.protobuf.ByteString
      getExportRtsBytes(int index);

  /**
   * <pre>
   * Read-only: List of connected LogicalBridges
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vlan cannot be negative number. --)
   * </pre>
   *
   * <code>repeated uint32 vlan_ids = 11;</code>
   * @return A list containing the vlanIds.
   */
  java.util.List<java.lang.Integer> getVlanIdsList();
  /**
   * <pre>
   * Read-only: List of connected LogicalBridges
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vlan cannot be negative number. --)
   * </pre>
   *
   * <code>repeated uint32 vlan_ids = 11;</code>
   * @return The count of vlanIds.
   */
  int getVlanIdsCount();
  /**
   * <pre>
   * Read-only: List of connected LogicalBridges
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: vlan cannot be negative number. --)
   * </pre>
   *
   * <code>repeated uint32 vlan_ids = 11;</code>
   * @param index The index of the element to return.
   * @return The vlanIds at the given index.
   */
  int getVlanIds(int index);
}
