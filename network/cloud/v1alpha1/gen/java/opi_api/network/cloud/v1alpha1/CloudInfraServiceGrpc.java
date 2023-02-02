package opi_api.network.cloud.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Cloud Infra Service configure/operate objects to manage cloud infrastructure
 * TB added:
 *  Port APIs
 *  rpc PortGet (PortGetRequest) returns (PortGetResponse) {}
 *  rpc PortUpdate (PortUpdateRequest) returns (PortUpdateResponse) {}
 *  rpc PortStatsReset (types.Id) returns (types.Empty) {}
 *  Interface APIs
 *  rpc InterfaceCreate (InterfaceRequest) returns (InterfaceResponse) {}
 *  rpc InterfaceUpdate (InterfaceRequest) returns (InterfaceResponse) {}
 *  rpc InterfaceDelete (InterfaceDeleteRequest) returns (InterfaceDeleteResponse) {}
 *  rpc InterfaceGet (InterfaceGetRequest) returns (InterfaceGetResponse) {}
 *  Route APIs
 *  rpc RouteTableCreate (RouteTableRequest) returns (RouteTableResponse) {}
 *  rpc RouteTableUpdate (RouteTableRequest) returns (RouteTableResponse) {}
 *  rpc RouteTableGet (RouteTableGetRequest) returns (RouteTableGetResponse) {}
 *  rpc RouteTableGetStreaming (RouteTableGetRequest) returns (stream RouteTableGetResponse) {}
 *  rpc RouteTableDelete (RouteTableDeleteRequest) returns (RouteTableDeleteResponse) {}
 *  rpc RouteCreate (RouteRequest) returns (RouteResponse) {}
 *  rpc RouteUpdate (RouteRequest) returns (RouteResponse) {}
 *  rpc RouteGet (RouteGetRequest) returns (RouteGetResponse) {}
 *  rpc RouteDelete (RouteDeleteRequest) returns (RouteDeleteResponse) {}
 *  rpc RouteLookup (RouteLookupRequest) returns (RouteLookupResponse) {}
 *  rpc VnicCreate (VnicRequest) returns (VnicResponse) {}
 *  rpc VnicUpdate (VnicRequest) returns (VnicResponse) {}
 *  rpc VnicGet (VnicGetRequest) returns (VnicGetResponse) {}
 *  rpc VnicDelete (VnicDeleteRequest) returns (VnicDeleteResponse) {}
 *  rpc CPRouteCreate (CPRouteRequest) returns (CPRouteResponse) {}
 *  rpc CPRouteUpdate(CPRouteRequest) returns (CPRouteResponse) {}
 *  rpc CPRouteDelete (CPRouteDeleteRequest) returns (CPRouteDeleteResponse) {}
 *  rpc CPRouteGet (CPRouteGetRequest) returns (CPRouteGetResponse) {}
 *  rpc CPRouteLookup (CPRouteGetRequest) returns (CPRouteGetResponse) {}
 *  rpc CPRouteRedistGet (CPRouteRedistGetRequest) returns (CPRouteRedistGetResponse) {}
 *  rpc BGPCreate (BGPRequest) returns (BGPResponse) {}
 *  rpc BGPUpdate (BGPRequest) returns (BGPResponse) {}
 *  rpc BGPDelete (BGPDeleteRequest) returns (BGPDeleteResponse) {}
 *  rpc BGPGet (BGPGetRequest) returns (BGPGetResponse) {}
 *  rpc BGPPeerCreate (BGPPeerRequest) returns (BGPPeerResponse) {}
 *  rpc BGPPeerUpdate (BGPPeerRequest) returns (BGPPeerResponse) {}
 *  rpc BGPPeerDelete (BGPPeerDeleteRequest) returns (BGPPeerDeleteResponse) {}
 *  rpc BGPPeerGet (BGPPeerGetRequest) returns (BGPPeerGetResponse) {}
 *  rpc BGPPeerAfCreate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
 *  rpc BGPPeerAfUpdate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
 *  rpc BGPPeerAfDelete (BGPPeerAfDeleteRequest) returns (BGPPeerAfDeleteResponse) {}
 *  rpc BGPPeerAfGet (BGPPeerAfGetRequest) returns (BGPPeerAfGetResponse) {}
 *  rpc BGPClearRoute (BGPClearRouteRequest) returns (BGPClearRouteResponse) {}
 *  rpc BGPNLRIPrefixGet (BGPNLRIPrefixGetRequest) returns (BGPNLRIPrefixGetResponse) {}
 *  rpc BGPPrfxCntrsGet (BGPPrfxCntrsGetRequest) returns (BGPPrfxCntrsGetResponse) {}
 *  rpc BGPAdjRibOutGet (BGPAdjRibOutGetRequest) returns (BGPAdjRibOutGetResponse) {}
 *  rpc MappingCreate (MappingRequest) returns (MappingResponse) {}
 *  rpc MappingUpdate (MappingRequest) returns (MappingResponse) {}
 *  rpc MappingGet (MappingGetRequest) returns (MappingGetResponse) {}
 *  rpc MappingGetStreaming (MappingGetRequest) returns (stream MappingGetResponse) {}
 *  rpc MappingDelete (MappingDeleteRequest) returns (MappingDeleteResponse) {}
 *  rpc NexthopCreate (NexthopRequest) returns (NexthopResponse) {}
 *  rpc NexthopUpdate (NexthopRequest) returns (NexthopResponse) {}
 *  rpc NexthopGet (NexthopGetRequest) returns (NexthopGetResponse) {}
 *  rpc NexthopDelete (NexthopDeleteRequest) returns (NexthopDeleteResponse) {}
 *  rpc NhGroupCreate (NhGroupRequest) returns (NhGroupResponse) {}
 *  rpc NhGroupUpdate (NhGroupRequest) returns (NhGroupResponse) {}
 *  rpc NhGroupGet (NhGroupGetRequest) returns (NhGroupGetResponse) {}
 *  rpc NhGroupDelete (NhGroupDeleteRequest) returns (NhGroupDeleteResponse) {}
 *  rpc SubnetCreate (SubnetRequest) returns (SubnetResponse) {}
 *  rpc SubnetUpdate (SubnetRequest) returns (SubnetResponse) {}
 *  rpc SubnetGet (SubnetGetRequest) returns (SubnetGetResponse) {}
 *  rpc SubnetDelete (SubnetDeleteRequest) returns (SubnetDeleteResponse) {}
 *  rpc TunnelCreate (TunnelRequest) returns (TunnelResponse) {}
 *  rpc TunnelUpdate (TunnelRequest) returns (TunnelResponse) {}
 *  rpc TunnelGet (TunnelGetRequest) returns (TunnelGetResponse) {}
 *  rpc TunnelDelete (TunnelDeleteRequest) returns (TunnelDeleteResponse) {}
 * 
 *  rpc VPCCreate (VPCRequest) returns (VPCResponse) {}
 *  rpc VPCUpdate (VPCRequest) returns (VPCResponse) {}
 *  rpc VPCGet (VPCGetRequest) returns (VPCGetResponse) {}
 *  rpc VPCDelete (VPCDeleteRequest) returns (VPCDeleteResponse) {}
 *  rpc VPCPeerCreate (VPCPeerRequest) returns (VPCPeerResponse) {}
 *  rpc VPCPeerUpdate (VPCPeerRequest) returns (VPCPeerResponse) {}
 *  rpc VPCPeerGet (VPCPeerGetRequest) returns (VPCPeerGetResponse) {}
 *  rpc VPCPeerDelete (VPCPeerDeleteRequest) returns (VPCPeerDeleteResponse) {}
 *  rpc SecurityPolicyCreate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
 *  rpc SecurityPolicyUpdate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
 *  rpc SecurityPolicyGet (SecurityPolicyGetRequest) returns (SecurityPolicyGetResponse) {}
 *  rpc SecurityPolicyGetStreaming (SecurityPolicyGetRequest) returns (stream SecurityPolicyGetResponse) {}
 *  rpc SecurityPolicyDelete (SecurityPolicyDeleteRequest) returns (SecurityPolicyDeleteResponse) {}
 *  rpc SecurityRuleCreate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
 *  rpc SecurityRuleUpdate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
 *  rpc SecurityRuleGet (SecurityRuleGetRequest) returns (SecurityRuleGetResponse) {}
 *  rpc SecurityRuleDelete (SecurityRuleDeleteRequest) returns (SecurityRuleDeleteResponse) {}
 *  rpc SecurityProfileCreate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
 *  rpc SecurityProfileUpdate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
 *  rpc SecurityProfileGet (SecurityProfileGetRequest) returns (SecurityProfileGetResponse) {}
 *  rpc SecurityProfileDelete (SecurityProfileDeleteRequest) returns (SecurityProfileDeleteResponse) {}
 *  rpc SecurityPolicyLookup (SecurityPolicyLookupRequest) returns (SecurityPolicyLookupResponse) {}
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: device.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CloudInfraServiceGrpc {

  private CloudInfraServiceGrpc() {}

  public static final String SERVICE_NAME = "opi_api.network.cloud.v1alpha1.CloudInfraService";

  // Static method descriptors that strictly reflect the proto.
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
   * Cloud Infra Service configure/operate objects to manage cloud infrastructure
   * TB added:
   *  Port APIs
   *  rpc PortGet (PortGetRequest) returns (PortGetResponse) {}
   *  rpc PortUpdate (PortUpdateRequest) returns (PortUpdateResponse) {}
   *  rpc PortStatsReset (types.Id) returns (types.Empty) {}
   *  Interface APIs
   *  rpc InterfaceCreate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceUpdate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceDelete (InterfaceDeleteRequest) returns (InterfaceDeleteResponse) {}
   *  rpc InterfaceGet (InterfaceGetRequest) returns (InterfaceGetResponse) {}
   *  Route APIs
   *  rpc RouteTableCreate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableUpdate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableGet (RouteTableGetRequest) returns (RouteTableGetResponse) {}
   *  rpc RouteTableGetStreaming (RouteTableGetRequest) returns (stream RouteTableGetResponse) {}
   *  rpc RouteTableDelete (RouteTableDeleteRequest) returns (RouteTableDeleteResponse) {}
   *  rpc RouteCreate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteUpdate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteGet (RouteGetRequest) returns (RouteGetResponse) {}
   *  rpc RouteDelete (RouteDeleteRequest) returns (RouteDeleteResponse) {}
   *  rpc RouteLookup (RouteLookupRequest) returns (RouteLookupResponse) {}
   *  rpc VnicCreate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicUpdate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicGet (VnicGetRequest) returns (VnicGetResponse) {}
   *  rpc VnicDelete (VnicDeleteRequest) returns (VnicDeleteResponse) {}
   *  rpc CPRouteCreate (CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteUpdate(CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteDelete (CPRouteDeleteRequest) returns (CPRouteDeleteResponse) {}
   *  rpc CPRouteGet (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteLookup (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteRedistGet (CPRouteRedistGetRequest) returns (CPRouteRedistGetResponse) {}
   *  rpc BGPCreate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPUpdate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPDelete (BGPDeleteRequest) returns (BGPDeleteResponse) {}
   *  rpc BGPGet (BGPGetRequest) returns (BGPGetResponse) {}
   *  rpc BGPPeerCreate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerUpdate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerDelete (BGPPeerDeleteRequest) returns (BGPPeerDeleteResponse) {}
   *  rpc BGPPeerGet (BGPPeerGetRequest) returns (BGPPeerGetResponse) {}
   *  rpc BGPPeerAfCreate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfUpdate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfDelete (BGPPeerAfDeleteRequest) returns (BGPPeerAfDeleteResponse) {}
   *  rpc BGPPeerAfGet (BGPPeerAfGetRequest) returns (BGPPeerAfGetResponse) {}
   *  rpc BGPClearRoute (BGPClearRouteRequest) returns (BGPClearRouteResponse) {}
   *  rpc BGPNLRIPrefixGet (BGPNLRIPrefixGetRequest) returns (BGPNLRIPrefixGetResponse) {}
   *  rpc BGPPrfxCntrsGet (BGPPrfxCntrsGetRequest) returns (BGPPrfxCntrsGetResponse) {}
   *  rpc BGPAdjRibOutGet (BGPAdjRibOutGetRequest) returns (BGPAdjRibOutGetResponse) {}
   *  rpc MappingCreate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingUpdate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingGet (MappingGetRequest) returns (MappingGetResponse) {}
   *  rpc MappingGetStreaming (MappingGetRequest) returns (stream MappingGetResponse) {}
   *  rpc MappingDelete (MappingDeleteRequest) returns (MappingDeleteResponse) {}
   *  rpc NexthopCreate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopUpdate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopGet (NexthopGetRequest) returns (NexthopGetResponse) {}
   *  rpc NexthopDelete (NexthopDeleteRequest) returns (NexthopDeleteResponse) {}
   *  rpc NhGroupCreate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupUpdate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupGet (NhGroupGetRequest) returns (NhGroupGetResponse) {}
   *  rpc NhGroupDelete (NhGroupDeleteRequest) returns (NhGroupDeleteResponse) {}
   *  rpc SubnetCreate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetUpdate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetGet (SubnetGetRequest) returns (SubnetGetResponse) {}
   *  rpc SubnetDelete (SubnetDeleteRequest) returns (SubnetDeleteResponse) {}
   *  rpc TunnelCreate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelUpdate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelGet (TunnelGetRequest) returns (TunnelGetResponse) {}
   *  rpc TunnelDelete (TunnelDeleteRequest) returns (TunnelDeleteResponse) {}
   * 
   *  rpc VPCCreate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCUpdate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCGet (VPCGetRequest) returns (VPCGetResponse) {}
   *  rpc VPCDelete (VPCDeleteRequest) returns (VPCDeleteResponse) {}
   *  rpc VPCPeerCreate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerUpdate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerGet (VPCPeerGetRequest) returns (VPCPeerGetResponse) {}
   *  rpc VPCPeerDelete (VPCPeerDeleteRequest) returns (VPCPeerDeleteResponse) {}
   *  rpc SecurityPolicyCreate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyUpdate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyGet (SecurityPolicyGetRequest) returns (SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyGetStreaming (SecurityPolicyGetRequest) returns (stream SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyDelete (SecurityPolicyDeleteRequest) returns (SecurityPolicyDeleteResponse) {}
   *  rpc SecurityRuleCreate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleUpdate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleGet (SecurityRuleGetRequest) returns (SecurityRuleGetResponse) {}
   *  rpc SecurityRuleDelete (SecurityRuleDeleteRequest) returns (SecurityRuleDeleteResponse) {}
   *  rpc SecurityProfileCreate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileUpdate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileGet (SecurityProfileGetRequest) returns (SecurityProfileGetResponse) {}
   *  rpc SecurityProfileDelete (SecurityProfileDeleteRequest) returns (SecurityProfileDeleteResponse) {}
   *  rpc SecurityPolicyLookup (SecurityPolicyLookupRequest) returns (SecurityPolicyLookupResponse) {}
   * </pre>
   */
  public static abstract class CloudInfraServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * device create request
     * </pre>
     */
    public void createDevice(opi_api.network.cloud.v1alpha1.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeviceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDeviceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                opi_api.network.cloud.v1alpha1.CreateDeviceRequest,
                opi_api.network.cloud.v1alpha1.Device>(
                  this, METHODID_CREATE_DEVICE)))
          .build();
    }
  }

  /**
   * <pre>
   * Cloud Infra Service configure/operate objects to manage cloud infrastructure
   * TB added:
   *  Port APIs
   *  rpc PortGet (PortGetRequest) returns (PortGetResponse) {}
   *  rpc PortUpdate (PortUpdateRequest) returns (PortUpdateResponse) {}
   *  rpc PortStatsReset (types.Id) returns (types.Empty) {}
   *  Interface APIs
   *  rpc InterfaceCreate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceUpdate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceDelete (InterfaceDeleteRequest) returns (InterfaceDeleteResponse) {}
   *  rpc InterfaceGet (InterfaceGetRequest) returns (InterfaceGetResponse) {}
   *  Route APIs
   *  rpc RouteTableCreate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableUpdate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableGet (RouteTableGetRequest) returns (RouteTableGetResponse) {}
   *  rpc RouteTableGetStreaming (RouteTableGetRequest) returns (stream RouteTableGetResponse) {}
   *  rpc RouteTableDelete (RouteTableDeleteRequest) returns (RouteTableDeleteResponse) {}
   *  rpc RouteCreate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteUpdate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteGet (RouteGetRequest) returns (RouteGetResponse) {}
   *  rpc RouteDelete (RouteDeleteRequest) returns (RouteDeleteResponse) {}
   *  rpc RouteLookup (RouteLookupRequest) returns (RouteLookupResponse) {}
   *  rpc VnicCreate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicUpdate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicGet (VnicGetRequest) returns (VnicGetResponse) {}
   *  rpc VnicDelete (VnicDeleteRequest) returns (VnicDeleteResponse) {}
   *  rpc CPRouteCreate (CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteUpdate(CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteDelete (CPRouteDeleteRequest) returns (CPRouteDeleteResponse) {}
   *  rpc CPRouteGet (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteLookup (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteRedistGet (CPRouteRedistGetRequest) returns (CPRouteRedistGetResponse) {}
   *  rpc BGPCreate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPUpdate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPDelete (BGPDeleteRequest) returns (BGPDeleteResponse) {}
   *  rpc BGPGet (BGPGetRequest) returns (BGPGetResponse) {}
   *  rpc BGPPeerCreate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerUpdate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerDelete (BGPPeerDeleteRequest) returns (BGPPeerDeleteResponse) {}
   *  rpc BGPPeerGet (BGPPeerGetRequest) returns (BGPPeerGetResponse) {}
   *  rpc BGPPeerAfCreate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfUpdate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfDelete (BGPPeerAfDeleteRequest) returns (BGPPeerAfDeleteResponse) {}
   *  rpc BGPPeerAfGet (BGPPeerAfGetRequest) returns (BGPPeerAfGetResponse) {}
   *  rpc BGPClearRoute (BGPClearRouteRequest) returns (BGPClearRouteResponse) {}
   *  rpc BGPNLRIPrefixGet (BGPNLRIPrefixGetRequest) returns (BGPNLRIPrefixGetResponse) {}
   *  rpc BGPPrfxCntrsGet (BGPPrfxCntrsGetRequest) returns (BGPPrfxCntrsGetResponse) {}
   *  rpc BGPAdjRibOutGet (BGPAdjRibOutGetRequest) returns (BGPAdjRibOutGetResponse) {}
   *  rpc MappingCreate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingUpdate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingGet (MappingGetRequest) returns (MappingGetResponse) {}
   *  rpc MappingGetStreaming (MappingGetRequest) returns (stream MappingGetResponse) {}
   *  rpc MappingDelete (MappingDeleteRequest) returns (MappingDeleteResponse) {}
   *  rpc NexthopCreate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopUpdate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopGet (NexthopGetRequest) returns (NexthopGetResponse) {}
   *  rpc NexthopDelete (NexthopDeleteRequest) returns (NexthopDeleteResponse) {}
   *  rpc NhGroupCreate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupUpdate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupGet (NhGroupGetRequest) returns (NhGroupGetResponse) {}
   *  rpc NhGroupDelete (NhGroupDeleteRequest) returns (NhGroupDeleteResponse) {}
   *  rpc SubnetCreate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetUpdate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetGet (SubnetGetRequest) returns (SubnetGetResponse) {}
   *  rpc SubnetDelete (SubnetDeleteRequest) returns (SubnetDeleteResponse) {}
   *  rpc TunnelCreate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelUpdate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelGet (TunnelGetRequest) returns (TunnelGetResponse) {}
   *  rpc TunnelDelete (TunnelDeleteRequest) returns (TunnelDeleteResponse) {}
   * 
   *  rpc VPCCreate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCUpdate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCGet (VPCGetRequest) returns (VPCGetResponse) {}
   *  rpc VPCDelete (VPCDeleteRequest) returns (VPCDeleteResponse) {}
   *  rpc VPCPeerCreate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerUpdate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerGet (VPCPeerGetRequest) returns (VPCPeerGetResponse) {}
   *  rpc VPCPeerDelete (VPCPeerDeleteRequest) returns (VPCPeerDeleteResponse) {}
   *  rpc SecurityPolicyCreate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyUpdate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyGet (SecurityPolicyGetRequest) returns (SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyGetStreaming (SecurityPolicyGetRequest) returns (stream SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyDelete (SecurityPolicyDeleteRequest) returns (SecurityPolicyDeleteResponse) {}
   *  rpc SecurityRuleCreate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleUpdate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleGet (SecurityRuleGetRequest) returns (SecurityRuleGetResponse) {}
   *  rpc SecurityRuleDelete (SecurityRuleDeleteRequest) returns (SecurityRuleDeleteResponse) {}
   *  rpc SecurityProfileCreate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileUpdate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileGet (SecurityProfileGetRequest) returns (SecurityProfileGetResponse) {}
   *  rpc SecurityProfileDelete (SecurityProfileDeleteRequest) returns (SecurityProfileDeleteResponse) {}
   *  rpc SecurityPolicyLookup (SecurityPolicyLookupRequest) returns (SecurityPolicyLookupResponse) {}
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
     * device create request
     * </pre>
     */
    public void createDevice(opi_api.network.cloud.v1alpha1.CreateDeviceRequest request,
        io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Cloud Infra Service configure/operate objects to manage cloud infrastructure
   * TB added:
   *  Port APIs
   *  rpc PortGet (PortGetRequest) returns (PortGetResponse) {}
   *  rpc PortUpdate (PortUpdateRequest) returns (PortUpdateResponse) {}
   *  rpc PortStatsReset (types.Id) returns (types.Empty) {}
   *  Interface APIs
   *  rpc InterfaceCreate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceUpdate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceDelete (InterfaceDeleteRequest) returns (InterfaceDeleteResponse) {}
   *  rpc InterfaceGet (InterfaceGetRequest) returns (InterfaceGetResponse) {}
   *  Route APIs
   *  rpc RouteTableCreate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableUpdate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableGet (RouteTableGetRequest) returns (RouteTableGetResponse) {}
   *  rpc RouteTableGetStreaming (RouteTableGetRequest) returns (stream RouteTableGetResponse) {}
   *  rpc RouteTableDelete (RouteTableDeleteRequest) returns (RouteTableDeleteResponse) {}
   *  rpc RouteCreate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteUpdate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteGet (RouteGetRequest) returns (RouteGetResponse) {}
   *  rpc RouteDelete (RouteDeleteRequest) returns (RouteDeleteResponse) {}
   *  rpc RouteLookup (RouteLookupRequest) returns (RouteLookupResponse) {}
   *  rpc VnicCreate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicUpdate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicGet (VnicGetRequest) returns (VnicGetResponse) {}
   *  rpc VnicDelete (VnicDeleteRequest) returns (VnicDeleteResponse) {}
   *  rpc CPRouteCreate (CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteUpdate(CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteDelete (CPRouteDeleteRequest) returns (CPRouteDeleteResponse) {}
   *  rpc CPRouteGet (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteLookup (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteRedistGet (CPRouteRedistGetRequest) returns (CPRouteRedistGetResponse) {}
   *  rpc BGPCreate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPUpdate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPDelete (BGPDeleteRequest) returns (BGPDeleteResponse) {}
   *  rpc BGPGet (BGPGetRequest) returns (BGPGetResponse) {}
   *  rpc BGPPeerCreate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerUpdate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerDelete (BGPPeerDeleteRequest) returns (BGPPeerDeleteResponse) {}
   *  rpc BGPPeerGet (BGPPeerGetRequest) returns (BGPPeerGetResponse) {}
   *  rpc BGPPeerAfCreate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfUpdate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfDelete (BGPPeerAfDeleteRequest) returns (BGPPeerAfDeleteResponse) {}
   *  rpc BGPPeerAfGet (BGPPeerAfGetRequest) returns (BGPPeerAfGetResponse) {}
   *  rpc BGPClearRoute (BGPClearRouteRequest) returns (BGPClearRouteResponse) {}
   *  rpc BGPNLRIPrefixGet (BGPNLRIPrefixGetRequest) returns (BGPNLRIPrefixGetResponse) {}
   *  rpc BGPPrfxCntrsGet (BGPPrfxCntrsGetRequest) returns (BGPPrfxCntrsGetResponse) {}
   *  rpc BGPAdjRibOutGet (BGPAdjRibOutGetRequest) returns (BGPAdjRibOutGetResponse) {}
   *  rpc MappingCreate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingUpdate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingGet (MappingGetRequest) returns (MappingGetResponse) {}
   *  rpc MappingGetStreaming (MappingGetRequest) returns (stream MappingGetResponse) {}
   *  rpc MappingDelete (MappingDeleteRequest) returns (MappingDeleteResponse) {}
   *  rpc NexthopCreate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopUpdate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopGet (NexthopGetRequest) returns (NexthopGetResponse) {}
   *  rpc NexthopDelete (NexthopDeleteRequest) returns (NexthopDeleteResponse) {}
   *  rpc NhGroupCreate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupUpdate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupGet (NhGroupGetRequest) returns (NhGroupGetResponse) {}
   *  rpc NhGroupDelete (NhGroupDeleteRequest) returns (NhGroupDeleteResponse) {}
   *  rpc SubnetCreate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetUpdate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetGet (SubnetGetRequest) returns (SubnetGetResponse) {}
   *  rpc SubnetDelete (SubnetDeleteRequest) returns (SubnetDeleteResponse) {}
   *  rpc TunnelCreate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelUpdate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelGet (TunnelGetRequest) returns (TunnelGetResponse) {}
   *  rpc TunnelDelete (TunnelDeleteRequest) returns (TunnelDeleteResponse) {}
   * 
   *  rpc VPCCreate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCUpdate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCGet (VPCGetRequest) returns (VPCGetResponse) {}
   *  rpc VPCDelete (VPCDeleteRequest) returns (VPCDeleteResponse) {}
   *  rpc VPCPeerCreate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerUpdate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerGet (VPCPeerGetRequest) returns (VPCPeerGetResponse) {}
   *  rpc VPCPeerDelete (VPCPeerDeleteRequest) returns (VPCPeerDeleteResponse) {}
   *  rpc SecurityPolicyCreate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyUpdate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyGet (SecurityPolicyGetRequest) returns (SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyGetStreaming (SecurityPolicyGetRequest) returns (stream SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyDelete (SecurityPolicyDeleteRequest) returns (SecurityPolicyDeleteResponse) {}
   *  rpc SecurityRuleCreate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleUpdate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleGet (SecurityRuleGetRequest) returns (SecurityRuleGetResponse) {}
   *  rpc SecurityRuleDelete (SecurityRuleDeleteRequest) returns (SecurityRuleDeleteResponse) {}
   *  rpc SecurityProfileCreate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileUpdate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileGet (SecurityProfileGetRequest) returns (SecurityProfileGetResponse) {}
   *  rpc SecurityProfileDelete (SecurityProfileDeleteRequest) returns (SecurityProfileDeleteResponse) {}
   *  rpc SecurityPolicyLookup (SecurityPolicyLookupRequest) returns (SecurityPolicyLookupResponse) {}
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
     * device create request
     * </pre>
     */
    public opi_api.network.cloud.v1alpha1.Device createDevice(opi_api.network.cloud.v1alpha1.CreateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Cloud Infra Service configure/operate objects to manage cloud infrastructure
   * TB added:
   *  Port APIs
   *  rpc PortGet (PortGetRequest) returns (PortGetResponse) {}
   *  rpc PortUpdate (PortUpdateRequest) returns (PortUpdateResponse) {}
   *  rpc PortStatsReset (types.Id) returns (types.Empty) {}
   *  Interface APIs
   *  rpc InterfaceCreate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceUpdate (InterfaceRequest) returns (InterfaceResponse) {}
   *  rpc InterfaceDelete (InterfaceDeleteRequest) returns (InterfaceDeleteResponse) {}
   *  rpc InterfaceGet (InterfaceGetRequest) returns (InterfaceGetResponse) {}
   *  Route APIs
   *  rpc RouteTableCreate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableUpdate (RouteTableRequest) returns (RouteTableResponse) {}
   *  rpc RouteTableGet (RouteTableGetRequest) returns (RouteTableGetResponse) {}
   *  rpc RouteTableGetStreaming (RouteTableGetRequest) returns (stream RouteTableGetResponse) {}
   *  rpc RouteTableDelete (RouteTableDeleteRequest) returns (RouteTableDeleteResponse) {}
   *  rpc RouteCreate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteUpdate (RouteRequest) returns (RouteResponse) {}
   *  rpc RouteGet (RouteGetRequest) returns (RouteGetResponse) {}
   *  rpc RouteDelete (RouteDeleteRequest) returns (RouteDeleteResponse) {}
   *  rpc RouteLookup (RouteLookupRequest) returns (RouteLookupResponse) {}
   *  rpc VnicCreate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicUpdate (VnicRequest) returns (VnicResponse) {}
   *  rpc VnicGet (VnicGetRequest) returns (VnicGetResponse) {}
   *  rpc VnicDelete (VnicDeleteRequest) returns (VnicDeleteResponse) {}
   *  rpc CPRouteCreate (CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteUpdate(CPRouteRequest) returns (CPRouteResponse) {}
   *  rpc CPRouteDelete (CPRouteDeleteRequest) returns (CPRouteDeleteResponse) {}
   *  rpc CPRouteGet (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteLookup (CPRouteGetRequest) returns (CPRouteGetResponse) {}
   *  rpc CPRouteRedistGet (CPRouteRedistGetRequest) returns (CPRouteRedistGetResponse) {}
   *  rpc BGPCreate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPUpdate (BGPRequest) returns (BGPResponse) {}
   *  rpc BGPDelete (BGPDeleteRequest) returns (BGPDeleteResponse) {}
   *  rpc BGPGet (BGPGetRequest) returns (BGPGetResponse) {}
   *  rpc BGPPeerCreate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerUpdate (BGPPeerRequest) returns (BGPPeerResponse) {}
   *  rpc BGPPeerDelete (BGPPeerDeleteRequest) returns (BGPPeerDeleteResponse) {}
   *  rpc BGPPeerGet (BGPPeerGetRequest) returns (BGPPeerGetResponse) {}
   *  rpc BGPPeerAfCreate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfUpdate (BGPPeerAfRequest) returns (BGPPeerAfResponse) {}
   *  rpc BGPPeerAfDelete (BGPPeerAfDeleteRequest) returns (BGPPeerAfDeleteResponse) {}
   *  rpc BGPPeerAfGet (BGPPeerAfGetRequest) returns (BGPPeerAfGetResponse) {}
   *  rpc BGPClearRoute (BGPClearRouteRequest) returns (BGPClearRouteResponse) {}
   *  rpc BGPNLRIPrefixGet (BGPNLRIPrefixGetRequest) returns (BGPNLRIPrefixGetResponse) {}
   *  rpc BGPPrfxCntrsGet (BGPPrfxCntrsGetRequest) returns (BGPPrfxCntrsGetResponse) {}
   *  rpc BGPAdjRibOutGet (BGPAdjRibOutGetRequest) returns (BGPAdjRibOutGetResponse) {}
   *  rpc MappingCreate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingUpdate (MappingRequest) returns (MappingResponse) {}
   *  rpc MappingGet (MappingGetRequest) returns (MappingGetResponse) {}
   *  rpc MappingGetStreaming (MappingGetRequest) returns (stream MappingGetResponse) {}
   *  rpc MappingDelete (MappingDeleteRequest) returns (MappingDeleteResponse) {}
   *  rpc NexthopCreate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopUpdate (NexthopRequest) returns (NexthopResponse) {}
   *  rpc NexthopGet (NexthopGetRequest) returns (NexthopGetResponse) {}
   *  rpc NexthopDelete (NexthopDeleteRequest) returns (NexthopDeleteResponse) {}
   *  rpc NhGroupCreate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupUpdate (NhGroupRequest) returns (NhGroupResponse) {}
   *  rpc NhGroupGet (NhGroupGetRequest) returns (NhGroupGetResponse) {}
   *  rpc NhGroupDelete (NhGroupDeleteRequest) returns (NhGroupDeleteResponse) {}
   *  rpc SubnetCreate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetUpdate (SubnetRequest) returns (SubnetResponse) {}
   *  rpc SubnetGet (SubnetGetRequest) returns (SubnetGetResponse) {}
   *  rpc SubnetDelete (SubnetDeleteRequest) returns (SubnetDeleteResponse) {}
   *  rpc TunnelCreate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelUpdate (TunnelRequest) returns (TunnelResponse) {}
   *  rpc TunnelGet (TunnelGetRequest) returns (TunnelGetResponse) {}
   *  rpc TunnelDelete (TunnelDeleteRequest) returns (TunnelDeleteResponse) {}
   * 
   *  rpc VPCCreate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCUpdate (VPCRequest) returns (VPCResponse) {}
   *  rpc VPCGet (VPCGetRequest) returns (VPCGetResponse) {}
   *  rpc VPCDelete (VPCDeleteRequest) returns (VPCDeleteResponse) {}
   *  rpc VPCPeerCreate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerUpdate (VPCPeerRequest) returns (VPCPeerResponse) {}
   *  rpc VPCPeerGet (VPCPeerGetRequest) returns (VPCPeerGetResponse) {}
   *  rpc VPCPeerDelete (VPCPeerDeleteRequest) returns (VPCPeerDeleteResponse) {}
   *  rpc SecurityPolicyCreate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyUpdate (SecurityPolicyRequest) returns (SecurityPolicyResponse) {}
   *  rpc SecurityPolicyGet (SecurityPolicyGetRequest) returns (SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyGetStreaming (SecurityPolicyGetRequest) returns (stream SecurityPolicyGetResponse) {}
   *  rpc SecurityPolicyDelete (SecurityPolicyDeleteRequest) returns (SecurityPolicyDeleteResponse) {}
   *  rpc SecurityRuleCreate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleUpdate (SecurityRuleRequest) returns (SecurityRuleResponse) {}
   *  rpc SecurityRuleGet (SecurityRuleGetRequest) returns (SecurityRuleGetResponse) {}
   *  rpc SecurityRuleDelete (SecurityRuleDeleteRequest) returns (SecurityRuleDeleteResponse) {}
   *  rpc SecurityProfileCreate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileUpdate (SecurityProfileRequest) returns (SecurityProfileResponse) {}
   *  rpc SecurityProfileGet (SecurityProfileGetRequest) returns (SecurityProfileGetResponse) {}
   *  rpc SecurityProfileDelete (SecurityProfileDeleteRequest) returns (SecurityProfileDeleteResponse) {}
   *  rpc SecurityPolicyLookup (SecurityPolicyLookupRequest) returns (SecurityPolicyLookupResponse) {}
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
     * device create request
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<opi_api.network.cloud.v1alpha1.Device> createDevice(
        opi_api.network.cloud.v1alpha1.CreateDeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DEVICE = 0;

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
        case METHODID_CREATE_DEVICE:
          serviceImpl.createDevice((opi_api.network.cloud.v1alpha1.CreateDeviceRequest) request,
              (io.grpc.stub.StreamObserver<opi_api.network.cloud.v1alpha1.Device>) responseObserver);
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
      return opi_api.network.cloud.v1alpha1.DeviceProto.getDescriptor();
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
              .addMethod(getCreateDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
