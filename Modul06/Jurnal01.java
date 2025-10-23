import java.util.Scanner;

public class Jurnal01 {


    public static String getSapaan(int waktu) {
        if (waktu >= 6 && waktu <= 11) {
            return "pagi";
        } else if (waktu >= 12 && waktu <= 14) {
            return "siang";
        } else if (waktu >= 15 && waktu <= 17) {
            return "sore";
        } else {
            return "malam";
        }
    }

    public static void sapaMahasiswa(String nama, String sapaan) {
        System.out.println("Halo, " + nama + ". Selamat " + sapaan + ".");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama1 = input.nextLine();
        String nama2 = input.nextLine();
        int waktu = input.nextInt();

        String sapaan = getSapaan(waktu);

        sapaMahasiswa(nama1, sapaan);
        sapaMahasiswa(nama2, sapaan);

        input.close();
    }
}