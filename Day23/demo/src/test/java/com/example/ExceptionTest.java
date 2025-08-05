package com.example;

import org.junit.Test;

public class ExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        System.out.println(10 / 0); // This will throw ArithmeticException
    }
}
