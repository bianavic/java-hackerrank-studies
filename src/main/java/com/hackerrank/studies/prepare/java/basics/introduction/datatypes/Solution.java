package com.hackerrank.studies.prepare.java.basics.introduction.datatypes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        String input = sc.nextLine();

        System.out.printf("%d %s%n",lineNumber,input);


        while (sc.hasNextLine() && (input = sc.nextLine()) != null) {
            lineNumber++;
            System.out.printf("%d %s%n",lineNumber,input);
        }
        sc.close();

    }

}
