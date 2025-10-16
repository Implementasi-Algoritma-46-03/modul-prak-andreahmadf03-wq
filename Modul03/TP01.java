import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int Nominal_awal;
        Nominal_awal = input.nextInt();

        int Jumlah_tabungan_perhari;
        Jumlah_tabungan_perhari = input.nextInt();

        int Lama_menabung;
        Lama_menabung = input.nextInt();

        int Total_tabungan = Nominal_awal + (Jumlah_tabungan_perhari * Lama_menabung);

        System.out.print(Total_tabungan);
    }
}
