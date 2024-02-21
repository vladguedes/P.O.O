package Unidade_2.Arrays;
import java.util.Scanner;

public class DemoExtrato {
    public static void main(String[] args) {
        int op;
        double valor;
        Scanner input = new Scanner(System.in);
        Extrato extrato = new Extrato();
        System.out.println("1 - Depositar");
        System.out.println("2 - Saque");
        System.out.println("3 - Visualizar Extrato");
        System.out.println("4 - Encerrar");
        
        do {
            op = input.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Opção escolhida: Deposito");
                    System.out.print("Valor do deposito: ");
                    valor = input.nextDouble();
                    extrato.deposito(valor);
                    break;

                case 2:
                    System.out.println("Opção escolhida: Saque");
                    System.out.print("Valor do saque: ");
                    valor = input.nextDouble();
                    extrato.saque(valor);
                    break;

                case 3:
                    System.out.println("Opção escolhida: Visualizar Extrato");
                    extrato.visualizar();
                    break;

                case 4:
                    System.out.println("Opção escolhida: Encerrar");
            }
    } while(op != 4);

        input.close();

    }
}
