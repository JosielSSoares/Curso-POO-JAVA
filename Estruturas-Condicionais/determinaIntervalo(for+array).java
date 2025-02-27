import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
// essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

public class determinaIntervalo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, x, in = 0, out = 0;

        // Listas para armazenar os números dentro e fora do intervalo
        List<Integer> numerosDentro = new ArrayList<>();
        List<Integer> numerosFora = new ArrayList<>();
    
        System.out.print("Digite a quantidade de números que deseja inserir: ");
        n = sc.nextInt();
        
        System.out.println("Digite " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
                numerosDentro.add(x);

            } else {
                out++;
                numerosFora.add(x);
            }
        }
        System.out.println("Foram encontrados:");
        System.out.println(in + " dentro do intervalo" + numerosDentro);
        System.out.println(out + " fora do intervalo" + numerosFora);

        sc.close();
    }
}
