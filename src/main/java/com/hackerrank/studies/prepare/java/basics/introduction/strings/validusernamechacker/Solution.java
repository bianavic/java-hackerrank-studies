package com.hackerrank.studies.prepare.java.basics.introduction.strings.validusernamechacker;

import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

/*

"^[a-zA-Z][a-zA-Z0-9_]{7,29}$"
1) ^[a-zA-Z]: The string must start with an alphabetic character (either lowercase or uppercase).
2) [a-zA-Z0-9_]{8,30}: This part allows for alphanumeric characters and underscores. {7,29} specifies (and ensures) that the length of this part should be between 8 and 30 characters (inclusive).
3) $: Indicates the end of the string.

*/

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

