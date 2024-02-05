package Lista_1.IntroducaoAoJava;

import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args) {
        System.out.print("Digite um valor maior que 0: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("\nDigite um valor acima de 0!");
        } else {
            System.out.printf("Fibonacci de %d = %d", n, fibonacci(n));
        }

        input.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return (n);
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
