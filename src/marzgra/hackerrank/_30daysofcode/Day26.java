/*
TASK:
    Your local library needs your help! Given the expected and actual return dates for a library book,
    create a program that calculates the fine (if any). The fee structure is as follows:

    1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: file = 0)
    2. If the book is returned after the expected return day but still within the same calendar month and year as the
    expected return date, fine = 15 Hackos x(the number of days late).
    3. If the book is returned after the expected return month but still within the same calendar year as the expected
    return date, the fine = 500 Hackos x(the number of months late).
    4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();
        scanner.nextLine();
        int dayExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();
        int fine;

        if (yearExpected >= yearReturned) {
            if (monthExpected >= monthReturned) {
                if (dayExpected >= dayReturned) {
                    fine = 0;
                } else fine = 15 * (dayReturned - dayExpected);
            } else fine = 500 * (monthReturned - monthExpected);
        } else fine = 10000;
        if (yearReturned < yearExpected) fine = 0;
        System.out.println(fine);
    }
}