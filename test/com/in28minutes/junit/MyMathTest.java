package com.in28minutes.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @Test
    void test() {
//        fail("not yet implemented");
        // Absence of failure is success
        // Test Conditions or Assert
        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int result = math.calculateSum(numbers);
        System.out.println(result);

        int expectedResult = 5;
        assertEquals(expectedResult, result);
    }

}
