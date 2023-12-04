package com.hackerrank.studies.prepare.java.basics.introduction.loops.loops1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.stream.Collectors.joining;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int i;
        i = 1;

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        while (i <= 10) {
            System.out.print(N);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.print(N * i);
            System.out.println();
            i++;
        }
    }

}
