package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @Test
    void calculateSum_ThreeMemberArray() {
//        fail("not yet implemented");
        // Absence of failure is success
        // Test Conditions or Assert
        assertEquals(6, new MyMath().calculateSum(new int[]{1,2,3}));
    }

    // {} => 0
    @Test
    void  calculateSum_ZeroLenghtArray(){
        assertEquals(0, new MyMath().calculateSum(new int[]{}));
    }

}
