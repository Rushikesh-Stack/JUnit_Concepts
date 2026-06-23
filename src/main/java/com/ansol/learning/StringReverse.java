package com.ansol.learning;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

    }

    public String strRev(String str) {
//        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter a string:");
//        String str=sc.nextLine();

        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }
//        System.out.println(s);
        return s;
    }

}
