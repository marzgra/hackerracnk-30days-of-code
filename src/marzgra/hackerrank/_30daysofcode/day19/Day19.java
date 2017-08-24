/*
TASK:
    Write the Calculator class, which implements the AdvancedArithmetic interface.
    The implementation for the divisorSum method must be public and take an integer parameter, n,
    and return the sum of all its divisors.
 */
package marzgra.hackerrank._30daysofcode.day19;

import java.util.Scanner;

class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println(sum);
    }
}