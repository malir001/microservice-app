# Base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy fat jar
COPY target/microservice-app-1.0.0.jar app.jar

# Expose port 9000
EXPOSE 9000

# Run jar (Main-Class will be read from manifest)
ENTRYPOINT ["java","-jar","app.jar"]
