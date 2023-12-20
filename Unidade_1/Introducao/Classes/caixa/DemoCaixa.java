package caixa;

public class DemoCaixa {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco(1);
        CaixaBanco caixa2 = new CaixaBanco(2);
        CaixaBanco caixa3 = new CaixaBanco(3);
        CaixaBanco caixa4 = new CaixaBanco(4);
        CaixaBanco caixa5 = new CaixaBanco(5);

        caixa1.iniciaAtendiamento();
        caixa2.iniciaAtendiamento();
        caixa3.iniciaAtendiamento();
        caixa4.iniciaAtendiamento();
        caixa5.iniciaAtendiamento();

    }
}
