
import java.util.Locale;
import java.util.Scanner;

public class nFatorial {
    public static void main(String[] args) throws Exception {
// Ler um número inteiro N e calcular todos os seus divisores.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Digite um numero para verificar seus divisores:" );
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            if (n % i == 0) {

                System.out.println(i);
                
            }
        }

        System.out.println("Programa encerrado");
        sc.close();
    }
}
