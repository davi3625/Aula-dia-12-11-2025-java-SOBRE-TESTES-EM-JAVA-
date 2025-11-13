package org.example;

import math.SimpleMath;
import org.junit.jupiter.api.*;

import static junit.framework.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BeforeAllTest {

    @BeforeAll
    static void BeforeAll(){
        System.out.println("Running BeforeAll!");
    }

    @AfterAll
    static void AfterAll(){
        System.out.println("Running AfterAll!");
    }

    @BeforeEach
     void BeforeEach(){
        System.out.println("Running AfterAll!");
    }

    @AfterEach
     void AfterEach(){
        System.out.println("Running AfterAll!");
    }

    @Test
    @DisplayName("Test 6.2 + 2.0 = 8.2")
    void testSum_When_SixDoTwoAddedByTwo_ShouldReturnEightDoTwo(){
        //test[System under test]_[Condition or Stage Change]_[Expected Result]
    SimpleMath math = new SimpleMath();
    Double actual = math.sum(6.2,2.0);
    double expect = 8.2;

        assertEquals(expect, actual, () -> "The test not produce the expected value");
        //utilizou a função lambda caso ocorra falha no teste do codigo
        assertNotEquals(9.2, actual);
    }


    @Test
    @DisplayName("Test 6.2 - 2.0 = 4.2")
    void testSub_When_SixDoTwoMenusdTwo_ShouldReturnForPointTwo(){
        //test[System under test]_[Condition or Stage Change]_[Expected Result]
        SimpleMath math = new SimpleMath();
        Double actual = math.sub(6.2,2.0);
        double expect = 4.2;
        System.out.println(" soma ");

        assertEquals(expect, actual, () -> "The test not produce the expected value");
        //utilizou a função lambda caso ocorra falha no teste do codigo
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
        System.out.println(" Subtração");
    }

}
