// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NVMeControllerListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NVMeControllerListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .opi_api.storage.v1.NVMeController controller = 1;</code>
   */
  java.util.List<opi_api.storage.v1.NVMeController> 
      getControllerList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMeController controller = 1;</code>
   */
  opi_api.storage.v1.NVMeController getController(int index);
  /**
   * <code>repeated .opi_api.storage.v1.NVMeController controller = 1;</code>
   */
  int getControllerCount();
  /**
   * <code>repeated .opi_api.storage.v1.NVMeController controller = 1;</code>
   */
  java.util.List<? extends opi_api.storage.v1.NVMeControllerOrBuilder> 
      getControllerOrBuilderList();
  /**
   * <code>repeated .opi_api.storage.v1.NVMeController controller = 1;</code>
   */
  opi_api.storage.v1.NVMeControllerOrBuilder getControllerOrBuilder(
      int index);
}