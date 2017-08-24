/*
TASK:
    Complete the Difference class by writing the following:
        * A class constructor that takes an array of integers as a parameter
          and saves it to the elements instance variable.
        * A computeDifference method that finds the maximum absolute difference
          between any 2 numbers in N and stores it in the maximumDifference instance variable.

 SAMPLE INPUT:
    3
    1 2 5

 SAMPLE OUTPUT:
    4
 */
package marzgra.hackerrank._30daysofcode.day14;

import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}