import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int coder = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Product:");
        System.out.printf(product1 + " which price is $ %.2f%n", price1);
        System.out.printf(product2 + " which price is $ %.2f%n", price2);
        System.out.printf("\nRecord: %d years old code, %d and gender: %c \n", age, coder, gender);

        Locale.setDefault(Locale.of("pt"));
        System.out.printf("\nMeasue with eight decimal places: %.8f", measure);
        System.out.printf("\nRouded (three decimal places): %.3f", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
        
    }
}
