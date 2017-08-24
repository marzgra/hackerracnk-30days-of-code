/*
TASK:
    Given an integer, n, perform the following conditional actions:
        * If n is odd, print Weird
        * If n is even and in the inclusive range of 2 to 5, print Not Weird
        * If n is even and in the inclusive range of 6 to 20, print Weird
        * If n is even and greater than 20, print Not Weird

SAMPLE INPUT:
    3
SAMPLE OUTPUT:
    Weird
SAMPLE INPUT:
    24
SAMPLE OUTPUT:
    Not Weird

 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        System.out.println(((n % 2 == 1) || (n >= 6 && n <= 20)) ? "Weird" : "Not Weird");
    }
}
