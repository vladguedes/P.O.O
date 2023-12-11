package Introducao.Basico;
import java.util.Scanner;


public class Exercicio_2 {
    public static void main(String[] args) {
        System.out.println("Digite os valores dos pontos");
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;

        System.out.print("Digite o valor de x1: ");
        x1 = input.nextDouble();
        System.out.print("Digite o valor de x2: ");
        x2 = input.nextDouble();
        System.out.print("Digite o valor de y1: ");
        y1 = input.nextDouble();
        System.out.print("Digite o valor de y2: ");
        y2 = input.nextDouble();

        distancia = Math.sqrt(Math.pow(x2-x1, 2.0) + Math.pow(y2 - y1, 2.0));
        System.out.printf("A distancia desses dois pontos são %g", distancia);
        
        input.close();
    }
}
