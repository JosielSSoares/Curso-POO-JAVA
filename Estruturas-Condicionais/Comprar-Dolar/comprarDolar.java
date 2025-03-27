import java.util.Locale;
import java.util.Scanner;

public class comprarDolar {
    public static void main(String[] args) throws Exception {
        
        
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            System.out.print("Qual o preço atual do dolar? ");
            double dolar = sc.nextDouble();
            
            System.out.print("Quantos dolares vc quer comprar? $");
            double dolarComprado = sc.nextDouble();
            
            System.out.printf("Pague este valor em Reais: R$ %.2f", CurrencyConverter.dolarToReal(dolar, dolarComprado));
        }
    }
}
