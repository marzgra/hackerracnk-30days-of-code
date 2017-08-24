/*
TASK:
    A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
    Given a number, n, determine and print whether it's Prime or Not prime.
    Note: If possible, try to come up with a O(sqrt(n)) primality algorithm, or see what sort of optimizations you
    come up with for an O(n) algorithm.
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tab[] = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scan.nextInt();
            isPrime(tab[i]);
            if (isPrime(tab[i])) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2) return true;
        if (num % 2 == 0 || num == 1 || num == 0) return false;

        double temp = Math.sqrt(num);
        for (int i = 3; i <= temp; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}