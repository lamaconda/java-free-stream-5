package main.java.by.jrr.sheremet.task2.algorithms;

public class Coffee implements Algorithm {

    private void takeSpoon() {
        System.out.println("Взять ложку");
    }

    private void takeCoffee() {
        System.out.println("Взять кофе");
    }

    private void putCoffeeIntoTheGlass() {
        System.out.println("Насыпать кофе в стокан");
    }

    private void boilWater() {
        System.out.println("Вскипятить воду");
    }

    private void pourWaterIntoTheGlass() {
        System.out.println("Налить воду в стокан");
    }

    private void stir() {
        System.out.println("Размешать");
    }

    @Override
    public void doAlgorithm() {
        System.out.println("\nАлгоритм приготовления кофе\n");
        takeSpoon();
        takeCoffee();
        putCoffeeIntoTheGlass();
        boilWater();
        pourWaterIntoTheGlass();
        stir();
    }
}
