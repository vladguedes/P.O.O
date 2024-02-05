package Lista_1.CriacaoDeClasses;

public class DemoFatura {
    public static void main(String[] args) {

        Fatura faturas = new Fatura("PC", "0108M", 3, 2.0f);

        System.out.println("Valor total: " + faturas.calculaTotal(faturas.quantidadeComprada, faturas.precoUnitario));

    }
}