package io.github.marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

/*
TASK:
    Declare  variables: one of type int, one of type double, and one of type String.
    Read  lines of input from stdin and initialize your  variables.
    Use the  operator to perform the following operations:
        1. Print the sum of  plus your int variable on a new line.
        2. Print the sum of  plus your double variable to a scale of one decimal place on a new line.
        3. Concatenate  with the string you read as input and print the result on a new line.

SAMPLE INPUT:
    12
    4.0
    is the best place to learn and practice coding!

SAMPLE OUTPUT:
    16
    8.0
    HackerRank is the best place to learn and practice coding!

 */

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int myInt;
        double myDouble;
        String myString;

        myInt = scan.nextInt();
        myDouble = scan.nextDouble();
        scan.nextLine();
        myString = scan.nextLine();

        System.out.println(i + myInt);
        System.out.println(d + myDouble);
        System.out.println(s + myString);

        scan.close();
    }
}

