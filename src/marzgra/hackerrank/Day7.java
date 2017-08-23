/*
TASK:
    Given an array, A, of integers, print A's elements in reverse order
    as a single line of space separated numbers.
SIMPLE INPUT:
    4
    1 4 3 2
SAMPLE OUTPUT
    2 3 4 1
 */

package io.github.marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = n-1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
