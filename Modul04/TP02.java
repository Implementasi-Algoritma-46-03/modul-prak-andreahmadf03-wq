import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
         Scanner scanner = new Scanner(System.in);
        int totalTransaksi = scanner.nextInt();

        double jumlahDiskon = 0.0;
        if (totalTransaksi > 200000) {
            jumlahDiskon = 0.05 * totalTransaksi;
        }

        double totalSetelahDiskon = totalTransaksi - jumlahDiskon;
        double pajakPpn = 0.11 * totalSetelahDiskon;
        double totalPembayaran = totalSetelahDiskon + pajakPpn;

        System.out.println("Transaksi = " + totalTransaksi);
        System.out.println("Total = " + totalTransaksi + " - " + jumlahDiskon);
        System.out.println("Ppn 11% = " + pajakPpn);
        System.out.println("Total dibayar = " + totalPembayaran);

        scanner.close();
    }
}
