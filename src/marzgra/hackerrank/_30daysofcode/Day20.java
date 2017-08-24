/*
TASK:
    Given an array, a, of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm
    above. Once sorted, print the following 3 lines:
        1. Array is sorted in numSwaps swaps, where numSwaps is the number of swaps that took place.
        2. First Element: firstElement, where firstElement is the first element in the sorted array.
        3. Last Element: lastElement, where lastElement is the last element in the sorted array.

SAMPLE INPUT:
    3
    1 2 3
SAMPLE OUTPUT:
    Array is sorted in 0 swaps.
    First Element: 1
    Last Element: 3
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}
