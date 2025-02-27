import java.util.Locale;
import java.util.Scanner;

// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

public class mediaPonderada {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.of("en", "US"));
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double a, b, c, mediaPonderada = 0;

        System.out.print("Digite a quantidade de conjuntos de deseja inserir:");
        n = sc.nextInt();

        System.out.println("Digite " + n + " conjuntos:");
        for( int i=0; i<n; i++){

            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            mediaPonderada = (a * 2 + b * 3 + c * 5)/10;
            
            System.out.printf(" Media ponderada dos conjuntos: %.1f%n", mediaPonderada);
        } 
        sc.close();
    }
}
