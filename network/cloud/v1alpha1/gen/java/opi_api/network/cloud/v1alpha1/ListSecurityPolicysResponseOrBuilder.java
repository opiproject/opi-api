// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface ListSecurityPolicysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  java.util.List<opi_api.network.cloud.v1alpha1.SecurityPolicy> 
      getSecuritypolicyList();
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicy getSecuritypolicy(int index);
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  int getSecuritypolicyCount();
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  java.util.List<? extends opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder> 
      getSecuritypolicyOrBuilderList();
  /**
   * <pre>
   * list of securitypolicys
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityPolicy securitypolicy = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicyOrBuilder getSecuritypolicyOrBuilder(
      int index);

  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
