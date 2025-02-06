import java.util.Locale;
import java.util.Scanner;

public class PlanoCartesiano2 {
    public static void main(String[] args) throws Exception {

        //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double x,y;
        boolean retorno = false;


        while (!retorno) { 
            System.out.printf("Digite o valor no eixo X(Exemplo:4,5):");
            x = sc.nextDouble();

            System.out.printf("Digite o valor no eixo Y(Exemplo -2,2):");
            y = sc.nextDouble();

        
            if(x > 0 && y > 0 ){
            System.out.println("Q1");

            }else if (x < 0 && y > 0 ) {
            System.out.println("Q2");
            
            }else if (x < 0 && y < 0 ){
            System.out.println("Q3");

            }else if( x > 0 && y < 0 ){
            System.out.println("Q4");
               
            // (x == 0 || y == 0)
            } else {
            System.out.println("Uma das coordenadas é nula");
            retorno = true;
            sc.close();
            }
        }  
    }
}
