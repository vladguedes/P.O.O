public class Questao_16 {
    public static void main(String[] args) {
        System.out.println("Todos os números de 3 algarismos que a soma dos cubos de seus algarismos sejam iguais ao próprio número.");
        int CDU, C, D, U;

        for (int i = 100; i <= 999; i++) {
            CDU = i;
            C = CDU / 100;
            D = (CDU - C * 100) / 10;
            U = CDU % 10;

            if ((Math.pow(C, 3)) + (Math.pow(D, 3)) + (Math.pow(U, 3)) == CDU) {
                System.out.printf("\n%d = %d³ + %d³ + %d³\n", CDU, C, D, U);
            }
        }
    }    
}
