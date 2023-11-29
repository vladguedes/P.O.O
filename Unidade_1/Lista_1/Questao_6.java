import java.util.Scanner;

/**
 * Questao_6
 */
public class Questao_6 {

    public static void main(String[] args) {
        System.out.print("Digite os minutos: ");
        Scanner input = new Scanner(System.in);
        int minutos, dias, resto, horas, minutosf;

        minutos = input.nextInt();
        dias = minutos / (60 * 24);  // Calcular dias
        resto = minutos % (60 * 24); // Calcular o resto em minutos
        horas = resto / 60;          // Calcular horas
        minutosf = resto % 60;       // Calcular minutos restantes

        System.out.printf("\n%d minutos = %d dias, %d horas e %d minutos.", minutos, dias, horas, minutosf);

        input.close();
    }
}
