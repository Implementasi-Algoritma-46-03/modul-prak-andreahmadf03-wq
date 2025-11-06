import java.util.Scanner;

public class Jurnal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah makanan (N) dan kode menu (M)
        int jumlah = input.nextInt();
        int menu = input.nextInt();

        String namaMenu;
        int harga;

        // Gunakan switch untuk menentukan nama menu dan harga
        switch (menu) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namaMenu = "Mie Goreng / Nyemek";
                harga = 18000;
                break;
            case 3:
                namaMenu = "Kwetiau Goreng / Nyemek";
                harga = 20000;
                break;
            case 4:
                namaMenu = "Capcay Goreng / Kuah";
                harga = 23000;
                break;
            default:
                System.out.println("Kode menu tidak valid!");
                return; // hentikan program jika kode tidak valid
        }

        // Hitung total harga
        int total = jumlah * harga;

        // Tampilkan hasil
        System.out.println(namaMenu + " " + jumlah + " buah, total harga Rp. " + total);
    }
}
