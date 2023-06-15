// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_nvme_tcp.proto

package opi_api.storage.v1;

public interface ListNVMfPathsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.ListNVMfPathsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NVMfPath> 
      getNvMfPathsList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  opi_api.storage.v1.NVMfPath getNvMfPaths(int index);
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  int getNvMfPathsCount();
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NVMfPathOrBuilder> 
      getNvMfPathsOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMfPath nv_mf_paths = 1;</code>
   */
  opi_api.storage.v1.NVMfPathOrBuilder getNvMfPathsOrBuilder(
      int index);

  /**
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
