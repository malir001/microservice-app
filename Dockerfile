# Use a lightweight OpenJDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the fat/shaded JAR file into the container
COPY target/microservice-app-1.0.0.jar app.jar

# Expose the application port
EXPOSE 9000

# Run the JAR file using main class
ENTRYPOINT ["java", "-cp", "app.jar", "com.growingflowers.app.App"]
