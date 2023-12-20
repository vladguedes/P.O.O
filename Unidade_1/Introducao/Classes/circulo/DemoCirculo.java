package circulo;

public class DemoCirculo {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2.5);
        System.out.println("PI = " + Circulo.pi);
        System.out.println("Perimetro: " + c1.perimetro());
    }
}
