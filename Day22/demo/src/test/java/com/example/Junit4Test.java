package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Junit4Test {

    public int compare(int i, int j) {
       if (i > j) return 1;
        return -1;
    }

    @Test
    public void testCompare() {
        Junit4Test junit4Test = new Junit4Test();
        assertEquals(1, junit4Test.compare(5, 3));
        assertEquals(-1, junit4Test.compare(2, 4));
    }
}
