public class Student {

    public String nome;
    public int nota1, nota2, nota3;
    
    public void mediaAluno(){

       int media = nota1 + nota2 + nota3;
       System.out.println("\nFinal Grade = " + media); 

        if(media >= 60){
            System.out.println("PASS");
        } else if (media < 60) {
            int points = 60 - media;
            System.out.println("FAILED");
            System.out.println("Missing: " + points + " Points");
            
        }

    }     
}
