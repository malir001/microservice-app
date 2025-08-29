package com.growingflowers.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        App app = new App();
        String expected = "Hello, DevOps Engineer!";
        assertEquals(expected, app.greet());
    }
}
