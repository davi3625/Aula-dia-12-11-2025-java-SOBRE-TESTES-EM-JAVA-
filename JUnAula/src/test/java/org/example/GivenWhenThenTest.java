package org.example;

import math.SimpleMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GivenWhenThenTest {

    @Test
    void testSum(){
        //Given / Arrange
    SimpleMath math = new SimpleMath();
    double firstNumber = 6.2;
    double secondNUmber = 2.0;
    double expect = 8.2;

    //When / Act
        Double actual =  math.sum(firstNumber, secondNUmber);

        //Then / Assert

        assertEquals(expect, actual, () -> "The test not produce the expected value");
        //utilizou a função lambda caso ocorra falha no teste do codigo
        assertNotEquals(9.2, actual);
    }



}
