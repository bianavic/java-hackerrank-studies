package com.hackerrank.studies.prepare.java.basics.introduction.currencyformatter;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        // US
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // China
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
