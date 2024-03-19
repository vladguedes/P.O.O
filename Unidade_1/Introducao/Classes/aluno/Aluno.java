package aluno;

public class Aluno {
    //private String nome;
    //private String matricula;
    private float[] notaProva;
    private float notaTrabalho;

    Aluno(String nome, String matricula, float[] notaProva, float notaTrabalho) {
        //this.nome = nome;
        //this.matricula = matricula;
        this.notaProva = notaProva;

        this.notaTrabalho = notaTrabalho;
    }

    public float mediaParcial() {
        return ((2.5f * this.notaProva[0] + 2.5f * this.notaProva[1] + 2f * this.notaTrabalho) / 7);
    }
    
}
