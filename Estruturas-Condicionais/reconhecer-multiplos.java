
import java.util.Scanner;

public class ReconhecerMultiplos {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.printf("Digite o valor de B: ");
        int b = sc.nextInt();


        if ( a % b == 0 || b % a == 0 ) {
            System.out.println("São multiplos");
        } else 
            System.out.println("Nao são Multiplos");
        sc.close();
    }
}
