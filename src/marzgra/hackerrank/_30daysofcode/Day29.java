/*
TASK:
    Given set S = {1, 2, 3, ... , N}. Find two integers, A and B (where A < B),
    from set S such that the value of A&B is the maximum possible and also less than a given integer, K.
    In this case, & represents the bitwise AND operator.

SAMPLE INPUT:
    3
    5 2
    8 5
    2 2

SAMPLE OUTPUT:
    1
    4
    0
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (((k - 1) | k) > n && k % 2 == 0) {
                System.out.println(k - 2);
            } else {
                System.out.println(k - 1);
            }
        }
    }
}