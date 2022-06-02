# Build
# Get maven image
FROM maven:3.8.5-openjdk-18 AS build

# Create working dir
RUN mkdir /docker
WORKDIR /docker

# Copy pom and resolve dependancies
COPY    pom.xml .
RUN     mvn dependency:resolve
# Copy source folder
COPY    src src

# Verify build
RUN     mvn clean verify

# Create
# Get jdk image
FROM openjdk:18-jdk

RUN mkdir /docker
WORKDIR /docker

# Copy jar from maven build
COPY    --from=build /docker/target/seng4400-a2-endpoint-1.jar seng4400-a2-endpoint-1.jar
# Expose port
EXPOSE ${PORT}
# Set entrypoint
ENTRYPOINT ["java","-jar","/docker/seng4400-a2-endpoint-1.jar"]