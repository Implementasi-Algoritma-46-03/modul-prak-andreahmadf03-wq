import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        String Nama;
        System.out.print("Masukkan Nama: ");
        Nama = input.nextLine();

        int Jumlah_Barang;
        System.out.print("Masukan jumlah barang: ");
        Jumlah_Barang = input.nextInt();

        int Harga_perbarang;
        System.out.print("Masukkan harga perbarang: ");
        Harga_perbarang = input.nextInt();

        int Total_harga = Jumlah_Barang * Harga_perbarang;

        System.out.print("Hi, " + Nama + ". Total belanja adalah: " + Total_harga + " rupiah.");
    }
}