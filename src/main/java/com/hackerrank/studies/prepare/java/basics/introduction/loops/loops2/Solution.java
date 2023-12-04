package com.hackerrank.studies.prepare.java.basics.introduction.loops.loops2;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] series = new int[n];
            int result = a;
            series[0] = result;

            for (int j = 0; j < n; j++) {
                result += (int) Math.pow(2, j) * b;
                series[j] = result;
            }
            System.out.println(Arrays.toString(series).replace("[", "").replace("]", "").replace(",", ""));
        }
        in.close();

    }

}
