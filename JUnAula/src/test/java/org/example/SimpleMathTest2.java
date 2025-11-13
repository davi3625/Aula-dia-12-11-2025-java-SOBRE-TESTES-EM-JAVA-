package org.example;

import math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SimpleMathTest2 {

    @Test
    void testSum(){
    SimpleMath math = new SimpleMath();
    Double actual = math.sum(6.2,2.0);
    double expect = 8.2;

        assertEquals(expect, actual, () -> "The test not produce the expected value");
        //utilizou a função lambda caso ocorra falha no teste do codigo
        assertNotEquals(9.2, actual);
    }

}
