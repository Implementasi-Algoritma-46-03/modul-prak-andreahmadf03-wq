import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input Jumlah Barang
        int n = input.nextInt();
        String[] inventaris = new String[n];

        // 2. Input Nama Barang
        for (int i = 0; i < n; i++) {
            inventaris[i] = input.next();
        }

        // 3. Proses Insertion Sort (Descending / Besar ke Kecil)
        for (int i = 1; i < n; i++) {
            String key = inventaris[i];
            int j = i - 1;

            // Bandingkan: Jika elemen kiri (arr[j]) LEBIH KECIL dari key, geser ke kanan
            while (j >= 0 && inventaris[j].compareTo(key) < 0) {
                inventaris[j + 1] = inventaris[j];
                j = j - 1;
            }
            inventaris[j + 1] = key;
        }

        // 4. Output Hasil
        for (int i = 0; i < n; i++) {
            System.out.print(inventaris[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
