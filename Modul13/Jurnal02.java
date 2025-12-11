import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] inventaris = new String[n];

        for (int i = 0; i < n; i++) {
            inventaris[i] = input.next();
        }

        // Proses Insertion Sort (Ascending / Kecil ke Besar)
        for (int i = 1; i < n; i++) {
            String key = inventaris[i];
            int j = i - 1;

            // Bandingkan: Jika elemen kiri (arr[j]) LEBIH BESAR dari key, geser ke kanan
            while (j >= 0 && inventaris[j].compareTo(key) > 0) {
                inventaris[j + 1] = inventaris[j];
                j = j - 1;
            }
            inventaris[j + 1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(inventaris[i]);
            if (i < n - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
