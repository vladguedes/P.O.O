package Introducao.Basico;
import java.util.Scanner;
import java.util.Calendar;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        String nome, numero, codigo;
        int mes, ano, anoAtual, mesAtual;
        boolean cartaoInvalido;
        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = calendar.get(Calendar.MONTH);
        
        do {
            System.out.println("Validando o seu cartão.");
            System.out.print("Digite o seu nome: ");
            nome = input.nextLine();
            System.out.print("Digite o número cartão: ");
            numero = input.nextLine();
            System.out.print("Digite o código: ");
            codigo = input.nextLine();
            System.out.println("Digite a validade do cartão");
            System.out.print("Mês: ");
            mes = input.nextInt();
            System.out.print("Ano: ");
            ano = input.nextInt();
            input.nextLine();

            cartaoInvalido = (ano < anoAtual || (ano == anoAtual && mes < mesAtual));
            if (cartaoInvalido) System.out.println("Cartão Inválido!\nTente Novamente!");
        } while (cartaoInvalido);

        System.out.println("\nCartão Válido!");
        System.out.printf("\nNome: %s\nNúmero: %s\nCódigo: %s\nValido até %d/%d", nome, numero, codigo, mes, ano);



        input.close();
    }
}