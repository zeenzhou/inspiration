// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface GetServerSocketsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.GetServerSocketsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  java.util.List<io.grpc.channelz.v1.SocketRef> 
      getSocketRefList();
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  io.grpc.channelz.v1.SocketRef getSocketRef(int index);
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  int getSocketRefCount();
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  java.util.List<? extends io.grpc.channelz.v1.SocketRefOrBuilder> 
      getSocketRefOrBuilderList();
  /**
   * <pre>
   * list of socket refs that the connection detail service knows about.  Sorted in
   * ascending socket_id order.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef socket_ref = 1;</code>
   */
  io.grpc.channelz.v1.SocketRefOrBuilder getSocketRefOrBuilder(
      int index);

  /**
   * <pre>
   * If set, indicates that the list of sockets is the final list.  Requesting
   * more sockets will only return more if they are created after this RPC
   * completes.
   * </pre>
   *
   * <code>bool end = 2;</code>
   */
  boolean getEnd();
}
