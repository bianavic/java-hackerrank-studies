package com.hackerrank.studies.prepare.java.basics.introduction.strings.introduction;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String sum = A + B;
        System.out.println(sum.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s1 = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String s2 = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();
        System.out.println(s1 + " " + s2);
    }

}
