package com.hackerrank.studies.prepare.java.basics.introduction.strings.reverse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        if (isPalindrome(A) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    static boolean isPalindrome(String s) {
        String reverse = "";
        boolean answer = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        if (s.equals(reverse)) {
            answer = true;
        }
        return answer;
    }

}