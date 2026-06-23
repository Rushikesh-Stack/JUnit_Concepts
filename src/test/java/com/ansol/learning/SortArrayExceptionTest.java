package com.ansol.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class SortArrayExceptionTest {
    SortingArraay sc = new SortingArraay();

    @Test
    void TC1() {
        int Unsorted[] = {12, 2, 3, 4, 4, 67, 8, 9};
        int[] sortedArray = sc.sortArray(Unsorted);

        for (int i : sortedArray) {
            System.out.println(i);
        }

    }

    @Test
    void TC2() {
//        try {
//
//            int Unsorted[] = null;
//            int[] sortedArray = sc.sortArray(Unsorted);
//
//            for (int i : sortedArray) {
//                System.out.println(i);
//            }
//            System.out.println("Code Executed Successfully......");
//            fail();
//        } catch (NullPointerException e) {
//            System.out.println("Exception Generated");
//
//        }

        int unsorted[]=null;
        assertThrows(NullPointerException.class,()-> sc.sortArray(unsorted));


    }

}
