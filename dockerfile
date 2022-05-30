# Package
FROM maven:3-openjdk-18 AS build
RUN mkdir /docker
WORKDIR /docker
COPY    pom.xml .
RUN     mvn dependency:resolve

COPY    src .
RUN     mvn clean package

# Create
FROM openjdk:18-jdk
COPY --from=build /docker/target/seng4400-a2-endpoint-1.jar /docker/seng4400-a2-endpoint-1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/docker/seng4400-a2-endpoint-1.jar"]