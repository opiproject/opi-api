// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_virtio_blk.proto

package opi_api.storage.v1;

public interface UpdateVirtioBlkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.UpdateVirtioBlkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
   * @return Whether the controller field is set.
   */
  boolean hasController();
  /**
   * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
   * @return The controller.
   */
  opi_api.storage.v1.VirtioBlk getController();
  /**
   * <code>.opi_api.storage.v1.VirtioBlk controller = 1;</code>
   */
  opi_api.storage.v1.VirtioBlkOrBuilder getControllerOrBuilder();

  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   * @return Whether the txnId field is set.
   */
  boolean hasTxnId();
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   * @return The txnId.
   */
  opi_api.common.v1.ObjectKey getTxnId();
  /**
   * <code>.opi_api.common.v1.ObjectKey txn_id = 2;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getTxnIdOrBuilder();
}
