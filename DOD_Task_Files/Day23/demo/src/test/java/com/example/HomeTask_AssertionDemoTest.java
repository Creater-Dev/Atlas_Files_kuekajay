package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class HomeTask_AssertionDemoTest {

    @Test
    public void testAssertSame() {
        String str1 = "Hello";
        String str2 = str1; // Same reference
        assertSame("Both should refer to the same object", str2, str1);
    }

    @Test
    public void testAssertNotSame() {
        String str1 = new String("Hello");
        String str2 = new String("Hello"); // Different objects, even if content is same
        assertNotSame("Both should NOT refer to the same object", str1, str2);
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expected = { 1, 2, 3 };
        int[] actual = { 1, 2, 3 };
        assertArrayEquals("Arrays Are Equal", expected, actual);
    }

}
