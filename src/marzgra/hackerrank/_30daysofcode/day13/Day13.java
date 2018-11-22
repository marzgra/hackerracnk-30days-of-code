/*
TASK:
    Given a Book class and a Solution class, write a MyBook class that does the following:
        * Inherits from Book
        * Has a parameterized constructor taking these 3 parameters:
            - string title
            - string author
            - int price
        * Implements the Book class' abstract display() method so it prints these 3 lines:
            - Title:, a space, and then the current instance's title.
            - Author:, a space, and then the current instance's author.
            - Price:, a space, and then the current instance's price.

SAMPLE INPUT:
    The Alchemist
    Paulo Coelho
    248

SAMPLE OUTPUT:
    Title: The Alchemist
    Author: Paulo Coelho
    Price: 248
 */
package marzgra.hackerrank._30daysofcode.day13;

import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }

    abstract class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        abstract void display();
    }

    class MyBook extends Book {
        int price;

        /**
         * Class Constructor
         *
         * @param title  The book's title.
         * @param author The book's author.
         * @param price  The book's price.
         **/
        // Write your constructor here
        MyBook(String title, String author, int price) {
            super(title, author);
            this.price = price;
        }

        /**
         * Method Name: display
         * Print the title, author, and price in the specified format.
         **/
        // Write your method here
        void display() {
            System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price);
        }

// End class
    }
}