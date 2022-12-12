// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: inventory.proto
// Original file comments:
// -----------------------------------------------------
// Copyright (c)
// protobuf specification for inventory object
// inventory.proto file
//
#ifndef GRPC_inventory_2eproto__INCLUDED
#define GRPC_inventory_2eproto__INCLUDED

#include "inventory.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_generic_service.h>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/client_context.h>
#include <grpcpp/impl/codegen/completion_queue.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/proto_utils.h>
#include <grpcpp/impl/codegen/rpc_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/status.h>
#include <grpcpp/impl/codegen/stub_options.h>
#include <grpcpp/impl/codegen/sync_stream.h>

namespace opi_api {
namespace inventory {
namespace v1 {

// Service functions for the device inventory data
class InventorySvc final {
 public:
  static constexpr char const* service_full_name() {
    return "opi_api.inventory.v1.InventorySvc";
  }
  class StubInterface {
   public:
    virtual ~StubInterface() {}
    // retrieves the inventory data for the device
    virtual ::grpc::Status InventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::opi_api::inventory::v1::InventoryGetResponse* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::InventoryGetResponse>> AsyncInventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::InventoryGetResponse>>(AsyncInventoryGetRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::InventoryGetResponse>> PrepareAsyncInventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::InventoryGetResponse>>(PrepareAsyncInventoryGetRaw(context, request, cq));
    }
    class async_interface {
     public:
      virtual ~async_interface() {}
      // retrieves the inventory data for the device
      virtual void InventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest* request, ::opi_api::inventory::v1::InventoryGetResponse* response, std::function<void(::grpc::Status)>) = 0;
      virtual void InventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest* request, ::opi_api::inventory::v1::InventoryGetResponse* response, ::grpc::ClientUnaryReactor* reactor) = 0;
    };
    typedef class async_interface experimental_async_interface;
    virtual class async_interface* async() { return nullptr; }
    class async_interface* experimental_async() { return async(); }
   private:
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::InventoryGetResponse>* AsyncInventoryGetRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::InventoryGetResponse>* PrepareAsyncInventoryGetRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) = 0;
  };
  class Stub final : public StubInterface {
   public:
    Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());
    ::grpc::Status InventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::opi_api::inventory::v1::InventoryGetResponse* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::InventoryGetResponse>> AsyncInventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::InventoryGetResponse>>(AsyncInventoryGetRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::InventoryGetResponse>> PrepareAsyncInventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::InventoryGetResponse>>(PrepareAsyncInventoryGetRaw(context, request, cq));
    }
    class async final :
      public StubInterface::async_interface {
     public:
      void InventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest* request, ::opi_api::inventory::v1::InventoryGetResponse* response, std::function<void(::grpc::Status)>) override;
      void InventoryGet(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest* request, ::opi_api::inventory::v1::InventoryGetResponse* response, ::grpc::ClientUnaryReactor* reactor) override;
     private:
      friend class Stub;
      explicit async(Stub* stub): stub_(stub) { }
      Stub* stub() { return stub_; }
      Stub* stub_;
    };
    class async* async() override { return &async_stub_; }

   private:
    std::shared_ptr< ::grpc::ChannelInterface> channel_;
    class async async_stub_{this};
    ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::InventoryGetResponse>* AsyncInventoryGetRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::InventoryGetResponse>* PrepareAsyncInventoryGetRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::InventoryGetRequest& request, ::grpc::CompletionQueue* cq) override;
    const ::grpc::internal::RpcMethod rpcmethod_InventoryGet_;
  };
  static std::unique_ptr<Stub> NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());

  class Service : public ::grpc::Service {
   public:
    Service();
    virtual ~Service();
    // retrieves the inventory data for the device
    virtual ::grpc::Status InventoryGet(::grpc::ServerContext* context, const ::opi_api::inventory::v1::InventoryGetRequest* request, ::opi_api::inventory::v1::InventoryGetResponse* response);
  };
  template <class BaseClass>
  class WithAsyncMethod_InventoryGet : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithAsyncMethod_InventoryGet() {
      ::grpc::Service::MarkMethodAsync(0);
    }
    ~WithAsyncMethod_InventoryGet() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status InventoryGet(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestInventoryGet(::grpc::ServerContext* context, ::opi_api::inventory::v1::InventoryGetRequest* request, ::grpc::ServerAsyncResponseWriter< ::opi_api::inventory::v1::InventoryGetResponse>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  typedef WithAsyncMethod_InventoryGet<Service > AsyncService;
  template <class BaseClass>
  class WithCallbackMethod_InventoryGet : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithCallbackMethod_InventoryGet() {
      ::grpc::Service::MarkMethodCallback(0,
          new ::grpc::internal::CallbackUnaryHandler< ::opi_api::inventory::v1::InventoryGetRequest, ::opi_api::inventory::v1::InventoryGetResponse>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::opi_api::inventory::v1::InventoryGetRequest* request, ::opi_api::inventory::v1::InventoryGetResponse* response) { return this->InventoryGet(context, request, response); }));}
    void SetMessageAllocatorFor_InventoryGet(
        ::grpc::MessageAllocator< ::opi_api::inventory::v1::InventoryGetRequest, ::opi_api::inventory::v1::InventoryGetResponse>* allocator) {
      ::grpc::internal::MethodHandler* const handler = ::grpc::Service::GetHandler(0);
      static_cast<::grpc::internal::CallbackUnaryHandler< ::opi_api::inventory::v1::InventoryGetRequest, ::opi_api::inventory::v1::InventoryGetResponse>*>(handler)
              ->SetMessageAllocator(allocator);
    }
    ~WithCallbackMethod_InventoryGet() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status InventoryGet(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* InventoryGet(
      ::grpc::CallbackServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/)  { return nullptr; }
  };
  typedef WithCallbackMethod_InventoryGet<Service > CallbackService;
  typedef CallbackService ExperimentalCallbackService;
  template <class BaseClass>
  class WithGenericMethod_InventoryGet : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithGenericMethod_InventoryGet() {
      ::grpc::Service::MarkMethodGeneric(0);
    }
    ~WithGenericMethod_InventoryGet() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status InventoryGet(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithRawMethod_InventoryGet : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawMethod_InventoryGet() {
      ::grpc::Service::MarkMethodRaw(0);
    }
    ~WithRawMethod_InventoryGet() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status InventoryGet(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestInventoryGet(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawCallbackMethod_InventoryGet : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawCallbackMethod_InventoryGet() {
      ::grpc::Service::MarkMethodRawCallback(0,
          new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response) { return this->InventoryGet(context, request, response); }));
    }
    ~WithRawCallbackMethod_InventoryGet() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status InventoryGet(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* InventoryGet(
      ::grpc::CallbackServerContext* /*context*/, const ::grpc::ByteBuffer* /*request*/, ::grpc::ByteBuffer* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_InventoryGet : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithStreamedUnaryMethod_InventoryGet() {
      ::grpc::Service::MarkMethodStreamed(0,
        new ::grpc::internal::StreamedUnaryHandler<
          ::opi_api::inventory::v1::InventoryGetRequest, ::opi_api::inventory::v1::InventoryGetResponse>(
            [this](::grpc::ServerContext* context,
                   ::grpc::ServerUnaryStreamer<
                     ::opi_api::inventory::v1::InventoryGetRequest, ::opi_api::inventory::v1::InventoryGetResponse>* streamer) {
                       return this->StreamedInventoryGet(context,
                         streamer);
                  }));
    }
    ~WithStreamedUnaryMethod_InventoryGet() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status InventoryGet(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::InventoryGetRequest* /*request*/, ::opi_api::inventory::v1::InventoryGetResponse* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedInventoryGet(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::opi_api::inventory::v1::InventoryGetRequest,::opi_api::inventory::v1::InventoryGetResponse>* server_unary_streamer) = 0;
  };
  typedef WithStreamedUnaryMethod_InventoryGet<Service > StreamedUnaryService;
  typedef Service SplitStreamedService;
  typedef WithStreamedUnaryMethod_InventoryGet<Service > StreamedService;
};

}  // namespace v1
}  // namespace inventory
}  // namespace opi_api


#endif  // GRPC_inventory_2eproto__INCLUDED
