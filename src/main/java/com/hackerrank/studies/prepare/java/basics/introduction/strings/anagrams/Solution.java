package com.hackerrank.studies.prepare.java.basics.introduction.strings.anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        char aString[] = a.toLowerCase().toCharArray();
        char bString[] = b.toLowerCase().toCharArray();

        boolean returnValue;

        if (aString != null && bString != null) {
            java.util.Arrays.sort(aString);
            java.util.Arrays.sort(bString);

            returnValue = java.util.Arrays.equals(aString, bString);
            return returnValue;
        } else {
            return returnValue = false;
        }

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}