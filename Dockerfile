FROM openjdk:8-jdk-alpine
EXPOSE 8081
WORKDIR /app
COPY target/payment-gateway-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "payment-gateway-0.0.1-SNAPSHOT.jar" ]
