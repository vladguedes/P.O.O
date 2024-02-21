package Unidade_2.Reuso;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao joao = new RegistroAcademicoPosGraduacao("João", "2022010801", "TI", "TCC", "Italo");

        RegistroAcademico paula = new RegistroAcademico("Paula", "2022010701", "Arquitetura");

        RegistroAcademicoPosGraduacao paulaPos = new RegistroAcademicoPosGraduacao("Paula", "2022010701", "Arquitetura", "TCC", "Italo");

        System.out.println(joao.toString());
        System.out.println(paula.toString());
        System.out.println(paulaPos.toString());
    }
}
