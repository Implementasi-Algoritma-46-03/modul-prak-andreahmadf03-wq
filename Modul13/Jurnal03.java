import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] inventaris = new String[n];

        for (int i = 0; i < n; i++) {
            inventaris[i] = input.next();
        }

        // Input Key yang dicari
        String key = input.next();

        // STEP 1: Sorting dulu (Ascending) agar bisa di-Binary Search
        for (int i = 1; i < n; i++) {
            String temp = inventaris[i];
            int j = i - 1;
            while (j >= 0 && inventaris[j].compareTo(temp) > 0) {
                inventaris[j + 1] = inventaris[j];
                j--;
            }
            inventaris[j + 1] = temp;
        }

        // STEP 2: Binary Search
        int left = 0;
        int right = n - 1;
        int foundIndex = -1; // -1 artinya tidak ditemukan

        while (left <= right) {
            int mid = (left + right) / 2;
            int result = key.compareTo(inventaris[mid]);

            if (result == 0) { // Jika sama persis
                foundIndex = mid;
                break;
            } else if (result > 0) { // Jika key lebih besar (ada di kanan)
                left = mid + 1;
            } else { // Jika key lebih kecil (ada di kiri)
                right = mid - 1;
            }
        }

        // STEP 3: Output sesuai format soal
        if (foundIndex != -1) {
            System.out.println("Ditemukan di indeks ke-" + foundIndex);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}