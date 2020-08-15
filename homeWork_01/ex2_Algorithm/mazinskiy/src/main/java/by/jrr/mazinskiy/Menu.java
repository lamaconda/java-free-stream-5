package by.jrr.mazinskiy;

import java.util.Scanner;

public class Menu {

    Menu(String A){
        if (A.equals("Dog"))DisplayInfoDog();
        else if (A.equals("Pizza"))DisplayInfoPizza();
        else if (A.equals("Film"))DisplayInfoFilm();
        else if (A.equals("Refrigerator"))DisplayInfoRefrigerator();
        else if (A.equals("Beer"))DisplayInfoBeer();
        else if (A.equals("Watch"))DisplayInfoWatch();
        else if (A.equals("Phone"))DisplayInfoPhone();
        else if (A.equals("Pen"))DisplayInfoPen();

        else System.out.println("Wrong data! Your class must be listed and capitalized.");
    }

    private void DisplayInfoDog(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write dog's name: ");
        String name = in.nextLine();

        System.out.println("Write dog's breed: ");
        String breed = in.nextLine();

        System.out.println("Describe your dog: ");
        String paramet = in.nextLine();


        Dog d = new Dog(name, breed, paramet);

        System.out.println("dog's name: " + name +"\n dog's breed: "+ breed +"\n description:"+ paramet);

        }

    private void DisplayInfoPizza(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write pizza's name: ");
        String name = in.nextLine();

        System.out.println("Write pizza's company: ");
        String company = in.nextLine();

        System.out.println("Describe your pizza: ");
        String paramet = in.nextLine();


        Pizza d = new Pizza(name, company, paramet);

        System.out.println("pizza's  name: " + name +"\n pizza's company: "+ company +"\n description:"+ paramet);

    }

    private void DisplayInfoFilm(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write Film's name: ");
        String name = in.nextLine();

        System.out.println("Write Film's producer: ");
        String producer = in.nextLine();

        System.out.println("Write Film's breed: ");
        String company = in.nextLine();

        System.out.println("Describe Film : ");
        String paramet = in.nextLine();


        Film d = new Film(name, producer, company , paramet);

        System.out.println("Film's name: " + name +"\n producer's name: " + producer + "\n film's company: "+ company +"\n description:"+ paramet);

    }

    private void DisplayInfoRefrigerator(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write Refrigerator's name: ");
        String name = in.nextLine();

        System.out.println("Write Refrigerator's company: ");
        String company = in.nextLine();

        System.out.println("Write Refrigerator's shelfLife: ");
        int shelfLife = in.nextInt();

        System.out.println("Describe Refrigerator: ");
        String paramet = in.nextLine();


        Refrigerator d = new Refrigerator(name, company, shelfLife, paramet);

        System.out.println("Refrigerator's name: " + name +"\n Refrigerator's company: "+ company +"\n Refrigerator's shelfLife: "+ shelfLife +"\n description:"+ paramet);

    }

    private void DisplayInfoBeer(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write Beer's name: ");
        String name = in.nextLine();

        System.out.println("Write Beer's company: ");
        String company = in.nextLine();

        System.out.println("Write Beer's shelfLife: ");
        int shelfLife = in.nextInt();

        System.out.println("Describe Beer: ");
        String paramet = in.nextLine();


        Beer d = new Beer(name, company, shelfLife, paramet);

        System.out.println("Beer's name: " + name +"\n Beer's company: "+ company +"\n Beer's shelfLife: "+ shelfLife +"\n description:"+ paramet);

    }

    private void DisplayInfoWatch(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write Watch's name: ");
        String name = in.nextLine();

        System.out.println("Write Watch's company: ");
        String company = in.nextLine();

        System.out.println("Describe Watch: ");
        String paramet = in.nextLine();


        Watch d = new Watch(name, company, paramet);

        System.out.println("Watch's  name: " + name +"\n Watch's company: "+ company +"\n description:"+ paramet);

    }

    private void DisplayInfoPhone(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write Phone's name: ");
        String name = in.nextLine();

        System.out.println("Write Phone's company: ");
        String company = in.nextLine();

        System.out.println("Describe Phone: ");
        String paramet = in.nextLine();


        Phone d = new Phone(name, company, paramet);

        System.out.println("Phone's  name: " + name +"\n Phone's company: "+ company +"\n description:"+ paramet);

    }

    private void DisplayInfoPen(){

        Scanner in = new Scanner(System.in);
        System.out.println("Write Pen's name: ");
        String name = in.nextLine();

        System.out.println("Write Pen's company: ");
        String company = in.nextLine();

        System.out.println("Describe your Pen: ");
        String paramet = in.nextLine();


        Pen d = new Pen(name, company, paramet);

        System.out.println("Pen's  name: " + name +"\n Pen's company: "+ company +"\n description:"+ paramet);

    }
}
