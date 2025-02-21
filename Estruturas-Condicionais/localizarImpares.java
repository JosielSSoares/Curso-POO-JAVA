
import java.util.Scanner;

        // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        // X, se for o caso.
        //Exemplo:

        // Entrada:     Saída:
        //   8            1
        //                3
        //                5
        //                7

public class localizarImpares {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite o valor de X:");
        x = sc.nextInt();

        int produto;
        for (int i=1; i<=x; i++){
            
            if (i % 2 != 0) {
                produto = i * i;

                System.out.println("\nImpares:"+i);
                System.out.println("Muiltiplicação dos Impares:" + produto);

            }else  {}
        }
    sc.close();
    }
}
