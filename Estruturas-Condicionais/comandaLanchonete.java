import java.util.Scanner;

public class comandaLanchonete {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double valor1 = 4.00;
        double valor2 = 4.50;
        double valor3 = 5.00;
        double valor4 = 2.00;   
        double valor5 = 1.50;
        int codigo = 0;
        int quantidade = 0;
        double resultado;
        boolean codigoValido = false;
        boolean quantidadeValida = false;

        while (!codigoValido) {
            System.out.printf("Digite o primeiro codigo do item (1 a 5): ");
            codigo = sc.nextInt();

            if (codigo > 0 && codigo <= 5) {
                codigoValido = true;
            } else {
                System.out.println("Codigo invalido. Digite um valor entre 1 e 5.");
            }
        }

        while (!quantidadeValida) {
            System.out.printf("Digite a quantidade do item: ");
            quantidade = sc.nextInt();

            if (quantidade > 0) {
                quantidadeValida = true;
            } else {
                System.out.println("Quantidade invalida. Digite um valor maior que zero.");
            }
        }

        if (codigo == 1) {
          resultado = quantidade * valor1;
          System.out.printf("Total R$:" + resultado);
        
        } else if (codigo == 2) {
            resultado = quantidade *valor2;
            System.out.printf("Total R$:" + resultado);
     
        } else if (codigo == 3 ) {
            resultado = quantidade * valor3;
            System.out.printf("Total R$:" + resultado);

        } else if ( codigo == 4){
            resultado = quantidade * valor4;
            System.out.printf("Total R$:" + resultado);

        } else if (codigo == 5) {
            resultado = quantidade * valor5;
            System.out.printf("Total R$:" + resultado);
        } else {
            System.out.println("Valores incorretos");
        }
        sc.close();
    }
}
