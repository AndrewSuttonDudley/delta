FROM eclipse-temurin:17-jdk-jammy
MAINTAINER crscreditapi.com
COPY build/libs/delta-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
