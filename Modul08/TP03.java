import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int bilangan;
        int hasil = 0;
        bilangan = in.nextInt();
        while (bilangan != 0){

            hasil = bilangan + hasil;
            bilangan = in.nextInt();
        }
        System.out.println(hasil);
    }
}