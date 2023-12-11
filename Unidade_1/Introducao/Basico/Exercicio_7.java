package Introducao.Basico;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        System.out.print("Digite um valor para ser fatorado: ");
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();

        System.out.printf("\n%d! = %d", valor, fatorial(valor));

        input.close();
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return (1);
        } else {
            return (num * fatorial(num - 1));
        }
    }
}
