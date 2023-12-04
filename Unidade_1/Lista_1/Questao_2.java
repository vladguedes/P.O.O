import java.util.Scanner;

/**
 * Questao_2
 */
public class Questao_2 {

    public static void main(String[] args) {
        System.out.println("Digite 3 valores para serem feita a soma e a média.");
        Scanner input = new Scanner(System.in);
        float valor_1, valor_2, valor_3;

        System.out.print("\nPrimeiro valor: ");
        valor_1 = input.nextFloat();
        System.out.print("Segundo valor: ");
        valor_2 = input.nextFloat();
        System.out.print("Terceiro valor: ");
        valor_3 = input.nextFloat();

        System.out.printf("\nSOMA: %.0f + %.0f + %.0f = %.0f",valor_1, valor_2, valor_3, (valor_1 + valor_2 + valor_3));
        System.out.printf("\nMÉDIA: %.1f", (valor_1 + valor_2 + valor_3) / 3);

        input.close();
    }
}