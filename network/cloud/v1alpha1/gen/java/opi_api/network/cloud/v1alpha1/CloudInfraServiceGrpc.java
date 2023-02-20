package opi_api.network.cloud.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Cloud Infra APIs - to manage a multi-node cloud infrastructure on a xPU
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: cloudrpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CloudInfraServiceGrpc {

  private CloudInfraServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.cloud.v1alpha1.CloudInfraService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest,
      opi_api.network.cloud.v1alpha1.DeviceCapabilities> getGetDeviceCapabilitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceCapabilities",
      requestType = opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.DeviceCapabilities.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest,
      opi_api.network.cloud.v1alpha1.DeviceCapabilities> getGetDeviceCapabilitiesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest, opi_api.network.cloud.v1alpha1.DeviceCapabilities> getGetDeviceCapabilitiesMethod;
    if ((getGetDeviceCapabilitiesMethod = CloudInfraServiceGrpc.getGetDeviceCapabilitiesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetDeviceCapabilitiesMethod = CloudInfraServiceGrpc.getGetDeviceCapabilitiesMethod) == null) {
          CloudInfraServiceGrpc.getGetDeviceCapabilitiesMethod = getGetDeviceCapabilitiesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest, opi_api.network.cloud.v1alpha1.DeviceCapabilities>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDeviceCapabilities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeviceCapabilities.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetDeviceCapabilities"))
              .build();
        }
      }
    }
    return getGetDeviceCapabilitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateDeviceRequest,
      opi_api.network.cloud.v1alpha1.Device> getCreateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDevice",
      requestType = opi_api.network.cloud.v1alpha1.CreateDeviceRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateDeviceRequest,
      opi_api.network.cloud.v1alpha1.Device> getCreateDeviceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateDeviceRequest, opi_api.network.cloud.v1alpha1.Device> getCreateDeviceMethod;
    if ((getCreateDeviceMethod = CloudInfraServiceGrpc.getCreateDeviceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateDeviceMethod = CloudInfraServiceGrpc.getCreateDeviceMethod) == null) {
          CloudInfraServiceGrpc.getCreateDeviceMethod = getCreateDeviceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateDeviceRequest, opi_api.network.cloud.v1alpha1.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Device.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateDevice"))
              .build();
        }
      }
    }
    return getCreateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteDeviceRequest,
      com.google.protobuf.Empty> getDeleteDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDevice",
      requestType = opi_api.network.cloud.v1alpha1.DeleteDeviceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteDeviceRequest,
      com.google.protobuf.Empty> getDeleteDeviceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteDeviceRequest, com.google.protobuf.Empty> getDeleteDeviceMethod;
    if ((getDeleteDeviceMethod = CloudInfraServiceGrpc.getDeleteDeviceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteDeviceMethod = CloudInfraServiceGrpc.getDeleteDeviceMethod) == null) {
          CloudInfraServiceGrpc.getDeleteDeviceMethod = getDeleteDeviceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteDeviceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteDevice"))
              .build();
        }
      }
    }
    return getDeleteDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateDeviceRequest,
      opi_api.network.cloud.v1alpha1.Device> getUpdateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDevice",
      requestType = opi_api.network.cloud.v1alpha1.UpdateDeviceRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateDeviceRequest,
      opi_api.network.cloud.v1alpha1.Device> getUpdateDeviceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateDeviceRequest, opi_api.network.cloud.v1alpha1.Device> getUpdateDeviceMethod;
    if ((getUpdateDeviceMethod = CloudInfraServiceGrpc.getUpdateDeviceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateDeviceMethod = CloudInfraServiceGrpc.getUpdateDeviceMethod) == null) {
          CloudInfraServiceGrpc.getUpdateDeviceMethod = getUpdateDeviceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateDeviceRequest, opi_api.network.cloud.v1alpha1.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Device.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateDevice"))
              .build();
        }
      }
    }
    return getUpdateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListDevicesRequest,
      opi_api.network.cloud.v1alpha1.ListDevicesResponse> getListDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevices",
      requestType = opi_api.network.cloud.v1alpha1.ListDevicesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListDevicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListDevicesRequest,
      opi_api.network.cloud.v1alpha1.ListDevicesResponse> getListDevicesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListDevicesRequest, opi_api.network.cloud.v1alpha1.ListDevicesResponse> getListDevicesMethod;
    if ((getListDevicesMethod = CloudInfraServiceGrpc.getListDevicesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListDevicesMethod = CloudInfraServiceGrpc.getListDevicesMethod) == null) {
          CloudInfraServiceGrpc.getListDevicesMethod = getListDevicesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListDevicesRequest, opi_api.network.cloud.v1alpha1.ListDevicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListDevicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListDevicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListDevices"))
              .build();
        }
      }
    }
    return getListDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetDeviceRequest,
      opi_api.network.cloud.v1alpha1.Device> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevice",
      requestType = opi_api.network.cloud.v1alpha1.GetDeviceRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetDeviceRequest,
      opi_api.network.cloud.v1alpha1.Device> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetDeviceRequest, opi_api.network.cloud.v1alpha1.Device> getGetDeviceMethod;
    if ((getGetDeviceMethod = CloudInfraServiceGrpc.getGetDeviceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetDeviceMethod = CloudInfraServiceGrpc.getGetDeviceMethod) == null) {
          CloudInfraServiceGrpc.getGetDeviceMethod = getGetDeviceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetDeviceRequest, opi_api.network.cloud.v1alpha1.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetDeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Device.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetDevice"))
              .build();
        }
      }
    }
    return getGetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdatePortRequest,
      opi_api.network.cloud.v1alpha1.Port> getUpdatePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePort",
      requestType = opi_api.network.cloud.v1alpha1.UpdatePortRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Port.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdatePortRequest,
      opi_api.network.cloud.v1alpha1.Port> getUpdatePortMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdatePortRequest, opi_api.network.cloud.v1alpha1.Port> getUpdatePortMethod;
    if ((getUpdatePortMethod = CloudInfraServiceGrpc.getUpdatePortMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdatePortMethod = CloudInfraServiceGrpc.getUpdatePortMethod) == null) {
          CloudInfraServiceGrpc.getUpdatePortMethod = getUpdatePortMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdatePortRequest, opi_api.network.cloud.v1alpha1.Port>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdatePortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Port.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdatePort"))
              .build();
        }
      }
    }
    return getUpdatePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListPortsRequest,
      opi_api.network.cloud.v1alpha1.ListPortsResponse> getListPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPorts",
      requestType = opi_api.network.cloud.v1alpha1.ListPortsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListPortsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListPortsRequest,
      opi_api.network.cloud.v1alpha1.ListPortsResponse> getListPortsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListPortsRequest, opi_api.network.cloud.v1alpha1.ListPortsResponse> getListPortsMethod;
    if ((getListPortsMethod = CloudInfraServiceGrpc.getListPortsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListPortsMethod = CloudInfraServiceGrpc.getListPortsMethod) == null) {
          CloudInfraServiceGrpc.getListPortsMethod = getListPortsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListPortsRequest, opi_api.network.cloud.v1alpha1.ListPortsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListPortsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListPortsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListPorts"))
              .build();
        }
      }
    }
    return getListPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetPortRequest,
      opi_api.network.cloud.v1alpha1.Port> getGetPortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPort",
      requestType = opi_api.network.cloud.v1alpha1.GetPortRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Port.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetPortRequest,
      opi_api.network.cloud.v1alpha1.Port> getGetPortMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetPortRequest, opi_api.network.cloud.v1alpha1.Port> getGetPortMethod;
    if ((getGetPortMethod = CloudInfraServiceGrpc.getGetPortMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetPortMethod = CloudInfraServiceGrpc.getGetPortMethod) == null) {
          CloudInfraServiceGrpc.getGetPortMethod = getGetPortMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetPortRequest, opi_api.network.cloud.v1alpha1.Port>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetPortRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Port.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetPort"))
              .build();
        }
      }
    }
    return getGetPortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVnicRequest,
      opi_api.network.cloud.v1alpha1.Vnic> getCreateVnicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVnic",
      requestType = opi_api.network.cloud.v1alpha1.CreateVnicRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Vnic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVnicRequest,
      opi_api.network.cloud.v1alpha1.Vnic> getCreateVnicMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVnicRequest, opi_api.network.cloud.v1alpha1.Vnic> getCreateVnicMethod;
    if ((getCreateVnicMethod = CloudInfraServiceGrpc.getCreateVnicMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateVnicMethod = CloudInfraServiceGrpc.getCreateVnicMethod) == null) {
          CloudInfraServiceGrpc.getCreateVnicMethod = getCreateVnicMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateVnicRequest, opi_api.network.cloud.v1alpha1.Vnic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVnic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateVnicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Vnic.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateVnic"))
              .build();
        }
      }
    }
    return getCreateVnicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVnicRequest,
      com.google.protobuf.Empty> getDeleteVnicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVnic",
      requestType = opi_api.network.cloud.v1alpha1.DeleteVnicRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVnicRequest,
      com.google.protobuf.Empty> getDeleteVnicMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVnicRequest, com.google.protobuf.Empty> getDeleteVnicMethod;
    if ((getDeleteVnicMethod = CloudInfraServiceGrpc.getDeleteVnicMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteVnicMethod = CloudInfraServiceGrpc.getDeleteVnicMethod) == null) {
          CloudInfraServiceGrpc.getDeleteVnicMethod = getDeleteVnicMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteVnicRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVnic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteVnicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteVnic"))
              .build();
        }
      }
    }
    return getDeleteVnicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVnicRequest,
      opi_api.network.cloud.v1alpha1.Vnic> getUpdateVnicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVnic",
      requestType = opi_api.network.cloud.v1alpha1.UpdateVnicRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Vnic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVnicRequest,
      opi_api.network.cloud.v1alpha1.Vnic> getUpdateVnicMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVnicRequest, opi_api.network.cloud.v1alpha1.Vnic> getUpdateVnicMethod;
    if ((getUpdateVnicMethod = CloudInfraServiceGrpc.getUpdateVnicMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateVnicMethod = CloudInfraServiceGrpc.getUpdateVnicMethod) == null) {
          CloudInfraServiceGrpc.getUpdateVnicMethod = getUpdateVnicMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateVnicRequest, opi_api.network.cloud.v1alpha1.Vnic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVnic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateVnicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Vnic.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateVnic"))
              .build();
        }
      }
    }
    return getUpdateVnicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVnicsRequest,
      opi_api.network.cloud.v1alpha1.ListVnicsResponse> getListVnicsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVnics",
      requestType = opi_api.network.cloud.v1alpha1.ListVnicsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListVnicsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVnicsRequest,
      opi_api.network.cloud.v1alpha1.ListVnicsResponse> getListVnicsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVnicsRequest, opi_api.network.cloud.v1alpha1.ListVnicsResponse> getListVnicsMethod;
    if ((getListVnicsMethod = CloudInfraServiceGrpc.getListVnicsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListVnicsMethod = CloudInfraServiceGrpc.getListVnicsMethod) == null) {
          CloudInfraServiceGrpc.getListVnicsMethod = getListVnicsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListVnicsRequest, opi_api.network.cloud.v1alpha1.ListVnicsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVnics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListVnicsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListVnicsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListVnics"))
              .build();
        }
      }
    }
    return getListVnicsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVnicRequest,
      opi_api.network.cloud.v1alpha1.Vnic> getGetVnicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVnic",
      requestType = opi_api.network.cloud.v1alpha1.GetVnicRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Vnic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVnicRequest,
      opi_api.network.cloud.v1alpha1.Vnic> getGetVnicMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVnicRequest, opi_api.network.cloud.v1alpha1.Vnic> getGetVnicMethod;
    if ((getGetVnicMethod = CloudInfraServiceGrpc.getGetVnicMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetVnicMethod = CloudInfraServiceGrpc.getGetVnicMethod) == null) {
          CloudInfraServiceGrpc.getGetVnicMethod = getGetVnicMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetVnicRequest, opi_api.network.cloud.v1alpha1.Vnic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVnic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetVnicRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Vnic.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetVnic"))
              .build();
        }
      }
    }
    return getGetVnicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateInterfaceRequest,
      opi_api.network.cloud.v1alpha1.Interface> getCreateInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInterface",
      requestType = opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Interface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateInterfaceRequest,
      opi_api.network.cloud.v1alpha1.Interface> getCreateInterfaceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateInterfaceRequest, opi_api.network.cloud.v1alpha1.Interface> getCreateInterfaceMethod;
    if ((getCreateInterfaceMethod = CloudInfraServiceGrpc.getCreateInterfaceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateInterfaceMethod = CloudInfraServiceGrpc.getCreateInterfaceMethod) == null) {
          CloudInfraServiceGrpc.getCreateInterfaceMethod = getCreateInterfaceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateInterfaceRequest, opi_api.network.cloud.v1alpha1.Interface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateInterface"))
              .build();
        }
      }
    }
    return getCreateInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest,
      com.google.protobuf.Empty> getDeleteInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteInterface",
      requestType = opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest,
      com.google.protobuf.Empty> getDeleteInterfaceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest, com.google.protobuf.Empty> getDeleteInterfaceMethod;
    if ((getDeleteInterfaceMethod = CloudInfraServiceGrpc.getDeleteInterfaceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteInterfaceMethod = CloudInfraServiceGrpc.getDeleteInterfaceMethod) == null) {
          CloudInfraServiceGrpc.getDeleteInterfaceMethod = getDeleteInterfaceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteInterface"))
              .build();
        }
      }
    }
    return getDeleteInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest,
      opi_api.network.cloud.v1alpha1.Interface> getUpdateInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateInterface",
      requestType = opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Interface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest,
      opi_api.network.cloud.v1alpha1.Interface> getUpdateInterfaceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest, opi_api.network.cloud.v1alpha1.Interface> getUpdateInterfaceMethod;
    if ((getUpdateInterfaceMethod = CloudInfraServiceGrpc.getUpdateInterfaceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateInterfaceMethod = CloudInfraServiceGrpc.getUpdateInterfaceMethod) == null) {
          CloudInfraServiceGrpc.getUpdateInterfaceMethod = getUpdateInterfaceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest, opi_api.network.cloud.v1alpha1.Interface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateInterface"))
              .build();
        }
      }
    }
    return getUpdateInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListInterfacesRequest,
      opi_api.network.cloud.v1alpha1.ListInterfacesResponse> getListInterfacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInterfaces",
      requestType = opi_api.network.cloud.v1alpha1.ListInterfacesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListInterfacesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListInterfacesRequest,
      opi_api.network.cloud.v1alpha1.ListInterfacesResponse> getListInterfacesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListInterfacesRequest, opi_api.network.cloud.v1alpha1.ListInterfacesResponse> getListInterfacesMethod;
    if ((getListInterfacesMethod = CloudInfraServiceGrpc.getListInterfacesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListInterfacesMethod = CloudInfraServiceGrpc.getListInterfacesMethod) == null) {
          CloudInfraServiceGrpc.getListInterfacesMethod = getListInterfacesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListInterfacesRequest, opi_api.network.cloud.v1alpha1.ListInterfacesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInterfaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListInterfacesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListInterfacesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListInterfaces"))
              .build();
        }
      }
    }
    return getListInterfacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetInterfaceRequest,
      opi_api.network.cloud.v1alpha1.Interface> getGetInterfaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInterface",
      requestType = opi_api.network.cloud.v1alpha1.GetInterfaceRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Interface.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetInterfaceRequest,
      opi_api.network.cloud.v1alpha1.Interface> getGetInterfaceMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetInterfaceRequest, opi_api.network.cloud.v1alpha1.Interface> getGetInterfaceMethod;
    if ((getGetInterfaceMethod = CloudInfraServiceGrpc.getGetInterfaceMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetInterfaceMethod = CloudInfraServiceGrpc.getGetInterfaceMethod) == null) {
          CloudInfraServiceGrpc.getGetInterfaceMethod = getGetInterfaceMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetInterfaceRequest, opi_api.network.cloud.v1alpha1.Interface>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInterface"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetInterfaceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Interface.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetInterface"))
              .build();
        }
      }
    }
    return getGetInterfaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateRouteTableRequest,
      opi_api.network.cloud.v1alpha1.RouteTable> getCreateRouteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRouteTable",
      requestType = opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.RouteTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateRouteTableRequest,
      opi_api.network.cloud.v1alpha1.RouteTable> getCreateRouteTableMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateRouteTableRequest, opi_api.network.cloud.v1alpha1.RouteTable> getCreateRouteTableMethod;
    if ((getCreateRouteTableMethod = CloudInfraServiceGrpc.getCreateRouteTableMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateRouteTableMethod = CloudInfraServiceGrpc.getCreateRouteTableMethod) == null) {
          CloudInfraServiceGrpc.getCreateRouteTableMethod = getCreateRouteTableMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateRouteTableRequest, opi_api.network.cloud.v1alpha1.RouteTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRouteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateRouteTable"))
              .build();
        }
      }
    }
    return getCreateRouteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest,
      com.google.protobuf.Empty> getDeleteRouteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRouteTable",
      requestType = opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest,
      com.google.protobuf.Empty> getDeleteRouteTableMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest, com.google.protobuf.Empty> getDeleteRouteTableMethod;
    if ((getDeleteRouteTableMethod = CloudInfraServiceGrpc.getDeleteRouteTableMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteRouteTableMethod = CloudInfraServiceGrpc.getDeleteRouteTableMethod) == null) {
          CloudInfraServiceGrpc.getDeleteRouteTableMethod = getDeleteRouteTableMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRouteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteRouteTable"))
              .build();
        }
      }
    }
    return getDeleteRouteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest,
      opi_api.network.cloud.v1alpha1.RouteTable> getUpdateRouteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRouteTable",
      requestType = opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.RouteTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest,
      opi_api.network.cloud.v1alpha1.RouteTable> getUpdateRouteTableMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest, opi_api.network.cloud.v1alpha1.RouteTable> getUpdateRouteTableMethod;
    if ((getUpdateRouteTableMethod = CloudInfraServiceGrpc.getUpdateRouteTableMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateRouteTableMethod = CloudInfraServiceGrpc.getUpdateRouteTableMethod) == null) {
          CloudInfraServiceGrpc.getUpdateRouteTableMethod = getUpdateRouteTableMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest, opi_api.network.cloud.v1alpha1.RouteTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRouteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateRouteTable"))
              .build();
        }
      }
    }
    return getUpdateRouteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListRouteTablesRequest,
      opi_api.network.cloud.v1alpha1.ListRouteTablesResponse> getListRouteTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRouteTables",
      requestType = opi_api.network.cloud.v1alpha1.ListRouteTablesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListRouteTablesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListRouteTablesRequest,
      opi_api.network.cloud.v1alpha1.ListRouteTablesResponse> getListRouteTablesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListRouteTablesRequest, opi_api.network.cloud.v1alpha1.ListRouteTablesResponse> getListRouteTablesMethod;
    if ((getListRouteTablesMethod = CloudInfraServiceGrpc.getListRouteTablesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListRouteTablesMethod = CloudInfraServiceGrpc.getListRouteTablesMethod) == null) {
          CloudInfraServiceGrpc.getListRouteTablesMethod = getListRouteTablesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListRouteTablesRequest, opi_api.network.cloud.v1alpha1.ListRouteTablesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRouteTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListRouteTablesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListRouteTablesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListRouteTables"))
              .build();
        }
      }
    }
    return getListRouteTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetRouteTableRequest,
      opi_api.network.cloud.v1alpha1.RouteTable> getGetRouteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRouteTable",
      requestType = opi_api.network.cloud.v1alpha1.GetRouteTableRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.RouteTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetRouteTableRequest,
      opi_api.network.cloud.v1alpha1.RouteTable> getGetRouteTableMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetRouteTableRequest, opi_api.network.cloud.v1alpha1.RouteTable> getGetRouteTableMethod;
    if ((getGetRouteTableMethod = CloudInfraServiceGrpc.getGetRouteTableMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetRouteTableMethod = CloudInfraServiceGrpc.getGetRouteTableMethod) == null) {
          CloudInfraServiceGrpc.getGetRouteTableMethod = getGetRouteTableMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetRouteTableRequest, opi_api.network.cloud.v1alpha1.RouteTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRouteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetRouteTableRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.RouteTable.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetRouteTable"))
              .build();
        }
      }
    }
    return getGetRouteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateRouteRequest,
      opi_api.network.cloud.v1alpha1.Route> getCreateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoute",
      requestType = opi_api.network.cloud.v1alpha1.CreateRouteRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Route.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateRouteRequest,
      opi_api.network.cloud.v1alpha1.Route> getCreateRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateRouteRequest, opi_api.network.cloud.v1alpha1.Route> getCreateRouteMethod;
    if ((getCreateRouteMethod = CloudInfraServiceGrpc.getCreateRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateRouteMethod = CloudInfraServiceGrpc.getCreateRouteMethod) == null) {
          CloudInfraServiceGrpc.getCreateRouteMethod = getCreateRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateRouteRequest, opi_api.network.cloud.v1alpha1.Route>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Route.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateRoute"))
              .build();
        }
      }
    }
    return getCreateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteRouteRequest,
      com.google.protobuf.Empty> getDeleteRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoute",
      requestType = opi_api.network.cloud.v1alpha1.DeleteRouteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteRouteRequest,
      com.google.protobuf.Empty> getDeleteRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteRouteRequest, com.google.protobuf.Empty> getDeleteRouteMethod;
    if ((getDeleteRouteMethod = CloudInfraServiceGrpc.getDeleteRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteRouteMethod = CloudInfraServiceGrpc.getDeleteRouteMethod) == null) {
          CloudInfraServiceGrpc.getDeleteRouteMethod = getDeleteRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteRouteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteRoute"))
              .build();
        }
      }
    }
    return getDeleteRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateRouteRequest,
      opi_api.network.cloud.v1alpha1.Route> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoute",
      requestType = opi_api.network.cloud.v1alpha1.UpdateRouteRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Route.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateRouteRequest,
      opi_api.network.cloud.v1alpha1.Route> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateRouteRequest, opi_api.network.cloud.v1alpha1.Route> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = CloudInfraServiceGrpc.getUpdateRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateRouteMethod = CloudInfraServiceGrpc.getUpdateRouteMethod) == null) {
          CloudInfraServiceGrpc.getUpdateRouteMethod = getUpdateRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateRouteRequest, opi_api.network.cloud.v1alpha1.Route>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Route.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateRoute"))
              .build();
        }
      }
    }
    return getUpdateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListRoutesRequest,
      opi_api.network.cloud.v1alpha1.ListRoutesResponse> getListRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoutes",
      requestType = opi_api.network.cloud.v1alpha1.ListRoutesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListRoutesRequest,
      opi_api.network.cloud.v1alpha1.ListRoutesResponse> getListRoutesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListRoutesRequest, opi_api.network.cloud.v1alpha1.ListRoutesResponse> getListRoutesMethod;
    if ((getListRoutesMethod = CloudInfraServiceGrpc.getListRoutesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListRoutesMethod = CloudInfraServiceGrpc.getListRoutesMethod) == null) {
          CloudInfraServiceGrpc.getListRoutesMethod = getListRoutesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListRoutesRequest, opi_api.network.cloud.v1alpha1.ListRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListRoutes"))
              .build();
        }
      }
    }
    return getListRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetRouteRequest,
      opi_api.network.cloud.v1alpha1.Route> getGetRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoute",
      requestType = opi_api.network.cloud.v1alpha1.GetRouteRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Route.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetRouteRequest,
      opi_api.network.cloud.v1alpha1.Route> getGetRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetRouteRequest, opi_api.network.cloud.v1alpha1.Route> getGetRouteMethod;
    if ((getGetRouteMethod = CloudInfraServiceGrpc.getGetRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetRouteMethod = CloudInfraServiceGrpc.getGetRouteMethod) == null) {
          CloudInfraServiceGrpc.getGetRouteMethod = getGetRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetRouteRequest, opi_api.network.cloud.v1alpha1.Route>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Route.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetRoute"))
              .build();
        }
      }
    }
    return getGetRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest,
      opi_api.network.cloud.v1alpha1.UnderlayRoute> getCreateUnderlayRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUnderlayRoute",
      requestType = opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.UnderlayRoute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest,
      opi_api.network.cloud.v1alpha1.UnderlayRoute> getCreateUnderlayRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest, opi_api.network.cloud.v1alpha1.UnderlayRoute> getCreateUnderlayRouteMethod;
    if ((getCreateUnderlayRouteMethod = CloudInfraServiceGrpc.getCreateUnderlayRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateUnderlayRouteMethod = CloudInfraServiceGrpc.getCreateUnderlayRouteMethod) == null) {
          CloudInfraServiceGrpc.getCreateUnderlayRouteMethod = getCreateUnderlayRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest, opi_api.network.cloud.v1alpha1.UnderlayRoute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUnderlayRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UnderlayRoute.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateUnderlayRoute"))
              .build();
        }
      }
    }
    return getCreateUnderlayRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest,
      com.google.protobuf.Empty> getDeleteUnderlayRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUnderlayRoute",
      requestType = opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest,
      com.google.protobuf.Empty> getDeleteUnderlayRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest, com.google.protobuf.Empty> getDeleteUnderlayRouteMethod;
    if ((getDeleteUnderlayRouteMethod = CloudInfraServiceGrpc.getDeleteUnderlayRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteUnderlayRouteMethod = CloudInfraServiceGrpc.getDeleteUnderlayRouteMethod) == null) {
          CloudInfraServiceGrpc.getDeleteUnderlayRouteMethod = getDeleteUnderlayRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUnderlayRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteUnderlayRoute"))
              .build();
        }
      }
    }
    return getDeleteUnderlayRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest,
      opi_api.network.cloud.v1alpha1.UnderlayRoute> getUpdateUnderlayRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUnderlayRoute",
      requestType = opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.UnderlayRoute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest,
      opi_api.network.cloud.v1alpha1.UnderlayRoute> getUpdateUnderlayRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest, opi_api.network.cloud.v1alpha1.UnderlayRoute> getUpdateUnderlayRouteMethod;
    if ((getUpdateUnderlayRouteMethod = CloudInfraServiceGrpc.getUpdateUnderlayRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateUnderlayRouteMethod = CloudInfraServiceGrpc.getUpdateUnderlayRouteMethod) == null) {
          CloudInfraServiceGrpc.getUpdateUnderlayRouteMethod = getUpdateUnderlayRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest, opi_api.network.cloud.v1alpha1.UnderlayRoute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUnderlayRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UnderlayRoute.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateUnderlayRoute"))
              .build();
        }
      }
    }
    return getUpdateUnderlayRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest,
      opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse> getListUnderlayRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUnderlayRoutes",
      requestType = opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest,
      opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse> getListUnderlayRoutesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest, opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse> getListUnderlayRoutesMethod;
    if ((getListUnderlayRoutesMethod = CloudInfraServiceGrpc.getListUnderlayRoutesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListUnderlayRoutesMethod = CloudInfraServiceGrpc.getListUnderlayRoutesMethod) == null) {
          CloudInfraServiceGrpc.getListUnderlayRoutesMethod = getListUnderlayRoutesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest, opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUnderlayRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListUnderlayRoutes"))
              .build();
        }
      }
    }
    return getListUnderlayRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest,
      opi_api.network.cloud.v1alpha1.UnderlayRoute> getGetUnderlayRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUnderlayRoute",
      requestType = opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.UnderlayRoute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest,
      opi_api.network.cloud.v1alpha1.UnderlayRoute> getGetUnderlayRouteMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest, opi_api.network.cloud.v1alpha1.UnderlayRoute> getGetUnderlayRouteMethod;
    if ((getGetUnderlayRouteMethod = CloudInfraServiceGrpc.getGetUnderlayRouteMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetUnderlayRouteMethod = CloudInfraServiceGrpc.getGetUnderlayRouteMethod) == null) {
          CloudInfraServiceGrpc.getGetUnderlayRouteMethod = getGetUnderlayRouteMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest, opi_api.network.cloud.v1alpha1.UnderlayRoute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUnderlayRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UnderlayRoute.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetUnderlayRoute"))
              .build();
        }
      }
    }
    return getGetUnderlayRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBgpRequest,
      opi_api.network.cloud.v1alpha1.Bgp> getCreateBgpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBgp",
      requestType = opi_api.network.cloud.v1alpha1.CreateBgpRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Bgp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBgpRequest,
      opi_api.network.cloud.v1alpha1.Bgp> getCreateBgpMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBgpRequest, opi_api.network.cloud.v1alpha1.Bgp> getCreateBgpMethod;
    if ((getCreateBgpMethod = CloudInfraServiceGrpc.getCreateBgpMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateBgpMethod = CloudInfraServiceGrpc.getCreateBgpMethod) == null) {
          CloudInfraServiceGrpc.getCreateBgpMethod = getCreateBgpMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateBgpRequest, opi_api.network.cloud.v1alpha1.Bgp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBgp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateBgpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateBgp"))
              .build();
        }
      }
    }
    return getCreateBgpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBgpRequest,
      com.google.protobuf.Empty> getDeleteBgpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBgp",
      requestType = opi_api.network.cloud.v1alpha1.DeleteBgpRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBgpRequest,
      com.google.protobuf.Empty> getDeleteBgpMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBgpRequest, com.google.protobuf.Empty> getDeleteBgpMethod;
    if ((getDeleteBgpMethod = CloudInfraServiceGrpc.getDeleteBgpMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteBgpMethod = CloudInfraServiceGrpc.getDeleteBgpMethod) == null) {
          CloudInfraServiceGrpc.getDeleteBgpMethod = getDeleteBgpMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteBgpRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBgp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteBgpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteBgp"))
              .build();
        }
      }
    }
    return getDeleteBgpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBgpRequest,
      opi_api.network.cloud.v1alpha1.Bgp> getUpdateBgpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBgp",
      requestType = opi_api.network.cloud.v1alpha1.UpdateBgpRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Bgp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBgpRequest,
      opi_api.network.cloud.v1alpha1.Bgp> getUpdateBgpMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBgpRequest, opi_api.network.cloud.v1alpha1.Bgp> getUpdateBgpMethod;
    if ((getUpdateBgpMethod = CloudInfraServiceGrpc.getUpdateBgpMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateBgpMethod = CloudInfraServiceGrpc.getUpdateBgpMethod) == null) {
          CloudInfraServiceGrpc.getUpdateBgpMethod = getUpdateBgpMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateBgpRequest, opi_api.network.cloud.v1alpha1.Bgp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBgp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateBgpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateBgp"))
              .build();
        }
      }
    }
    return getUpdateBgpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBgpsRequest,
      opi_api.network.cloud.v1alpha1.ListBgpsResponse> getListBgpsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBgps",
      requestType = opi_api.network.cloud.v1alpha1.ListBgpsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListBgpsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBgpsRequest,
      opi_api.network.cloud.v1alpha1.ListBgpsResponse> getListBgpsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBgpsRequest, opi_api.network.cloud.v1alpha1.ListBgpsResponse> getListBgpsMethod;
    if ((getListBgpsMethod = CloudInfraServiceGrpc.getListBgpsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListBgpsMethod = CloudInfraServiceGrpc.getListBgpsMethod) == null) {
          CloudInfraServiceGrpc.getListBgpsMethod = getListBgpsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListBgpsRequest, opi_api.network.cloud.v1alpha1.ListBgpsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBgps"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListBgpsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListBgpsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListBgps"))
              .build();
        }
      }
    }
    return getListBgpsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBgpRequest,
      opi_api.network.cloud.v1alpha1.Bgp> getGetBgpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBgp",
      requestType = opi_api.network.cloud.v1alpha1.GetBgpRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Bgp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBgpRequest,
      opi_api.network.cloud.v1alpha1.Bgp> getGetBgpMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBgpRequest, opi_api.network.cloud.v1alpha1.Bgp> getGetBgpMethod;
    if ((getGetBgpMethod = CloudInfraServiceGrpc.getGetBgpMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetBgpMethod = CloudInfraServiceGrpc.getGetBgpMethod) == null) {
          CloudInfraServiceGrpc.getGetBgpMethod = getGetBgpMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetBgpRequest, opi_api.network.cloud.v1alpha1.Bgp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBgp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetBgpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Bgp.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetBgp"))
              .build();
        }
      }
    }
    return getGetBgpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest,
      opi_api.network.cloud.v1alpha1.BGPPeer> getCreateBGPPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBGPPeer",
      requestType = opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.BGPPeer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest,
      opi_api.network.cloud.v1alpha1.BGPPeer> getCreateBGPPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest, opi_api.network.cloud.v1alpha1.BGPPeer> getCreateBGPPeerMethod;
    if ((getCreateBGPPeerMethod = CloudInfraServiceGrpc.getCreateBGPPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateBGPPeerMethod = CloudInfraServiceGrpc.getCreateBGPPeerMethod) == null) {
          CloudInfraServiceGrpc.getCreateBGPPeerMethod = getCreateBGPPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest, opi_api.network.cloud.v1alpha1.BGPPeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBGPPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.BGPPeer.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateBGPPeer"))
              .build();
        }
      }
    }
    return getCreateBGPPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest,
      com.google.protobuf.Empty> getDeleteBGPPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBGPPeer",
      requestType = opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest,
      com.google.protobuf.Empty> getDeleteBGPPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest, com.google.protobuf.Empty> getDeleteBGPPeerMethod;
    if ((getDeleteBGPPeerMethod = CloudInfraServiceGrpc.getDeleteBGPPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteBGPPeerMethod = CloudInfraServiceGrpc.getDeleteBGPPeerMethod) == null) {
          CloudInfraServiceGrpc.getDeleteBGPPeerMethod = getDeleteBGPPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBGPPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteBGPPeer"))
              .build();
        }
      }
    }
    return getDeleteBGPPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest,
      opi_api.network.cloud.v1alpha1.BGPPeer> getUpdateBGPPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBGPPeer",
      requestType = opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.BGPPeer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest,
      opi_api.network.cloud.v1alpha1.BGPPeer> getUpdateBGPPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest, opi_api.network.cloud.v1alpha1.BGPPeer> getUpdateBGPPeerMethod;
    if ((getUpdateBGPPeerMethod = CloudInfraServiceGrpc.getUpdateBGPPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateBGPPeerMethod = CloudInfraServiceGrpc.getUpdateBGPPeerMethod) == null) {
          CloudInfraServiceGrpc.getUpdateBGPPeerMethod = getUpdateBGPPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest, opi_api.network.cloud.v1alpha1.BGPPeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBGPPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.BGPPeer.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateBGPPeer"))
              .build();
        }
      }
    }
    return getUpdateBGPPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBGPPeersRequest,
      opi_api.network.cloud.v1alpha1.ListBGPPeersResponse> getListBGPPeersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBGPPeers",
      requestType = opi_api.network.cloud.v1alpha1.ListBGPPeersRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListBGPPeersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBGPPeersRequest,
      opi_api.network.cloud.v1alpha1.ListBGPPeersResponse> getListBGPPeersMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBGPPeersRequest, opi_api.network.cloud.v1alpha1.ListBGPPeersResponse> getListBGPPeersMethod;
    if ((getListBGPPeersMethod = CloudInfraServiceGrpc.getListBGPPeersMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListBGPPeersMethod = CloudInfraServiceGrpc.getListBGPPeersMethod) == null) {
          CloudInfraServiceGrpc.getListBGPPeersMethod = getListBGPPeersMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListBGPPeersRequest, opi_api.network.cloud.v1alpha1.ListBGPPeersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBGPPeers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListBGPPeersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListBGPPeersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListBGPPeers"))
              .build();
        }
      }
    }
    return getListBGPPeersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBGPPeerRequest,
      opi_api.network.cloud.v1alpha1.BGPPeer> getGetBGPPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBGPPeer",
      requestType = opi_api.network.cloud.v1alpha1.GetBGPPeerRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.BGPPeer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBGPPeerRequest,
      opi_api.network.cloud.v1alpha1.BGPPeer> getGetBGPPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBGPPeerRequest, opi_api.network.cloud.v1alpha1.BGPPeer> getGetBGPPeerMethod;
    if ((getGetBGPPeerMethod = CloudInfraServiceGrpc.getGetBGPPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetBGPPeerMethod = CloudInfraServiceGrpc.getGetBGPPeerMethod) == null) {
          CloudInfraServiceGrpc.getGetBGPPeerMethod = getGetBGPPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetBGPPeerRequest, opi_api.network.cloud.v1alpha1.BGPPeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBGPPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetBGPPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.BGPPeer.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetBGPPeer"))
              .build();
        }
      }
    }
    return getGetBGPPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest,
      opi_api.network.cloud.v1alpha1.BGPPeerAf> getCreateBGPPeerAfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBGPPeerAf",
      requestType = opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.BGPPeerAf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest,
      opi_api.network.cloud.v1alpha1.BGPPeerAf> getCreateBGPPeerAfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest, opi_api.network.cloud.v1alpha1.BGPPeerAf> getCreateBGPPeerAfMethod;
    if ((getCreateBGPPeerAfMethod = CloudInfraServiceGrpc.getCreateBGPPeerAfMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateBGPPeerAfMethod = CloudInfraServiceGrpc.getCreateBGPPeerAfMethod) == null) {
          CloudInfraServiceGrpc.getCreateBGPPeerAfMethod = getCreateBGPPeerAfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest, opi_api.network.cloud.v1alpha1.BGPPeerAf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBGPPeerAf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateBGPPeerAf"))
              .build();
        }
      }
    }
    return getCreateBGPPeerAfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest,
      com.google.protobuf.Empty> getDeleteBGPPeerAfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBGPPeerAf",
      requestType = opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest,
      com.google.protobuf.Empty> getDeleteBGPPeerAfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest, com.google.protobuf.Empty> getDeleteBGPPeerAfMethod;
    if ((getDeleteBGPPeerAfMethod = CloudInfraServiceGrpc.getDeleteBGPPeerAfMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteBGPPeerAfMethod = CloudInfraServiceGrpc.getDeleteBGPPeerAfMethod) == null) {
          CloudInfraServiceGrpc.getDeleteBGPPeerAfMethod = getDeleteBGPPeerAfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBGPPeerAf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteBGPPeerAf"))
              .build();
        }
      }
    }
    return getDeleteBGPPeerAfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest,
      opi_api.network.cloud.v1alpha1.BGPPeerAf> getUpdateBGPPeerAfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBGPPeerAf",
      requestType = opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.BGPPeerAf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest,
      opi_api.network.cloud.v1alpha1.BGPPeerAf> getUpdateBGPPeerAfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest, opi_api.network.cloud.v1alpha1.BGPPeerAf> getUpdateBGPPeerAfMethod;
    if ((getUpdateBGPPeerAfMethod = CloudInfraServiceGrpc.getUpdateBGPPeerAfMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateBGPPeerAfMethod = CloudInfraServiceGrpc.getUpdateBGPPeerAfMethod) == null) {
          CloudInfraServiceGrpc.getUpdateBGPPeerAfMethod = getUpdateBGPPeerAfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest, opi_api.network.cloud.v1alpha1.BGPPeerAf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBGPPeerAf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateBGPPeerAf"))
              .build();
        }
      }
    }
    return getUpdateBGPPeerAfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest,
      opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse> getListBGPPeerAfsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBGPPeerAfs",
      requestType = opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest,
      opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse> getListBGPPeerAfsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest, opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse> getListBGPPeerAfsMethod;
    if ((getListBGPPeerAfsMethod = CloudInfraServiceGrpc.getListBGPPeerAfsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListBGPPeerAfsMethod = CloudInfraServiceGrpc.getListBGPPeerAfsMethod) == null) {
          CloudInfraServiceGrpc.getListBGPPeerAfsMethod = getListBGPPeerAfsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest, opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBGPPeerAfs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListBGPPeerAfs"))
              .build();
        }
      }
    }
    return getListBGPPeerAfsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest,
      opi_api.network.cloud.v1alpha1.BGPPeerAf> getGetBGPPeerAfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBGPPeerAf",
      requestType = opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.BGPPeerAf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest,
      opi_api.network.cloud.v1alpha1.BGPPeerAf> getGetBGPPeerAfMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest, opi_api.network.cloud.v1alpha1.BGPPeerAf> getGetBGPPeerAfMethod;
    if ((getGetBGPPeerAfMethod = CloudInfraServiceGrpc.getGetBGPPeerAfMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetBGPPeerAfMethod = CloudInfraServiceGrpc.getGetBGPPeerAfMethod) == null) {
          CloudInfraServiceGrpc.getGetBGPPeerAfMethod = getGetBGPPeerAfMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest, opi_api.network.cloud.v1alpha1.BGPPeerAf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBGPPeerAf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.BGPPeerAf.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetBGPPeerAf"))
              .build();
        }
      }
    }
    return getGetBGPPeerAfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateMappingRequest,
      opi_api.network.cloud.v1alpha1.Mapping> getCreateMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMapping",
      requestType = opi_api.network.cloud.v1alpha1.CreateMappingRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Mapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateMappingRequest,
      opi_api.network.cloud.v1alpha1.Mapping> getCreateMappingMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateMappingRequest, opi_api.network.cloud.v1alpha1.Mapping> getCreateMappingMethod;
    if ((getCreateMappingMethod = CloudInfraServiceGrpc.getCreateMappingMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateMappingMethod = CloudInfraServiceGrpc.getCreateMappingMethod) == null) {
          CloudInfraServiceGrpc.getCreateMappingMethod = getCreateMappingMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateMappingRequest, opi_api.network.cloud.v1alpha1.Mapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Mapping.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateMapping"))
              .build();
        }
      }
    }
    return getCreateMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteMappingRequest,
      com.google.protobuf.Empty> getDeleteMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMapping",
      requestType = opi_api.network.cloud.v1alpha1.DeleteMappingRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteMappingRequest,
      com.google.protobuf.Empty> getDeleteMappingMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteMappingRequest, com.google.protobuf.Empty> getDeleteMappingMethod;
    if ((getDeleteMappingMethod = CloudInfraServiceGrpc.getDeleteMappingMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteMappingMethod = CloudInfraServiceGrpc.getDeleteMappingMethod) == null) {
          CloudInfraServiceGrpc.getDeleteMappingMethod = getDeleteMappingMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteMappingRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteMapping"))
              .build();
        }
      }
    }
    return getDeleteMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateMappingRequest,
      opi_api.network.cloud.v1alpha1.Mapping> getUpdateMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMapping",
      requestType = opi_api.network.cloud.v1alpha1.UpdateMappingRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Mapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateMappingRequest,
      opi_api.network.cloud.v1alpha1.Mapping> getUpdateMappingMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateMappingRequest, opi_api.network.cloud.v1alpha1.Mapping> getUpdateMappingMethod;
    if ((getUpdateMappingMethod = CloudInfraServiceGrpc.getUpdateMappingMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateMappingMethod = CloudInfraServiceGrpc.getUpdateMappingMethod) == null) {
          CloudInfraServiceGrpc.getUpdateMappingMethod = getUpdateMappingMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateMappingRequest, opi_api.network.cloud.v1alpha1.Mapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Mapping.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateMapping"))
              .build();
        }
      }
    }
    return getUpdateMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListMappingsRequest,
      opi_api.network.cloud.v1alpha1.ListMappingsResponse> getListMappingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMappings",
      requestType = opi_api.network.cloud.v1alpha1.ListMappingsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListMappingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListMappingsRequest,
      opi_api.network.cloud.v1alpha1.ListMappingsResponse> getListMappingsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListMappingsRequest, opi_api.network.cloud.v1alpha1.ListMappingsResponse> getListMappingsMethod;
    if ((getListMappingsMethod = CloudInfraServiceGrpc.getListMappingsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListMappingsMethod = CloudInfraServiceGrpc.getListMappingsMethod) == null) {
          CloudInfraServiceGrpc.getListMappingsMethod = getListMappingsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListMappingsRequest, opi_api.network.cloud.v1alpha1.ListMappingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMappings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListMappingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListMappingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListMappings"))
              .build();
        }
      }
    }
    return getListMappingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetMappingRequest,
      opi_api.network.cloud.v1alpha1.Mapping> getGetMappingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMapping",
      requestType = opi_api.network.cloud.v1alpha1.GetMappingRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Mapping.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetMappingRequest,
      opi_api.network.cloud.v1alpha1.Mapping> getGetMappingMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetMappingRequest, opi_api.network.cloud.v1alpha1.Mapping> getGetMappingMethod;
    if ((getGetMappingMethod = CloudInfraServiceGrpc.getGetMappingMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetMappingMethod = CloudInfraServiceGrpc.getGetMappingMethod) == null) {
          CloudInfraServiceGrpc.getGetMappingMethod = getGetMappingMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetMappingRequest, opi_api.network.cloud.v1alpha1.Mapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMapping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetMappingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Mapping.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetMapping"))
              .build();
        }
      }
    }
    return getGetMappingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateNextHopRequest,
      opi_api.network.cloud.v1alpha1.NextHop> getCreateNextHopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNextHop",
      requestType = opi_api.network.cloud.v1alpha1.CreateNextHopRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.NextHop.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateNextHopRequest,
      opi_api.network.cloud.v1alpha1.NextHop> getCreateNextHopMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateNextHopRequest, opi_api.network.cloud.v1alpha1.NextHop> getCreateNextHopMethod;
    if ((getCreateNextHopMethod = CloudInfraServiceGrpc.getCreateNextHopMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateNextHopMethod = CloudInfraServiceGrpc.getCreateNextHopMethod) == null) {
          CloudInfraServiceGrpc.getCreateNextHopMethod = getCreateNextHopMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateNextHopRequest, opi_api.network.cloud.v1alpha1.NextHop>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNextHop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateNextHopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.NextHop.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateNextHop"))
              .build();
        }
      }
    }
    return getCreateNextHopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteNextHopRequest,
      com.google.protobuf.Empty> getDeleteNextHopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNextHop",
      requestType = opi_api.network.cloud.v1alpha1.DeleteNextHopRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteNextHopRequest,
      com.google.protobuf.Empty> getDeleteNextHopMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteNextHopRequest, com.google.protobuf.Empty> getDeleteNextHopMethod;
    if ((getDeleteNextHopMethod = CloudInfraServiceGrpc.getDeleteNextHopMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteNextHopMethod = CloudInfraServiceGrpc.getDeleteNextHopMethod) == null) {
          CloudInfraServiceGrpc.getDeleteNextHopMethod = getDeleteNextHopMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteNextHopRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNextHop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteNextHopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteNextHop"))
              .build();
        }
      }
    }
    return getDeleteNextHopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateNextHopRequest,
      opi_api.network.cloud.v1alpha1.NextHop> getUpdateNextHopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNextHop",
      requestType = opi_api.network.cloud.v1alpha1.UpdateNextHopRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.NextHop.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateNextHopRequest,
      opi_api.network.cloud.v1alpha1.NextHop> getUpdateNextHopMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateNextHopRequest, opi_api.network.cloud.v1alpha1.NextHop> getUpdateNextHopMethod;
    if ((getUpdateNextHopMethod = CloudInfraServiceGrpc.getUpdateNextHopMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateNextHopMethod = CloudInfraServiceGrpc.getUpdateNextHopMethod) == null) {
          CloudInfraServiceGrpc.getUpdateNextHopMethod = getUpdateNextHopMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateNextHopRequest, opi_api.network.cloud.v1alpha1.NextHop>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNextHop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateNextHopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.NextHop.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateNextHop"))
              .build();
        }
      }
    }
    return getUpdateNextHopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListNextHopsRequest,
      opi_api.network.cloud.v1alpha1.ListNextHopsResponse> getListNextHopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNextHop",
      requestType = opi_api.network.cloud.v1alpha1.ListNextHopsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListNextHopsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListNextHopsRequest,
      opi_api.network.cloud.v1alpha1.ListNextHopsResponse> getListNextHopMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListNextHopsRequest, opi_api.network.cloud.v1alpha1.ListNextHopsResponse> getListNextHopMethod;
    if ((getListNextHopMethod = CloudInfraServiceGrpc.getListNextHopMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListNextHopMethod = CloudInfraServiceGrpc.getListNextHopMethod) == null) {
          CloudInfraServiceGrpc.getListNextHopMethod = getListNextHopMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListNextHopsRequest, opi_api.network.cloud.v1alpha1.ListNextHopsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNextHop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListNextHopsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListNextHopsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListNextHop"))
              .build();
        }
      }
    }
    return getListNextHopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetNextHopRequest,
      opi_api.network.cloud.v1alpha1.NextHop> getGetNextHopMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextHop",
      requestType = opi_api.network.cloud.v1alpha1.GetNextHopRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.NextHop.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetNextHopRequest,
      opi_api.network.cloud.v1alpha1.NextHop> getGetNextHopMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetNextHopRequest, opi_api.network.cloud.v1alpha1.NextHop> getGetNextHopMethod;
    if ((getGetNextHopMethod = CloudInfraServiceGrpc.getGetNextHopMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetNextHopMethod = CloudInfraServiceGrpc.getGetNextHopMethod) == null) {
          CloudInfraServiceGrpc.getGetNextHopMethod = getGetNextHopMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetNextHopRequest, opi_api.network.cloud.v1alpha1.NextHop>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextHop"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetNextHopRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.NextHop.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetNextHop"))
              .build();
        }
      }
    }
    return getGetNextHopMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest,
      opi_api.network.cloud.v1alpha1.NextHopGroup> getCreateNextHopGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNextHopGroup",
      requestType = opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.NextHopGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest,
      opi_api.network.cloud.v1alpha1.NextHopGroup> getCreateNextHopGroupMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest, opi_api.network.cloud.v1alpha1.NextHopGroup> getCreateNextHopGroupMethod;
    if ((getCreateNextHopGroupMethod = CloudInfraServiceGrpc.getCreateNextHopGroupMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateNextHopGroupMethod = CloudInfraServiceGrpc.getCreateNextHopGroupMethod) == null) {
          CloudInfraServiceGrpc.getCreateNextHopGroupMethod = getCreateNextHopGroupMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest, opi_api.network.cloud.v1alpha1.NextHopGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNextHopGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.NextHopGroup.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateNextHopGroup"))
              .build();
        }
      }
    }
    return getCreateNextHopGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest,
      com.google.protobuf.Empty> getDeleteNextHopGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNextHopGroup",
      requestType = opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest,
      com.google.protobuf.Empty> getDeleteNextHopGroupMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest, com.google.protobuf.Empty> getDeleteNextHopGroupMethod;
    if ((getDeleteNextHopGroupMethod = CloudInfraServiceGrpc.getDeleteNextHopGroupMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteNextHopGroupMethod = CloudInfraServiceGrpc.getDeleteNextHopGroupMethod) == null) {
          CloudInfraServiceGrpc.getDeleteNextHopGroupMethod = getDeleteNextHopGroupMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNextHopGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteNextHopGroup"))
              .build();
        }
      }
    }
    return getDeleteNextHopGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest,
      opi_api.network.cloud.v1alpha1.NextHopGroup> getUpdateNextHopGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNextHopGroup",
      requestType = opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.NextHopGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest,
      opi_api.network.cloud.v1alpha1.NextHopGroup> getUpdateNextHopGroupMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest, opi_api.network.cloud.v1alpha1.NextHopGroup> getUpdateNextHopGroupMethod;
    if ((getUpdateNextHopGroupMethod = CloudInfraServiceGrpc.getUpdateNextHopGroupMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateNextHopGroupMethod = CloudInfraServiceGrpc.getUpdateNextHopGroupMethod) == null) {
          CloudInfraServiceGrpc.getUpdateNextHopGroupMethod = getUpdateNextHopGroupMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest, opi_api.network.cloud.v1alpha1.NextHopGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNextHopGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.NextHopGroup.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateNextHopGroup"))
              .build();
        }
      }
    }
    return getUpdateNextHopGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest,
      opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse> getListNextHopGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNextHopGroups",
      requestType = opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest,
      opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse> getListNextHopGroupsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest, opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse> getListNextHopGroupsMethod;
    if ((getListNextHopGroupsMethod = CloudInfraServiceGrpc.getListNextHopGroupsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListNextHopGroupsMethod = CloudInfraServiceGrpc.getListNextHopGroupsMethod) == null) {
          CloudInfraServiceGrpc.getListNextHopGroupsMethod = getListNextHopGroupsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest, opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNextHopGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListNextHopGroups"))
              .build();
        }
      }
    }
    return getListNextHopGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest,
      opi_api.network.cloud.v1alpha1.NextHopGroup> getGetNextHopGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNextHopGroup",
      requestType = opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.NextHopGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest,
      opi_api.network.cloud.v1alpha1.NextHopGroup> getGetNextHopGroupMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest, opi_api.network.cloud.v1alpha1.NextHopGroup> getGetNextHopGroupMethod;
    if ((getGetNextHopGroupMethod = CloudInfraServiceGrpc.getGetNextHopGroupMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetNextHopGroupMethod = CloudInfraServiceGrpc.getGetNextHopGroupMethod) == null) {
          CloudInfraServiceGrpc.getGetNextHopGroupMethod = getGetNextHopGroupMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest, opi_api.network.cloud.v1alpha1.NextHopGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNextHopGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.NextHopGroup.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetNextHopGroup"))
              .build();
        }
      }
    }
    return getGetNextHopGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSubnetRequest,
      opi_api.network.cloud.v1alpha1.Subnet> getCreateSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSubnet",
      requestType = opi_api.network.cloud.v1alpha1.CreateSubnetRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Subnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSubnetRequest,
      opi_api.network.cloud.v1alpha1.Subnet> getCreateSubnetMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSubnetRequest, opi_api.network.cloud.v1alpha1.Subnet> getCreateSubnetMethod;
    if ((getCreateSubnetMethod = CloudInfraServiceGrpc.getCreateSubnetMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateSubnetMethod = CloudInfraServiceGrpc.getCreateSubnetMethod) == null) {
          CloudInfraServiceGrpc.getCreateSubnetMethod = getCreateSubnetMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateSubnetRequest, opi_api.network.cloud.v1alpha1.Subnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Subnet.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateSubnet"))
              .build();
        }
      }
    }
    return getCreateSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSubnetRequest,
      com.google.protobuf.Empty> getDeleteSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSubnet",
      requestType = opi_api.network.cloud.v1alpha1.DeleteSubnetRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSubnetRequest,
      com.google.protobuf.Empty> getDeleteSubnetMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSubnetRequest, com.google.protobuf.Empty> getDeleteSubnetMethod;
    if ((getDeleteSubnetMethod = CloudInfraServiceGrpc.getDeleteSubnetMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteSubnetMethod = CloudInfraServiceGrpc.getDeleteSubnetMethod) == null) {
          CloudInfraServiceGrpc.getDeleteSubnetMethod = getDeleteSubnetMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteSubnetRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteSubnet"))
              .build();
        }
      }
    }
    return getDeleteSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSubnetRequest,
      opi_api.network.cloud.v1alpha1.Subnet> getUpdateSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSubnet",
      requestType = opi_api.network.cloud.v1alpha1.UpdateSubnetRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Subnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSubnetRequest,
      opi_api.network.cloud.v1alpha1.Subnet> getUpdateSubnetMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSubnetRequest, opi_api.network.cloud.v1alpha1.Subnet> getUpdateSubnetMethod;
    if ((getUpdateSubnetMethod = CloudInfraServiceGrpc.getUpdateSubnetMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateSubnetMethod = CloudInfraServiceGrpc.getUpdateSubnetMethod) == null) {
          CloudInfraServiceGrpc.getUpdateSubnetMethod = getUpdateSubnetMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateSubnetRequest, opi_api.network.cloud.v1alpha1.Subnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Subnet.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateSubnet"))
              .build();
        }
      }
    }
    return getUpdateSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSubnetsRequest,
      opi_api.network.cloud.v1alpha1.ListSubnetsResponse> getListSubnetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSubnets",
      requestType = opi_api.network.cloud.v1alpha1.ListSubnetsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListSubnetsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSubnetsRequest,
      opi_api.network.cloud.v1alpha1.ListSubnetsResponse> getListSubnetsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSubnetsRequest, opi_api.network.cloud.v1alpha1.ListSubnetsResponse> getListSubnetsMethod;
    if ((getListSubnetsMethod = CloudInfraServiceGrpc.getListSubnetsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListSubnetsMethod = CloudInfraServiceGrpc.getListSubnetsMethod) == null) {
          CloudInfraServiceGrpc.getListSubnetsMethod = getListSubnetsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListSubnetsRequest, opi_api.network.cloud.v1alpha1.ListSubnetsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSubnets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSubnetsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSubnetsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListSubnets"))
              .build();
        }
      }
    }
    return getListSubnetsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSubnetRequest,
      opi_api.network.cloud.v1alpha1.Subnet> getGetSubnetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSubnet",
      requestType = opi_api.network.cloud.v1alpha1.GetSubnetRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Subnet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSubnetRequest,
      opi_api.network.cloud.v1alpha1.Subnet> getGetSubnetMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSubnetRequest, opi_api.network.cloud.v1alpha1.Subnet> getGetSubnetMethod;
    if ((getGetSubnetMethod = CloudInfraServiceGrpc.getGetSubnetMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetSubnetMethod = CloudInfraServiceGrpc.getGetSubnetMethod) == null) {
          CloudInfraServiceGrpc.getGetSubnetMethod = getGetSubnetMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetSubnetRequest, opi_api.network.cloud.v1alpha1.Subnet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSubnet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetSubnetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Subnet.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetSubnet"))
              .build();
        }
      }
    }
    return getGetSubnetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateTunnelRequest,
      opi_api.network.cloud.v1alpha1.Tunnel> getCreateTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTunnel",
      requestType = opi_api.network.cloud.v1alpha1.CreateTunnelRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Tunnel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateTunnelRequest,
      opi_api.network.cloud.v1alpha1.Tunnel> getCreateTunnelMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateTunnelRequest, opi_api.network.cloud.v1alpha1.Tunnel> getCreateTunnelMethod;
    if ((getCreateTunnelMethod = CloudInfraServiceGrpc.getCreateTunnelMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateTunnelMethod = CloudInfraServiceGrpc.getCreateTunnelMethod) == null) {
          CloudInfraServiceGrpc.getCreateTunnelMethod = getCreateTunnelMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateTunnelRequest, opi_api.network.cloud.v1alpha1.Tunnel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateTunnelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateTunnel"))
              .build();
        }
      }
    }
    return getCreateTunnelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteTunnelRequest,
      com.google.protobuf.Empty> getDeleteTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTunnel",
      requestType = opi_api.network.cloud.v1alpha1.DeleteTunnelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteTunnelRequest,
      com.google.protobuf.Empty> getDeleteTunnelMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteTunnelRequest, com.google.protobuf.Empty> getDeleteTunnelMethod;
    if ((getDeleteTunnelMethod = CloudInfraServiceGrpc.getDeleteTunnelMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteTunnelMethod = CloudInfraServiceGrpc.getDeleteTunnelMethod) == null) {
          CloudInfraServiceGrpc.getDeleteTunnelMethod = getDeleteTunnelMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteTunnelRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteTunnelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteTunnel"))
              .build();
        }
      }
    }
    return getDeleteTunnelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateTunnelRequest,
      opi_api.network.cloud.v1alpha1.Tunnel> getUpdateTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTunnel",
      requestType = opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Tunnel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateTunnelRequest,
      opi_api.network.cloud.v1alpha1.Tunnel> getUpdateTunnelMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateTunnelRequest, opi_api.network.cloud.v1alpha1.Tunnel> getUpdateTunnelMethod;
    if ((getUpdateTunnelMethod = CloudInfraServiceGrpc.getUpdateTunnelMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateTunnelMethod = CloudInfraServiceGrpc.getUpdateTunnelMethod) == null) {
          CloudInfraServiceGrpc.getUpdateTunnelMethod = getUpdateTunnelMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateTunnelRequest, opi_api.network.cloud.v1alpha1.Tunnel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateTunnel"))
              .build();
        }
      }
    }
    return getUpdateTunnelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListTunnelsRequest,
      opi_api.network.cloud.v1alpha1.ListTunnelsResponse> getListTunnelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTunnels",
      requestType = opi_api.network.cloud.v1alpha1.ListTunnelsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListTunnelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListTunnelsRequest,
      opi_api.network.cloud.v1alpha1.ListTunnelsResponse> getListTunnelsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListTunnelsRequest, opi_api.network.cloud.v1alpha1.ListTunnelsResponse> getListTunnelsMethod;
    if ((getListTunnelsMethod = CloudInfraServiceGrpc.getListTunnelsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListTunnelsMethod = CloudInfraServiceGrpc.getListTunnelsMethod) == null) {
          CloudInfraServiceGrpc.getListTunnelsMethod = getListTunnelsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListTunnelsRequest, opi_api.network.cloud.v1alpha1.ListTunnelsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTunnels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListTunnelsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListTunnelsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListTunnels"))
              .build();
        }
      }
    }
    return getListTunnelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetTunnelRequest,
      opi_api.network.cloud.v1alpha1.Tunnel> getGetTunnelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTunnel",
      requestType = opi_api.network.cloud.v1alpha1.GetTunnelRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Tunnel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetTunnelRequest,
      opi_api.network.cloud.v1alpha1.Tunnel> getGetTunnelMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetTunnelRequest, opi_api.network.cloud.v1alpha1.Tunnel> getGetTunnelMethod;
    if ((getGetTunnelMethod = CloudInfraServiceGrpc.getGetTunnelMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetTunnelMethod = CloudInfraServiceGrpc.getGetTunnelMethod) == null) {
          CloudInfraServiceGrpc.getGetTunnelMethod = getGetTunnelMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetTunnelRequest, opi_api.network.cloud.v1alpha1.Tunnel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTunnel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetTunnelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetTunnel"))
              .build();
        }
      }
    }
    return getGetTunnelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVpcRequest,
      opi_api.network.cloud.v1alpha1.Vpc> getCreateVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVpc",
      requestType = opi_api.network.cloud.v1alpha1.CreateVpcRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Vpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVpcRequest,
      opi_api.network.cloud.v1alpha1.Vpc> getCreateVpcMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVpcRequest, opi_api.network.cloud.v1alpha1.Vpc> getCreateVpcMethod;
    if ((getCreateVpcMethod = CloudInfraServiceGrpc.getCreateVpcMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateVpcMethod = CloudInfraServiceGrpc.getCreateVpcMethod) == null) {
          CloudInfraServiceGrpc.getCreateVpcMethod = getCreateVpcMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateVpcRequest, opi_api.network.cloud.v1alpha1.Vpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Vpc.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateVpc"))
              .build();
        }
      }
    }
    return getCreateVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVpcRequest,
      com.google.protobuf.Empty> getDeleteVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVpc",
      requestType = opi_api.network.cloud.v1alpha1.DeleteVpcRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVpcRequest,
      com.google.protobuf.Empty> getDeleteVpcMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVpcRequest, com.google.protobuf.Empty> getDeleteVpcMethod;
    if ((getDeleteVpcMethod = CloudInfraServiceGrpc.getDeleteVpcMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteVpcMethod = CloudInfraServiceGrpc.getDeleteVpcMethod) == null) {
          CloudInfraServiceGrpc.getDeleteVpcMethod = getDeleteVpcMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteVpcRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteVpc"))
              .build();
        }
      }
    }
    return getDeleteVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVpcRequest,
      opi_api.network.cloud.v1alpha1.Vpc> getUpdateVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVpc",
      requestType = opi_api.network.cloud.v1alpha1.UpdateVpcRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Vpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVpcRequest,
      opi_api.network.cloud.v1alpha1.Vpc> getUpdateVpcMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVpcRequest, opi_api.network.cloud.v1alpha1.Vpc> getUpdateVpcMethod;
    if ((getUpdateVpcMethod = CloudInfraServiceGrpc.getUpdateVpcMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateVpcMethod = CloudInfraServiceGrpc.getUpdateVpcMethod) == null) {
          CloudInfraServiceGrpc.getUpdateVpcMethod = getUpdateVpcMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateVpcRequest, opi_api.network.cloud.v1alpha1.Vpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Vpc.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateVpc"))
              .build();
        }
      }
    }
    return getUpdateVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVpcsRequest,
      opi_api.network.cloud.v1alpha1.ListVpcsResponse> getListVpcsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVpcs",
      requestType = opi_api.network.cloud.v1alpha1.ListVpcsRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListVpcsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVpcsRequest,
      opi_api.network.cloud.v1alpha1.ListVpcsResponse> getListVpcsMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVpcsRequest, opi_api.network.cloud.v1alpha1.ListVpcsResponse> getListVpcsMethod;
    if ((getListVpcsMethod = CloudInfraServiceGrpc.getListVpcsMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListVpcsMethod = CloudInfraServiceGrpc.getListVpcsMethod) == null) {
          CloudInfraServiceGrpc.getListVpcsMethod = getListVpcsMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListVpcsRequest, opi_api.network.cloud.v1alpha1.ListVpcsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVpcs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListVpcsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListVpcsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListVpcs"))
              .build();
        }
      }
    }
    return getListVpcsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVpcRequest,
      opi_api.network.cloud.v1alpha1.Vpc> getGetVpcMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVpc",
      requestType = opi_api.network.cloud.v1alpha1.GetVpcRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.Vpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVpcRequest,
      opi_api.network.cloud.v1alpha1.Vpc> getGetVpcMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVpcRequest, opi_api.network.cloud.v1alpha1.Vpc> getGetVpcMethod;
    if ((getGetVpcMethod = CloudInfraServiceGrpc.getGetVpcMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetVpcMethod = CloudInfraServiceGrpc.getGetVpcMethod) == null) {
          CloudInfraServiceGrpc.getGetVpcMethod = getGetVpcMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetVpcRequest, opi_api.network.cloud.v1alpha1.Vpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVpc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetVpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.Vpc.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetVpc"))
              .build();
        }
      }
    }
    return getGetVpcMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest,
      opi_api.network.cloud.v1alpha1.VPCPeer> getCreateVPCPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVPCPeer",
      requestType = opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.VPCPeer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest,
      opi_api.network.cloud.v1alpha1.VPCPeer> getCreateVPCPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest, opi_api.network.cloud.v1alpha1.VPCPeer> getCreateVPCPeerMethod;
    if ((getCreateVPCPeerMethod = CloudInfraServiceGrpc.getCreateVPCPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateVPCPeerMethod = CloudInfraServiceGrpc.getCreateVPCPeerMethod) == null) {
          CloudInfraServiceGrpc.getCreateVPCPeerMethod = getCreateVPCPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest, opi_api.network.cloud.v1alpha1.VPCPeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVPCPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.VPCPeer.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateVPCPeer"))
              .build();
        }
      }
    }
    return getCreateVPCPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest,
      com.google.protobuf.Empty> getDeleteVPCPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVPCPeer",
      requestType = opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest,
      com.google.protobuf.Empty> getDeleteVPCPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest, com.google.protobuf.Empty> getDeleteVPCPeerMethod;
    if ((getDeleteVPCPeerMethod = CloudInfraServiceGrpc.getDeleteVPCPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteVPCPeerMethod = CloudInfraServiceGrpc.getDeleteVPCPeerMethod) == null) {
          CloudInfraServiceGrpc.getDeleteVPCPeerMethod = getDeleteVPCPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVPCPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteVPCPeer"))
              .build();
        }
      }
    }
    return getDeleteVPCPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest,
      opi_api.network.cloud.v1alpha1.VPCPeer> getUpdateVPCPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateVPCPeer",
      requestType = opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.VPCPeer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest,
      opi_api.network.cloud.v1alpha1.VPCPeer> getUpdateVPCPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest, opi_api.network.cloud.v1alpha1.VPCPeer> getUpdateVPCPeerMethod;
    if ((getUpdateVPCPeerMethod = CloudInfraServiceGrpc.getUpdateVPCPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateVPCPeerMethod = CloudInfraServiceGrpc.getUpdateVPCPeerMethod) == null) {
          CloudInfraServiceGrpc.getUpdateVPCPeerMethod = getUpdateVPCPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest, opi_api.network.cloud.v1alpha1.VPCPeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateVPCPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.VPCPeer.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateVPCPeer"))
              .build();
        }
      }
    }
    return getUpdateVPCPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVPCPeersRequest,
      opi_api.network.cloud.v1alpha1.ListVPCPeersResponse> getListVPCPeersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListVPCPeers",
      requestType = opi_api.network.cloud.v1alpha1.ListVPCPeersRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListVPCPeersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVPCPeersRequest,
      opi_api.network.cloud.v1alpha1.ListVPCPeersResponse> getListVPCPeersMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListVPCPeersRequest, opi_api.network.cloud.v1alpha1.ListVPCPeersResponse> getListVPCPeersMethod;
    if ((getListVPCPeersMethod = CloudInfraServiceGrpc.getListVPCPeersMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListVPCPeersMethod = CloudInfraServiceGrpc.getListVPCPeersMethod) == null) {
          CloudInfraServiceGrpc.getListVPCPeersMethod = getListVPCPeersMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListVPCPeersRequest, opi_api.network.cloud.v1alpha1.ListVPCPeersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListVPCPeers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListVPCPeersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListVPCPeersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListVPCPeers"))
              .build();
        }
      }
    }
    return getListVPCPeersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVPCPeerRequest,
      opi_api.network.cloud.v1alpha1.VPCPeer> getGetVPCPeerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVPCPeer",
      requestType = opi_api.network.cloud.v1alpha1.GetVPCPeerRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.VPCPeer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVPCPeerRequest,
      opi_api.network.cloud.v1alpha1.VPCPeer> getGetVPCPeerMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetVPCPeerRequest, opi_api.network.cloud.v1alpha1.VPCPeer> getGetVPCPeerMethod;
    if ((getGetVPCPeerMethod = CloudInfraServiceGrpc.getGetVPCPeerMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetVPCPeerMethod = CloudInfraServiceGrpc.getGetVPCPeerMethod) == null) {
          CloudInfraServiceGrpc.getGetVPCPeerMethod = getGetVPCPeerMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetVPCPeerRequest, opi_api.network.cloud.v1alpha1.VPCPeer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVPCPeer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetVPCPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.VPCPeer.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetVPCPeer"))
              .build();
        }
      }
    }
    return getGetVPCPeerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest,
      opi_api.network.cloud.v1alpha1.SecurityPolicy> getCreateSecurityPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSecurityPolicy",
      requestType = opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest,
      opi_api.network.cloud.v1alpha1.SecurityPolicy> getCreateSecurityPolicyMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest, opi_api.network.cloud.v1alpha1.SecurityPolicy> getCreateSecurityPolicyMethod;
    if ((getCreateSecurityPolicyMethod = CloudInfraServiceGrpc.getCreateSecurityPolicyMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateSecurityPolicyMethod = CloudInfraServiceGrpc.getCreateSecurityPolicyMethod) == null) {
          CloudInfraServiceGrpc.getCreateSecurityPolicyMethod = getCreateSecurityPolicyMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest, opi_api.network.cloud.v1alpha1.SecurityPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSecurityPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateSecurityPolicy"))
              .build();
        }
      }
    }
    return getCreateSecurityPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest,
      com.google.protobuf.Empty> getDeleteSecurityPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSecurityPolicy",
      requestType = opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest,
      com.google.protobuf.Empty> getDeleteSecurityPolicyMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest, com.google.protobuf.Empty> getDeleteSecurityPolicyMethod;
    if ((getDeleteSecurityPolicyMethod = CloudInfraServiceGrpc.getDeleteSecurityPolicyMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteSecurityPolicyMethod = CloudInfraServiceGrpc.getDeleteSecurityPolicyMethod) == null) {
          CloudInfraServiceGrpc.getDeleteSecurityPolicyMethod = getDeleteSecurityPolicyMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSecurityPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteSecurityPolicy"))
              .build();
        }
      }
    }
    return getDeleteSecurityPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest,
      opi_api.network.cloud.v1alpha1.SecurityPolicy> getUpdateSecurityPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSecurityPolicy",
      requestType = opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest,
      opi_api.network.cloud.v1alpha1.SecurityPolicy> getUpdateSecurityPolicyMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest, opi_api.network.cloud.v1alpha1.SecurityPolicy> getUpdateSecurityPolicyMethod;
    if ((getUpdateSecurityPolicyMethod = CloudInfraServiceGrpc.getUpdateSecurityPolicyMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateSecurityPolicyMethod = CloudInfraServiceGrpc.getUpdateSecurityPolicyMethod) == null) {
          CloudInfraServiceGrpc.getUpdateSecurityPolicyMethod = getUpdateSecurityPolicyMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest, opi_api.network.cloud.v1alpha1.SecurityPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSecurityPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateSecurityPolicy"))
              .build();
        }
      }
    }
    return getUpdateSecurityPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest,
      opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse> getListSecurityPolicysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecurityPolicys",
      requestType = opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest,
      opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse> getListSecurityPolicysMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest, opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse> getListSecurityPolicysMethod;
    if ((getListSecurityPolicysMethod = CloudInfraServiceGrpc.getListSecurityPolicysMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListSecurityPolicysMethod = CloudInfraServiceGrpc.getListSecurityPolicysMethod) == null) {
          CloudInfraServiceGrpc.getListSecurityPolicysMethod = getListSecurityPolicysMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest, opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSecurityPolicys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListSecurityPolicys"))
              .build();
        }
      }
    }
    return getListSecurityPolicysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest,
      opi_api.network.cloud.v1alpha1.SecurityPolicy> getGetSecurityPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecurityPolicy",
      requestType = opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest,
      opi_api.network.cloud.v1alpha1.SecurityPolicy> getGetSecurityPolicyMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest, opi_api.network.cloud.v1alpha1.SecurityPolicy> getGetSecurityPolicyMethod;
    if ((getGetSecurityPolicyMethod = CloudInfraServiceGrpc.getGetSecurityPolicyMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetSecurityPolicyMethod = CloudInfraServiceGrpc.getGetSecurityPolicyMethod) == null) {
          CloudInfraServiceGrpc.getGetSecurityPolicyMethod = getGetSecurityPolicyMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest, opi_api.network.cloud.v1alpha1.SecurityPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecurityPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetSecurityPolicy"))
              .build();
        }
      }
    }
    return getGetSecurityPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest,
      opi_api.network.cloud.v1alpha1.SecurityRule> getCreateSecurityRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSecurityRule",
      requestType = opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityRule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest,
      opi_api.network.cloud.v1alpha1.SecurityRule> getCreateSecurityRuleMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest, opi_api.network.cloud.v1alpha1.SecurityRule> getCreateSecurityRuleMethod;
    if ((getCreateSecurityRuleMethod = CloudInfraServiceGrpc.getCreateSecurityRuleMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateSecurityRuleMethod = CloudInfraServiceGrpc.getCreateSecurityRuleMethod) == null) {
          CloudInfraServiceGrpc.getCreateSecurityRuleMethod = getCreateSecurityRuleMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest, opi_api.network.cloud.v1alpha1.SecurityRule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSecurityRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityRule.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateSecurityRule"))
              .build();
        }
      }
    }
    return getCreateSecurityRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest,
      com.google.protobuf.Empty> getDeleteSecurityRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSecurityRule",
      requestType = opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest,
      com.google.protobuf.Empty> getDeleteSecurityRuleMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest, com.google.protobuf.Empty> getDeleteSecurityRuleMethod;
    if ((getDeleteSecurityRuleMethod = CloudInfraServiceGrpc.getDeleteSecurityRuleMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteSecurityRuleMethod = CloudInfraServiceGrpc.getDeleteSecurityRuleMethod) == null) {
          CloudInfraServiceGrpc.getDeleteSecurityRuleMethod = getDeleteSecurityRuleMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSecurityRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteSecurityRule"))
              .build();
        }
      }
    }
    return getDeleteSecurityRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest,
      opi_api.network.cloud.v1alpha1.SecurityRule> getUpdateSecurityRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSecurityRule",
      requestType = opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityRule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest,
      opi_api.network.cloud.v1alpha1.SecurityRule> getUpdateSecurityRuleMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest, opi_api.network.cloud.v1alpha1.SecurityRule> getUpdateSecurityRuleMethod;
    if ((getUpdateSecurityRuleMethod = CloudInfraServiceGrpc.getUpdateSecurityRuleMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateSecurityRuleMethod = CloudInfraServiceGrpc.getUpdateSecurityRuleMethod) == null) {
          CloudInfraServiceGrpc.getUpdateSecurityRuleMethod = getUpdateSecurityRuleMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest, opi_api.network.cloud.v1alpha1.SecurityRule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSecurityRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityRule.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateSecurityRule"))
              .build();
        }
      }
    }
    return getUpdateSecurityRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest,
      opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse> getListSecurityRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecurityRules",
      requestType = opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest,
      opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse> getListSecurityRulesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest, opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse> getListSecurityRulesMethod;
    if ((getListSecurityRulesMethod = CloudInfraServiceGrpc.getListSecurityRulesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListSecurityRulesMethod = CloudInfraServiceGrpc.getListSecurityRulesMethod) == null) {
          CloudInfraServiceGrpc.getListSecurityRulesMethod = getListSecurityRulesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest, opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSecurityRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListSecurityRules"))
              .build();
        }
      }
    }
    return getListSecurityRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest,
      opi_api.network.cloud.v1alpha1.SecurityRule> getGetSecurityRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecurityRule",
      requestType = opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityRule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest,
      opi_api.network.cloud.v1alpha1.SecurityRule> getGetSecurityRuleMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest, opi_api.network.cloud.v1alpha1.SecurityRule> getGetSecurityRuleMethod;
    if ((getGetSecurityRuleMethod = CloudInfraServiceGrpc.getGetSecurityRuleMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetSecurityRuleMethod = CloudInfraServiceGrpc.getGetSecurityRuleMethod) == null) {
          CloudInfraServiceGrpc.getGetSecurityRuleMethod = getGetSecurityRuleMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest, opi_api.network.cloud.v1alpha1.SecurityRule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecurityRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityRule.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetSecurityRule"))
              .build();
        }
      }
    }
    return getGetSecurityRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest,
      opi_api.network.cloud.v1alpha1.SecurityProfile> getCreateSecurityProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSecurityProfile",
      requestType = opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest,
      opi_api.network.cloud.v1alpha1.SecurityProfile> getCreateSecurityProfileMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest, opi_api.network.cloud.v1alpha1.SecurityProfile> getCreateSecurityProfileMethod;
    if ((getCreateSecurityProfileMethod = CloudInfraServiceGrpc.getCreateSecurityProfileMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getCreateSecurityProfileMethod = CloudInfraServiceGrpc.getCreateSecurityProfileMethod) == null) {
          CloudInfraServiceGrpc.getCreateSecurityProfileMethod = getCreateSecurityProfileMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest, opi_api.network.cloud.v1alpha1.SecurityProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSecurityProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityProfile.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("CreateSecurityProfile"))
              .build();
        }
      }
    }
    return getCreateSecurityProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest,
      com.google.protobuf.Empty> getDeleteSecurityProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSecurityProfile",
      requestType = opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest,
      com.google.protobuf.Empty> getDeleteSecurityProfileMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest, com.google.protobuf.Empty> getDeleteSecurityProfileMethod;
    if ((getDeleteSecurityProfileMethod = CloudInfraServiceGrpc.getDeleteSecurityProfileMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getDeleteSecurityProfileMethod = CloudInfraServiceGrpc.getDeleteSecurityProfileMethod) == null) {
          CloudInfraServiceGrpc.getDeleteSecurityProfileMethod = getDeleteSecurityProfileMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSecurityProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("DeleteSecurityProfile"))
              .build();
        }
      }
    }
    return getDeleteSecurityProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest,
      opi_api.network.cloud.v1alpha1.SecurityProfile> getUpdateSecurityProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSecurityProfile",
      requestType = opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest,
      opi_api.network.cloud.v1alpha1.SecurityProfile> getUpdateSecurityProfileMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest, opi_api.network.cloud.v1alpha1.SecurityProfile> getUpdateSecurityProfileMethod;
    if ((getUpdateSecurityProfileMethod = CloudInfraServiceGrpc.getUpdateSecurityProfileMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getUpdateSecurityProfileMethod = CloudInfraServiceGrpc.getUpdateSecurityProfileMethod) == null) {
          CloudInfraServiceGrpc.getUpdateSecurityProfileMethod = getUpdateSecurityProfileMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest, opi_api.network.cloud.v1alpha1.SecurityProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSecurityProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityProfile.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("UpdateSecurityProfile"))
              .build();
        }
      }
    }
    return getUpdateSecurityProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest,
      opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse> getListSecurityProfilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSecurityProfiles",
      requestType = opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest,
      opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse> getListSecurityProfilesMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest, opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse> getListSecurityProfilesMethod;
    if ((getListSecurityProfilesMethod = CloudInfraServiceGrpc.getListSecurityProfilesMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getListSecurityProfilesMethod = CloudInfraServiceGrpc.getListSecurityProfilesMethod) == null) {
          CloudInfraServiceGrpc.getListSecurityProfilesMethod = getListSecurityProfilesMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest, opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSecurityProfiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("ListSecurityProfiles"))
              .build();
        }
      }
    }
    return getListSecurityProfilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest,
      opi_api.network.cloud.v1alpha1.SecurityProfile> getGetSecurityProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSecurityProfile",
      requestType = opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest.class,
      responseType = opi_api.network.cloud.v1alpha1.SecurityProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest,
      opi_api.network.cloud.v1alpha1.SecurityProfile> getGetSecurityProfileMethod() {
    io.grpc.MethodDescriptor<opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest, opi_api.network.cloud.v1alpha1.SecurityProfile> getGetSecurityProfileMethod;
    if ((getGetSecurityProfileMethod = CloudInfraServiceGrpc.getGetSecurityProfileMethod) == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        if ((getGetSecurityProfileMethod = CloudInfraServiceGrpc.getGetSecurityProfileMethod) == null) {
          CloudInfraServiceGrpc.getGetSecurityProfileMethod = getGetSecurityProfileMethod =
              io.grpc.MethodDescriptor.<opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest, opi_api.network.cloud.v1alpha1.SecurityProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSecurityProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  opi_api.network.cloud.v1alpha1.SecurityProfile.getDefaultInstance()))
              .setSchemaDescriptor(new CloudInfraServiceMethodDescriptorSupplier("GetSecurityProfile"))
              .build();
        }
      }
    }
    return getGetSecurityProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CloudInfraServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudInfraServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudInfraServiceStub>() {
        @java.lang.Override
        public CloudInfraServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudInfraServiceStub(channel, callOptions);
        }
      };
    return CloudInfraServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CloudInfraServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudInfraServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudInfraServiceBlockingStub>() {
        @java.lang.Override
        public CloudInfraServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudInfraServiceBlockingStub(channel, callOptions);
        }
      };
    return CloudInfraServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CloudInfraServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CloudInfraServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CloudInfraServiceFutureStub>() {
        @java.lang.Override
        public CloudInfraServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CloudInfraServiceFutureStub(channel, callOptions);
        }
      };
    return CloudInfraServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Cloud Infra APIs - to manage a multi-node cloud infrastructure on a xPU
   * </pre>
   */
  public static abstract class CloudInfraServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * device capabilities
     * </pre>
     */
    public void getDeviceCapabilities(opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.DeviceCapabilities> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceCapabilitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * device apis
     * </pre>
     */
    public void createDevice(opi_api.network.cloud.v1alpha1.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeviceMethod(), responseObserver);
    }

    /**
     */
    public void deleteDevice(opi_api.network.cloud.v1alpha1.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDeviceMethod(), responseObserver);
    }

    /**
     */
    public void updateDevice(opi_api.network.cloud.v1alpha1.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDeviceMethod(), responseObserver);
    }

    /**
     */
    public void listDevices(opi_api.network.cloud.v1alpha1.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDevicesMethod(), responseObserver);
    }

    /**
     */
    public void getDevice(opi_api.network.cloud.v1alpha1.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * port apis
     * </pre>
     */
    public void updatePort(opi_api.network.cloud.v1alpha1.UpdatePortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Port> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePortMethod(), responseObserver);
    }

    /**
     */
    public void listPorts(opi_api.network.cloud.v1alpha1.ListPortsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListPortsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPortsMethod(), responseObserver);
    }

    /**
     */
    public void getPort(opi_api.network.cloud.v1alpha1.GetPortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Port> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortMethod(), responseObserver);
    }

    /**
     * <pre>
     * vnic apis
     * </pre>
     */
    public void createVnic(opi_api.network.cloud.v1alpha1.CreateVnicRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVnicMethod(), responseObserver);
    }

    /**
     */
    public void deleteVnic(opi_api.network.cloud.v1alpha1.DeleteVnicRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVnicMethod(), responseObserver);
    }

    /**
     */
    public void updateVnic(opi_api.network.cloud.v1alpha1.UpdateVnicRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVnicMethod(), responseObserver);
    }

    /**
     */
    public void listVnics(opi_api.network.cloud.v1alpha1.ListVnicsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVnicsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVnicsMethod(), responseObserver);
    }

    /**
     */
    public void getVnic(opi_api.network.cloud.v1alpha1.GetVnicRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVnicMethod(), responseObserver);
    }

    /**
     * <pre>
     * interface apis
     * </pre>
     */
    public void createInterface(opi_api.network.cloud.v1alpha1.CreateInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateInterfaceMethod(), responseObserver);
    }

    /**
     */
    public void deleteInterface(opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteInterfaceMethod(), responseObserver);
    }

    /**
     */
    public void updateInterface(opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateInterfaceMethod(), responseObserver);
    }

    /**
     */
    public void listInterfaces(opi_api.network.cloud.v1alpha1.ListInterfacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListInterfacesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInterfacesMethod(), responseObserver);
    }

    /**
     */
    public void getInterface(opi_api.network.cloud.v1alpha1.GetInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInterfaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * routetable apis
     * </pre>
     */
    public void createRouteTable(opi_api.network.cloud.v1alpha1.CreateRouteTableRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRouteTableMethod(), responseObserver);
    }

    /**
     */
    public void deleteRouteTable(opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRouteTableMethod(), responseObserver);
    }

    /**
     */
    public void updateRouteTable(opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRouteTableMethod(), responseObserver);
    }

    /**
     */
    public void listRouteTables(opi_api.network.cloud.v1alpha1.ListRouteTablesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListRouteTablesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRouteTablesMethod(), responseObserver);
    }

    /**
     */
    public void getRouteTable(opi_api.network.cloud.v1alpha1.GetRouteTableRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRouteTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * route apis
     * </pre>
     */
    public void createRoute(opi_api.network.cloud.v1alpha1.CreateRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRouteMethod(), responseObserver);
    }

    /**
     */
    public void deleteRoute(opi_api.network.cloud.v1alpha1.DeleteRouteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRouteMethod(), responseObserver);
    }

    /**
     */
    public void updateRoute(opi_api.network.cloud.v1alpha1.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }

    /**
     */
    public void listRoutes(opi_api.network.cloud.v1alpha1.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListRoutesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRoutesMethod(), responseObserver);
    }

    /**
     */
    public void getRoute(opi_api.network.cloud.v1alpha1.GetRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * underlayroute apis
     * </pre>
     */
    public void createUnderlayRoute(opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUnderlayRouteMethod(), responseObserver);
    }

    /**
     */
    public void deleteUnderlayRoute(opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUnderlayRouteMethod(), responseObserver);
    }

    /**
     */
    public void updateUnderlayRoute(opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUnderlayRouteMethod(), responseObserver);
    }

    /**
     */
    public void listUnderlayRoutes(opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUnderlayRoutesMethod(), responseObserver);
    }

    /**
     */
    public void getUnderlayRoute(opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUnderlayRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * bgp (optional) apis
     * </pre>
     */
    public void createBgp(opi_api.network.cloud.v1alpha1.CreateBgpRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBgpMethod(), responseObserver);
    }

    /**
     */
    public void deleteBgp(opi_api.network.cloud.v1alpha1.DeleteBgpRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBgpMethod(), responseObserver);
    }

    /**
     */
    public void updateBgp(opi_api.network.cloud.v1alpha1.UpdateBgpRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBgpMethod(), responseObserver);
    }

    /**
     */
    public void listBgps(opi_api.network.cloud.v1alpha1.ListBgpsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBgpsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBgpsMethod(), responseObserver);
    }

    /**
     */
    public void getBgp(opi_api.network.cloud.v1alpha1.GetBgpRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBgpMethod(), responseObserver);
    }

    /**
     * <pre>
     * bgppeer (optional) apis
     * </pre>
     */
    public void createBGPPeer(opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBGPPeerMethod(), responseObserver);
    }

    /**
     */
    public void deleteBGPPeer(opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBGPPeerMethod(), responseObserver);
    }

    /**
     */
    public void updateBGPPeer(opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBGPPeerMethod(), responseObserver);
    }

    /**
     */
    public void listBGPPeers(opi_api.network.cloud.v1alpha1.ListBGPPeersRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBGPPeersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBGPPeersMethod(), responseObserver);
    }

    /**
     */
    public void getBGPPeer(opi_api.network.cloud.v1alpha1.GetBGPPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBGPPeerMethod(), responseObserver);
    }

    /**
     * <pre>
     * bgppeeraf (optional) apis
     * </pre>
     */
    public void createBGPPeerAf(opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBGPPeerAfMethod(), responseObserver);
    }

    /**
     */
    public void deleteBGPPeerAf(opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBGPPeerAfMethod(), responseObserver);
    }

    /**
     */
    public void updateBGPPeerAf(opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBGPPeerAfMethod(), responseObserver);
    }

    /**
     */
    public void listBGPPeerAfs(opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBGPPeerAfsMethod(), responseObserver);
    }

    /**
     */
    public void getBGPPeerAf(opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBGPPeerAfMethod(), responseObserver);
    }

    /**
     * <pre>
     * mapping apis
     * </pre>
     */
    public void createMapping(opi_api.network.cloud.v1alpha1.CreateMappingRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMappingMethod(), responseObserver);
    }

    /**
     */
    public void deleteMapping(opi_api.network.cloud.v1alpha1.DeleteMappingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMappingMethod(), responseObserver);
    }

    /**
     */
    public void updateMapping(opi_api.network.cloud.v1alpha1.UpdateMappingRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMappingMethod(), responseObserver);
    }

    /**
     */
    public void listMappings(opi_api.network.cloud.v1alpha1.ListMappingsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListMappingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMappingsMethod(), responseObserver);
    }

    /**
     */
    public void getMapping(opi_api.network.cloud.v1alpha1.GetMappingRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMappingMethod(), responseObserver);
    }

    /**
     * <pre>
     * nexthop apis
     * </pre>
     */
    public void createNextHop(opi_api.network.cloud.v1alpha1.CreateNextHopRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNextHopMethod(), responseObserver);
    }

    /**
     */
    public void deleteNextHop(opi_api.network.cloud.v1alpha1.DeleteNextHopRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNextHopMethod(), responseObserver);
    }

    /**
     */
    public void updateNextHop(opi_api.network.cloud.v1alpha1.UpdateNextHopRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNextHopMethod(), responseObserver);
    }

    /**
     */
    public void listNextHop(opi_api.network.cloud.v1alpha1.ListNextHopsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListNextHopsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNextHopMethod(), responseObserver);
    }

    /**
     */
    public void getNextHop(opi_api.network.cloud.v1alpha1.GetNextHopRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextHopMethod(), responseObserver);
    }

    /**
     * <pre>
     * nexthopgroup apis
     * </pre>
     */
    public void createNextHopGroup(opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNextHopGroupMethod(), responseObserver);
    }

    /**
     */
    public void deleteNextHopGroup(opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNextHopGroupMethod(), responseObserver);
    }

    /**
     */
    public void updateNextHopGroup(opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNextHopGroupMethod(), responseObserver);
    }

    /**
     */
    public void listNextHopGroups(opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNextHopGroupsMethod(), responseObserver);
    }

    /**
     */
    public void getNextHopGroup(opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNextHopGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * subnet apis
     * </pre>
     */
    public void createSubnet(opi_api.network.cloud.v1alpha1.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSubnetMethod(), responseObserver);
    }

    /**
     */
    public void deleteSubnet(opi_api.network.cloud.v1alpha1.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSubnetMethod(), responseObserver);
    }

    /**
     */
    public void updateSubnet(opi_api.network.cloud.v1alpha1.UpdateSubnetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSubnetMethod(), responseObserver);
    }

    /**
     */
    public void listSubnets(opi_api.network.cloud.v1alpha1.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSubnetsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSubnetsMethod(), responseObserver);
    }

    /**
     */
    public void getSubnet(opi_api.network.cloud.v1alpha1.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSubnetMethod(), responseObserver);
    }

    /**
     * <pre>
     * tunnel apis
     * </pre>
     */
    public void createTunnel(opi_api.network.cloud.v1alpha1.CreateTunnelRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTunnelMethod(), responseObserver);
    }

    /**
     */
    public void deleteTunnel(opi_api.network.cloud.v1alpha1.DeleteTunnelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTunnelMethod(), responseObserver);
    }

    /**
     */
    public void updateTunnel(opi_api.network.cloud.v1alpha1.UpdateTunnelRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTunnelMethod(), responseObserver);
    }

    /**
     */
    public void listTunnels(opi_api.network.cloud.v1alpha1.ListTunnelsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListTunnelsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTunnelsMethod(), responseObserver);
    }

    /**
     */
    public void getTunnel(opi_api.network.cloud.v1alpha1.GetTunnelRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTunnelMethod(), responseObserver);
    }

    /**
     * <pre>
     * vpc apis
     * </pre>
     */
    public void createVpc(opi_api.network.cloud.v1alpha1.CreateVpcRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVpcMethod(), responseObserver);
    }

    /**
     */
    public void deleteVpc(opi_api.network.cloud.v1alpha1.DeleteVpcRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVpcMethod(), responseObserver);
    }

    /**
     */
    public void updateVpc(opi_api.network.cloud.v1alpha1.UpdateVpcRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVpcMethod(), responseObserver);
    }

    /**
     */
    public void listVpcs(opi_api.network.cloud.v1alpha1.ListVpcsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVpcsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVpcsMethod(), responseObserver);
    }

    /**
     */
    public void getVpc(opi_api.network.cloud.v1alpha1.GetVpcRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVpcMethod(), responseObserver);
    }

    /**
     * <pre>
     * vpcpeer apis
     * </pre>
     */
    public void createVPCPeer(opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVPCPeerMethod(), responseObserver);
    }

    /**
     */
    public void deleteVPCPeer(opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVPCPeerMethod(), responseObserver);
    }

    /**
     */
    public void updateVPCPeer(opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateVPCPeerMethod(), responseObserver);
    }

    /**
     */
    public void listVPCPeers(opi_api.network.cloud.v1alpha1.ListVPCPeersRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVPCPeersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListVPCPeersMethod(), responseObserver);
    }

    /**
     */
    public void getVPCPeer(opi_api.network.cloud.v1alpha1.GetVPCPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVPCPeerMethod(), responseObserver);
    }

    /**
     * <pre>
     * securitypolicy apis
     * </pre>
     */
    public void createSecurityPolicy(opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSecurityPolicyMethod(), responseObserver);
    }

    /**
     */
    public void deleteSecurityPolicy(opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSecurityPolicyMethod(), responseObserver);
    }

    /**
     */
    public void updateSecurityPolicy(opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSecurityPolicyMethod(), responseObserver);
    }

    /**
     */
    public void listSecurityPolicys(opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSecurityPolicysMethod(), responseObserver);
    }

    /**
     */
    public void getSecurityPolicy(opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecurityPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * securityrule apis
     * </pre>
     */
    public void createSecurityRule(opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSecurityRuleMethod(), responseObserver);
    }

    /**
     */
    public void deleteSecurityRule(opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSecurityRuleMethod(), responseObserver);
    }

    /**
     */
    public void updateSecurityRule(opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSecurityRuleMethod(), responseObserver);
    }

    /**
     */
    public void listSecurityRules(opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSecurityRulesMethod(), responseObserver);
    }

    /**
     */
    public void getSecurityRule(opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecurityRuleMethod(), responseObserver);
    }

    /**
     * <pre>
     * securityprofile apis
     * </pre>
     */
    public void createSecurityProfile(opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSecurityProfileMethod(), responseObserver);
    }

    /**
     */
    public void deleteSecurityProfile(opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSecurityProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateSecurityProfile(opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSecurityProfileMethod(), responseObserver);
    }

    /**
     */
    public void listSecurityProfiles(opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSecurityProfilesMethod(), responseObserver);
    }

    /**
     */
    public void getSecurityProfile(opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSecurityProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDeviceCapabilitiesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest,
                opi_api.network.cloud.v1alpha1.DeviceCapabilities>(
                  this, METHODID_GET_DEVICE_CAPABILITIES)))
          .addMethod(
            getCreateDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateDeviceRequest,
                opi_api.network.cloud.v1alpha1.Device>(
                  this, METHODID_CREATE_DEVICE)))
          .addMethod(
            getDeleteDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteDeviceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE)))
          .addMethod(
            getUpdateDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateDeviceRequest,
                opi_api.network.cloud.v1alpha1.Device>(
                  this, METHODID_UPDATE_DEVICE)))
          .addMethod(
            getListDevicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListDevicesRequest,
                opi_api.network.cloud.v1alpha1.ListDevicesResponse>(
                  this, METHODID_LIST_DEVICES)))
          .addMethod(
            getGetDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetDeviceRequest,
                opi_api.network.cloud.v1alpha1.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            getUpdatePortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdatePortRequest,
                opi_api.network.cloud.v1alpha1.Port>(
                  this, METHODID_UPDATE_PORT)))
          .addMethod(
            getListPortsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListPortsRequest,
                opi_api.network.cloud.v1alpha1.ListPortsResponse>(
                  this, METHODID_LIST_PORTS)))
          .addMethod(
            getGetPortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetPortRequest,
                opi_api.network.cloud.v1alpha1.Port>(
                  this, METHODID_GET_PORT)))
          .addMethod(
            getCreateVnicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateVnicRequest,
                opi_api.network.cloud.v1alpha1.Vnic>(
                  this, METHODID_CREATE_VNIC)))
          .addMethod(
            getDeleteVnicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteVnicRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VNIC)))
          .addMethod(
            getUpdateVnicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateVnicRequest,
                opi_api.network.cloud.v1alpha1.Vnic>(
                  this, METHODID_UPDATE_VNIC)))
          .addMethod(
            getListVnicsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListVnicsRequest,
                opi_api.network.cloud.v1alpha1.ListVnicsResponse>(
                  this, METHODID_LIST_VNICS)))
          .addMethod(
            getGetVnicMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetVnicRequest,
                opi_api.network.cloud.v1alpha1.Vnic>(
                  this, METHODID_GET_VNIC)))
          .addMethod(
            getCreateInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateInterfaceRequest,
                opi_api.network.cloud.v1alpha1.Interface>(
                  this, METHODID_CREATE_INTERFACE)))
          .addMethod(
            getDeleteInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_INTERFACE)))
          .addMethod(
            getUpdateInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest,
                opi_api.network.cloud.v1alpha1.Interface>(
                  this, METHODID_UPDATE_INTERFACE)))
          .addMethod(
            getListInterfacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListInterfacesRequest,
                opi_api.network.cloud.v1alpha1.ListInterfacesResponse>(
                  this, METHODID_LIST_INTERFACES)))
          .addMethod(
            getGetInterfaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetInterfaceRequest,
                opi_api.network.cloud.v1alpha1.Interface>(
                  this, METHODID_GET_INTERFACE)))
          .addMethod(
            getCreateRouteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateRouteTableRequest,
                opi_api.network.cloud.v1alpha1.RouteTable>(
                  this, METHODID_CREATE_ROUTE_TABLE)))
          .addMethod(
            getDeleteRouteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ROUTE_TABLE)))
          .addMethod(
            getUpdateRouteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest,
                opi_api.network.cloud.v1alpha1.RouteTable>(
                  this, METHODID_UPDATE_ROUTE_TABLE)))
          .addMethod(
            getListRouteTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListRouteTablesRequest,
                opi_api.network.cloud.v1alpha1.ListRouteTablesResponse>(
                  this, METHODID_LIST_ROUTE_TABLES)))
          .addMethod(
            getGetRouteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetRouteTableRequest,
                opi_api.network.cloud.v1alpha1.RouteTable>(
                  this, METHODID_GET_ROUTE_TABLE)))
          .addMethod(
            getCreateRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateRouteRequest,
                opi_api.network.cloud.v1alpha1.Route>(
                  this, METHODID_CREATE_ROUTE)))
          .addMethod(
            getDeleteRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteRouteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_ROUTE)))
          .addMethod(
            getUpdateRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateRouteRequest,
                opi_api.network.cloud.v1alpha1.Route>(
                  this, METHODID_UPDATE_ROUTE)))
          .addMethod(
            getListRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListRoutesRequest,
                opi_api.network.cloud.v1alpha1.ListRoutesResponse>(
                  this, METHODID_LIST_ROUTES)))
          .addMethod(
            getGetRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetRouteRequest,
                opi_api.network.cloud.v1alpha1.Route>(
                  this, METHODID_GET_ROUTE)))
          .addMethod(
            getCreateUnderlayRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest,
                opi_api.network.cloud.v1alpha1.UnderlayRoute>(
                  this, METHODID_CREATE_UNDERLAY_ROUTE)))
          .addMethod(
            getDeleteUnderlayRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_UNDERLAY_ROUTE)))
          .addMethod(
            getUpdateUnderlayRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest,
                opi_api.network.cloud.v1alpha1.UnderlayRoute>(
                  this, METHODID_UPDATE_UNDERLAY_ROUTE)))
          .addMethod(
            getListUnderlayRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest,
                opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse>(
                  this, METHODID_LIST_UNDERLAY_ROUTES)))
          .addMethod(
            getGetUnderlayRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest,
                opi_api.network.cloud.v1alpha1.UnderlayRoute>(
                  this, METHODID_GET_UNDERLAY_ROUTE)))
          .addMethod(
            getCreateBgpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateBgpRequest,
                opi_api.network.cloud.v1alpha1.Bgp>(
                  this, METHODID_CREATE_BGP)))
          .addMethod(
            getDeleteBgpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteBgpRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BGP)))
          .addMethod(
            getUpdateBgpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateBgpRequest,
                opi_api.network.cloud.v1alpha1.Bgp>(
                  this, METHODID_UPDATE_BGP)))
          .addMethod(
            getListBgpsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListBgpsRequest,
                opi_api.network.cloud.v1alpha1.ListBgpsResponse>(
                  this, METHODID_LIST_BGPS)))
          .addMethod(
            getGetBgpMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetBgpRequest,
                opi_api.network.cloud.v1alpha1.Bgp>(
                  this, METHODID_GET_BGP)))
          .addMethod(
            getCreateBGPPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest,
                opi_api.network.cloud.v1alpha1.BGPPeer>(
                  this, METHODID_CREATE_BGPPEER)))
          .addMethod(
            getDeleteBGPPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BGPPEER)))
          .addMethod(
            getUpdateBGPPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest,
                opi_api.network.cloud.v1alpha1.BGPPeer>(
                  this, METHODID_UPDATE_BGPPEER)))
          .addMethod(
            getListBGPPeersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListBGPPeersRequest,
                opi_api.network.cloud.v1alpha1.ListBGPPeersResponse>(
                  this, METHODID_LIST_BGPPEERS)))
          .addMethod(
            getGetBGPPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetBGPPeerRequest,
                opi_api.network.cloud.v1alpha1.BGPPeer>(
                  this, METHODID_GET_BGPPEER)))
          .addMethod(
            getCreateBGPPeerAfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest,
                opi_api.network.cloud.v1alpha1.BGPPeerAf>(
                  this, METHODID_CREATE_BGPPEER_AF)))
          .addMethod(
            getDeleteBGPPeerAfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BGPPEER_AF)))
          .addMethod(
            getUpdateBGPPeerAfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest,
                opi_api.network.cloud.v1alpha1.BGPPeerAf>(
                  this, METHODID_UPDATE_BGPPEER_AF)))
          .addMethod(
            getListBGPPeerAfsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest,
                opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse>(
                  this, METHODID_LIST_BGPPEER_AFS)))
          .addMethod(
            getGetBGPPeerAfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest,
                opi_api.network.cloud.v1alpha1.BGPPeerAf>(
                  this, METHODID_GET_BGPPEER_AF)))
          .addMethod(
            getCreateMappingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateMappingRequest,
                opi_api.network.cloud.v1alpha1.Mapping>(
                  this, METHODID_CREATE_MAPPING)))
          .addMethod(
            getDeleteMappingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteMappingRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_MAPPING)))
          .addMethod(
            getUpdateMappingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateMappingRequest,
                opi_api.network.cloud.v1alpha1.Mapping>(
                  this, METHODID_UPDATE_MAPPING)))
          .addMethod(
            getListMappingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListMappingsRequest,
                opi_api.network.cloud.v1alpha1.ListMappingsResponse>(
                  this, METHODID_LIST_MAPPINGS)))
          .addMethod(
            getGetMappingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetMappingRequest,
                opi_api.network.cloud.v1alpha1.Mapping>(
                  this, METHODID_GET_MAPPING)))
          .addMethod(
            getCreateNextHopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateNextHopRequest,
                opi_api.network.cloud.v1alpha1.NextHop>(
                  this, METHODID_CREATE_NEXT_HOP)))
          .addMethod(
            getDeleteNextHopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteNextHopRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NEXT_HOP)))
          .addMethod(
            getUpdateNextHopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateNextHopRequest,
                opi_api.network.cloud.v1alpha1.NextHop>(
                  this, METHODID_UPDATE_NEXT_HOP)))
          .addMethod(
            getListNextHopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListNextHopsRequest,
                opi_api.network.cloud.v1alpha1.ListNextHopsResponse>(
                  this, METHODID_LIST_NEXT_HOP)))
          .addMethod(
            getGetNextHopMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetNextHopRequest,
                opi_api.network.cloud.v1alpha1.NextHop>(
                  this, METHODID_GET_NEXT_HOP)))
          .addMethod(
            getCreateNextHopGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest,
                opi_api.network.cloud.v1alpha1.NextHopGroup>(
                  this, METHODID_CREATE_NEXT_HOP_GROUP)))
          .addMethod(
            getDeleteNextHopGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NEXT_HOP_GROUP)))
          .addMethod(
            getUpdateNextHopGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest,
                opi_api.network.cloud.v1alpha1.NextHopGroup>(
                  this, METHODID_UPDATE_NEXT_HOP_GROUP)))
          .addMethod(
            getListNextHopGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest,
                opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse>(
                  this, METHODID_LIST_NEXT_HOP_GROUPS)))
          .addMethod(
            getGetNextHopGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest,
                opi_api.network.cloud.v1alpha1.NextHopGroup>(
                  this, METHODID_GET_NEXT_HOP_GROUP)))
          .addMethod(
            getCreateSubnetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateSubnetRequest,
                opi_api.network.cloud.v1alpha1.Subnet>(
                  this, METHODID_CREATE_SUBNET)))
          .addMethod(
            getDeleteSubnetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteSubnetRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SUBNET)))
          .addMethod(
            getUpdateSubnetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateSubnetRequest,
                opi_api.network.cloud.v1alpha1.Subnet>(
                  this, METHODID_UPDATE_SUBNET)))
          .addMethod(
            getListSubnetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListSubnetsRequest,
                opi_api.network.cloud.v1alpha1.ListSubnetsResponse>(
                  this, METHODID_LIST_SUBNETS)))
          .addMethod(
            getGetSubnetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetSubnetRequest,
                opi_api.network.cloud.v1alpha1.Subnet>(
                  this, METHODID_GET_SUBNET)))
          .addMethod(
            getCreateTunnelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateTunnelRequest,
                opi_api.network.cloud.v1alpha1.Tunnel>(
                  this, METHODID_CREATE_TUNNEL)))
          .addMethod(
            getDeleteTunnelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteTunnelRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TUNNEL)))
          .addMethod(
            getUpdateTunnelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateTunnelRequest,
                opi_api.network.cloud.v1alpha1.Tunnel>(
                  this, METHODID_UPDATE_TUNNEL)))
          .addMethod(
            getListTunnelsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListTunnelsRequest,
                opi_api.network.cloud.v1alpha1.ListTunnelsResponse>(
                  this, METHODID_LIST_TUNNELS)))
          .addMethod(
            getGetTunnelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetTunnelRequest,
                opi_api.network.cloud.v1alpha1.Tunnel>(
                  this, METHODID_GET_TUNNEL)))
          .addMethod(
            getCreateVpcMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateVpcRequest,
                opi_api.network.cloud.v1alpha1.Vpc>(
                  this, METHODID_CREATE_VPC)))
          .addMethod(
            getDeleteVpcMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteVpcRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VPC)))
          .addMethod(
            getUpdateVpcMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateVpcRequest,
                opi_api.network.cloud.v1alpha1.Vpc>(
                  this, METHODID_UPDATE_VPC)))
          .addMethod(
            getListVpcsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListVpcsRequest,
                opi_api.network.cloud.v1alpha1.ListVpcsResponse>(
                  this, METHODID_LIST_VPCS)))
          .addMethod(
            getGetVpcMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetVpcRequest,
                opi_api.network.cloud.v1alpha1.Vpc>(
                  this, METHODID_GET_VPC)))
          .addMethod(
            getCreateVPCPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest,
                opi_api.network.cloud.v1alpha1.VPCPeer>(
                  this, METHODID_CREATE_VPCPEER)))
          .addMethod(
            getDeleteVPCPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VPCPEER)))
          .addMethod(
            getUpdateVPCPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest,
                opi_api.network.cloud.v1alpha1.VPCPeer>(
                  this, METHODID_UPDATE_VPCPEER)))
          .addMethod(
            getListVPCPeersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListVPCPeersRequest,
                opi_api.network.cloud.v1alpha1.ListVPCPeersResponse>(
                  this, METHODID_LIST_VPCPEERS)))
          .addMethod(
            getGetVPCPeerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetVPCPeerRequest,
                opi_api.network.cloud.v1alpha1.VPCPeer>(
                  this, METHODID_GET_VPCPEER)))
          .addMethod(
            getCreateSecurityPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest,
                opi_api.network.cloud.v1alpha1.SecurityPolicy>(
                  this, METHODID_CREATE_SECURITY_POLICY)))
          .addMethod(
            getDeleteSecurityPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SECURITY_POLICY)))
          .addMethod(
            getUpdateSecurityPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest,
                opi_api.network.cloud.v1alpha1.SecurityPolicy>(
                  this, METHODID_UPDATE_SECURITY_POLICY)))
          .addMethod(
            getListSecurityPolicysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest,
                opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse>(
                  this, METHODID_LIST_SECURITY_POLICYS)))
          .addMethod(
            getGetSecurityPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest,
                opi_api.network.cloud.v1alpha1.SecurityPolicy>(
                  this, METHODID_GET_SECURITY_POLICY)))
          .addMethod(
            getCreateSecurityRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest,
                opi_api.network.cloud.v1alpha1.SecurityRule>(
                  this, METHODID_CREATE_SECURITY_RULE)))
          .addMethod(
            getDeleteSecurityRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SECURITY_RULE)))
          .addMethod(
            getUpdateSecurityRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest,
                opi_api.network.cloud.v1alpha1.SecurityRule>(
                  this, METHODID_UPDATE_SECURITY_RULE)))
          .addMethod(
            getListSecurityRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest,
                opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse>(
                  this, METHODID_LIST_SECURITY_RULES)))
          .addMethod(
            getGetSecurityRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest,
                opi_api.network.cloud.v1alpha1.SecurityRule>(
                  this, METHODID_GET_SECURITY_RULE)))
          .addMethod(
            getCreateSecurityProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest,
                opi_api.network.cloud.v1alpha1.SecurityProfile>(
                  this, METHODID_CREATE_SECURITY_PROFILE)))
          .addMethod(
            getDeleteSecurityProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SECURITY_PROFILE)))
          .addMethod(
            getUpdateSecurityProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest,
                opi_api.network.cloud.v1alpha1.SecurityProfile>(
                  this, METHODID_UPDATE_SECURITY_PROFILE)))
          .addMethod(
            getListSecurityProfilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest,
                opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse>(
                  this, METHODID_LIST_SECURITY_PROFILES)))
          .addMethod(
            getGetSecurityProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest,
                opi_api.network.cloud.v1alpha1.SecurityProfile>(
                  this, METHODID_GET_SECURITY_PROFILE)))
          .build();
    }
  }

  /**
   * <pre>
   * Cloud Infra APIs - to manage a multi-node cloud infrastructure on a xPU
   * </pre>
   */
  public static final class CloudInfraServiceStub extends io.grpc.stub.AbstractAsyncStub<CloudInfraServiceStub> {
    private CloudInfraServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudInfraServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudInfraServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * device capabilities
     * </pre>
     */
    public void getDeviceCapabilities(opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.DeviceCapabilities> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceCapabilitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * device apis
     * </pre>
     */
    public void createDevice(opi_api.network.cloud.v1alpha1.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDevice(opi_api.network.cloud.v1alpha1.DeleteDeviceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDevice(opi_api.network.cloud.v1alpha1.UpdateDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDevices(opi_api.network.cloud.v1alpha1.ListDevicesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListDevicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDevice(opi_api.network.cloud.v1alpha1.GetDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * port apis
     * </pre>
     */
    public void updatePort(opi_api.network.cloud.v1alpha1.UpdatePortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Port> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPorts(opi_api.network.cloud.v1alpha1.ListPortsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListPortsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPort(opi_api.network.cloud.v1alpha1.GetPortRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Port> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * vnic apis
     * </pre>
     */
    public void createVnic(opi_api.network.cloud.v1alpha1.CreateVnicRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVnicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVnic(opi_api.network.cloud.v1alpha1.DeleteVnicRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVnicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVnic(opi_api.network.cloud.v1alpha1.UpdateVnicRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVnicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVnics(opi_api.network.cloud.v1alpha1.ListVnicsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVnicsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVnicsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVnic(opi_api.network.cloud.v1alpha1.GetVnicRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVnicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * interface apis
     * </pre>
     */
    public void createInterface(opi_api.network.cloud.v1alpha1.CreateInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteInterface(opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateInterface(opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listInterfaces(opi_api.network.cloud.v1alpha1.ListInterfacesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListInterfacesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInterfacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInterface(opi_api.network.cloud.v1alpha1.GetInterfaceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInterfaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * routetable apis
     * </pre>
     */
    public void createRouteTable(opi_api.network.cloud.v1alpha1.CreateRouteTableRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRouteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRouteTable(opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRouteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRouteTable(opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRouteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRouteTables(opi_api.network.cloud.v1alpha1.ListRouteTablesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListRouteTablesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRouteTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRouteTable(opi_api.network.cloud.v1alpha1.GetRouteTableRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRouteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * route apis
     * </pre>
     */
    public void createRoute(opi_api.network.cloud.v1alpha1.CreateRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRoute(opi_api.network.cloud.v1alpha1.DeleteRouteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoute(opi_api.network.cloud.v1alpha1.UpdateRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoutes(opi_api.network.cloud.v1alpha1.ListRoutesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListRoutesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoute(opi_api.network.cloud.v1alpha1.GetRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * underlayroute apis
     * </pre>
     */
    public void createUnderlayRoute(opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUnderlayRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUnderlayRoute(opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUnderlayRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUnderlayRoute(opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUnderlayRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUnderlayRoutes(opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUnderlayRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUnderlayRoute(opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUnderlayRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bgp (optional) apis
     * </pre>
     */
    public void createBgp(opi_api.network.cloud.v1alpha1.CreateBgpRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBgpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBgp(opi_api.network.cloud.v1alpha1.DeleteBgpRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBgpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBgp(opi_api.network.cloud.v1alpha1.UpdateBgpRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBgpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBgps(opi_api.network.cloud.v1alpha1.ListBgpsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBgpsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBgpsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBgp(opi_api.network.cloud.v1alpha1.GetBgpRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBgpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bgppeer (optional) apis
     * </pre>
     */
    public void createBGPPeer(opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBGPPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBGPPeer(opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBGPPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBGPPeer(opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBGPPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBGPPeers(opi_api.network.cloud.v1alpha1.ListBGPPeersRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBGPPeersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBGPPeersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBGPPeer(opi_api.network.cloud.v1alpha1.GetBGPPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBGPPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * bgppeeraf (optional) apis
     * </pre>
     */
    public void createBGPPeerAf(opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBGPPeerAfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBGPPeerAf(opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBGPPeerAfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBGPPeerAf(opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBGPPeerAfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBGPPeerAfs(opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListBGPPeerAfsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBGPPeerAf(opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBGPPeerAfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * mapping apis
     * </pre>
     */
    public void createMapping(opi_api.network.cloud.v1alpha1.CreateMappingRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMapping(opi_api.network.cloud.v1alpha1.DeleteMappingRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMapping(opi_api.network.cloud.v1alpha1.UpdateMappingRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listMappings(opi_api.network.cloud.v1alpha1.ListMappingsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListMappingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMappingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMapping(opi_api.network.cloud.v1alpha1.GetMappingRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMappingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * nexthop apis
     * </pre>
     */
    public void createNextHop(opi_api.network.cloud.v1alpha1.CreateNextHopRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNextHopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNextHop(opi_api.network.cloud.v1alpha1.DeleteNextHopRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNextHopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNextHop(opi_api.network.cloud.v1alpha1.UpdateNextHopRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNextHopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNextHop(opi_api.network.cloud.v1alpha1.ListNextHopsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListNextHopsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNextHopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextHop(opi_api.network.cloud.v1alpha1.GetNextHopRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextHopMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * nexthopgroup apis
     * </pre>
     */
    public void createNextHopGroup(opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNextHopGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNextHopGroup(opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNextHopGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNextHopGroup(opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNextHopGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNextHopGroups(opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNextHopGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNextHopGroup(opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNextHopGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * subnet apis
     * </pre>
     */
    public void createSubnet(opi_api.network.cloud.v1alpha1.CreateSubnetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSubnet(opi_api.network.cloud.v1alpha1.DeleteSubnetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSubnet(opi_api.network.cloud.v1alpha1.UpdateSubnetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSubnets(opi_api.network.cloud.v1alpha1.ListSubnetsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSubnetsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSubnetsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSubnet(opi_api.network.cloud.v1alpha1.GetSubnetRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSubnetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * tunnel apis
     * </pre>
     */
    public void createTunnel(opi_api.network.cloud.v1alpha1.CreateTunnelRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTunnelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTunnel(opi_api.network.cloud.v1alpha1.DeleteTunnelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTunnelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTunnel(opi_api.network.cloud.v1alpha1.UpdateTunnelRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTunnelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTunnels(opi_api.network.cloud.v1alpha1.ListTunnelsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListTunnelsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTunnelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTunnel(opi_api.network.cloud.v1alpha1.GetTunnelRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTunnelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * vpc apis
     * </pre>
     */
    public void createVpc(opi_api.network.cloud.v1alpha1.CreateVpcRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVpc(opi_api.network.cloud.v1alpha1.DeleteVpcRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVpc(opi_api.network.cloud.v1alpha1.UpdateVpcRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVpcs(opi_api.network.cloud.v1alpha1.ListVpcsRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVpcsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVpcsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVpc(opi_api.network.cloud.v1alpha1.GetVpcRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVpcMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * vpcpeer apis
     * </pre>
     */
    public void createVPCPeer(opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVPCPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVPCPeer(opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVPCPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVPCPeer(opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateVPCPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVPCPeers(opi_api.network.cloud.v1alpha1.ListVPCPeersRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVPCPeersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListVPCPeersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVPCPeer(opi_api.network.cloud.v1alpha1.GetVPCPeerRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVPCPeerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * securitypolicy apis
     * </pre>
     */
    public void createSecurityPolicy(opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSecurityPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSecurityPolicy(opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSecurityPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSecurityPolicy(opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSecurityPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSecurityPolicys(opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSecurityPolicysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecurityPolicy(opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecurityPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * securityrule apis
     * </pre>
     */
    public void createSecurityRule(opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSecurityRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSecurityRule(opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSecurityRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSecurityRule(opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSecurityRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSecurityRules(opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSecurityRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecurityRule(opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecurityRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * securityprofile apis
     * </pre>
     */
    public void createSecurityProfile(opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSecurityProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSecurityProfile(opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSecurityProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSecurityProfile(opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSecurityProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSecurityProfiles(opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSecurityProfilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSecurityProfile(opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSecurityProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Cloud Infra APIs - to manage a multi-node cloud infrastructure on a xPU
   * </pre>
   */
  public static final class CloudInfraServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CloudInfraServiceBlockingStub> {
    private CloudInfraServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudInfraServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudInfraServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * device capabilities
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.DeviceCapabilities getDeviceCapabilities(opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceCapabilitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * device apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Device createDevice(opi_api.network.cloud.v1alpha1.CreateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteDevice(opi_api.network.cloud.v1alpha1.DeleteDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Device updateDevice(opi_api.network.cloud.v1alpha1.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListDevicesResponse listDevices(opi_api.network.cloud.v1alpha1.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDevicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Device getDevice(opi_api.network.cloud.v1alpha1.GetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * port apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Port updatePort(opi_api.network.cloud.v1alpha1.UpdatePortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePortMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListPortsResponse listPorts(opi_api.network.cloud.v1alpha1.ListPortsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPortsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Port getPort(opi_api.network.cloud.v1alpha1.GetPortRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * vnic apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Vnic createVnic(opi_api.network.cloud.v1alpha1.CreateVnicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVnicMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVnic(opi_api.network.cloud.v1alpha1.DeleteVnicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVnicMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Vnic updateVnic(opi_api.network.cloud.v1alpha1.UpdateVnicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVnicMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListVnicsResponse listVnics(opi_api.network.cloud.v1alpha1.ListVnicsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVnicsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Vnic getVnic(opi_api.network.cloud.v1alpha1.GetVnicRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVnicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * interface apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Interface createInterface(opi_api.network.cloud.v1alpha1.CreateInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateInterfaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteInterface(opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteInterfaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Interface updateInterface(opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateInterfaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListInterfacesResponse listInterfaces(opi_api.network.cloud.v1alpha1.ListInterfacesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInterfacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Interface getInterface(opi_api.network.cloud.v1alpha1.GetInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInterfaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * routetable apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.RouteTable createRouteTable(opi_api.network.cloud.v1alpha1.CreateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRouteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteRouteTable(opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRouteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.RouteTable updateRouteTable(opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRouteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListRouteTablesResponse listRouteTables(opi_api.network.cloud.v1alpha1.ListRouteTablesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRouteTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.RouteTable getRouteTable(opi_api.network.cloud.v1alpha1.GetRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRouteTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * route apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Route createRoute(opi_api.network.cloud.v1alpha1.CreateRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteRoute(opi_api.network.cloud.v1alpha1.DeleteRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Route updateRoute(opi_api.network.cloud.v1alpha1.UpdateRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListRoutesResponse listRoutes(opi_api.network.cloud.v1alpha1.ListRoutesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Route getRoute(opi_api.network.cloud.v1alpha1.GetRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * underlayroute apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute createUnderlayRoute(opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUnderlayRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUnderlayRoute(opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUnderlayRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute updateUnderlayRoute(opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUnderlayRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse listUnderlayRoutes(opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUnderlayRoutesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.UnderlayRoute getUnderlayRoute(opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUnderlayRouteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * bgp (optional) apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Bgp createBgp(opi_api.network.cloud.v1alpha1.CreateBgpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBgpMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBgp(opi_api.network.cloud.v1alpha1.DeleteBgpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBgpMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Bgp updateBgp(opi_api.network.cloud.v1alpha1.UpdateBgpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBgpMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListBgpsResponse listBgps(opi_api.network.cloud.v1alpha1.ListBgpsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBgpsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Bgp getBgp(opi_api.network.cloud.v1alpha1.GetBgpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBgpMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * bgppeer (optional) apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeer createBGPPeer(opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBGPPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBGPPeer(opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBGPPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.BGPPeer updateBGPPeer(opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBGPPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListBGPPeersResponse listBGPPeers(opi_api.network.cloud.v1alpha1.ListBGPPeersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBGPPeersMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.BGPPeer getBGPPeer(opi_api.network.cloud.v1alpha1.GetBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBGPPeerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * bgppeeraf (optional) apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf createBGPPeerAf(opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBGPPeerAfMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBGPPeerAf(opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBGPPeerAfMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf updateBGPPeerAf(opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBGPPeerAfMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse listBGPPeerAfs(opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListBGPPeerAfsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.BGPPeerAf getBGPPeerAf(opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBGPPeerAfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * mapping apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Mapping createMapping(opi_api.network.cloud.v1alpha1.CreateMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteMapping(opi_api.network.cloud.v1alpha1.DeleteMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Mapping updateMapping(opi_api.network.cloud.v1alpha1.UpdateMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMappingMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListMappingsResponse listMappings(opi_api.network.cloud.v1alpha1.ListMappingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMappingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Mapping getMapping(opi_api.network.cloud.v1alpha1.GetMappingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMappingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * nexthop apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.NextHop createNextHop(opi_api.network.cloud.v1alpha1.CreateNextHopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNextHopMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNextHop(opi_api.network.cloud.v1alpha1.DeleteNextHopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNextHopMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.NextHop updateNextHop(opi_api.network.cloud.v1alpha1.UpdateNextHopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNextHopMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListNextHopsResponse listNextHop(opi_api.network.cloud.v1alpha1.ListNextHopsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNextHopMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.NextHop getNextHop(opi_api.network.cloud.v1alpha1.GetNextHopRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextHopMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * nexthopgroup apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.NextHopGroup createNextHopGroup(opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNextHopGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNextHopGroup(opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNextHopGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.NextHopGroup updateNextHopGroup(opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNextHopGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse listNextHopGroups(opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNextHopGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.NextHopGroup getNextHopGroup(opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNextHopGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * subnet apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Subnet createSubnet(opi_api.network.cloud.v1alpha1.CreateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSubnetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSubnet(opi_api.network.cloud.v1alpha1.DeleteSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSubnetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Subnet updateSubnet(opi_api.network.cloud.v1alpha1.UpdateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSubnetMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListSubnetsResponse listSubnets(opi_api.network.cloud.v1alpha1.ListSubnetsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSubnetsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Subnet getSubnet(opi_api.network.cloud.v1alpha1.GetSubnetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSubnetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * tunnel apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Tunnel createTunnel(opi_api.network.cloud.v1alpha1.CreateTunnelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTunnelMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTunnel(opi_api.network.cloud.v1alpha1.DeleteTunnelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTunnelMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Tunnel updateTunnel(opi_api.network.cloud.v1alpha1.UpdateTunnelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTunnelMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListTunnelsResponse listTunnels(opi_api.network.cloud.v1alpha1.ListTunnelsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTunnelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Tunnel getTunnel(opi_api.network.cloud.v1alpha1.GetTunnelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTunnelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * vpc apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Vpc createVpc(opi_api.network.cloud.v1alpha1.CreateVpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVpcMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVpc(opi_api.network.cloud.v1alpha1.DeleteVpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVpcMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Vpc updateVpc(opi_api.network.cloud.v1alpha1.UpdateVpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVpcMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListVpcsResponse listVpcs(opi_api.network.cloud.v1alpha1.ListVpcsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVpcsMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.Vpc getVpc(opi_api.network.cloud.v1alpha1.GetVpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVpcMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * vpcpeer apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.VPCPeer createVPCPeer(opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVPCPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVPCPeer(opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVPCPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.VPCPeer updateVPCPeer(opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateVPCPeerMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListVPCPeersResponse listVPCPeers(opi_api.network.cloud.v1alpha1.ListVPCPeersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListVPCPeersMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.VPCPeer getVPCPeer(opi_api.network.cloud.v1alpha1.GetVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVPCPeerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * securitypolicy apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy createSecurityPolicy(opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSecurityPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSecurityPolicy(opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSecurityPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy updateSecurityPolicy(opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSecurityPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse listSecurityPolicys(opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSecurityPolicysMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.SecurityPolicy getSecurityPolicy(opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecurityPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * securityrule apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.SecurityRule createSecurityRule(opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSecurityRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSecurityRule(opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSecurityRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.SecurityRule updateSecurityRule(opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSecurityRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse listSecurityRules(opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSecurityRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.SecurityRule getSecurityRule(opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecurityRuleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * securityprofile apis
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.SecurityProfile createSecurityProfile(opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSecurityProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSecurityProfile(opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSecurityProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.SecurityProfile updateSecurityProfile(opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSecurityProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse listSecurityProfiles(opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSecurityProfilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public opi_api.network.cloud.v1alpha1.SecurityProfile getSecurityProfile(opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSecurityProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud Infra APIs - to manage a multi-node cloud infrastructure on a xPU
   * </pre>
   */
  public static final class CloudInfraServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CloudInfraServiceFutureStub> {
    private CloudInfraServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CloudInfraServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CloudInfraServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * device capabilities
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.DeviceCapabilities> getDeviceCapabilities(
        opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceCapabilitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * device apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Device> createDevice(
        opi_api.network.cloud.v1alpha1.CreateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        opi_api.network.cloud.v1alpha1.DeleteDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Device> updateDevice(
        opi_api.network.cloud.v1alpha1.UpdateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListDevicesResponse> listDevices(
        opi_api.network.cloud.v1alpha1.ListDevicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Device> getDevice(
        opi_api.network.cloud.v1alpha1.GetDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * port apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Port> updatePort(
        opi_api.network.cloud.v1alpha1.UpdatePortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePortMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListPortsResponse> listPorts(
        opi_api.network.cloud.v1alpha1.ListPortsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPortsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Port> getPort(
        opi_api.network.cloud.v1alpha1.GetPortRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * vnic apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Vnic> createVnic(
        opi_api.network.cloud.v1alpha1.CreateVnicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVnicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVnic(
        opi_api.network.cloud.v1alpha1.DeleteVnicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVnicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Vnic> updateVnic(
        opi_api.network.cloud.v1alpha1.UpdateVnicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVnicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListVnicsResponse> listVnics(
        opi_api.network.cloud.v1alpha1.ListVnicsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVnicsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Vnic> getVnic(
        opi_api.network.cloud.v1alpha1.GetVnicRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVnicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * interface apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Interface> createInterface(
        opi_api.network.cloud.v1alpha1.CreateInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateInterfaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteInterface(
        opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteInterfaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Interface> updateInterface(
        opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateInterfaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListInterfacesResponse> listInterfaces(
        opi_api.network.cloud.v1alpha1.ListInterfacesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInterfacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Interface> getInterface(
        opi_api.network.cloud.v1alpha1.GetInterfaceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInterfaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * routetable apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.RouteTable> createRouteTable(
        opi_api.network.cloud.v1alpha1.CreateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRouteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRouteTable(
        opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRouteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.RouteTable> updateRouteTable(
        opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRouteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListRouteTablesResponse> listRouteTables(
        opi_api.network.cloud.v1alpha1.ListRouteTablesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRouteTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.RouteTable> getRouteTable(
        opi_api.network.cloud.v1alpha1.GetRouteTableRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRouteTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * route apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Route> createRoute(
        opi_api.network.cloud.v1alpha1.CreateRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteRoute(
        opi_api.network.cloud.v1alpha1.DeleteRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Route> updateRoute(
        opi_api.network.cloud.v1alpha1.UpdateRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListRoutesResponse> listRoutes(
        opi_api.network.cloud.v1alpha1.ListRoutesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Route> getRoute(
        opi_api.network.cloud.v1alpha1.GetRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * underlayroute apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.UnderlayRoute> createUnderlayRoute(
        opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUnderlayRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUnderlayRoute(
        opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUnderlayRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.UnderlayRoute> updateUnderlayRoute(
        opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUnderlayRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse> listUnderlayRoutes(
        opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUnderlayRoutesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.UnderlayRoute> getUnderlayRoute(
        opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUnderlayRouteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * bgp (optional) apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Bgp> createBgp(
        opi_api.network.cloud.v1alpha1.CreateBgpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBgpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBgp(
        opi_api.network.cloud.v1alpha1.DeleteBgpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBgpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Bgp> updateBgp(
        opi_api.network.cloud.v1alpha1.UpdateBgpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBgpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListBgpsResponse> listBgps(
        opi_api.network.cloud.v1alpha1.ListBgpsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBgpsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Bgp> getBgp(
        opi_api.network.cloud.v1alpha1.GetBgpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBgpMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * bgppeer (optional) apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.BGPPeer> createBGPPeer(
        opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBGPPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBGPPeer(
        opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBGPPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.BGPPeer> updateBGPPeer(
        opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBGPPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListBGPPeersResponse> listBGPPeers(
        opi_api.network.cloud.v1alpha1.ListBGPPeersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBGPPeersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.BGPPeer> getBGPPeer(
        opi_api.network.cloud.v1alpha1.GetBGPPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBGPPeerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * bgppeeraf (optional) apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.BGPPeerAf> createBGPPeerAf(
        opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBGPPeerAfMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBGPPeerAf(
        opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBGPPeerAfMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.BGPPeerAf> updateBGPPeerAf(
        opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBGPPeerAfMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse> listBGPPeerAfs(
        opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListBGPPeerAfsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.BGPPeerAf> getBGPPeerAf(
        opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBGPPeerAfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * mapping apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Mapping> createMapping(
        opi_api.network.cloud.v1alpha1.CreateMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMapping(
        opi_api.network.cloud.v1alpha1.DeleteMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Mapping> updateMapping(
        opi_api.network.cloud.v1alpha1.UpdateMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMappingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListMappingsResponse> listMappings(
        opi_api.network.cloud.v1alpha1.ListMappingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMappingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Mapping> getMapping(
        opi_api.network.cloud.v1alpha1.GetMappingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMappingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * nexthop apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.NextHop> createNextHop(
        opi_api.network.cloud.v1alpha1.CreateNextHopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNextHopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNextHop(
        opi_api.network.cloud.v1alpha1.DeleteNextHopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNextHopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.NextHop> updateNextHop(
        opi_api.network.cloud.v1alpha1.UpdateNextHopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNextHopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListNextHopsResponse> listNextHop(
        opi_api.network.cloud.v1alpha1.ListNextHopsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNextHopMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.NextHop> getNextHop(
        opi_api.network.cloud.v1alpha1.GetNextHopRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextHopMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * nexthopgroup apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.NextHopGroup> createNextHopGroup(
        opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNextHopGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNextHopGroup(
        opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNextHopGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.NextHopGroup> updateNextHopGroup(
        opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNextHopGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse> listNextHopGroups(
        opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNextHopGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.NextHopGroup> getNextHopGroup(
        opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNextHopGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * subnet apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Subnet> createSubnet(
        opi_api.network.cloud.v1alpha1.CreateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSubnetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSubnet(
        opi_api.network.cloud.v1alpha1.DeleteSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSubnetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Subnet> updateSubnet(
        opi_api.network.cloud.v1alpha1.UpdateSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSubnetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListSubnetsResponse> listSubnets(
        opi_api.network.cloud.v1alpha1.ListSubnetsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSubnetsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Subnet> getSubnet(
        opi_api.network.cloud.v1alpha1.GetSubnetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSubnetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * tunnel apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Tunnel> createTunnel(
        opi_api.network.cloud.v1alpha1.CreateTunnelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTunnelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTunnel(
        opi_api.network.cloud.v1alpha1.DeleteTunnelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTunnelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Tunnel> updateTunnel(
        opi_api.network.cloud.v1alpha1.UpdateTunnelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTunnelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListTunnelsResponse> listTunnels(
        opi_api.network.cloud.v1alpha1.ListTunnelsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTunnelsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Tunnel> getTunnel(
        opi_api.network.cloud.v1alpha1.GetTunnelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTunnelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * vpc apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Vpc> createVpc(
        opi_api.network.cloud.v1alpha1.CreateVpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVpcMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVpc(
        opi_api.network.cloud.v1alpha1.DeleteVpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVpcMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Vpc> updateVpc(
        opi_api.network.cloud.v1alpha1.UpdateVpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVpcMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListVpcsResponse> listVpcs(
        opi_api.network.cloud.v1alpha1.ListVpcsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVpcsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Vpc> getVpc(
        opi_api.network.cloud.v1alpha1.GetVpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVpcMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * vpcpeer apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.VPCPeer> createVPCPeer(
        opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVPCPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVPCPeer(
        opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVPCPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.VPCPeer> updateVPCPeer(
        opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateVPCPeerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListVPCPeersResponse> listVPCPeers(
        opi_api.network.cloud.v1alpha1.ListVPCPeersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListVPCPeersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.VPCPeer> getVPCPeer(
        opi_api.network.cloud.v1alpha1.GetVPCPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVPCPeerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * securitypolicy apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityPolicy> createSecurityPolicy(
        opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSecurityPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSecurityPolicy(
        opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSecurityPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityPolicy> updateSecurityPolicy(
        opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSecurityPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse> listSecurityPolicys(
        opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSecurityPolicysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityPolicy> getSecurityPolicy(
        opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecurityPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * securityrule apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityRule> createSecurityRule(
        opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSecurityRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSecurityRule(
        opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSecurityRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityRule> updateSecurityRule(
        opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSecurityRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse> listSecurityRules(
        opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSecurityRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityRule> getSecurityRule(
        opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecurityRuleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * securityprofile apis
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityProfile> createSecurityProfile(
        opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSecurityProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSecurityProfile(
        opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSecurityProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityProfile> updateSecurityProfile(
        opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSecurityProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse> listSecurityProfiles(
        opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSecurityProfilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.SecurityProfile> getSecurityProfile(
        opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSecurityProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEVICE_CAPABILITIES = 0;
  private static final int METHODID_CREATE_DEVICE = 1;
  private static final int METHODID_DELETE_DEVICE = 2;
  private static final int METHODID_UPDATE_DEVICE = 3;
  private static final int METHODID_LIST_DEVICES = 4;
  private static final int METHODID_GET_DEVICE = 5;
  private static final int METHODID_UPDATE_PORT = 6;
  private static final int METHODID_LIST_PORTS = 7;
  private static final int METHODID_GET_PORT = 8;
  private static final int METHODID_CREATE_VNIC = 9;
  private static final int METHODID_DELETE_VNIC = 10;
  private static final int METHODID_UPDATE_VNIC = 11;
  private static final int METHODID_LIST_VNICS = 12;
  private static final int METHODID_GET_VNIC = 13;
  private static final int METHODID_CREATE_INTERFACE = 14;
  private static final int METHODID_DELETE_INTERFACE = 15;
  private static final int METHODID_UPDATE_INTERFACE = 16;
  private static final int METHODID_LIST_INTERFACES = 17;
  private static final int METHODID_GET_INTERFACE = 18;
  private static final int METHODID_CREATE_ROUTE_TABLE = 19;
  private static final int METHODID_DELETE_ROUTE_TABLE = 20;
  private static final int METHODID_UPDATE_ROUTE_TABLE = 21;
  private static final int METHODID_LIST_ROUTE_TABLES = 22;
  private static final int METHODID_GET_ROUTE_TABLE = 23;
  private static final int METHODID_CREATE_ROUTE = 24;
  private static final int METHODID_DELETE_ROUTE = 25;
  private static final int METHODID_UPDATE_ROUTE = 26;
  private static final int METHODID_LIST_ROUTES = 27;
  private static final int METHODID_GET_ROUTE = 28;
  private static final int METHODID_CREATE_UNDERLAY_ROUTE = 29;
  private static final int METHODID_DELETE_UNDERLAY_ROUTE = 30;
  private static final int METHODID_UPDATE_UNDERLAY_ROUTE = 31;
  private static final int METHODID_LIST_UNDERLAY_ROUTES = 32;
  private static final int METHODID_GET_UNDERLAY_ROUTE = 33;
  private static final int METHODID_CREATE_BGP = 34;
  private static final int METHODID_DELETE_BGP = 35;
  private static final int METHODID_UPDATE_BGP = 36;
  private static final int METHODID_LIST_BGPS = 37;
  private static final int METHODID_GET_BGP = 38;
  private static final int METHODID_CREATE_BGPPEER = 39;
  private static final int METHODID_DELETE_BGPPEER = 40;
  private static final int METHODID_UPDATE_BGPPEER = 41;
  private static final int METHODID_LIST_BGPPEERS = 42;
  private static final int METHODID_GET_BGPPEER = 43;
  private static final int METHODID_CREATE_BGPPEER_AF = 44;
  private static final int METHODID_DELETE_BGPPEER_AF = 45;
  private static final int METHODID_UPDATE_BGPPEER_AF = 46;
  private static final int METHODID_LIST_BGPPEER_AFS = 47;
  private static final int METHODID_GET_BGPPEER_AF = 48;
  private static final int METHODID_CREATE_MAPPING = 49;
  private static final int METHODID_DELETE_MAPPING = 50;
  private static final int METHODID_UPDATE_MAPPING = 51;
  private static final int METHODID_LIST_MAPPINGS = 52;
  private static final int METHODID_GET_MAPPING = 53;
  private static final int METHODID_CREATE_NEXT_HOP = 54;
  private static final int METHODID_DELETE_NEXT_HOP = 55;
  private static final int METHODID_UPDATE_NEXT_HOP = 56;
  private static final int METHODID_LIST_NEXT_HOP = 57;
  private static final int METHODID_GET_NEXT_HOP = 58;
  private static final int METHODID_CREATE_NEXT_HOP_GROUP = 59;
  private static final int METHODID_DELETE_NEXT_HOP_GROUP = 60;
  private static final int METHODID_UPDATE_NEXT_HOP_GROUP = 61;
  private static final int METHODID_LIST_NEXT_HOP_GROUPS = 62;
  private static final int METHODID_GET_NEXT_HOP_GROUP = 63;
  private static final int METHODID_CREATE_SUBNET = 64;
  private static final int METHODID_DELETE_SUBNET = 65;
  private static final int METHODID_UPDATE_SUBNET = 66;
  private static final int METHODID_LIST_SUBNETS = 67;
  private static final int METHODID_GET_SUBNET = 68;
  private static final int METHODID_CREATE_TUNNEL = 69;
  private static final int METHODID_DELETE_TUNNEL = 70;
  private static final int METHODID_UPDATE_TUNNEL = 71;
  private static final int METHODID_LIST_TUNNELS = 72;
  private static final int METHODID_GET_TUNNEL = 73;
  private static final int METHODID_CREATE_VPC = 74;
  private static final int METHODID_DELETE_VPC = 75;
  private static final int METHODID_UPDATE_VPC = 76;
  private static final int METHODID_LIST_VPCS = 77;
  private static final int METHODID_GET_VPC = 78;
  private static final int METHODID_CREATE_VPCPEER = 79;
  private static final int METHODID_DELETE_VPCPEER = 80;
  private static final int METHODID_UPDATE_VPCPEER = 81;
  private static final int METHODID_LIST_VPCPEERS = 82;
  private static final int METHODID_GET_VPCPEER = 83;
  private static final int METHODID_CREATE_SECURITY_POLICY = 84;
  private static final int METHODID_DELETE_SECURITY_POLICY = 85;
  private static final int METHODID_UPDATE_SECURITY_POLICY = 86;
  private static final int METHODID_LIST_SECURITY_POLICYS = 87;
  private static final int METHODID_GET_SECURITY_POLICY = 88;
  private static final int METHODID_CREATE_SECURITY_RULE = 89;
  private static final int METHODID_DELETE_SECURITY_RULE = 90;
  private static final int METHODID_UPDATE_SECURITY_RULE = 91;
  private static final int METHODID_LIST_SECURITY_RULES = 92;
  private static final int METHODID_GET_SECURITY_RULE = 93;
  private static final int METHODID_CREATE_SECURITY_PROFILE = 94;
  private static final int METHODID_DELETE_SECURITY_PROFILE = 95;
  private static final int METHODID_UPDATE_SECURITY_PROFILE = 96;
  private static final int METHODID_LIST_SECURITY_PROFILES = 97;
  private static final int METHODID_GET_SECURITY_PROFILE = 98;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CloudInfraServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CloudInfraServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEVICE_CAPABILITIES:
          serviceImpl.getDeviceCapabilities((opi_api.network.cloud.v1alpha1.GetDeviceCapabilitiesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.DeviceCapabilities>) responseObserver);
          break;
        case METHODID_CREATE_DEVICE:
          serviceImpl.createDevice((opi_api.network.cloud.v1alpha1.CreateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((opi_api.network.cloud.v1alpha1.DeleteDeviceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE:
          serviceImpl.updateDevice((opi_api.network.cloud.v1alpha1.UpdateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device>) responseObserver);
          break;
        case METHODID_LIST_DEVICES:
          serviceImpl.listDevices((opi_api.network.cloud.v1alpha1.ListDevicesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListDevicesResponse>) responseObserver);
          break;
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((opi_api.network.cloud.v1alpha1.GetDeviceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device>) responseObserver);
          break;
        case METHODID_UPDATE_PORT:
          serviceImpl.updatePort((opi_api.network.cloud.v1alpha1.UpdatePortRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Port>) responseObserver);
          break;
        case METHODID_LIST_PORTS:
          serviceImpl.listPorts((opi_api.network.cloud.v1alpha1.ListPortsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListPortsResponse>) responseObserver);
          break;
        case METHODID_GET_PORT:
          serviceImpl.getPort((opi_api.network.cloud.v1alpha1.GetPortRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Port>) responseObserver);
          break;
        case METHODID_CREATE_VNIC:
          serviceImpl.createVnic((opi_api.network.cloud.v1alpha1.CreateVnicRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic>) responseObserver);
          break;
        case METHODID_DELETE_VNIC:
          serviceImpl.deleteVnic((opi_api.network.cloud.v1alpha1.DeleteVnicRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VNIC:
          serviceImpl.updateVnic((opi_api.network.cloud.v1alpha1.UpdateVnicRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic>) responseObserver);
          break;
        case METHODID_LIST_VNICS:
          serviceImpl.listVnics((opi_api.network.cloud.v1alpha1.ListVnicsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVnicsResponse>) responseObserver);
          break;
        case METHODID_GET_VNIC:
          serviceImpl.getVnic((opi_api.network.cloud.v1alpha1.GetVnicRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vnic>) responseObserver);
          break;
        case METHODID_CREATE_INTERFACE:
          serviceImpl.createInterface((opi_api.network.cloud.v1alpha1.CreateInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface>) responseObserver);
          break;
        case METHODID_DELETE_INTERFACE:
          serviceImpl.deleteInterface((opi_api.network.cloud.v1alpha1.DeleteInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_INTERFACE:
          serviceImpl.updateInterface((opi_api.network.cloud.v1alpha1.UpdateInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface>) responseObserver);
          break;
        case METHODID_LIST_INTERFACES:
          serviceImpl.listInterfaces((opi_api.network.cloud.v1alpha1.ListInterfacesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListInterfacesResponse>) responseObserver);
          break;
        case METHODID_GET_INTERFACE:
          serviceImpl.getInterface((opi_api.network.cloud.v1alpha1.GetInterfaceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Interface>) responseObserver);
          break;
        case METHODID_CREATE_ROUTE_TABLE:
          serviceImpl.createRouteTable((opi_api.network.cloud.v1alpha1.CreateRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable>) responseObserver);
          break;
        case METHODID_DELETE_ROUTE_TABLE:
          serviceImpl.deleteRouteTable((opi_api.network.cloud.v1alpha1.DeleteRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE_TABLE:
          serviceImpl.updateRouteTable((opi_api.network.cloud.v1alpha1.UpdateRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable>) responseObserver);
          break;
        case METHODID_LIST_ROUTE_TABLES:
          serviceImpl.listRouteTables((opi_api.network.cloud.v1alpha1.ListRouteTablesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListRouteTablesResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTE_TABLE:
          serviceImpl.getRouteTable((opi_api.network.cloud.v1alpha1.GetRouteTableRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.RouteTable>) responseObserver);
          break;
        case METHODID_CREATE_ROUTE:
          serviceImpl.createRoute((opi_api.network.cloud.v1alpha1.CreateRouteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route>) responseObserver);
          break;
        case METHODID_DELETE_ROUTE:
          serviceImpl.deleteRoute((opi_api.network.cloud.v1alpha1.DeleteRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((opi_api.network.cloud.v1alpha1.UpdateRouteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route>) responseObserver);
          break;
        case METHODID_LIST_ROUTES:
          serviceImpl.listRoutes((opi_api.network.cloud.v1alpha1.ListRoutesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListRoutesResponse>) responseObserver);
          break;
        case METHODID_GET_ROUTE:
          serviceImpl.getRoute((opi_api.network.cloud.v1alpha1.GetRouteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Route>) responseObserver);
          break;
        case METHODID_CREATE_UNDERLAY_ROUTE:
          serviceImpl.createUnderlayRoute((opi_api.network.cloud.v1alpha1.CreateUnderlayRouteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute>) responseObserver);
          break;
        case METHODID_DELETE_UNDERLAY_ROUTE:
          serviceImpl.deleteUnderlayRoute((opi_api.network.cloud.v1alpha1.DeleteUnderlayRouteRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_UNDERLAY_ROUTE:
          serviceImpl.updateUnderlayRoute((opi_api.network.cloud.v1alpha1.UpdateUnderlayRouteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute>) responseObserver);
          break;
        case METHODID_LIST_UNDERLAY_ROUTES:
          serviceImpl.listUnderlayRoutes((opi_api.network.cloud.v1alpha1.ListUnderlayRoutesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListUnderlayRoutesResponse>) responseObserver);
          break;
        case METHODID_GET_UNDERLAY_ROUTE:
          serviceImpl.getUnderlayRoute((opi_api.network.cloud.v1alpha1.GetUnderlayRouteRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.UnderlayRoute>) responseObserver);
          break;
        case METHODID_CREATE_BGP:
          serviceImpl.createBgp((opi_api.network.cloud.v1alpha1.CreateBgpRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp>) responseObserver);
          break;
        case METHODID_DELETE_BGP:
          serviceImpl.deleteBgp((opi_api.network.cloud.v1alpha1.DeleteBgpRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BGP:
          serviceImpl.updateBgp((opi_api.network.cloud.v1alpha1.UpdateBgpRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp>) responseObserver);
          break;
        case METHODID_LIST_BGPS:
          serviceImpl.listBgps((opi_api.network.cloud.v1alpha1.ListBgpsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBgpsResponse>) responseObserver);
          break;
        case METHODID_GET_BGP:
          serviceImpl.getBgp((opi_api.network.cloud.v1alpha1.GetBgpRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Bgp>) responseObserver);
          break;
        case METHODID_CREATE_BGPPEER:
          serviceImpl.createBGPPeer((opi_api.network.cloud.v1alpha1.CreateBGPPeerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer>) responseObserver);
          break;
        case METHODID_DELETE_BGPPEER:
          serviceImpl.deleteBGPPeer((opi_api.network.cloud.v1alpha1.DeleteBGPPeerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BGPPEER:
          serviceImpl.updateBGPPeer((opi_api.network.cloud.v1alpha1.UpdateBGPPeerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer>) responseObserver);
          break;
        case METHODID_LIST_BGPPEERS:
          serviceImpl.listBGPPeers((opi_api.network.cloud.v1alpha1.ListBGPPeersRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBGPPeersResponse>) responseObserver);
          break;
        case METHODID_GET_BGPPEER:
          serviceImpl.getBGPPeer((opi_api.network.cloud.v1alpha1.GetBGPPeerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeer>) responseObserver);
          break;
        case METHODID_CREATE_BGPPEER_AF:
          serviceImpl.createBGPPeerAf((opi_api.network.cloud.v1alpha1.CreateBGPPeerAfRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf>) responseObserver);
          break;
        case METHODID_DELETE_BGPPEER_AF:
          serviceImpl.deleteBGPPeerAf((opi_api.network.cloud.v1alpha1.DeleteBGPPeerAfRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_BGPPEER_AF:
          serviceImpl.updateBGPPeerAf((opi_api.network.cloud.v1alpha1.UpdateBGPPeerAfRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf>) responseObserver);
          break;
        case METHODID_LIST_BGPPEER_AFS:
          serviceImpl.listBGPPeerAfs((opi_api.network.cloud.v1alpha1.ListBGPPeerAfsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListBGPPeerAfsResponse>) responseObserver);
          break;
        case METHODID_GET_BGPPEER_AF:
          serviceImpl.getBGPPeerAf((opi_api.network.cloud.v1alpha1.GetBGPPeerAfRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.BGPPeerAf>) responseObserver);
          break;
        case METHODID_CREATE_MAPPING:
          serviceImpl.createMapping((opi_api.network.cloud.v1alpha1.CreateMappingRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping>) responseObserver);
          break;
        case METHODID_DELETE_MAPPING:
          serviceImpl.deleteMapping((opi_api.network.cloud.v1alpha1.DeleteMappingRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_MAPPING:
          serviceImpl.updateMapping((opi_api.network.cloud.v1alpha1.UpdateMappingRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping>) responseObserver);
          break;
        case METHODID_LIST_MAPPINGS:
          serviceImpl.listMappings((opi_api.network.cloud.v1alpha1.ListMappingsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListMappingsResponse>) responseObserver);
          break;
        case METHODID_GET_MAPPING:
          serviceImpl.getMapping((opi_api.network.cloud.v1alpha1.GetMappingRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Mapping>) responseObserver);
          break;
        case METHODID_CREATE_NEXT_HOP:
          serviceImpl.createNextHop((opi_api.network.cloud.v1alpha1.CreateNextHopRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop>) responseObserver);
          break;
        case METHODID_DELETE_NEXT_HOP:
          serviceImpl.deleteNextHop((opi_api.network.cloud.v1alpha1.DeleteNextHopRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NEXT_HOP:
          serviceImpl.updateNextHop((opi_api.network.cloud.v1alpha1.UpdateNextHopRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop>) responseObserver);
          break;
        case METHODID_LIST_NEXT_HOP:
          serviceImpl.listNextHop((opi_api.network.cloud.v1alpha1.ListNextHopsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListNextHopsResponse>) responseObserver);
          break;
        case METHODID_GET_NEXT_HOP:
          serviceImpl.getNextHop((opi_api.network.cloud.v1alpha1.GetNextHopRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHop>) responseObserver);
          break;
        case METHODID_CREATE_NEXT_HOP_GROUP:
          serviceImpl.createNextHopGroup((opi_api.network.cloud.v1alpha1.CreateNextHopGroupRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup>) responseObserver);
          break;
        case METHODID_DELETE_NEXT_HOP_GROUP:
          serviceImpl.deleteNextHopGroup((opi_api.network.cloud.v1alpha1.DeleteNextHopGroupRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_NEXT_HOP_GROUP:
          serviceImpl.updateNextHopGroup((opi_api.network.cloud.v1alpha1.UpdateNextHopGroupRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup>) responseObserver);
          break;
        case METHODID_LIST_NEXT_HOP_GROUPS:
          serviceImpl.listNextHopGroups((opi_api.network.cloud.v1alpha1.ListNextHopGroupsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListNextHopGroupsResponse>) responseObserver);
          break;
        case METHODID_GET_NEXT_HOP_GROUP:
          serviceImpl.getNextHopGroup((opi_api.network.cloud.v1alpha1.GetNextHopGroupRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.NextHopGroup>) responseObserver);
          break;
        case METHODID_CREATE_SUBNET:
          serviceImpl.createSubnet((opi_api.network.cloud.v1alpha1.CreateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet>) responseObserver);
          break;
        case METHODID_DELETE_SUBNET:
          serviceImpl.deleteSubnet((opi_api.network.cloud.v1alpha1.DeleteSubnetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SUBNET:
          serviceImpl.updateSubnet((opi_api.network.cloud.v1alpha1.UpdateSubnetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet>) responseObserver);
          break;
        case METHODID_LIST_SUBNETS:
          serviceImpl.listSubnets((opi_api.network.cloud.v1alpha1.ListSubnetsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSubnetsResponse>) responseObserver);
          break;
        case METHODID_GET_SUBNET:
          serviceImpl.getSubnet((opi_api.network.cloud.v1alpha1.GetSubnetRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Subnet>) responseObserver);
          break;
        case METHODID_CREATE_TUNNEL:
          serviceImpl.createTunnel((opi_api.network.cloud.v1alpha1.CreateTunnelRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel>) responseObserver);
          break;
        case METHODID_DELETE_TUNNEL:
          serviceImpl.deleteTunnel((opi_api.network.cloud.v1alpha1.DeleteTunnelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_TUNNEL:
          serviceImpl.updateTunnel((opi_api.network.cloud.v1alpha1.UpdateTunnelRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel>) responseObserver);
          break;
        case METHODID_LIST_TUNNELS:
          serviceImpl.listTunnels((opi_api.network.cloud.v1alpha1.ListTunnelsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListTunnelsResponse>) responseObserver);
          break;
        case METHODID_GET_TUNNEL:
          serviceImpl.getTunnel((opi_api.network.cloud.v1alpha1.GetTunnelRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Tunnel>) responseObserver);
          break;
        case METHODID_CREATE_VPC:
          serviceImpl.createVpc((opi_api.network.cloud.v1alpha1.CreateVpcRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc>) responseObserver);
          break;
        case METHODID_DELETE_VPC:
          serviceImpl.deleteVpc((opi_api.network.cloud.v1alpha1.DeleteVpcRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VPC:
          serviceImpl.updateVpc((opi_api.network.cloud.v1alpha1.UpdateVpcRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc>) responseObserver);
          break;
        case METHODID_LIST_VPCS:
          serviceImpl.listVpcs((opi_api.network.cloud.v1alpha1.ListVpcsRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVpcsResponse>) responseObserver);
          break;
        case METHODID_GET_VPC:
          serviceImpl.getVpc((opi_api.network.cloud.v1alpha1.GetVpcRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Vpc>) responseObserver);
          break;
        case METHODID_CREATE_VPCPEER:
          serviceImpl.createVPCPeer((opi_api.network.cloud.v1alpha1.CreateVPCPeerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer>) responseObserver);
          break;
        case METHODID_DELETE_VPCPEER:
          serviceImpl.deleteVPCPeer((opi_api.network.cloud.v1alpha1.DeleteVPCPeerRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_VPCPEER:
          serviceImpl.updateVPCPeer((opi_api.network.cloud.v1alpha1.UpdateVPCPeerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer>) responseObserver);
          break;
        case METHODID_LIST_VPCPEERS:
          serviceImpl.listVPCPeers((opi_api.network.cloud.v1alpha1.ListVPCPeersRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListVPCPeersResponse>) responseObserver);
          break;
        case METHODID_GET_VPCPEER:
          serviceImpl.getVPCPeer((opi_api.network.cloud.v1alpha1.GetVPCPeerRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.VPCPeer>) responseObserver);
          break;
        case METHODID_CREATE_SECURITY_POLICY:
          serviceImpl.createSecurityPolicy((opi_api.network.cloud.v1alpha1.CreateSecurityPolicyRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy>) responseObserver);
          break;
        case METHODID_DELETE_SECURITY_POLICY:
          serviceImpl.deleteSecurityPolicy((opi_api.network.cloud.v1alpha1.DeleteSecurityPolicyRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SECURITY_POLICY:
          serviceImpl.updateSecurityPolicy((opi_api.network.cloud.v1alpha1.UpdateSecurityPolicyRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy>) responseObserver);
          break;
        case METHODID_LIST_SECURITY_POLICYS:
          serviceImpl.listSecurityPolicys((opi_api.network.cloud.v1alpha1.ListSecurityPolicysRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityPolicysResponse>) responseObserver);
          break;
        case METHODID_GET_SECURITY_POLICY:
          serviceImpl.getSecurityPolicy((opi_api.network.cloud.v1alpha1.GetSecurityPolicyRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityPolicy>) responseObserver);
          break;
        case METHODID_CREATE_SECURITY_RULE:
          serviceImpl.createSecurityRule((opi_api.network.cloud.v1alpha1.CreateSecurityRuleRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule>) responseObserver);
          break;
        case METHODID_DELETE_SECURITY_RULE:
          serviceImpl.deleteSecurityRule((opi_api.network.cloud.v1alpha1.DeleteSecurityRuleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SECURITY_RULE:
          serviceImpl.updateSecurityRule((opi_api.network.cloud.v1alpha1.UpdateSecurityRuleRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule>) responseObserver);
          break;
        case METHODID_LIST_SECURITY_RULES:
          serviceImpl.listSecurityRules((opi_api.network.cloud.v1alpha1.ListSecurityRulesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityRulesResponse>) responseObserver);
          break;
        case METHODID_GET_SECURITY_RULE:
          serviceImpl.getSecurityRule((opi_api.network.cloud.v1alpha1.GetSecurityRuleRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityRule>) responseObserver);
          break;
        case METHODID_CREATE_SECURITY_PROFILE:
          serviceImpl.createSecurityProfile((opi_api.network.cloud.v1alpha1.CreateSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile>) responseObserver);
          break;
        case METHODID_DELETE_SECURITY_PROFILE:
          serviceImpl.deleteSecurityProfile((opi_api.network.cloud.v1alpha1.DeleteSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SECURITY_PROFILE:
          serviceImpl.updateSecurityProfile((opi_api.network.cloud.v1alpha1.UpdateSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile>) responseObserver);
          break;
        case METHODID_LIST_SECURITY_PROFILES:
          serviceImpl.listSecurityProfiles((opi_api.network.cloud.v1alpha1.ListSecurityProfilesRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse>) responseObserver);
          break;
        case METHODID_GET_SECURITY_PROFILE:
          serviceImpl.getSecurityProfile((opi_api.network.cloud.v1alpha1.GetSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.SecurityProfile>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CloudInfraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CloudInfraServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CloudInfraService");
    }
  }

  private static final class CloudInfraServiceFileDescriptorSupplier
      extends CloudInfraServiceBaseDescriptorSupplier {
    CloudInfraServiceFileDescriptorSupplier() {}
  }

  private static final class CloudInfraServiceMethodDescriptorSupplier
      extends CloudInfraServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CloudInfraServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CloudInfraServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CloudInfraServiceFileDescriptorSupplier())
              .addMethod(getGetDeviceCapabilitiesMethod())
              .addMethod(getCreateDeviceMethod())
              .addMethod(getDeleteDeviceMethod())
              .addMethod(getUpdateDeviceMethod())
              .addMethod(getListDevicesMethod())
              .addMethod(getGetDeviceMethod())
              .addMethod(getUpdatePortMethod())
              .addMethod(getListPortsMethod())
              .addMethod(getGetPortMethod())
              .addMethod(getCreateVnicMethod())
              .addMethod(getDeleteVnicMethod())
              .addMethod(getUpdateVnicMethod())
              .addMethod(getListVnicsMethod())
              .addMethod(getGetVnicMethod())
              .addMethod(getCreateInterfaceMethod())
              .addMethod(getDeleteInterfaceMethod())
              .addMethod(getUpdateInterfaceMethod())
              .addMethod(getListInterfacesMethod())
              .addMethod(getGetInterfaceMethod())
              .addMethod(getCreateRouteTableMethod())
              .addMethod(getDeleteRouteTableMethod())
              .addMethod(getUpdateRouteTableMethod())
              .addMethod(getListRouteTablesMethod())
              .addMethod(getGetRouteTableMethod())
              .addMethod(getCreateRouteMethod())
              .addMethod(getDeleteRouteMethod())
              .addMethod(getUpdateRouteMethod())
              .addMethod(getListRoutesMethod())
              .addMethod(getGetRouteMethod())
              .addMethod(getCreateUnderlayRouteMethod())
              .addMethod(getDeleteUnderlayRouteMethod())
              .addMethod(getUpdateUnderlayRouteMethod())
              .addMethod(getListUnderlayRoutesMethod())
              .addMethod(getGetUnderlayRouteMethod())
              .addMethod(getCreateBgpMethod())
              .addMethod(getDeleteBgpMethod())
              .addMethod(getUpdateBgpMethod())
              .addMethod(getListBgpsMethod())
              .addMethod(getGetBgpMethod())
              .addMethod(getCreateBGPPeerMethod())
              .addMethod(getDeleteBGPPeerMethod())
              .addMethod(getUpdateBGPPeerMethod())
              .addMethod(getListBGPPeersMethod())
              .addMethod(getGetBGPPeerMethod())
              .addMethod(getCreateBGPPeerAfMethod())
              .addMethod(getDeleteBGPPeerAfMethod())
              .addMethod(getUpdateBGPPeerAfMethod())
              .addMethod(getListBGPPeerAfsMethod())
              .addMethod(getGetBGPPeerAfMethod())
              .addMethod(getCreateMappingMethod())
              .addMethod(getDeleteMappingMethod())
              .addMethod(getUpdateMappingMethod())
              .addMethod(getListMappingsMethod())
              .addMethod(getGetMappingMethod())
              .addMethod(getCreateNextHopMethod())
              .addMethod(getDeleteNextHopMethod())
              .addMethod(getUpdateNextHopMethod())
              .addMethod(getListNextHopMethod())
              .addMethod(getGetNextHopMethod())
              .addMethod(getCreateNextHopGroupMethod())
              .addMethod(getDeleteNextHopGroupMethod())
              .addMethod(getUpdateNextHopGroupMethod())
              .addMethod(getListNextHopGroupsMethod())
              .addMethod(getGetNextHopGroupMethod())
              .addMethod(getCreateSubnetMethod())
              .addMethod(getDeleteSubnetMethod())
              .addMethod(getUpdateSubnetMethod())
              .addMethod(getListSubnetsMethod())
              .addMethod(getGetSubnetMethod())
              .addMethod(getCreateTunnelMethod())
              .addMethod(getDeleteTunnelMethod())
              .addMethod(getUpdateTunnelMethod())
              .addMethod(getListTunnelsMethod())
              .addMethod(getGetTunnelMethod())
              .addMethod(getCreateVpcMethod())
              .addMethod(getDeleteVpcMethod())
              .addMethod(getUpdateVpcMethod())
              .addMethod(getListVpcsMethod())
              .addMethod(getGetVpcMethod())
              .addMethod(getCreateVPCPeerMethod())
              .addMethod(getDeleteVPCPeerMethod())
              .addMethod(getUpdateVPCPeerMethod())
              .addMethod(getListVPCPeersMethod())
              .addMethod(getGetVPCPeerMethod())
              .addMethod(getCreateSecurityPolicyMethod())
              .addMethod(getDeleteSecurityPolicyMethod())
              .addMethod(getUpdateSecurityPolicyMethod())
              .addMethod(getListSecurityPolicysMethod())
              .addMethod(getGetSecurityPolicyMethod())
              .addMethod(getCreateSecurityRuleMethod())
              .addMethod(getDeleteSecurityRuleMethod())
              .addMethod(getUpdateSecurityRuleMethod())
              .addMethod(getListSecurityRulesMethod())
              .addMethod(getGetSecurityRuleMethod())
              .addMethod(getCreateSecurityProfileMethod())
              .addMethod(getDeleteSecurityProfileMethod())
              .addMethod(getUpdateSecurityProfileMethod())
              .addMethod(getListSecurityProfilesMethod())
              .addMethod(getGetSecurityProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
