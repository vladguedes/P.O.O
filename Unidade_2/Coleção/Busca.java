package Unidade_2.Coleção;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Busca {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>(Arrays.asList("vermelho", "branco", "azul", "preto", "verde", "roxo", "laranja", "rosa"));
        System.out.println(cores);
        Collections.sort(cores);
        System.out.println(cores);

        buscaBinaria(cores, "preto");
        buscaBinaria(cores, "vermelho");
        buscaBinaria(cores, "rosa");
        buscaBinaria(cores, "cinza");
        buscaBinaria(cores, "amarelo");
        buscaBinaria(cores, "turquesa");
    }

    public static void buscaBinaria(ArrayList<String> lista, String alvo) {
        int i;
        System.out.println("Buscando por " + alvo);
        i = Collections.binarySearch(lista, alvo);
        if (i >= 0) {
            System.out.println("Encontramos " + alvo + " na posição " + i);
        } else {
            System.out.println("Não encontrado!");
        }
    }
}
