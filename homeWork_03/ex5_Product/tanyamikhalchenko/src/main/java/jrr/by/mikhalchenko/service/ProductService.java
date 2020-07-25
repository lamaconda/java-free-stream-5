package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.Product;

public class ProductService {


    public double actualPrice(Product product) {
        double discount = (product.getRegularPrice() * product.getDiscount() / 100);
        return product.getRegularPrice() - discount;
    }
    public String printInformation(Product product) {
        String namePrint = "Product : name =" + product.getName() + ", ";
        String pricePrint  =  "regular price =  " + product.getRegularPrice();
        String discountPrint =  " EUR, discount = " + product.getDiscount()+ "%, ";
        String actualPricePrint =  "actual price = " + actualPrice(product) + " EUR";
        return namePrint + pricePrint + discountPrint + actualPricePrint;
    }
}
