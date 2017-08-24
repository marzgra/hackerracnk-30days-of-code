/*
TASK:
    Read a string, S, and print its integer value;
    if S cannot be converted to an integer, print "Bad String".

 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}