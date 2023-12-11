package Introducao.Basico;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, med;

        System.out.print("Nota 1: ");
        n1 = input.nextDouble();
        System.out.print("Nota 2: ");
        n2 = input.nextDouble();
        System.out.print("Nota 3: ");
        n3 = input.nextDouble();

        med = media(n1,n2,n3);

        System.out.println("Média = " + med);

        input.close();
    }

    public static double media(double n1, double n2, double n3) {
        double m;
        m = (n1 + n2 + n3) / 3;

        return (m);
    }
}
