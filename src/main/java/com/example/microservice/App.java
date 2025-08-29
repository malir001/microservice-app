package com.example.microservice;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello from Microservice App!");

        // Keep the container running for testing
        while (true) {
            Thread.sleep(1000);
        }
    }

    public String greet() {
        return "Hello, DevOps Engineer!";
    }
}
