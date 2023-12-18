package Lista_1.IntroducaoAoJava;
import java.util.Scanner;

/**
 * Questao_7
 */
public class Questao_7 {

    public static void main(String[] args) {
        System.out.println("Digite 3 valores");
        Scanner input = new Scanner(System.in);
        int[] valor = new int[3];
        int menor;
        
        for (int i = 0; i <= 2; i++) {
            System.out.printf("\nValor %d: ", i+1);
            valor[i] = input.nextInt();
        }

        menor = valor[0];

        for (int i = 0; i <= 2; i++) {
            if(menor > valor[i]) {
                menor = valor[i];
            }
        }

        System.out.printf("\nO menor valor é %d", menor);
        
        input.close();
    }
}