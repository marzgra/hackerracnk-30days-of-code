/*
TASK:
    Write Student class which extends Person class.
    Write a constructor which has 4 parameters ( firstName, lastName, id, scores ).
    Write a char calculate() method which calculate a Student object's average
    and returns the grade character representative of their calculated average.

SAMPLE INPUT:
    Heraldo Memelli 8135627
    2
    100 80

SAMPLE OUTPUT:
    Name: Memelli, Heraldo
    ID: 8135627
    Grade: O
 */
package marzgra.hackerrank._30daysofcode.day12;

class Student extends Person {
    private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate() {
        int sum = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            sum += this.testScores[i];
        }
        int avg = sum / this.testScores.length;
        if (avg >= 90) return 'O';
        else if (avg >= 80 && avg < 90) return 'E';
        else if (avg >= 70 && avg < 80) return 'A';
        else if (avg >= 55 && avg < 70) return 'P';
        else if (avg >= 40 && avg < 55) return 'D';
        else return 'T';
    }
}