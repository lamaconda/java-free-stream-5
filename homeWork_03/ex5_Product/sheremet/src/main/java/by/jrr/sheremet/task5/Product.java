package main.java.by.jrr.sheremet.task5;

public class Product {
    private String name;
    public double regularPrice;
    public double discount;

    public Product(String name){
        this.name = name;
    }

    private double actualPrice() {
        return regularPrice - (regularPrice * (discount/100));

    }

    public void printInformation() {
        System.out.println("Product name = \"" + name + "\", regular price = " + regularPrice + " EUR, discount = " + discount +"%, actual price = " + actualPrice() + " EUR");
    }
}
