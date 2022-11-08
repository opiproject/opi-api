// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

#include "common.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>

PROTOBUF_PRAGMA_INIT_SEG
namespace opi_api {
namespace storage {
namespace v1 {
constexpr NvmeControllerPciId::NvmeControllerPciId(
  ::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized)
  : bus_(0u)
  , device_(0u)
  , function_(0u)
  , virtual_function_(0u){}
struct NvmeControllerPciIdDefaultTypeInternal {
  constexpr NvmeControllerPciIdDefaultTypeInternal()
    : _instance(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized{}) {}
  ~NvmeControllerPciIdDefaultTypeInternal() {}
  union {
    NvmeControllerPciId _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT NvmeControllerPciIdDefaultTypeInternal _NvmeControllerPciId_default_instance_;
}  // namespace v1
}  // namespace storage
}  // namespace opi_api
static ::PROTOBUF_NAMESPACE_ID::Metadata file_level_metadata_common_2eproto[1];
static constexpr ::PROTOBUF_NAMESPACE_ID::EnumDescriptor const** file_level_enum_descriptors_common_2eproto = nullptr;
static constexpr ::PROTOBUF_NAMESPACE_ID::ServiceDescriptor const** file_level_service_descriptors_common_2eproto = nullptr;

const uint32_t TableStruct_common_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::opi_api::storage::v1::NvmeControllerPciId, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  ~0u,  // no _inlined_string_donated_
  PROTOBUF_FIELD_OFFSET(::opi_api::storage::v1::NvmeControllerPciId, bus_),
  PROTOBUF_FIELD_OFFSET(::opi_api::storage::v1::NvmeControllerPciId, device_),
  PROTOBUF_FIELD_OFFSET(::opi_api::storage::v1::NvmeControllerPciId, function_),
  PROTOBUF_FIELD_OFFSET(::opi_api::storage::v1::NvmeControllerPciId, virtual_function_),
};
static const ::PROTOBUF_NAMESPACE_ID::internal::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, -1, sizeof(::opi_api::storage::v1::NvmeControllerPciId)},
};

static ::PROTOBUF_NAMESPACE_ID::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::PROTOBUF_NAMESPACE_ID::Message*>(&::opi_api::storage::v1::_NvmeControllerPciId_default_instance_),
};

const char descriptor_table_protodef_common_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\014common.proto\022\022opi_api.storage.v1\"^\n\023Nv"
  "meControllerPciId\022\013\n\003bus\030\001 \001(\r\022\016\n\006device"
  "\030\002 \001(\r\022\020\n\010function\030\003 \001(\r\022\030\n\020virtual_func"
  "tion\030\004 \001(\rB7Z5github.com/opiproject/opi-"
  "api/storage/v1alpha1/gen/gob\006proto3"
  ;
static ::PROTOBUF_NAMESPACE_ID::internal::once_flag descriptor_table_common_2eproto_once;
const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_common_2eproto = {
  false, false, 195, descriptor_table_protodef_common_2eproto, "common.proto", 
  &descriptor_table_common_2eproto_once, nullptr, 0, 1,
  schemas, file_default_instances, TableStruct_common_2eproto::offsets,
  file_level_metadata_common_2eproto, file_level_enum_descriptors_common_2eproto, file_level_service_descriptors_common_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable* descriptor_table_common_2eproto_getter() {
  return &descriptor_table_common_2eproto;
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY static ::PROTOBUF_NAMESPACE_ID::internal::AddDescriptorsRunner dynamic_init_dummy_common_2eproto(&descriptor_table_common_2eproto);
namespace opi_api {
namespace storage {
namespace v1 {

// ===================================================================

class NvmeControllerPciId::_Internal {
 public:
};

NvmeControllerPciId::NvmeControllerPciId(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                         bool is_message_owned)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena, is_message_owned) {
  SharedCtor();
  if (!is_message_owned) {
    RegisterArenaDtor(arena);
  }
  // @@protoc_insertion_point(arena_constructor:opi_api.storage.v1.NvmeControllerPciId)
}
NvmeControllerPciId::NvmeControllerPciId(const NvmeControllerPciId& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  ::memcpy(&bus_, &from.bus_,
    static_cast<size_t>(reinterpret_cast<char*>(&virtual_function_) -
    reinterpret_cast<char*>(&bus_)) + sizeof(virtual_function_));
  // @@protoc_insertion_point(copy_constructor:opi_api.storage.v1.NvmeControllerPciId)
}

inline void NvmeControllerPciId::SharedCtor() {
::memset(reinterpret_cast<char*>(this) + static_cast<size_t>(
    reinterpret_cast<char*>(&bus_) - reinterpret_cast<char*>(this)),
    0, static_cast<size_t>(reinterpret_cast<char*>(&virtual_function_) -
    reinterpret_cast<char*>(&bus_)) + sizeof(virtual_function_));
}

NvmeControllerPciId::~NvmeControllerPciId() {
  // @@protoc_insertion_point(destructor:opi_api.storage.v1.NvmeControllerPciId)
  if (GetArenaForAllocation() != nullptr) return;
  SharedDtor();
  _internal_metadata_.Delete<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

inline void NvmeControllerPciId::SharedDtor() {
  GOOGLE_DCHECK(GetArenaForAllocation() == nullptr);
}

void NvmeControllerPciId::ArenaDtor(void* object) {
  NvmeControllerPciId* _this = reinterpret_cast< NvmeControllerPciId* >(object);
  (void)_this;
}
void NvmeControllerPciId::RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena*) {
}
void NvmeControllerPciId::SetCachedSize(int size) const {
  _cached_size_.Set(size);
}

void NvmeControllerPciId::Clear() {
// @@protoc_insertion_point(message_clear_start:opi_api.storage.v1.NvmeControllerPciId)
  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  ::memset(&bus_, 0, static_cast<size_t>(
      reinterpret_cast<char*>(&virtual_function_) -
      reinterpret_cast<char*>(&bus_)) + sizeof(virtual_function_));
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* NvmeControllerPciId::_InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    uint32_t tag;
    ptr = ::PROTOBUF_NAMESPACE_ID::internal::ReadTag(ptr, &tag);
    switch (tag >> 3) {
      // uint32 bus = 1;
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 8)) {
          bus_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint32(&ptr);
          CHK_(ptr);
        } else
          goto handle_unusual;
        continue;
      // uint32 device = 2;
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 16)) {
          device_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint32(&ptr);
          CHK_(ptr);
        } else
          goto handle_unusual;
        continue;
      // uint32 function = 3;
      case 3:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 24)) {
          function_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint32(&ptr);
          CHK_(ptr);
        } else
          goto handle_unusual;
        continue;
      // uint32 virtual_function = 4;
      case 4:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 32)) {
          virtual_function_ = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint32(&ptr);
          CHK_(ptr);
        } else
          goto handle_unusual;
        continue;
      default:
        goto handle_unusual;
    }  // switch
  handle_unusual:
    if ((tag == 0) || ((tag & 7) == 4)) {
      CHK_(ptr);
      ctx->SetLastTag(tag);
      goto message_done;
    }
    ptr = UnknownFieldParse(
        tag,
        _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
        ptr, ctx);
    CHK_(ptr != nullptr);
  }  // while
message_done:
  return ptr;
failure:
  ptr = nullptr;
  goto message_done;
#undef CHK_
}

uint8_t* NvmeControllerPciId::_InternalSerialize(
    uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:opi_api.storage.v1.NvmeControllerPciId)
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  // uint32 bus = 1;
  if (this->_internal_bus() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt32ToArray(1, this->_internal_bus(), target);
  }

  // uint32 device = 2;
  if (this->_internal_device() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt32ToArray(2, this->_internal_device(), target);
  }

  // uint32 function = 3;
  if (this->_internal_function() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt32ToArray(3, this->_internal_function(), target);
  }

  // uint32 virtual_function = 4;
  if (this->_internal_virtual_function() != 0) {
    target = stream->EnsureSpace(target);
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::WriteUInt32ToArray(4, this->_internal_virtual_function(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::PROTOBUF_NAMESPACE_ID::internal::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:opi_api.storage.v1.NvmeControllerPciId)
  return target;
}

size_t NvmeControllerPciId::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:opi_api.storage.v1.NvmeControllerPciId)
  size_t total_size = 0;

  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // uint32 bus = 1;
  if (this->_internal_bus() != 0) {
    total_size += ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt32SizePlusOne(this->_internal_bus());
  }

  // uint32 device = 2;
  if (this->_internal_device() != 0) {
    total_size += ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt32SizePlusOne(this->_internal_device());
  }

  // uint32 function = 3;
  if (this->_internal_function() != 0) {
    total_size += ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt32SizePlusOne(this->_internal_function());
  }

  // uint32 virtual_function = 4;
  if (this->_internal_virtual_function() != 0) {
    total_size += ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::UInt32SizePlusOne(this->_internal_virtual_function());
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_cached_size_);
}

const ::PROTOBUF_NAMESPACE_ID::Message::ClassData NvmeControllerPciId::_class_data_ = {
    ::PROTOBUF_NAMESPACE_ID::Message::CopyWithSizeCheck,
    NvmeControllerPciId::MergeImpl
};
const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*NvmeControllerPciId::GetClassData() const { return &_class_data_; }

void NvmeControllerPciId::MergeImpl(::PROTOBUF_NAMESPACE_ID::Message* to,
                      const ::PROTOBUF_NAMESPACE_ID::Message& from) {
  static_cast<NvmeControllerPciId *>(to)->MergeFrom(
      static_cast<const NvmeControllerPciId &>(from));
}


void NvmeControllerPciId::MergeFrom(const NvmeControllerPciId& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:opi_api.storage.v1.NvmeControllerPciId)
  GOOGLE_DCHECK_NE(&from, this);
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if (from._internal_bus() != 0) {
    _internal_set_bus(from._internal_bus());
  }
  if (from._internal_device() != 0) {
    _internal_set_device(from._internal_device());
  }
  if (from._internal_function() != 0) {
    _internal_set_function(from._internal_function());
  }
  if (from._internal_virtual_function() != 0) {
    _internal_set_virtual_function(from._internal_virtual_function());
  }
  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
}

void NvmeControllerPciId::CopyFrom(const NvmeControllerPciId& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:opi_api.storage.v1.NvmeControllerPciId)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool NvmeControllerPciId::IsInitialized() const {
  return true;
}

void NvmeControllerPciId::InternalSwap(NvmeControllerPciId* other) {
  using std::swap;
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::internal::memswap<
      PROTOBUF_FIELD_OFFSET(NvmeControllerPciId, virtual_function_)
      + sizeof(NvmeControllerPciId::virtual_function_)
      - PROTOBUF_FIELD_OFFSET(NvmeControllerPciId, bus_)>(
          reinterpret_cast<char*>(&bus_),
          reinterpret_cast<char*>(&other->bus_));
}

::PROTOBUF_NAMESPACE_ID::Metadata NvmeControllerPciId::GetMetadata() const {
  return ::PROTOBUF_NAMESPACE_ID::internal::AssignDescriptors(
      &descriptor_table_common_2eproto_getter, &descriptor_table_common_2eproto_once,
      file_level_metadata_common_2eproto[0]);
}

// @@protoc_insertion_point(namespace_scope)
}  // namespace v1
}  // namespace storage
}  // namespace opi_api
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::opi_api::storage::v1::NvmeControllerPciId* Arena::CreateMaybeMessage< ::opi_api::storage::v1::NvmeControllerPciId >(Arena* arena) {
  return Arena::CreateMessageInternal< ::opi_api::storage::v1::NvmeControllerPciId >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
