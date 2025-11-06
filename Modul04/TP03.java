import java.util.Scanner;
public class TP03 {
//tess
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilaiDira = scanner.nextInt();
        int nilaiRadi = scanner.nextInt();
        int nilaiIdar = scanner.nextInt();

        if (nilaiDira > nilaiRadi && nilaiDira > nilaiIdar) {
            System.out.println("Dira");
        } else if (nilaiRadi > nilaiDira && nilaiRadi > nilaiIdar) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

        scanner.close();
    }
}