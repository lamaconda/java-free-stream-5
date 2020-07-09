package by.jrr.mikhalchenko;

public class Juice {
    public static void main(String[] args) {
        takeIt();
        cutIt();
        squeezeIt();
        pourIt();
        drinkIt();
    }

    public static void  takeIt(){
        System.out.println("take some oranges");
    }
    public static void cutIt() {
        System.out.println("cut the oranges into two parts");
    }
    public static void squeezeIt() {
        System.out.println("squeeze the juice from the orange with a juicer");
    }
    public static void pourIt() {
        System.out.println("pour the juice into a glass");
    }
    public static void drinkIt() {
        System.out.println("drink the juice");
    }
}

