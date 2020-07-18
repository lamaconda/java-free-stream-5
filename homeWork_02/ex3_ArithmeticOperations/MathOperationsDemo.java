package jrr.by.Petranovski;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Демонстрация арифметических операций сложения, вычетания, деления, умножения.");
        MathOperationsDemo arith = new MathOperationsDemo();
        arith.sum(2, 3);
        arith.subtraction(5, 1);
        arith.division(6, 3);
        arith.multiplication(28, 10);
    }
    public double sum(double a, double b) {
        System.out.println("Сумма чисел а и b = " + (a + b));
        return a + b;
    }
    public double subtraction(double a, double b) {
        System.out.println("Разность чисел a и b = " + (a - b));
        return a - b;
    }
    public double division(double a, double b) {
        System.out.println("Результат деления чисел a и b = " + (a/b));
        return a/b;
    }
    public double multiplication(double a, double b) {
        System.out.println("Результат умножения чисел a и b = " + (a*b));
        return a*b;
    }
}
