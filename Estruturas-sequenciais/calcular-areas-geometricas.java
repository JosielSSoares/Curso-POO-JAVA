
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaDoTriangulo;
        double areaDoCirculo;
        double areaDoTrapezio;
        double areaDoQuadrado;
        double areaDoRetangulo;
        double pi;

        System.out.printf("Digite o valor de A(base):");
        double a = sc.nextDouble();
        System.out.printf("Digite o valor de B:(bases ou algura)");
        double b = sc.nextDouble();
        System.out.printf("Digite o valor de C:(altura e raio)");
        double c = sc.nextDouble();

        pi = 3.14159;

        areaDoTriangulo = (a * c) / 2;
        areaDoCirculo = (c * c) * pi;
        areaDoTrapezio = (a + b) * c / 2;
        areaDoQuadrado = (b * b);
        areaDoRetangulo = (b *a) ;


        System.out.println();
        System.out.printf("Area do Triangulo Retangulo: %.3f", areaDoTriangulo);
        System.out.printf("\nÁrea do Circulo: %.3f", areaDoCirculo);
        System.out.printf("\nArea do Trapézio: %.3f", areaDoTrapezio);
        System.out.printf("\nArea do Quadrado: %.3f", areaDoQuadrado);
        System.out.printf("\nArea do Retangulo: %.3f", areaDoRetangulo);

        sc.close();

    }
}
