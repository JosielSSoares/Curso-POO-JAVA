
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            Triangle x, y;
            x = new Triangle();
            y = new Triangle();

            System.out.println("Enter the measures of triangle X: ");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();

            System.out.println("Enter the measures of triangle Y: ");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            double areaX = x.Area();
            double areaY = y.Area();

            if (areaX > areaY) {
                System.out.printf("Larger area X: %.4f%n" , areaX);
            }
            else {
                System.out.printf("Larger area Y: %.4f%n" , areaY);
            }
        }      
    }  
}


