package caixa;

public class CaixaBanco {
    private int numeroCaixa;
    private static int clientesAtendidos = 0;

    CaixaBanco(int numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
        System.out.println("Caixa " + numeroCaixa + " inicializado");
    }

    public void iniciaAtendiamento() {
        System.out.println("Caixa " + numeroCaixa + " atendeu o cliente " + (clientesAtendidos + 1));
        clientesAtendidos++;
    }
}
