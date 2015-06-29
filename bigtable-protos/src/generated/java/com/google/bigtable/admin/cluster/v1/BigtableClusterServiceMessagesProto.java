// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/cluster/v1/bigtable_cluster_service_messages.proto

package com.google.bigtable.admin.cluster.v1;

public final class BigtableClusterServiceMessagesProto {
  private BigtableClusterServiceMessagesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_ListZonesRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_ListZonesRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_ListZonesResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_ListZonesResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_ListClustersRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_ListClustersRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_ListClustersResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_ListClustersResponse_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_CreateClusterMetadata_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_CreateClusterMetadata_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_UpdateClusterMetadata_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_UpdateClusterMetadata_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_DeleteClusterRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_DeleteClusterRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/bigtable/admin/cluster/v1/bigta" +
      "ble_cluster_service_messages.proto\022 goog" +
      "le.bigtable.admin.cluster.v1\032<google/big" +
      "table/admin/cluster/v1/bigtable_cluster_" +
      "data.proto\032\037google/protobuf/timestamp.pr" +
      "oto\" \n\020ListZonesRequest\022\014\n\004name\030\001 \001(\t\"J\n" +
      "\021ListZonesResponse\0225\n\005zones\030\001 \003(\0132&.goog" +
      "le.bigtable.admin.cluster.v1.Zone\"!\n\021Get" +
      "ClusterRequest\022\014\n\004name\030\001 \001(\t\"#\n\023ListClus" +
      "tersRequest\022\014\n\004name\030\001 \001(\t\"\221\001\n\024ListCluste",
      "rsResponse\022;\n\010clusters\030\001 \003(\0132).google.bi" +
      "gtable.admin.cluster.v1.Cluster\022<\n\014faile" +
      "d_zones\030\002 \003(\0132&.google.bigtable.admin.cl" +
      "uster.v1.Zone\"t\n\024CreateClusterRequest\022\014\n" +
      "\004name\030\001 \001(\t\022\022\n\ncluster_id\030\002 \001(\t\022:\n\007clust" +
      "er\030\003 \001(\0132).google.bigtable.admin.cluster" +
      ".v1.Cluster\"\314\001\n\025CreateClusterMetadata\022P\n" +
      "\020original_request\030\001 \001(\01326.google.bigtabl" +
      "e.admin.cluster.v1.CreateClusterRequest\022" +
      "0\n\014request_time\030\002 \001(\0132\032.google.protobuf.",
      "Timestamp\022/\n\013finish_time\030\003 \001(\0132\032.google." +
      "protobuf.Timestamp\"\360\001\n\025UpdateClusterMeta" +
      "data\022C\n\020original_request\030\001 \001(\0132).google." +
      "bigtable.admin.cluster.v1.Cluster\0220\n\014req" +
      "uest_time\030\002 \001(\0132\032.google.protobuf.Timest" +
      "amp\022/\n\013cancel_time\030\003 \001(\0132\032.google.protob" +
      "uf.Timestamp\022/\n\013finish_time\030\004 \001(\0132\032.goog" +
      "le.protobuf.Timestamp\"$\n\024DeleteClusterRe" +
      "quest\022\014\n\004name\030\001 \001(\t\"&\n\026UndeleteClusterRe" +
      "quest\022\014\n\004name\030\001 \001(\t\"|\n\027UndeleteClusterMe",
      "tadata\0220\n\014request_time\030\001 \001(\0132\032.google.pr" +
      "otobuf.Timestamp\022/\n\013finish_time\030\002 \001(\0132\032." +
      "google.protobuf.TimestampBM\n$com.google." +
      "bigtable.admin.cluster.v1B#BigtableClust" +
      "erServiceMessagesProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.bigtable.admin.cluster.v1.BigtableClusterDataProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_bigtable_admin_cluster_v1_ListZonesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_bigtable_admin_cluster_v1_ListZonesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_ListZonesRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_bigtable_admin_cluster_v1_ListZonesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_bigtable_admin_cluster_v1_ListZonesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_ListZonesResponse_descriptor,
        new java.lang.String[] { "Zones", });
    internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_GetClusterRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_bigtable_admin_cluster_v1_ListClustersRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_bigtable_admin_cluster_v1_ListClustersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_ListClustersRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_bigtable_admin_cluster_v1_ListClustersResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_bigtable_admin_cluster_v1_ListClustersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_ListClustersResponse_descriptor,
        new java.lang.String[] { "Clusters", "FailedZones", });
    internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_CreateClusterRequest_descriptor,
        new java.lang.String[] { "Name", "ClusterId", "Cluster", });
    internal_static_google_bigtable_admin_cluster_v1_CreateClusterMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_bigtable_admin_cluster_v1_CreateClusterMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_CreateClusterMetadata_descriptor,
        new java.lang.String[] { "OriginalRequest", "RequestTime", "FinishTime", });
    internal_static_google_bigtable_admin_cluster_v1_UpdateClusterMetadata_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_bigtable_admin_cluster_v1_UpdateClusterMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_UpdateClusterMetadata_descriptor,
        new java.lang.String[] { "OriginalRequest", "RequestTime", "CancelTime", "FinishTime", });
    internal_static_google_bigtable_admin_cluster_v1_DeleteClusterRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_bigtable_admin_cluster_v1_DeleteClusterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_DeleteClusterRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_bigtable_admin_cluster_v1_UndeleteClusterMetadata_descriptor,
        new java.lang.String[] { "RequestTime", "FinishTime", });
    com.google.bigtable.admin.cluster.v1.BigtableClusterDataProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
