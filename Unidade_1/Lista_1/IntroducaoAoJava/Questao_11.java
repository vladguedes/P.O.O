package Lista_1.IntroducaoAoJava;
import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        System.out.println("Digite dois valores no plano cartesiano.");
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("\nDigite o valor de x: ");
        x = input.nextInt();
        System.out.print("\nDigite o valor de y: ");
        y = input.nextInt();

        if (y > 0) {
            System.out.print("O ponto y está acima");

            if (x > 0) {
                System.out.print(" e a esquerda do ponto x.");
            } else {
                System.out.print(" e a direita do ponto x.");
            }
        } else {
            System.out.print("O ponto y está abaixo");

            if (x > 0) {
                System.out.print(" e a esquerda do ponto x.");
            } else {
                System.out.print(" e a direita do ponto x.");
            }
        }

        input.close();
    }
}
