import java.util.Scanner;

/**
 * Questao_5
 */
public class Questao_5 {

    public static void main(String[] args) {
        System.out.print("Digite um valor maior igual que 100 e menor igual 999: ");
        Scanner input = new Scanner(System.in);
        int CDU, UCD;
        int C, D, U;

        CDU = input.nextInt();
        C = CDU / 100;
        D = (CDU - C * 100) / 10;
        U = CDU % 10;
        UCD = U * 100 + C * 10 + D;
        System.out.println("\nCDU = " + CDU + "\nUCD = " + UCD);

        input.close();
    }
}