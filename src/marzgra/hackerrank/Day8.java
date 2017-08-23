/*
TASK:
    Given n names and phone numbers, assemble a phone book that maps friends'
    names to their respective phone numbers.
    You will then be given an unknown number of names to query your phone book for.
    For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
    if an entry for name is not found, print Not found instead.
SAMPLE INPUT:
    3
    sam 99912222
    tom 11122222
    harry 12299933
    sam
    edward
    harry
SAMPLE OUTPUT:
    sam=99912222
    Not found
    harry=12299933
 */
package io.github.marzgra.hackerrank._30daysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    private static Scanner in = new Scanner(System.in);
    private static void getNumberOfAPerson(Map myMap){
        String s = in.next();
        System.out.println(myMap.containsKey(s) ? s + "=" + myMap.get(s) : "Not found");
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            myMap.put(name, phone);
        }
        while (in.hasNext()) {
            getNumberOfAPerson(myMap);
        }
        in.close();
    }
}
