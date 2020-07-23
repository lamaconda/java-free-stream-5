package ex4_RandomNumberGenerator.Dmitry_Karachun;

import java.util.Arrays;
import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        int[] genArray = generateArrayNumbers();
        System.out.println("Сгенерированные числа: " + Arrays.toString(genArray));
        System.out.println("Сумма чисел = " + sumCounter(genArray));
    }

    public static int[] generateArrayNumbers() {
        Random random = new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static int sumCounter(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
