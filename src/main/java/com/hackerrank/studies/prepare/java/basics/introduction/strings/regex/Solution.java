package com.hackerrank.studies.prepare.java.basics.introduction.strings.regex;

import java.util.Scanner;

class Solution {

    /*
    matcher -> used to search the pattern
    pattern -> to be used in search
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

//Write your code here

/*
PATTERN:
    IP address is a string in the form "A.B.C.D",
    where the value of A, B, C, and D may range from 0 to 255.
    Leading zeros are allowed.
    The length of A, B, C, or D can't be greater than 3.

REGEX: "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"
    The | (pipe) character is used as an OR operator, and the parentheses are used for grouping
    0-9-->              // [0-9] A single digit, any value range from 0 to 9
    09-99 -->           // [0-9][0-9] Two digits, leading zero is allowed
    100 - 199           // (0|1)[0-9][0-9]: Numbers in the range 100 to 199.
    099-199 -->         // (0|1)[0-9][0-9] ex: (0|1) choose either 0 or 1
    200-249-->          // 2 [0-4][0-9] Numbers in the range 200 to 249
    250-254 -->         // 25 [0-4] Numbers in the range 250 to 255.
    ([0-9]|...|25[0-5]): This part captures a number from 0 to 255.
 */

class MyRegex {
    String value = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = value + "." + value + "." + value + "." + value;
}