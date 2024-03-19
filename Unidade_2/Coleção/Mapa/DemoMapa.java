package Unidade_2.Coleção.Mapa;
import java.util.TreeMap;

public class DemoMapa {
    public static void main(String[] args) {

        String entrada = "Lorem ipsum dolor sit amet consectetur adipiscing elit. Donec molestie dictum purus. Mauris molestie felis vel metus rhoncus feugiat. Fusce in euismod risus. Quisque imperdiet nibh at lobortis semper. Phasellus diam justo, vestibulum in ornare id, aliquet sed enim. Integer sed augue non augue scelerisque placerat a non libero. Etiam suscipit tristique gravida. Curabitur massa arcu, tempor vel ante consectetur, bibendum aliquam dui. Morbi vitae eros vitae metus interdum congue quis id lorem. Mauris aliquet, ipsum in consequat porta, dolor lorem interdum elit, id consequat est augue a velit. Aliquam dignissim elit eu justo fringilla mollis.";
        String palavras[] = entrada.split(" ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        System.out.println("====================================================================================");

        String aux;
        int valor;
        TreeMap<String,Integer> contaPalavras = new TreeMap<>();
        for (String palavra : palavras) {
            aux = palavra.toLowerCase();
            if (contaPalavras.containsKey(aux)) { //palavra jah estah no mapa
                valor = contaPalavras.get(aux);
                contaPalavras.put(aux, valor+1);
            } else { //palavra nao estah no mapa
                contaPalavras.put(aux, 1);
            }
        }
        for (String palavra : contaPalavras.keySet()) {
            System.out.println(palavra + " : " + contaPalavras.get(palavra));
        }
    }
}
