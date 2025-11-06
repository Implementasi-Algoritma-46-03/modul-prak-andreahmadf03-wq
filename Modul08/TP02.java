import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);

        int bilangan = in.nextInt();
        int hasil = 0;

        while (bilangan != 0){
            int digit = bilangan % 10;
            // System.out.println("digit -> " + digit);
            hasil = hasil * 10 + digit;
            // System.out.println("hasil -> " + hasil);
            bilangan = bilangan / 10;
            // System.out.println("bilangan -> " + bilangan);
        }

        System.out.println(hasil);
    }
}