// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device.proto

package opi_api.network.cloud.v1alpha1;

public interface SystemAlertOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SystemAlert)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * alert timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alert_time = 1;</code>
   * @return Whether the alertTime field is set.
   */
  boolean hasAlertTime();
  /**
   * <pre>
   * alert timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alert_time = 1;</code>
   * @return The alertTime.
   */
  com.google.protobuf.Timestamp getAlertTime();
  /**
   * <pre>
   * alert timestamp
   * </pre>
   *
   * <code>.google.protobuf.Timestamp alert_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getAlertTimeOrBuilder();

  /**
   * <pre>
   * name of the alert
   * </pre>
   *
   * <code>string alert_description = 2;</code>
   * @return The alertDescription.
   */
  java.lang.String getAlertDescription();
  /**
   * <pre>
   * name of the alert
   * </pre>
   *
   * <code>string alert_description = 2;</code>
   * @return The bytes for alertDescription.
   */
  com.google.protobuf.ByteString
      getAlertDescriptionBytes();
}