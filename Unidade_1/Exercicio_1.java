import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        System.out.println("Bom dia, qual é o seu nome?");
        Scanner input = new Scanner(System.in);
        String nome;
        
        nome = input.nextLine();
        System.out.printf("Seja bem vindo(a) %s", nome);

        input.close();
    }
}
