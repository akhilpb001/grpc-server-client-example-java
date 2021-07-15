#!/usr/bin/env sh

protoc --proto_path=./src/main/proto --java_out=./src/main/java addressbook.proto
