import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);

        int bilangan = in.nextInt();

        int amouba = 30;
        int waktu = 0;

        while (amouba < bilangan) {
            amouba *= 2;
            waktu += 15;
        }

        System.out.println(waktu);

    }
}
