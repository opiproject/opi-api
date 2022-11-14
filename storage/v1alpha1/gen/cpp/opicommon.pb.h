// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opicommon.proto

#ifndef GOOGLE_PROTOBUF_INCLUDED_opicommon_2eproto
#define GOOGLE_PROTOBUF_INCLUDED_opicommon_2eproto

#include <limits>
#include <string>

#include <google/protobuf/port_def.inc>
#if PROTOBUF_VERSION < 3019000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers. Please update
#error your headers.
#endif
#if 3019004 < PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers. Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/port_undef.inc>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_table_driven.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata_lite.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>  // IWYU pragma: export
#include <google/protobuf/extension_set.h>  // IWYU pragma: export
#include <google/protobuf/generated_enum_reflection.h>
#include <google/protobuf/unknown_field_set.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>
#define PROTOBUF_INTERNAL_EXPORT_opicommon_2eproto
PROTOBUF_NAMESPACE_OPEN
namespace internal {
class AnyMetadata;
}  // namespace internal
PROTOBUF_NAMESPACE_CLOSE

// Internal implementation detail -- do not use these members.
struct TableStruct_opicommon_2eproto {
  static const ::PROTOBUF_NAMESPACE_ID::internal::ParseTableField entries[]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::PROTOBUF_NAMESPACE_ID::internal::AuxiliaryParseTableField aux[]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::PROTOBUF_NAMESPACE_ID::internal::ParseTable schema[1]
    PROTOBUF_SECTION_VARIABLE(protodesc_cold);
  static const ::PROTOBUF_NAMESPACE_ID::internal::FieldMetadata field_metadata[];
  static const ::PROTOBUF_NAMESPACE_ID::internal::SerializationTable serialization_table[];
  static const uint32_t offsets[];
};
extern const ::PROTOBUF_NAMESPACE_ID::internal::DescriptorTable descriptor_table_opicommon_2eproto;
namespace opi_api {
namespace storage {
namespace v1 {
class PciEndpoint;
struct PciEndpointDefaultTypeInternal;
extern PciEndpointDefaultTypeInternal _PciEndpoint_default_instance_;
}  // namespace v1
}  // namespace storage
}  // namespace opi_api
PROTOBUF_NAMESPACE_OPEN
template<> ::opi_api::storage::v1::PciEndpoint* Arena::CreateMaybeMessage<::opi_api::storage::v1::PciEndpoint>(Arena*);
PROTOBUF_NAMESPACE_CLOSE
namespace opi_api {
namespace storage {
namespace v1 {

enum CryptoType : int {
  CRYPTO_TYPE_UNSPECIFIED = 0,
  CRYPTO_TYPE_AES_CBC_128 = 1,
  CRYPTO_TYPE_AES_CBC_192 = 2,
  CRYPTO_TYPE_AES_CBC_256 = 3,
  CRYPTO_TYPE_AES_XTS_128 = 4,
  CRYPTO_TYPE_AES_XTS_192 = 5,
  CRYPTO_TYPE_AES_XTS_256 = 6,
  CryptoType_INT_MIN_SENTINEL_DO_NOT_USE_ = std::numeric_limits<int32_t>::min(),
  CryptoType_INT_MAX_SENTINEL_DO_NOT_USE_ = std::numeric_limits<int32_t>::max()
};
bool CryptoType_IsValid(int value);
constexpr CryptoType CryptoType_MIN = CRYPTO_TYPE_UNSPECIFIED;
constexpr CryptoType CryptoType_MAX = CRYPTO_TYPE_AES_XTS_256;
constexpr int CryptoType_ARRAYSIZE = CryptoType_MAX + 1;

const ::PROTOBUF_NAMESPACE_ID::EnumDescriptor* CryptoType_descriptor();
template<typename T>
inline const std::string& CryptoType_Name(T enum_t_value) {
  static_assert(::std::is_same<T, CryptoType>::value ||
    ::std::is_integral<T>::value,
    "Incorrect type passed to function CryptoType_Name.");
  return ::PROTOBUF_NAMESPACE_ID::internal::NameOfEnum(
    CryptoType_descriptor(), enum_t_value);
}
inline bool CryptoType_Parse(
    ::PROTOBUF_NAMESPACE_ID::ConstStringParam name, CryptoType* value) {
  return ::PROTOBUF_NAMESPACE_ID::internal::ParseNamedEnum<CryptoType>(
    CryptoType_descriptor(), name, value);
}
// ===================================================================

class PciEndpoint final :
    public ::PROTOBUF_NAMESPACE_ID::Message /* @@protoc_insertion_point(class_definition:opi_api.storage.v1.PciEndpoint) */ {
 public:
  inline PciEndpoint() : PciEndpoint(nullptr) {}
  ~PciEndpoint() override;
  explicit constexpr PciEndpoint(::PROTOBUF_NAMESPACE_ID::internal::ConstantInitialized);

  PciEndpoint(const PciEndpoint& from);
  PciEndpoint(PciEndpoint&& from) noexcept
    : PciEndpoint() {
    *this = ::std::move(from);
  }

  inline PciEndpoint& operator=(const PciEndpoint& from) {
    CopyFrom(from);
    return *this;
  }
  inline PciEndpoint& operator=(PciEndpoint&& from) noexcept {
    if (this == &from) return *this;
    if (GetOwningArena() == from.GetOwningArena()
  #ifdef PROTOBUF_FORCE_COPY_IN_MOVE
        && GetOwningArena() != nullptr
  #endif  // !PROTOBUF_FORCE_COPY_IN_MOVE
    ) {
      InternalSwap(&from);
    } else {
      CopyFrom(from);
    }
    return *this;
  }

  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* descriptor() {
    return GetDescriptor();
  }
  static const ::PROTOBUF_NAMESPACE_ID::Descriptor* GetDescriptor() {
    return default_instance().GetMetadata().descriptor;
  }
  static const ::PROTOBUF_NAMESPACE_ID::Reflection* GetReflection() {
    return default_instance().GetMetadata().reflection;
  }
  static const PciEndpoint& default_instance() {
    return *internal_default_instance();
  }
  static inline const PciEndpoint* internal_default_instance() {
    return reinterpret_cast<const PciEndpoint*>(
               &_PciEndpoint_default_instance_);
  }
  static constexpr int kIndexInFileMessages =
    0;

  friend void swap(PciEndpoint& a, PciEndpoint& b) {
    a.Swap(&b);
  }
  inline void Swap(PciEndpoint* other) {
    if (other == this) return;
  #ifdef PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() != nullptr &&
        GetOwningArena() == other->GetOwningArena()) {
   #else  // PROTOBUF_FORCE_COPY_IN_SWAP
    if (GetOwningArena() == other->GetOwningArena()) {
  #endif  // !PROTOBUF_FORCE_COPY_IN_SWAP
      InternalSwap(other);
    } else {
      ::PROTOBUF_NAMESPACE_ID::internal::GenericSwap(this, other);
    }
  }
  void UnsafeArenaSwap(PciEndpoint* other) {
    if (other == this) return;
    GOOGLE_DCHECK(GetOwningArena() == other->GetOwningArena());
    InternalSwap(other);
  }

  // implements Message ----------------------------------------------

  PciEndpoint* New(::PROTOBUF_NAMESPACE_ID::Arena* arena = nullptr) const final {
    return CreateMaybeMessage<PciEndpoint>(arena);
  }
  using ::PROTOBUF_NAMESPACE_ID::Message::CopyFrom;
  void CopyFrom(const PciEndpoint& from);
  using ::PROTOBUF_NAMESPACE_ID::Message::MergeFrom;
  void MergeFrom(const PciEndpoint& from);
  private:
  static void MergeImpl(::PROTOBUF_NAMESPACE_ID::Message* to, const ::PROTOBUF_NAMESPACE_ID::Message& from);
  public:
  PROTOBUF_ATTRIBUTE_REINITIALIZES void Clear() final;
  bool IsInitialized() const final;

  size_t ByteSizeLong() const final;
  const char* _InternalParse(const char* ptr, ::PROTOBUF_NAMESPACE_ID::internal::ParseContext* ctx) final;
  uint8_t* _InternalSerialize(
      uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const final;
  int GetCachedSize() const final { return _cached_size_.Get(); }

  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const final;
  void InternalSwap(PciEndpoint* other);

  private:
  friend class ::PROTOBUF_NAMESPACE_ID::internal::AnyMetadata;
  static ::PROTOBUF_NAMESPACE_ID::StringPiece FullMessageName() {
    return "opi_api.storage.v1.PciEndpoint";
  }
  protected:
  explicit PciEndpoint(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                       bool is_message_owned = false);
  private:
  static void ArenaDtor(void* object);
  inline void RegisterArenaDtor(::PROTOBUF_NAMESPACE_ID::Arena* arena);
  public:

  static const ClassData _class_data_;
  const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*GetClassData() const final;

  ::PROTOBUF_NAMESPACE_ID::Metadata GetMetadata() const final;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  enum : int {
    kPortIdFieldNumber = 1,
    kPhysicalFunctionFieldNumber = 2,
    kVirtualFunctionFieldNumber = 3,
  };
  // int32 port_id = 1;
  void clear_port_id();
  int32_t port_id() const;
  void set_port_id(int32_t value);
  private:
  int32_t _internal_port_id() const;
  void _internal_set_port_id(int32_t value);
  public:

  // int32 physical_function = 2;
  void clear_physical_function();
  int32_t physical_function() const;
  void set_physical_function(int32_t value);
  private:
  int32_t _internal_physical_function() const;
  void _internal_set_physical_function(int32_t value);
  public:

  // int32 virtual_function = 3;
  void clear_virtual_function();
  int32_t virtual_function() const;
  void set_virtual_function(int32_t value);
  private:
  int32_t _internal_virtual_function() const;
  void _internal_set_virtual_function(int32_t value);
  public:

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.PciEndpoint)
 private:
  class _Internal;

  template <typename T> friend class ::PROTOBUF_NAMESPACE_ID::Arena::InternalHelper;
  typedef void InternalArenaConstructable_;
  typedef void DestructorSkippable_;
  int32_t port_id_;
  int32_t physical_function_;
  int32_t virtual_function_;
  mutable ::PROTOBUF_NAMESPACE_ID::internal::CachedSize _cached_size_;
  friend struct ::TableStruct_opicommon_2eproto;
};
// ===================================================================


// ===================================================================

#ifdef __GNUC__
  #pragma GCC diagnostic push
  #pragma GCC diagnostic ignored "-Wstrict-aliasing"
#endif  // __GNUC__
// PciEndpoint

// int32 port_id = 1;
inline void PciEndpoint::clear_port_id() {
  port_id_ = 0;
}
inline int32_t PciEndpoint::_internal_port_id() const {
  return port_id_;
}
inline int32_t PciEndpoint::port_id() const {
  // @@protoc_insertion_point(field_get:opi_api.storage.v1.PciEndpoint.port_id)
  return _internal_port_id();
}
inline void PciEndpoint::_internal_set_port_id(int32_t value) {
  
  port_id_ = value;
}
inline void PciEndpoint::set_port_id(int32_t value) {
  _internal_set_port_id(value);
  // @@protoc_insertion_point(field_set:opi_api.storage.v1.PciEndpoint.port_id)
}

// int32 physical_function = 2;
inline void PciEndpoint::clear_physical_function() {
  physical_function_ = 0;
}
inline int32_t PciEndpoint::_internal_physical_function() const {
  return physical_function_;
}
inline int32_t PciEndpoint::physical_function() const {
  // @@protoc_insertion_point(field_get:opi_api.storage.v1.PciEndpoint.physical_function)
  return _internal_physical_function();
}
inline void PciEndpoint::_internal_set_physical_function(int32_t value) {
  
  physical_function_ = value;
}
inline void PciEndpoint::set_physical_function(int32_t value) {
  _internal_set_physical_function(value);
  // @@protoc_insertion_point(field_set:opi_api.storage.v1.PciEndpoint.physical_function)
}

// int32 virtual_function = 3;
inline void PciEndpoint::clear_virtual_function() {
  virtual_function_ = 0;
}
inline int32_t PciEndpoint::_internal_virtual_function() const {
  return virtual_function_;
}
inline int32_t PciEndpoint::virtual_function() const {
  // @@protoc_insertion_point(field_get:opi_api.storage.v1.PciEndpoint.virtual_function)
  return _internal_virtual_function();
}
inline void PciEndpoint::_internal_set_virtual_function(int32_t value) {
  
  virtual_function_ = value;
}
inline void PciEndpoint::set_virtual_function(int32_t value) {
  _internal_set_virtual_function(value);
  // @@protoc_insertion_point(field_set:opi_api.storage.v1.PciEndpoint.virtual_function)
}

#ifdef __GNUC__
  #pragma GCC diagnostic pop
#endif  // __GNUC__

// @@protoc_insertion_point(namespace_scope)

}  // namespace v1
}  // namespace storage
}  // namespace opi_api

PROTOBUF_NAMESPACE_OPEN

template <> struct is_proto_enum< ::opi_api::storage::v1::CryptoType> : ::std::true_type {};
template <>
inline const EnumDescriptor* GetEnumDescriptor< ::opi_api::storage::v1::CryptoType>() {
  return ::opi_api::storage::v1::CryptoType_descriptor();
}

PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)

#include <google/protobuf/port_undef.inc>
#endif  // GOOGLE_PROTOBUF_INCLUDED_GOOGLE_PROTOBUF_INCLUDED_opicommon_2eproto
