package Lista_1.IntroducaoAoJava;
import java.util.Scanner;

/**
 * Questao_1
 */
public class Questao_1 {

    public static void main(String[] args) {
        System.out.print("Digite o valor do lado do quadrado: ");
        Scanner input = new Scanner(System.in);
        int valor;
        
        valor = input.nextInt();
        System.out.println("\nA área do quadrado é " + valor * valor);

        input.close();
    }
}