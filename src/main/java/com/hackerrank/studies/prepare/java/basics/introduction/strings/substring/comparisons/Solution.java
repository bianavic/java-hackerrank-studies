package com.hackerrank.studies.prepare.java.basics.introduction.strings.substring.comparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        ;
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        // smallest = s.substring(0, k);
        // largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String subString = s.substring(i, i + k);

            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }

            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
