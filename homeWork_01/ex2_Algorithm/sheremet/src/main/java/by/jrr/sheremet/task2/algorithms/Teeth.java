package main.java.by.jrr.sheremet.task2.algorithms;

public class Teeth implements Algorithm{
    private void openToothpaste() {
        System.out.println("Открыть тюбик с пастой\n");
    }

    private void takeTothbrush() {
        System.out.println("Взть щетку");
    }

    private void putTothpasteOnTheToothbrush() {
        System.out.println("Нанести пасту на щетку");
    }

    private void brushTeeth() {
        System.out.println("Почистить зубы");
    }

    private void rinseMouth() {
        System.out.println("Прополоскать рот");
    }

    @Override
    public void doAlgorithm() {
        System.out.println("\nАлгоритм чистки зубов\n");
        openToothpaste();
        takeTothbrush();
        putTothpasteOnTheToothbrush();
        brushTeeth();
        rinseMouth();
    }
}
