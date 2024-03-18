package Introducao.Classes.aluno;

public class DemoAluno {
    public static void main(String[] args) {
        float[] notas = {9.0f, 8.0f};
        Aluno a1 = new Aluno("Leo", "202021", notas, 10f);

        System.out.println(a1.mediaParcial());
    }
}
