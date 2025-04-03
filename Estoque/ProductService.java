public class ProductService {

    public Product createProduct(String name, double price) {
        return new Product(name, price);
    }

    public void addStock(Product product, int quantity) {
        product.addProducts(quantity);
    }

    public void removeStock(Product product, int quantity) {
        product.removeProducts(quantity);
    }
}
