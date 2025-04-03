import java.util.Scanner;

public class EstoqueView {
    private final Scanner scanner;
    private final ProductService productService;

    public EstoqueView() {
        this.scanner = new Scanner(System.in);
        this.productService = new ProductService();
    }

    private String readString(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Entrada inválida. Tente novamente.");
        }
    }

    private double readDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = Double.parseDouble(scanner.nextLine().replace(",", "."));
                if (value > 0) {
                    return value;
                }
                System.out.println("Erro: O valor deve ser maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número válido.");
            }
        }
    }

    private int readInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    return value;
                }
                System.out.println("Erro: A quantidade deve ser maior que zero.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
            }
        }
    }

    private int readValidQuantityForRemoval(Product product) {
        while (true) {
            int quantity = readInt("Quantidade para remover: ");
            if (quantity <= product.getQuantity()) {
                return quantity;
            }
            System.out.printf("Erro: Estoque insuficiente! Você tem apenas %d unidades disponíveis.\n", product.getQuantity());
        }
    }

    public void start() {
        System.out.println("=== Cadastro de Produto ===");
        String name = readString("Nome: ");
        double price = readDouble("Preço: ");
        
        Product product = productService.createProduct(name, price);
        System.out.println("\nProduto cadastrado: " + product);

        int quantityToAdd = readInt("Quantidade para adicionar: ");
        productService.addStock(product, quantityToAdd);
        System.out.println("\nEstoque atualizado: " + product);

        int quantityToRemove = readValidQuantityForRemoval(product);
        productService.removeStock(product, quantityToRemove);
        System.out.println("\nEstoque atualizado: " + product);
    }
}
