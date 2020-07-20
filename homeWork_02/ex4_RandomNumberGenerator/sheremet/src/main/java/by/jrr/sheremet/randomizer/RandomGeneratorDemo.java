package main.java.by.jrr.sheremet.randomizer;

import java.util.Random;

public class RandomGeneratorDemo {

    public int[] generateThreeRandomDigits(){
        Random random = new Random();
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public void printRndDigitsFromArray(int[] arr){
        System.out.print("Случайно сгенерированные числа : ");
        for(int i: arr){
            System.out.print(i + "  ");
        }
        System.out.println();
    }

    public int sumDigits(int a, int b, int c){
        return a + b + c;
    }

    public void printSumOfDigits(int a){
        System.out.println("Результат сложения чисел : " + a);
    }
}
