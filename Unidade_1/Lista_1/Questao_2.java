import java.util.Scanner;

/**
 * Questao_2
 */
public class Questao_2 {

    public static void main(String[] args) {
        System.out.println("Digite 3 valores para serem feita a soma e a média: ");
        Scanner input = new Scanner(System.in);
        float valor_1, valor_2, valor_3;

        System.out.println("Primeiro valor ");
        valor_1 = input.nextFloat();
        System.out.println("Segundo valor ");
        valor_2 = input.nextFloat();
        System.out.println("Terceiro valor ");
        valor_3 = input.nextFloat();

        System.out
                .println("SOMA: " + valor_1 + " + " + valor_2 + " + " + valor_3 + " = " + (valor_1 + valor_2 + valor_3));
        System.out.println("MÉDIA: " + (valor_1 + valor_2 + valor_3) / 3);

        input.close();
    }
}