package org.example;

import math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class DivisionByZero {


    SimpleMath math;

    @BeforeEach
    void beforeEachMethod(){
        math = new SimpleMath();

    }
    @Test
    @DisplayName("")
        void testAnyNumber_When_DivisionByZero_ShouldReturnException(){
        //Given
        double firstnum = 8.4;
        double secondNum = 0.0;
        String expectedMessage = "Impossible to divide by zero";


        //When
        math.division(firstnum, secondNum);

        //Then
        ArithmeticException actual = Assertions.assertThrows(
                ArithmeticException.class,
                () -> math.division(firstnum, secondNum),
                () -> "Unexpected exception message");

    }
}
