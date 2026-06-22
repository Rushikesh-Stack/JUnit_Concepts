package com.ansol.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void divide()
    {
        Calc c=new Calc();
        int actualValue=c.divide(10,5);
        int expectedResult=2;
        assertEquals(expectedResult,actualValue);
//        System.out.println();
    }
}