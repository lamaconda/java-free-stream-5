package main.java.by.jrr.sheremet.task2.algorithms;

public class Cocktail implements Algorithm {

    private void takeGlass() {
        System.out.println("Взять стакан");
    }

    private void putIceIntoTheGlass() {
        System.out.println("Насыпать льда");
    }

    private void pourVodkaIntoTheGlass() {
        System.out.println("Добавить водки");
    }

    private void pourJinIntoTheGlass() {
        System.out.println("Добавить Джин");
    }

    private void pourWhiteRumIntoTheGlass() {
        System.out.println("Добавить белый ром");
    }

    private void pourTekilaIntoTheGlass() {
        System.out.println("Добавить Текилу");
    }

    private void pourMintliquorIntoTheGlass() {
        System.out.println("Добавить мятный ликер");
    }

    private void pourSugarSyrupIntoTheGlass() {
        System.out.println("Добавить сахарный сироп");
    }

    private void pourLimeJuiceIntoTheGlass() {
        System.out.println("Добавить лимонный сок");
    }

    private void pourCocaColaIntoTheGlass() {
        System.out.println("налить Кока-кола");
    }

    private void mixIt() {
        System.out.println("Взболтать");
    }

    @Override
    public void doAlgorithm() {
        System.out.println("\nАлгоритм приготовления коктейля\n");
        takeGlass();
        putIceIntoTheGlass();
        pourVodkaIntoTheGlass();
        pourJinIntoTheGlass();
        pourTekilaIntoTheGlass();
        pourMintliquorIntoTheGlass();
        pourSugarSyrupIntoTheGlass();
        pourCocaColaIntoTheGlass();
        pourLimeJuiceIntoTheGlass();
        pourWhiteRumIntoTheGlass();
        mixIt();
    }
}
