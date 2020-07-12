package main.java.by.jrr.sheremet.task2.algorithms;

public class Grass implements Algorithm {

    private void startGrassCutter() {
        System.out.println("Завести газонокосилку");
    }

    private void cutGrass() {
        System.out.println("Косить траву");
    }

    private void stopGrassCutter() {
        System.out.println("Заглушить газонокосилку");
    }

    @Override
    public void doAlgorithm() {
        System.out.println("\nАлгоритм кошения газона : \n");
        startGrassCutter();
        cutGrass();
        stopGrassCutter();
    }
}
