import java.util.Scanner;

public class Questao_9 {
    public static void main(String[] args) {
        System.out.println(
                "Digite um valor de 1 até 13, referente a cada numeração das cartas do baralho, e um valor de 1 até 4 referente aos naipes.");
        Scanner input = new Scanner(System.in);
        int valor, naipe;

        System.out.print("\nvalor da carta: ");
        valor = input.nextInt();

        for (int i = 1; i <= 13; i++) {

            if (i == valor) {
                System.out.print("\nNumeração do naipe: ");
                naipe = input.nextInt();

                for (int j = 1; j <= 4; j++) {

                    if (j == naipe) {

                        switch (naipe) {
                            case 1:

                                if (valor == 1) {
                                    System.out.printf("\nÁs de ouros.", valor);
                                } else if (valor == 11) {
                                    System.out.printf("\nValete de ouros.", valor);
                                } else if (valor == 12) {
                                    System.out.printf("\nDama de ouros.", valor);
                                } else if (valor == 13) {
                                    System.out.printf("\nReis de ouros.", valor);
                                }

                                break;

                            case 2:

                                if (valor == 1) {
                                    System.out.printf("\nÁs de paus.", valor);
                                } else if (valor == 11) {
                                    System.out.printf("\nValete de paus.", valor);
                                } else if (valor == 12) {
                                    System.out.printf("\nDama de paus.", valor);
                                } else if (valor == 13) {
                                    System.out.printf("\nReis de paus.", valor);
                                }

                                break;

                            case 3:

                                if (valor == 1) {
                                    System.out.printf("\nÁs de copas.", valor);
                                } else if (valor == 11) {
                                    System.out.printf("\nValete de copas.", valor);
                                } else if (valor == 12) {
                                    System.out.printf("\nDama de copas.", valor);
                                } else if (valor == 13) {
                                    System.out.printf("\nReis de copas.", valor);
                                }

                                break;

                            case 4:
                                if (valor == 1) {
                                    System.out.printf("\nÁs de espadas.", valor);
                                } else if (valor == 11) {
                                    System.out.printf("\nValete de espadas.", valor);
                                } else if (valor == 12) {
                                    System.out.printf("\nDama de espadas.", valor);
                                } else if (valor == 13) {
                                    System.out.printf("\nReis de espadas.", valor);
                                }

                                break;

                            default:
                                System.out.println("\nValores inválidos!");

                        }

                    }

                }

            }

        }

        input.close();
    }
}
