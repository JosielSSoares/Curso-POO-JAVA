import java.util.Scanner;

public class lerNumerosInteiros {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    
    int n;
    int soma = 0;

    System.out.println("Digite a quanditade de vezes que será solicitado a entrada:");
    n = sc.nextInt();

    for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        soma = soma + x;        
    }

    System.out.println("\nResultado:" + soma);
    sc.close();

    }
}
