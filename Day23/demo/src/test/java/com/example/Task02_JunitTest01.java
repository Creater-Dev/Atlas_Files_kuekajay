package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task02_JunitTest01 {

    String msg = "running test01 ";
    MessageUtil msgUtilobj = new MessageUtil(msg);

    @Test(timeout = 1000)
    public void msgTest() {
        System.out.println("Inside msgTest() of JunitTest01");
        assertEquals(msg, msgUtilobj.printMessage());
    }
}
