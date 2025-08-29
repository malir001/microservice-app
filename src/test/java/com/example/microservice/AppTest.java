package com.example.microservice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();  // refers to com.example.microservice.App
        String expected = "Hello, DevOps Engineer!";
        assertEquals(expected, app.greet());
    }
}
