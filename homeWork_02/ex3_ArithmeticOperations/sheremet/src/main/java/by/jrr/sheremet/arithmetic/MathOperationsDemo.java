package main.java.by.jrr.sheremet.arithmetic;

public class MathOperationsDemo implements Arithmetic {

    @Override
    public double divide(int a, int b) {
        return (double) a / (double) b;
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
