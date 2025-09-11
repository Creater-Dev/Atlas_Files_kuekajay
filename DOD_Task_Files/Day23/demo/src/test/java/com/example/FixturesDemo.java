package com.example;

import junit.framework.TestCase;

public class FixturesDemo extends TestCase {
    protected int num1, num2;

    protected void setUp() {
        num1 = 100;
        num2 = 200;
    }

    public void testMultiply() {
        int res = num1 * num2;
        System.out.println("This is FixturesDemo: ");
        assertTrue(res == 20000);
    }
}
