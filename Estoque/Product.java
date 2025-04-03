public class Product {
    private String name;
    private double price;
    private int quantity;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Product(String name, double price) {
        setName(name);
        setPrice(price);
        this.quantity = 0;
    }

    public static class ProductService {

        public static Product createProduct(String name, double price) {
            return new Product(name, price);
        }
    
        public static void addStock(Product product, int quantity) {
            product.addProducts(quantity);
        }
    
        public static  void removeStock(Product product, int quantity) {
            product.removeProducts(quantity);
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode estar vazio.");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }
        this.price = price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void addProducts(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("A quantidade adicionada deve ser positiva.");
        }
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("A quantidade removida deve ser positiva.");
        }
        if (quantity > this.quantity) {
            throw new IllegalArgumentException("Quantidade insuficiente em estoque.");
        }
        this.quantity -= quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s | Preço: R$ %.2f | Quantidade: %d | Valor Total em Estoque: R$ %.2f",
                name, price, quantity, totalValueInStock());
    }

    
}
