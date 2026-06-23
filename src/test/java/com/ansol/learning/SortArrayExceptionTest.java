package com.ansol.learning;

import org.junit.jupiter.api.Test;

public class SortArrayTest
{
    SortingArraay sc=new SortingArraay();
     @Test
      void TC1()
     {
         int Unsorted[]={12,2,3,4,4,67,8,9};
         int[] sortedArray=sc.sortArray(Unsorted);

         for(int i: sortedArray)
         {
             System.out.println(i);
         }

     }
             
}
