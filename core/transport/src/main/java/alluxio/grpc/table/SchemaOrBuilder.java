// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface SchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.Schema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .alluxio.grpc.table.FieldSchema cols = 1;</code>
   */
  java.util.List<alluxio.grpc.table.FieldSchema> 
      getColsList();
  /**
   * <code>repeated .alluxio.grpc.table.FieldSchema cols = 1;</code>
   */
  alluxio.grpc.table.FieldSchema getCols(int index);
  /**
   * <code>repeated .alluxio.grpc.table.FieldSchema cols = 1;</code>
   */
  int getColsCount();
  /**
   * <code>repeated .alluxio.grpc.table.FieldSchema cols = 1;</code>
   */
  java.util.List<? extends alluxio.grpc.table.FieldSchemaOrBuilder> 
      getColsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.table.FieldSchema cols = 1;</code>
   */
  alluxio.grpc.table.FieldSchemaOrBuilder getColsOrBuilder(
      int index);
}
