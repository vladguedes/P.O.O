public class Questao_13 {
    public static void main(String[] args) {
        System.out.println("================================= MEGA-SENA =================================\n");

        for (int k = 0; k < 4; k++) {
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("|" + i + "|\t");
            }

            System.out.println("\n");
            
            for (int i = 11; i <= 60; i++) {
                System.out.print("|" + i + "|\t");
                
                if (i % 10 == 0) {
                    System.out.println("\n");
                }

            }

            System.out.println("----------------------------------------------------------------------------\n");
        }

    }
}
