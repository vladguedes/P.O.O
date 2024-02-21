package Unidade_2.Reuso;

public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registro;
    private String tituloTese;
    private String nomeDoOrientador;

    public RegistroAcademicoPosGraduacao(String nomeDoAluno, String matricula, String curso, String tituloTese, String nomeDoOrientador) {
        this.registro = new RegistroAcademico(nomeDoAluno, matricula, curso);
        this.tituloTese = tituloTese;
        this.nomeDoOrientador = nomeDoOrientador;
    }

    public String toString() {
        String res = registro.toString();
        res += "Titulo da tese: " + tituloTese + "\n";
        res += "Orientador: " + nomeDoOrientador + "\n";
        return (res);
    }
}
