import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double gram = input.nextDouble();
        int N = input.nextInt();

        double sisa = gram;
        int hari = 0;

        while (hari + 10 <= N)  {
            sisa = sisa / 2;
            hari += 10;
        }
        System.out.printf("%.3f", sisa);
    }
}
