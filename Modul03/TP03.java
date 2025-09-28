import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int Jumlah_permen;
        System.out.print("Masukkan Jumlah permen: ");
        Jumlah_permen = input.nextInt();

        int Jumlah_teman;
        System.out.print("Masukkan Jumlah teman: ");
        Jumlah_teman = input.nextInt();

        int permen_perteman = Jumlah_permen / (Jumlah_teman + 1);
        int sisa_permen = Jumlah_permen % (Jumlah_teman + 1);
        if (sisa_permen == 0) {
            System.out.print("jumlah permen ada " + Jumlah_permen + ", dibagi ke Dira dan " + Jumlah_teman + " temannya, maka setiap orang mendapat " + permen_perteman + " perteman, tanpa ada sisa.");
        } else {
            System.out.print("jumlah permen ada " + Jumlah_permen + ", dibagi ke Dira dan " + Jumlah_teman + " temannya, maka setiap orang mendapat " + permen_perteman + " perteman, bersisa " + sisa_permen + " buah.");
        }
    }
}
