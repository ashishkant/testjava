package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for Main
 */
public class MainTest {
    
    @Test
    public void testGreet() {
        String result = Main.greet("World");
        assertEquals("Hello, World!", result);
    }
    
    @Test
    public void testGreetWithName() {
        String result = Main.greet("Alice");
        assertEquals("Hello, Alice!", result);
    }
}
