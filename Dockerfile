# Build stage
FROM gradle:7.3.0-jdk17-alpine AS builder
COPY . /BDA
WORKDIR /BDA

RUN gradle clean build

# Package stage
FROM openjdk:17-slim

WORKDIR /BDA
COPY --from=builder /BDA/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
