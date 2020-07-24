package jrr.by.mikhalchenko.service;

import jrr.by.mikhalchenko.bean.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void actualPrice() {
        Product product = new Product("Milk", 50.0, 20.0);
        ProductService productService = new ProductService();
        double expected = 40;
        double actual = productService.actualPrice(product);
        assertEquals(expected, actual, 0);
    }

    @Test
    public void printInformation() {
        Product product = new Product("Milk", 50.0, 20.0);
        ProductService productService = new ProductService();
        String expected = "Product : name =" + product.getName() + ", regular price =  " + product.getRegularPrice() + " EUR, discount = " + product.getDiscount() + "%, actual price = " + 40.0 + " EUR";
        String actual = productService.printInformation(product);
        assertEquals(expected, actual);
    }
}

