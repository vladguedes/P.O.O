import java.text.DecimalFormat;
/**
 * Exercicio_4
 */
public class Exercicio_4 {

    public static void main(String[] args) {
        System.out.println("Conversor de quilómetros.");
        double kmph = 0.0, mps;

        System.out.println("|km/h |\t|m/s  |");
        while (kmph <= 50) {
            mps = kmph * 0.2778;
            System.out.printf("|" + new DecimalFormat("00.00").format(kmph) + "|\t|" + new DecimalFormat("00.00").format(mps) + "|\n", kmph, mps);
            kmph += 0.5;
        }

    }
}