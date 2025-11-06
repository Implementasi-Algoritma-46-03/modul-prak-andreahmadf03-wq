import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca input nilai Dira (D), Radi (R), dan Idar (I)
        int dira = input.nextInt();
        int radi = input.nextInt();
        int idar = input.nextInt();

        // 6 kondisi untuk menentukan urutan nilai dari terkecil ke terbesar
        if (dira < radi && radi < idar) {
            System.out.println("Dira, Radi, Idar");
        } 
        else if (dira < idar && idar < radi) {
            System.out.println("Dira, Idar, Radi");
        } 
        else if (radi < dira && dira < idar) {
            System.out.println("Radi, Dira, Idar");
        } 
        else if (radi < idar && idar < dira) {
            System.out.println("Radi, Idar, Dira");
        } 
        else if (idar < dira && dira < radi) {
            System.out.println("Idar, Dira, Radi");
        } 
        else if (idar < radi && radi < dira) {
            System.out.println("Idar, Radi, Dira");
        }

        input.close();
    }
}
