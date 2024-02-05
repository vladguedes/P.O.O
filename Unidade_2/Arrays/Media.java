package Unidade_2.Arrays;

public class Media {
    public static void main(String[] args) {
        System.out.println("Média de 2 numeros: " + media(2.3, 4.5));
        System.out.println("Média de 3 numeros: " + media(2.3, 4.5, 3.5));
        System.out.println("Média de 4 numeros: " + media(2.3, 4.5, 4.0, 5.5));
        System.out.println("Média de 4 numeros: " + media(2.3, 4.5, 2.5, 6.5));

    }

    public static double media(double...numeros) {
        double soma = 0.0;
        for (double d : numeros) {
            soma += d;
        }

        return (soma / numeros.length);
    }
}   
