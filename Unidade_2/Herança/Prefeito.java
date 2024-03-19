package Unidade_2.Herança;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, String identidade, String partido, String cidade) {
        super(nome, identidade, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return (super.toString() + ", cidade=" + cidade);
    }

}
