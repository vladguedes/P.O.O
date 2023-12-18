package faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael", "cs0981", 3, 0.75);
        System.out.println("Matricula" + michael.calculaMensalidade());
    }
    
}
