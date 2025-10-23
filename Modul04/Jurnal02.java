import java.util.Scanner;
public class Jurnal02 {

 public static void main(final String[] args) {
        // Kerjakan soalnya di sini

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double pajakPersen;

        if (N <= 50) {
            pajakPersen = 5;
        } else if (N <= 250) {
            pajakPersen = 15;
        } else if (N <= 500) {
            pajakPersen = 25;
        } else {
            pajakPersen = 30;
        }

        double besarPajak = N * 1_000_000 * (pajakPersen / 100);
        double penghasilanBersih = (N * 1_000_000) - besarPajak;

        System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
        System.out.println("Pajak " + (int)pajakPersen + "% = Rp. " + (int)besarPajak);
        System.out.println("Penghasilan bersih = Rp. " + (int)penghasilanBersih);

        input.close();
    }
}
