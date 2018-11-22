/*
TASK:
    Given a base-10 integer, n, convert it to binary (base-2).
    Then find and print the base-10 integer denoting the maximum number of consecutive 's
    in 's binary representation.
SAMPLE INPUT:
    13
SAMPLE OUTPUT:
    2
EXPLANATION:
    13 (base-10) = 1101 (base-2)
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day10 {

    private static int maxOnesInBinary(int n) {
        int count = 0;
        int max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                ++count;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
            n /= 2;
        }
        return Math.max(max, count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(maxOnesInBinary(n));
    }
}
