import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) throws Exception {

        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustivel abastecido (codificado da seguinte forma: 1.Alcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme conforme
        //exemplo.Exemplo:

        //Entrada:     Saída:
        // 8            MUITO OBRIGADO
        // 1            Alcool: 1
        // 7            Gasolina: 2
        // 2            Diesel: 0
        // 2
        // 4

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo = 0;

        while (codigo != 4) {

            System.out.println("Digite um codigo de combustivel (1-3) ou 4 para sair:");
            codigo = sc.nextInt();

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break; // Não faz nada, apenas sai do loop
                default:
                    break;
            }
        }

        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
