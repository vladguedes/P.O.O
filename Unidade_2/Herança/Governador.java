package Unidade_2.Herança;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, String identidade, String partido, String estado) {
        super(nome, identidade, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return (super.toString() + ", estado=" + estado);
    }

}