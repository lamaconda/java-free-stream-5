package main.java.by.jrr.sheremet.arithmetic;

public class Application {
    public static void main(String[] args) {
        Arithmetic arithmetic = new MathOperationsDemo();
        System.out.println("--Приложение демонстрирующее работу с простейшими арифметическими операциями--");
        System.out.println("Сложение чисел 17 и 31 : 17 + 31 = " + arithmetic.sum(17,31));
        System.out.println("Вычитание чисел 26 и 19 : 26 - 19 = " + arithmetic.subtract(26,19));
        System.out.println("Деление чисел 88 и 26 : 88 \\ 26 = " + arithmetic.divide(88,26));
        System.out.println("Умножение чисел 7 и 11 : 7 * 11 = " + arithmetic.multiply(7,11));
    }
}
