package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
class TestCase02 {
    @Test
    @Tags({@Tag("firstPriority")})
    void testMethod01() {

    }
    
    @Test
    @Tag("firstPriority")
    void runTestcase02() {

    } 
    @Tag("fastTag")
    void testMethod03() {

    }
    
    @Test
    @Tag("slowTag")
    void runTestcase04() {

    }    
}
