package Unidade_2.Coleção.Conjunto;
import java.util.TreeSet;
import java.util.Arrays;

public class DemoConjuntos {
    public static void main(String[] args) {
        String cores[] = {"branco", "vermelho", "azul", "roxo", "verde", "rosa", "preto", "vermelho"};
        TreeSet<String> conjCores = new TreeSet<>(Arrays.asList(cores));
        System.out.println(conjCores);
        System.out.println("Antes de rosa:" + conjCores.headSet("rosa"));
        System.out.println("Antes de rosa:" + conjCores.tailSet("rosa"));
        System.out.println("Primeiro: " + conjCores.first());
        System.out.println("Ultima cor: " + conjCores.last());

    }
}
