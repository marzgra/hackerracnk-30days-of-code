package marzgra.hackerrank._30daysofcode.day14;

import java.util.Arrays;

class Difference {
    public int maximumDifference;
    private int[] elements;

    Difference(int[] arr) {
        this.elements = arr;
        this.maximumDifference = 0;
    }

    void computeDifference() {
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
}
