package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task02_JunitTest03 {

    @Test
    public void testStringLength() {
        String str = "JUnit";
        System.out.println("Inside testStringLength() of JunitTest03");
        assertEquals(5, str.length());
    }
}
