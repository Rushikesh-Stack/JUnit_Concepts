package com.ansol.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest
{
    @Test
    public void test1()
    {
       StringReverse str=new StringReverse();
       String actualResult=str.strRev("Rushi");
       String expeactedResult="ihsuR";

       assertEquals(expeactedResult,actualResult,"String reversal did not produce the expected output");
        System.out.println("Status: TC1 Success");
    }

    @Test
    public void Test2()
    {
        StringReverse str = new StringReverse();
        assertEquals("olleH", str.strRev("Hello"),"String reversal did not produce the expected output");
        System.out.println("Status: TC2 Success");

    }

    @Test
    public void Test3()
    {
       StringReverse str=new StringReverse();
       assertEquals("avaJ",str.strRev("Java"),"String reversal did not produce the expected output");
        System.out.println("Status: TC3 Success");


    }
}