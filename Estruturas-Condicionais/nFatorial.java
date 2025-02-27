
import java.util.Locale;
import java.util.Scanner;

public class nFatorial {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, fatorial = 1;

        System.out.print("Qual numero vc quer saber o fatorial:!" );
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            fatorial = fatorial * i;
            System.out.println(fatorial);

        }
        System.out.println("Programa encerrado");
        
    }
}
