package Unidade_2.Arrays;
import java.util.ArrayList;

public class Extrato {
    private double saldo;
    private ArrayList<Double> transacoes;

    Extrato() {
        saldo = 0.0;
        transacoes = new ArrayList<Double>();
    }

    public void deposito(double valor) {
        saldo += valor;
        transacoes.add(valor);
    }

    public void saque(double valor) {
        if (saldo >= valor){
            transacoes.add(-valor);
            saldo -= valor;
        }
    }

    public void visualizar() {
        System.out.println("======================");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println("Transação #" + i + ":" + transacoes.get(i));
        }
        System.out.println("Saldo: " + saldo);
        System.out.println("======================");
    }
}
