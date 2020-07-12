package main.java.by.jrr.sheremet.task2.algorithms;

public class Pasta implements Algorithm{
    private void takeCooker() {
        System.out.println("Взять кастрюлю");
    }

    private void boilWater() {
        System.out.println("Вскипятить воду");
    }

    private void takePasta() {
        System.out.println("Взять Макароны");
    }

    private void putThePastaIntoTheCooker() {
        System.out.println("Положить макароны в кастрюлю");
    }

    private void cookPasta() {
        System.out.println("Сварить макароны");
    }

    private void drainWater() {
        System.out.println("Слить воду");
    }

    private void addSauce(){
        System.out.println("Добавить соус");
    }

    @Override
    public void doAlgorithm() {
        System.out.println("\nАлгоритм приготовления макарон\n");
        takeCooker();
        boilWater();
        takePasta();
        putThePastaIntoTheCooker();
        cookPasta();
        drainWater();
        addSauce();
    }
}
