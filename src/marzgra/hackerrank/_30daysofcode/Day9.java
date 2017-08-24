/*
TASK
    Write a factorial function that takes a positive integer, n as parameter
    and prints the result of n!
SAMPLE INPUT
    3
SAMPLE OUTPUT
    6
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day9 {
    private static int factorial(int n) {
        int result = 1;
        if (n <= 1) return result;
        else {
            for (int i = n; i >= 1; i--) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print(factorial(number));
    }
}
