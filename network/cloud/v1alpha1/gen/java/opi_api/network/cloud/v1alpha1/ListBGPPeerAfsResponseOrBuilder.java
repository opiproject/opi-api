// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface ListBGPPeerAfsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  java.util.List<opi_api.network.cloud.v1alpha1.BGPPeerAf> 
      getBgppeerafList();
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.BGPPeerAf getBgppeeraf(int index);
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  int getBgppeerafCount();
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  java.util.List<? extends opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder> 
      getBgppeerafOrBuilderList();
  /**
   * <pre>
   * list of bgppeerafs
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.BGPPeerAf bgppeeraf = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.BGPPeerAfOrBuilder getBgppeerafOrBuilder(
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
