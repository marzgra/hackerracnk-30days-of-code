package marzgra.hackerrank._30daysofcode.day17;

class Calculator {
    int power(double n, double p) throws Exception {
        if (p < 0 || n < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return (int) Math.pow(n, p);
        }
    }
}
