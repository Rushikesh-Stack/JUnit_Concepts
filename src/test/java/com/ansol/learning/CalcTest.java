package com.ansol.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc c=new Calc();
    @Test
    void divideTest()
    {

        int actualValue=c.divide(10,5);
        int expectedResult=2;
        assertEquals(expectedResult,actualValue);
//        System.out.println();
    }

    @Test
    void divideTest2()
    {
        assertNotEquals(5 , c.divide(10,5),"Test Cases Failed");
    }
}