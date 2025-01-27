import java.util.Scanner;

public class horasJogadas {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("A que horas vc começou a jogar? ");
        int horaInicial = sc.nextInt();

        System.out.println("A que horas vc terminou de jogar? ");
        int horaFinal = sc.nextInt();

        int horasJogadas;

        if (horaInicial < horaFinal) {  
            horasJogadas = (horaFinal - horaInicial);       
            System.out.printf("Voce jogou durante: " + horasJogadas + " horas");
            
        // }else if( horaFinal == horaInicial) {
        //     horasJogadas = 24;     
        //     System.out.printf("Voce jogou durante: " + horasJogadas + " horas");

         }else{ 
            horasJogadas = ((24 - horaInicial) + horaFinal);
            System.out.printf("Voce jogou durante: " + horasJogadas + " horas");
        } 
        sc.close();
    }
}
