// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SunRPCOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SunRPCOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * RPC program identifiers
   * </pre>
   *
   * <code>repeated bytes program_id = 1;</code>
   * @return A list containing the programId.
   */
  java.util.List<com.google.protobuf.ByteString> getProgramIdList();
  /**
   * <pre>
   * RPC program identifiers
   * </pre>
   *
   * <code>repeated bytes program_id = 1;</code>
   * @return The count of programId.
   */
  int getProgramIdCount();
  /**
   * <pre>
   * RPC program identifiers
   * </pre>
   *
   * <code>repeated bytes program_id = 1;</code>
   * @param index The index of the element to return.
   * @return The programId at the given index.
   */
  com.google.protobuf.ByteString getProgramId(int index);
}
