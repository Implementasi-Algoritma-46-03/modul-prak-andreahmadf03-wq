import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int menu = in.nextInt();
        int jumlahMakanan = in.nextInt();
        

        String namaMenu = null;
        int harga = 0;

        switch (menu) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
            namaMenu = "Mie Goreng/Nyemek";
            harga = 18000; 
                break;
            case 3:
                namaMenu = "Kwetiau Goreng/Nyemek";
                harga = 20000;
                break;
            case 4:
                namaMenu = "Capcay Goreng/Kuah";
                harga = 23000;
                break;
            default:
            System.out.println("Menu tidak ada!");
                return;
        }
        int total = jumlahMakanan * harga;
        System.out.println(namaMenu + " " + jumlahMakanan + " buah, total harga Rp. " + total );

    }
}