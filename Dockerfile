FROM openjdk:17-jdk-slim

EXPOSE 8090

COPY target/stock-ms.jar stock-ms.jar

ENTRYPOINT ["java", "-jar", "stock-ms.jar"]
