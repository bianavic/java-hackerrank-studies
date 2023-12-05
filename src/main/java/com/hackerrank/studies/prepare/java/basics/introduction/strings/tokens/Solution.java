package com.hackerrank.studies.prepare.java.basics.introduction.strings.tokens;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        if (s.trim().length() == 0 || s.trim().length() >= 400000) {
            System.out.println(0);
            return;
        }

        String regex = "[ !,?._'@]+";
        String[] splitted = s.trim().split(regex);

        System.out.println(splitted.length);

        for (String str : splitted) {
            System.out.println(str);
        }

        scan.close();
    }

}