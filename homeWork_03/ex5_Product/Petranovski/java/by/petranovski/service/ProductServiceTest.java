package by.petranovski.service;

import by.petranovski.bean.Product;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductServiceTest {

    @Test
    public void actualPriceTest() {
        Product product = new Product("Milk", 100.0, 20.0);
        ProductService productService = new ProductService();
        double expected = 80.0;
        double actual = productService.actualPrice(product);
        assertEquals(expected, actual, 0);

    }

    @Test
    public void printInformationTest() {
        Product product = new Product("Milk", 100.0, 20.0);
        ProductService productService = new ProductService();
        String expected = "Product : name = " + product.getName() + ", regular price = " + product.getRegularPrice() + " EUR, discount = " + product.getDiscount() + ", actual price = " + 80.0 + " EUR";
        String actual = productService.printInformation(product);
        assertEquals(expected, actual);
    }
}