package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

@Ignore("This Test is Ignored temporarily ")
public class Task01_TestJunit {

    @Test
    public void testSubtract() {
        int num1 = 10;
        int num2 = 5;
        int res = num1 - num2;
        assertEquals(4, res);
        System.out.println("This is Task01_Testunit");

    }
}
