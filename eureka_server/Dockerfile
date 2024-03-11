# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 as build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Setup the runtime environment
FROM openjdk:17-ea-3-jdk-oracle
COPY --from=build /app/target/intuit-*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

