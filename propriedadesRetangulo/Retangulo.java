public class Retangulo {

    public double altura, largura, area, perimetro, diagonal;

    public double Area() {
        return area = largura * altura;

    }

    public double Perimetro(){
        return perimetro = 2 * (largura + altura);

    }

    public double Diagonal(){
        // A diagonal de um retângulo pode ser calculada usando o Teorema de Pitágoras. Se 'l' e 'c' são os comprimentos dos lados do retângulo, então o comprimento da diagonal 'd' é dado por: d = √(l² + c²). Basta elevar ao quadrado o comprimento e a largura, somar os resultados e, finalmente, calcular a raiz quadrada da soma.

        return diagonal = Math.sqrt((altura * altura) + (largura * largura));
        
    }
   
}
