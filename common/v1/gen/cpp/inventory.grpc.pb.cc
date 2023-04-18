// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: inventory.proto

#include "inventory.pb.h"
#include "inventory.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace opi_api {
namespace inventory {
namespace v1 {

static const char* InventorySvc_method_names[] = {
  "/opi_api.inventory.v1.InventorySvc/GetInventory",
};

std::unique_ptr< InventorySvc::Stub> InventorySvc::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< InventorySvc::Stub> stub(new InventorySvc::Stub(channel, options));
  return stub;
}

InventorySvc::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_GetInventory_(InventorySvc_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status InventorySvc::Stub::GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::opi_api::inventory::v1::Inventory* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetInventory_, context, request, response);
}

void InventorySvc::Stub::async::GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetInventory_, context, request, response, std::move(f));
}

void InventorySvc::Stub::async::GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetInventory_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>* InventorySvc::Stub::PrepareAsyncGetInventoryRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::inventory::v1::Inventory, ::opi_api::inventory::v1::GetInventoryRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetInventory_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>* InventorySvc::Stub::AsyncGetInventoryRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetInventoryRaw(context, request, cq);
  result->StartCall();
  return result;
}

InventorySvc::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      InventorySvc_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< InventorySvc::Service, ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](InventorySvc::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::inventory::v1::GetInventoryRequest* req,
             ::opi_api::inventory::v1::Inventory* resp) {
               return service->GetInventory(ctx, req, resp);
             }, this)));
}

InventorySvc::Service::~Service() {
}

::grpc::Status InventorySvc::Service::GetInventory(::grpc::ServerContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace inventory
}  // namespace v1

