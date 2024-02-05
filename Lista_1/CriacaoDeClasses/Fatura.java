package Lista_1.CriacaoDeClasses;


public class Fatura {
    String descricao;
    String identificacao;
    int quantidadeComprada;
    float precoUnitario;

    Fatura(String descricao, String identificacao, int quantidadeComprada, float precoUnitario) {
        this.descricao = descricao;
        this.identificacao = identificacao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    float calculaTotal(int quantidadeComprada, float precoUnitario) {
        float valorDaCompra;
        valorDaCompra = quantidadeComprada * precoUnitario;

        return (valorDaCompra);
    }

}