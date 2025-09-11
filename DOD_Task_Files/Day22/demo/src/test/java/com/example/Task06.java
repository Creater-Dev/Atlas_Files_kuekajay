package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Task06 {
 String message = "hello all How are you";
   @Test
   public void testMsg() {
       System.out.println("asserting the Test case ");
   	assertEquals("hello all How are you", message);
   }
}
