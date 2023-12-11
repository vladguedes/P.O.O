package Introducao.Basico;
import java.util.Scanner;

/**
 * hello_world
 */
public class hello_world {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        valor = input.nextInt();
        System.out.println(valor);

        input.close();
    }
}