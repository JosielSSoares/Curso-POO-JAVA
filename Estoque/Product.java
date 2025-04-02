public class Product {
    private String name;
    private double price;
    private int quantity;

    //Constructors
    public Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    //Sobrecarga
    public Product(String name, double price) {
        setName(name);
        setPrice(price);
        this.quantity = 0;
    }

    //Getter e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
        }
        if (Character.isDigit(name.charAt(0))) {
            throw new IllegalArgumentException("O nome do produto não pode começar com um número.");
        }
        if (name.matches(".*\\d.*")) {
            throw new IllegalArgumentException("O nome do produto não pode conter números.");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("O preço não pode ser menor ou igual a zero.");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser menor que zero.");
        }
        this.quantity = quantity;
    }

    //Funções ou Métodos
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("A quantidade a ser adicionada não pode ser negativa.");
        }
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("A quantidade a ser removida não pode ser negativa.");
        }
        if (this.quantity - quantity < 0) {
            throw new IllegalArgumentException("Não há estoque suficiente para remover essa quantidade.");
        }
        this.quantity -= quantity;
    }

    //Declara mminha propria versão do metodo toSring
    @Override
    public String toString() {
        return name
                + ", $"
                + String.format("%.2f", price)
                + "\n"
                + quantity
                + " Unidades, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
