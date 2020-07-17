package jrr.by.mikhalcheno;

public class HumanDemo {
    public static void main(String[] args) {
        Human firstHuman = new Human("Paul", 18);
        Human secondHuman = new Human("Tyler", 40);
        Human thirdHuman = new Human("Molly", 25);
        Human fourthHuman = new Human("Eva", 33);
        Human fifthHuman = new Human("Seth", 29);

        firstHuman.greet();

        System.out.println();

        secondHuman.greet();

        System.out.println();

        thirdHuman.greet();

        System.out.println();

        fourthHuman.greet();

        System.out.println();

        fifthHuman.greet();
    }
}




