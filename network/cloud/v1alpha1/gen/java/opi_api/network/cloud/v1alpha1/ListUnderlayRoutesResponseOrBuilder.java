// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface ListUnderlayRoutesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  java.util.List<opi_api.network.cloud.v1alpha1.UnderlayRoute> 
      getUnderlayrouteList();
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.UnderlayRoute getUnderlayroute(int index);
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  int getUnderlayrouteCount();
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  java.util.List<? extends opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder> 
      getUnderlayrouteOrBuilderList();
  /**
   * <pre>
   * list of underlayroutes
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.UnderlayRoute underlayroute = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.UnderlayRouteOrBuilder getUnderlayrouteOrBuilder(
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
