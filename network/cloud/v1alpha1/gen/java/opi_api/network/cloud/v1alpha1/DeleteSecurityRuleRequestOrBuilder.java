// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface DeleteSecurityRuleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * securityrule id
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * securityrule id
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true, and the resource is not found, the request will succeed
   * but no action will be taken on the server
   * </pre>
   *
   * <code>bool allow_missing = 2;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
