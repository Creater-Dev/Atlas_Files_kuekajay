package com.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerTest {
    public static void main(String[] args) {
        Result resobj = JUnitCore.runClasses(
                AllTestSuiteDemoTest.class);
        for (Failure fobj : resobj.getFailures()) {
            System.out.println(fobj.toString());
        }
        System.out.println(resobj.wasSuccessful());
    }
}
