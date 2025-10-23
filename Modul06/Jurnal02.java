import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String lirik = s.nextLine();
        String hasil1 = vokalKecil(lirik);
        String hasil2 = vokalBesar(hasil1);
        System.out.println(hasil2);
    }

    private static String vokalKecil(String teks) {
         int panjang = teks.length();
         int panjangTeks = panjang % 5;
         switch (panjangTeks) {
            case 0: return teks.replaceAll("[aiueo]", "a");
            case 1: return teks.replaceAll("[aiueo]", "e");
            case 2: return teks.replaceAll("[aiueo]", "i");
            case 3: return teks.replaceAll("[aiueo]", "o");
            case 4: return teks.replaceAll("[aiueo]", "u");
        } return null;
    }

    private static String vokalBesar(String teks) {
         int panjang = teks.length();
         int panjangTeks = panjang % 5;
         switch (panjangTeks) {
            case 0: return teks.replaceAll("[AIUEO]", "A");
            case 1: return teks.replaceAll("[AIUEO]", "E");
            case 2: return teks.replaceAll("[AIUEO]", "I");
            case 3: return teks.replaceAll("[AIUEO]", "O");
            case 4: return teks.replaceAll("[AIUEO]", "U");
        } return null;
    }
}