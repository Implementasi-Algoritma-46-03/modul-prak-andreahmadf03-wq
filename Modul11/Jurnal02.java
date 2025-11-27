import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        String[] arr = input.split("\\s+");
        String hasil = String.join(" ", arr);

        System.out.println(hasil);
    }
}