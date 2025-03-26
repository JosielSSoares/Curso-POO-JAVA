
import java.util.Locale;
import java.util.Scanner;

public class propriedadesRetangulo {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

            Retangulo retangulo = new Retangulo();

            System.out.println("Insira a largura e a altura do retângulo:");
            retangulo.largura = sc.nextDouble();
            retangulo.altura = sc.nextDouble();

            double area = retangulo.Area();
            double perimetro = retangulo.Perimetro();
            double diagonal = retangulo.Diagonal();


            //System.out.printf("\nÁrea: " + area + "\nPerímetro: " + perimetro + "\nDiagonal: " + diagonal);
            System.out.printf("\nÁrea: %.2f\nPerímetro: %.2f\nDiagonal: %.2f", area, perimetro, diagonal);
        }

    }
}
