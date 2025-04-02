import java.util.InputMismatchException;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com os dados do Produto");

            String name;
            while (true) {
                System.out.print("Nome: ");
                name = sc.nextLine();
                try {
                    break;
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro no nome: " + e.getMessage());
                }
            }

            double price;
            while (true) {
                System.out.print("Preço: ");
                try {
                    price = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Erro no preço: Por favor, digite um número válido.");
                    sc.next();
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro no preço: " + e.getMessage());
                }
            }
            sc.nextLine();
            Product product = new Product(name, price);

            System.out.println("\nDados do Produto: " + product);

            int quantityToAdd;
            while (true) {
                System.out.print("Qual a quantidade de produtos de deseja acrescentar? ");
                try {
                    quantityToAdd = sc.nextInt();
                    product.addProducts(quantityToAdd);
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Erro na quantidade: Por favor, digite um número inteiro.");
                    sc.next();
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro na quantidade: " + e.getMessage());
                }
            }
            sc.nextLine();

            System.out.println("\nDados atualizados do produto: " + product);

            int quantityToRemove;
            while (true) {
                System.out.print("\nEntre com a quantidade que deseja REMOVER deste produto? ");
                try {
                    quantityToRemove = sc.nextInt();
                    product.removeProducts(quantityToRemove);
                    break;
                } catch (InputMismatchException e) {
                    System.err.println("Erro na quantidade: Por favor, digite um número inteiro.");
                    sc.next();
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro na quantidade: " + e.getMessage());
                }
            }

            System.out.println("\nDados atualizados: " + product);
        }
    }
}
