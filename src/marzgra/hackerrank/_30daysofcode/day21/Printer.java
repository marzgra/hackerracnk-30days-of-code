/*
TASK:
    Write a single generic function named printArray;
    this function must take an array of generic elements as a parameter.
    The  Solution class tests your function.
 */
package marzgra.hackerrank._30daysofcode.day21;

class Printer<T> {
    /**
     * Method Name: printArray Print each element of the generic array on a new line. Do not return anything.
     *
     * @param array generic array
     **/
    void printArray(T array[]) {
        for (T anArray : array) {
            System.out.println(anArray);
        }
    }
}