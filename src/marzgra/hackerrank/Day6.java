/*
TASK:
    Given a string S, of length N that is indexed from 0 to N - 1,
    print its even-indexed and odd-indexed characters
    as 2 space-separated string on a single line.

SAMPLE INPUT
    2 (number of cases)
    Hacker
    Rank

SAMPLE OUTPUT:
    Hce akr
    Rn ak
 */
package io.github.marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String odd = new String();
            String even = new String();

            String input = scan.nextLine();
            for (int j = 0; j < input.length(); j++) {
                if (j % 2 == 0) even += input.charAt(j);
                else odd += input.charAt(j);
            }
            System.out.println(even + " " + odd);
        }

    }
}
