import java.util.Scanner;

/**
 * Questao_1
 */
public class Questao_1 {

    public static void main(String[] args) {
        System.out.println("Digite o valor do lado do quadrado: ");
        Scanner input = new Scanner(System.in);
        int valor;
        valor = input.nextInt();
        System.out.println("A área do quadrado é " + valor * valor);

        input.close();
    }
}