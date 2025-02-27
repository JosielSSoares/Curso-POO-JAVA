
import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class divisaoNporN {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double n, a, b, divisao = 0;

        System.out.print("Digite a quantidade de PARES que deseja inserir:");
        n = sc.nextInt();

        System.out.println("Digite " + n + " conjuntos:");
        for( int i=0; i<n; i++){

            a = sc.nextInt();
            b = sc.nextInt();
            
            divisao = a / b;

            if (b == 0) {
                System.out.println("Não é possível dividir por Zero");
                
            } else {
                System.out.println("Resultado: " + divisao);
            }
        }
        sc.close();
    }
}
