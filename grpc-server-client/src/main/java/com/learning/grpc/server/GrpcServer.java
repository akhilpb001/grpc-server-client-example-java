package com.learning.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class GrpcServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    Server server = ServerBuilder
        .forPort(8080)
        .addService(new HelloServiceImpl()).build();

    server.start();
    System.out.println("[INFO] gRPC server started, listening on port 8080...");
    server.awaitTermination();
  }
}
