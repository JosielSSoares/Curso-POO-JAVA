import java.util.Locale;
import java.util.Scanner;

public class nLinhas {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quadrado, cubo;

        System.out.print("Digite um numero inteiro positivo:" );
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){

            quadrado = i * i;
            cubo = quadrado * i;
            System.out.printf("%-4d %-6d %-8d%n", i, quadrado, cubo);
                 
        }

        System.out.println("Programa encerrado");
        sc.close();
    }
}
