package Lista_1.IntroducaoAoJava;
import java.util.Scanner;

/**
 * Questao_3
 */
public class Questao_4 {

    public static void main(String[] args) {
        System.out.print("Digite a temperatura em graus Celcius para ser convertido para Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        float graus;

        graus = input.nextFloat();
        System.out.println("\n" + graus + " °C = " + ((graus * 9/5) + 32) + "°F");

        input.close();
    }
}