package elevador;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador a = new Elevador(3, 4);

        a.sobe();
        System.out.println(a.toString());
        a.sobe();
        a.sobe();
        a.entra();
        a.entra();
        a.entra();
        System.out.println(a.toString());
        a.sai();
        a.desce();
        System.out.println(a.toString());
    }
}
