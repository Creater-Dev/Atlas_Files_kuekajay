package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task02_JunitTest02 {

    String msg = "Hello Test02";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test(timeout = 1000)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage() of JunitTest02");
        assertEquals(msg, msgUtilobj.printMessage());
    }
}
