package com.hackerrank.studies.prepare.java.basics;

public class FizzBuzz {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    for ( int i = 1; i <= 100; i++) {
      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0) {
        System.out.println("Fizz");
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }

  }
}

/**
 * my output atencao ao inicio do for ==>>> int = 1
 * Your Output (stdout)
 * 1
 * 2
 * Fizz
 * 4
 * Buzz
 * Fizz
 * 7
 * 8
 * Fizz
 * Buzz
 * 11
 * Fizz
 * 13
 * 14
 * FizzBuzz
 * 16
 * 17
 * Fizz
 * 19
 * Buzz
 * Fizz
 * 22
 * 23
 * Fizz
 * Buzz
 * 26
 * Fizz
 * 28
 * 29
 * FizzBuzz
 * 31
 * 32
 * Fizz
 * 34
 * Buzz
 * Fizz
 * 37
 * 38
 * Fizz
 * Buzz
 * 41
 * Fizz
 * 43
 * 44
 * FizzBuzz
 *
 *
 *
 */
