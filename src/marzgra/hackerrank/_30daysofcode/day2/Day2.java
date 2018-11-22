/*
TASK:
    Given the meal price (base cost of a meal),
    tip percent (the percentage of the meal price being added as tip),
    and tax percent (the percentage of the meal price being added as tax) for a meal,
    find and print the meal's total cost.

SAMPLE INPUT:
    12.00
    20
    8

SAMPLE OUTPUT:
    The total meal cost is 15 dollars.
 */
package marzgra.hackerrank._30daysofcode;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();    // original meal price
        int tipPercent = scan.nextInt();        // tip percentage
        int taxPercent = scan.nextInt();        // tax percentage
        scan.close();

        double tipCost = mealCost * tipPercent / 100;
        double taxCost = mealCost * taxPercent / 100;
        double total = mealCost + tipCost + taxCost;

        int totalCost = (int) Math.round(total);

        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}