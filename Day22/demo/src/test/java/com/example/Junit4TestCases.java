package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Junit4TestCases {

    @Test
    public void testCompareGreater() {
        Junit4Test obj = new Junit4Test();
        int result = obj.compare(20, 10);
        Assertions.assertEquals(1, result); // 20 > 10 → should return 1
    }

    @Test
    public void testCompareLesser() {
        Junit4Test obj = new Junit4Test();
        int result = obj.compare(5, 10);
        Assertions.assertEquals(-1, result); // 5 < 10 → should return -1
    }

    @Test
    public void testCompareEqual() {
        Junit4Test obj = new Junit4Test();
        int result = obj.compare(10, 10);
        Assertions.assertEquals(-1, result); // 10 == 10 → by your logic returns -1
    }
}
