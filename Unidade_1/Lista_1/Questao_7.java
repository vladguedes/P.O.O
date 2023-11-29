import java.util.Scanner;

/**
 * Questao_7
 */
public class Questao_7 {

    public static void main(String[] args) {
        System.out.println("Digite 3 valores");
        Scanner input = new Scanner(System.in);
        int[] valor = new int[3];
        int maior;
        
        for (int i = 0; i <= 2; i++) {
            System.out.printf("Valor %d: ", i+1);
            valor[i] = input.nextInt();
        }

        maior = valor[0];

        for (int i = 0; i <= 2; i++) {
            if(maior < valor[i]) {
                maior = valor[i];
            }
        }

        System.out.printf("O maior valor é %d", maior);
        
        input.close();
    }
}