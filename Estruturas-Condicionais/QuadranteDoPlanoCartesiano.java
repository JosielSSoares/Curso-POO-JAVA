
import java.util.Locale;
import java.util.Scanner;

public class QuadranteDoPlanoCartesiano {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.forLanguageTag("EN"));
        Locale.setDefault(Locale.US);
        
        double x,y;

        System.out.printf("Digite o valor no eixo X(Exemplo:4,5):");
        x = sc.nextDouble();

        System.out.printf("Digite o valor no eixo Y(Exemplo -2,2):");
        y = sc.nextDouble();

        if(x > 0 && y >=0 || x >=0 && y > 0){
            System.out.println("Q1");

        }else if (x < 0 && y >=0 || x <=0 && y > 0) {
            System.out.println("Q2");
            
        }else if (x < 0 && y <=0 || x <= 0 && y < 0){
            System.out.println("Q3");

        }else if( x > 0 && y <=0 || x >=0 && y < 0){
            System.out.println("Q4");

        } else if (x == 0 && y == 0) {
            System.out.println("Eixo Origem 0.0");
        
        } else{
            System.out.println("Não foi possível determinar o quadrante");
        }
        sc.close();
    }
}
