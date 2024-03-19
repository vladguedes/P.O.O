package Unidade_2.Herança;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, String identidade, String partido) {
        super(nome, identidade);
        this.partido = partido;
    }

    @Override
    public String toString() {
        return (super.toString() + ", partido=" + partido);
    }

}
