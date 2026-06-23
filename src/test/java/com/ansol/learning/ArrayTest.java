package com.ansol.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest
{
    @Test
    void TC1()
    {
        int actual[]={10,20,30,40};
        int expected[]={10,20,30,40};
        assertArrayEquals(expected,actual);

    }
    @Test
    void TC2()
    {
        int actual[]={10,20,30,40};
        int expected[]={10,20,50,40};
        assertArrayEquals(expected,actual);

    }

    @Test
    void TC3()
    {
        int actual[]={10,20,30,40};
        int expected[]={10,20,40};
        assertArrayEquals(expected,actual);

    }
    @Test
    void TC4()
    {
        int actual[]={10,20,30,40};
        int expected[]={10,30,20,40};
        assertArrayEquals(expected,actual);
    }




}
