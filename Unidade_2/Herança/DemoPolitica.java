package Unidade_2.Herança;

public class DemoPolitica {
    public static void main(String[] args) {
        Politico p = new Politico("João", "098154", "PT");
        Governador g = new Governador("Pedro", "2314", "PTB", "RN");
        Prefeito pr = new Prefeito("Carlos", "098343", "PSDB", "Martins");

        System.out.println(p);
        System.out.println(g);
        System.out.println(pr);

    }
}
