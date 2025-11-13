package org.example;

import math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

    @Test
    void testSum(){
    SimpleMath math = new SimpleMath();
    Double actual = math.sum(6.2,2.0);
    double expect = 8.2;

        Assertions.assertEquals(expect, actual);
    }

}
