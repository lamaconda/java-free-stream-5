package by.petranovski.bean;

import java.util.Objects;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product() {

    }
    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public String getName() {
        return name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0 &&
                Double.compare(product.discount, discount) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
