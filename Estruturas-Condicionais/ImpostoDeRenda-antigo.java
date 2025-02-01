import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Locale.setDefault(Locale.forLanguageTag("EN"));
        Scanner sc = new Scanner(System.in);

        double salario = 0;
        double imposto = 0;
        
        System.out.printf("Digite o valor do seu salário mensal:");
        salario = sc.nextDouble();
  
        if (salario <= 2000.00) {
            System.out.println("Isento do Imposto de Renda");
            return;

        }else if (salario <= 3000.00){  

            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("Valor descontado: %.2f", imposto);

        }else if(salario <= 4500.00){
           
            imposto = (salario - 3000.00) * 0.18 + 1000 * 0.08;
            System.out.printf("Valor descontado: %.2f", imposto);

        }else{

            imposto = (salario - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("Valor descontado: %.2f", imposto);
        }
        sc.close();
    }
}
