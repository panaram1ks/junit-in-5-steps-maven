package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {

    List<String> todos = Arrays.asList("AWS","Azure","DevOps");

    @Test
    void test(){
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("GCP");

        assertTrue(test, "wrong reason");
        assertFalse(test2);
        assertNull(null);
        assertNotNull(test);
        assertArrayEquals(new int[]{1,2}, new int[] {1,2});

        assertEquals(3, todos.size(), "reason of mistake");
    }
}
