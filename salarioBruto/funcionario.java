import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) throws Exception {

        try (Scanner sc = new Scanner(System.in)) {
            Locale.setDefault(Locale.US);

        Salario salario = new Salario();

        System.out.print("Nome: ");
        salario.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        salario.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        salario.tax = sc.nextDouble();

        System.out.printf("\nEmployee: %s, $ %.2f%n", salario.name , salario.netSalary());
          
        System.out.println("Which percentage to increse in Gross Salary? ");    
        double percentage = sc.nextDouble();
        salario.IncreaseSalary(percentage);

        System.out.println("Update data: " + salario);

        } 
    }
}
