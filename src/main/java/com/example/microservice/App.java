package com.example.microservice;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        // Set port to 9000
        port(9000);

        // Define a simple GET endpoint
        get("/", (req, res) -> "Hello from Microservice App!");

        System.out.println("Microservice App is running on port 9000...");

        // Keep Spark server alive
        awaitInitialization();
    }

    // For testing
    public String greet() {
        return "Hello, DevOps Engineer!";
    }
}
