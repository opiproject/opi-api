// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeControllerSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeControllerSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * subsystem controller id range: 0 to 65535.
   * must not be reused under the same subsystem
   * </pre>
   *
   * <code>optional int32 nvme_controller_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the nvmeControllerId field is set.
   */
  boolean hasNvmeControllerId();
  /**
   * <pre>
   * subsystem controller id range: 0 to 65535.
   * must not be reused under the same subsystem
   * </pre>
   *
   * <code>optional int32 nvme_controller_id = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nvmeControllerId.
   */
  int getNvmeControllerId();

  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the pcieId field is set.
   */
  boolean hasPcieId();
  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pcieId.
   */
  opi_api.storage.v1.PciEndpoint getPcieId();
  /**
   * <pre>
   * xPU's PCI ID for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.PciEndpoint pcie_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.PciEndpointOrBuilder getPcieIdOrBuilder();

  /**
   * <pre>
   * maximum number of host submission queues allowed.
   * If not set, the xPU will provide a default.
   * </pre>
   *
   * <code>int32 max_nsq = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maxNsq.
   */
  int getMaxNsq();

  /**
   * <pre>
   * maximum number of host completion queues allowed.
   * If not set, the xPU will provide a default.
   * </pre>
   *
   * <code>int32 max_ncq = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maxNcq.
   */
  int getMaxNcq();

  /**
   * <pre>
   * maximum number of submission queue entries per submission queue, as a power of 2.
   * default value as per spec is 6
   * </pre>
   *
   * <code>int32 sqes = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The sqes.
   */
  int getSqes();

  /**
   * <pre>
   * maximum number of completion queue entries per completion queue, as a power of 2.
   * default value as per spec is 4
   * </pre>
   *
   * <code>int32 cqes = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The cqes.
   */
  int getCqes();

  /**
   * <pre>
   * maximum Number of namespaces that will be provisioned under
   * the controller.
   * </pre>
   *
   * <code>int32 max_namespaces = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maxNamespaces.
   */
  int getMaxNamespaces();

  /**
   * <pre>
   * min QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit min_limit = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the minLimit field is set.
   */
  boolean hasMinLimit();
  /**
   * <pre>
   * min QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit min_limit = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The minLimit.
   */
  opi_api.storage.v1.QosLimit getMinLimit();
  /**
   * <pre>
   * min QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit min_limit = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.storage.v1.QosLimitOrBuilder getMinLimitOrBuilder();

  /**
   * <pre>
   * max QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit max_limit = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the maxLimit field is set.
   */
  boolean hasMaxLimit();
  /**
   * <pre>
   * max QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit max_limit = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The maxLimit.
   */
  opi_api.storage.v1.QosLimit getMaxLimit();
  /**
   * <pre>
   * max QoS limits for the controller
   * </pre>
   *
   * <code>.opi_api.storage.v1.QosLimit max_limit = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  opi_api.storage.v1.QosLimitOrBuilder getMaxLimitOrBuilder();
}
