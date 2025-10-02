import java.util.Scanner;

public class Jurnal03 {
//edit
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
         
        int p = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        double na = (0.25 * p) + (0.35 * a) + (0.4 * b);
        System.out.printf("%.2f%n", na);
        System.out.println("Lulus MK: " + (na >= 75));

        input.close();

    }
}
