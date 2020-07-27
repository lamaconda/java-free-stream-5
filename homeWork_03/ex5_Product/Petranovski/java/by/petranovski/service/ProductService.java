package by.petranovski.service;

        import by.petranovski.bean.Product;

public class ProductService {
    public double actualPrice(Product product) {
        double sumDiscount = product.getRegularPrice() / 100 * product.getDiscount();
        return  product.getRegularPrice()-sumDiscount;
    }
    public String printInformation(Product product) {
        String info = "Product : name = " + product.getName() + ", regular price = " + product.getRegularPrice() + " EUR, discount = " + product.getDiscount() + ", actual price = " + actualPrice(product) + " EUR";
        return info;

    }

}
