import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int Nominal_awal;
        System.out.print("Masukkan Nominal Awal: ");
        Nominal_awal = input.nextInt();

        int Jumlah_tabungan_perhari;
        System.out.print("Masukkan Jumlah tabungan perhari: ");
        Jumlah_tabungan_perhari = input.nextInt();

        int Lama_menabung;
        System.out.print("Masukkan Lama menabung (dalam hari): ");
        Lama_menabung = input.nextInt();

        int Total_tabungan = Nominal_awal + (Jumlah_tabungan_perhari * Lama_menabung);

        System.out.print("Total tabungan anda adalah: " + Total_tabungan);
    }
}
