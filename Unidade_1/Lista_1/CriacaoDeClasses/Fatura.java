package Lista_1.CriacaoDeClasses;

import java.util.Scanner;

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

    void novoProduto() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nDigite a identificação do produto: ");
        identificacao = input.next();
        System.out.print("\nDigite a descrição do produto: ");
        descricao = input.nextLine();
        System.out.print("\nDigite o preço deste  produto: ");
        precoUnitario = input.nextFloat();
        input.close();
    }

    float calculaTotal(int quantidadeComprada, float precoUnitario) {
        float valorDaCompra;
        valorDaCompra = quantidadeComprada * precoUnitario;

        return (valorDaCompra);
    }

}