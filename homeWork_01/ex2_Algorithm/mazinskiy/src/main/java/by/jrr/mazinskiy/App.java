package by.jrr.mazinskiy;

import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
            System.out.println("Choose from this list any class, where u can put information: Beer; Dog; Film; Phone; Pizza; Pen;" +
                    "Refrigerator; Watch ");

            Scanner in = new Scanner(System.in);
            System.out.println("Write ur class pls: ");

            String A = in.nextLine();

            Menu m = new Menu(A);



        }

}
