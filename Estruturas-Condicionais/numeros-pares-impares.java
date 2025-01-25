import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero inteiro:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este numero é Par");
        }else {
            System.out.println("Este numero é Impar");
        }
        sc.close();
    }
}
