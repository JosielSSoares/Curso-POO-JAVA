
import java.util.Locale;
import java.util.Scanner;

public class calculoMedia {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Entre com seu nome: ");
        student.nome = sc.nextLine();
        System.out.println("Entre com suas notas do Trimestre: ");
        student.nota1 = sc.nextInt();
        student.nota2 = sc.nextInt();
        student.nota3 = sc.nextInt();

        student.mediaAluno();
        sc.close();
    }
}
