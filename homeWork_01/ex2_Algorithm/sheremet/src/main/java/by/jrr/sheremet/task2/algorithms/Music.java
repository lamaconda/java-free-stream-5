package main.java.by.jrr.sheremet.task2.algorithms;

public class Music implements Algorithm {

    private void takeDisk() {
        System.out.println("Взять компакт-диск");
    }

    private void turnOnPlayer() {
        System.out.println("Включить аудио-плейер");
    }

    private void loadDiskIntoThePlayer() {
        System.out.println("Загрузить диск в аудио- плейер");
    }

    private void pressPlayButton() {
        System.out.println("Нажать на play");
    }

    @Override
    public void doAlgorithm() {
        System.out.println("\nАлгоритм включения музыки\n");
        takeDisk();
        turnOnPlayer();
        loadDiskIntoThePlayer();
        pressPlayButton();
    }
}
