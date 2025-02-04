
import java.util.Locale;
import java.util.Scanner;

public class Senha {
  
//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.printf("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.printf("ACESSO NEGADO! Digite novamente a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("ACESSO PERMITIDO");

        sc.close();
    }
}
