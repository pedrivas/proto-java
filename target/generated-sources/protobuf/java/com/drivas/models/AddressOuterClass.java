// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/address.proto

package com.drivas.models;

public final class AddressOuterClass {
  private AddressOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Address_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024common/address.proto\022\006common\"8\n\007Addres" +
      "s\022\017\n\007postbox\030\001 \001(\005\022\016\n\006street\030\002 \001(\t\022\014\n\004ci" +
      "ty\030\003 \001(\tB\025\n\021com.drivas.modelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_common_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Address_descriptor,
        new java.lang.String[] { "Postbox", "Street", "City", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
