package io.github.marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

/*
TASK:
    save a line of input from stdin to a variable, print "Hello, World." on a single line,
    and finally print the value of your variable on a second line.

SAMPLE INPUT:
    Welcome to 30 Days of Code!

SAMPLE OUTPUT:
    Hello, World.
    Welcome to 30 Days of Code!
*/

public class Day0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello, World.\n" + inputString);
    }
}