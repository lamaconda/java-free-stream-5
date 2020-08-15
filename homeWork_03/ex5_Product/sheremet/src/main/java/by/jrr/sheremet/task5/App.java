package main.java.by.jrr.sheremet.task5;

public class App {
    public static void main(String[] args) {
        Product product = new Product("potato");
        product.regularPrice = 0.8;
        product.discount = 20;
        product.printInformation();
    }
}
