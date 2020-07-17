package main.java.by.jrr.sheremet.randomizer;

public class Application {
    public static void main(String[] args) {
        RandomGeneratorDemo randomGenerator = new RandomGeneratorDemo();
        int[] arr;
        int result;
        arr = randomGenerator.generateThreeRandomDigits();
        randomGenerator.printRndDigitsFromArray(arr);
        result = randomGenerator.sumDigits(arr[0],arr[1],arr[2]);
        randomGenerator.printSumOfDigits(result);
    }
}
