import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int Jumlah_permen;
        Jumlah_permen = input.nextInt();

        int Jumlah_teman;
        Jumlah_teman = input.nextInt();

        int permen_perteman = Jumlah_permen / (Jumlah_teman + 1);
        int sisa_permen = Jumlah_permen % (Jumlah_teman + 1);
        System.out.println(permen_perteman);
        System.out.println(sisa_permen);
    }
}
