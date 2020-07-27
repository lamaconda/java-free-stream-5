package by.petranovski;

import by.petranovski.bean.Product;
import by.petranovski.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        ProductService productService =new ProductService();
        Product product = new Product("Milk");
        product.setRegularPrice(100);
        product.setDiscount(20);
        System.out.println(productService.printInformation(product));
    }
}
