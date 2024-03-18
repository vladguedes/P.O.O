package elevador;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int quantidadePessoasPresentes;

    public Elevador(int totalAndares, int capacidade) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.quantidadePessoasPresentes = 0;
    }

    public void entra() {
        if (quantidadePessoasPresentes < capacidade) {
            quantidadePessoasPresentes++;

        } 

    }

    public void sai() {
        if (quantidadePessoasPresentes > 0) {
            quantidadePessoasPresentes--;

        }

    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;

        }

    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;

        }
        
    }

    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", capacidade=" + capacidade
                + ", quantidadePessoasPresentes=" + quantidadePessoasPresentes + "]";
    }

    
    
}
