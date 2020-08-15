package by.jrr.Petranovski_HW2_Task4;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        double firstNumber = Math.random()*100;
        System.out.println(firstNumber);
        double secondNumber = Math.random()*200 - 100;
        System.out.println(secondNumber);
        double threeNumber = Math.random() + 2;
        System.out.println(threeNumber);
        double sum = firstNumber + secondNumber + threeNumber;
        System.out.println(sum);
    }
}
