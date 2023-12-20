package banco;

public class ContaBancaria {
    private String nomeCorrentista;
    private double saldo;
    private boolean ehEspecial;

    ContaBancaria(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0.0;
        this.ehEspecial = false;
    }

    ContaBancaria(String nomeCorrentista, double saldo, boolean ehEspecial) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
    }

    public String toString() {
        return ("[Correntista = " + nomeCorrentista + ", saldo = " + saldo + ", ehEspecial = " + (ehEspecial? "sim": "não") + "]");
    }
}