import java.util.Scanner;
//edit
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner andre = new Scanner(System.in);
         
        int a = andre.nextInt();
        int b = andre.nextInt();
        int c = andre.nextInt();

        double rataRata = (a + b + c)/3.0;

        System.out.printf("Nilai rata-rata: %.2f", rataRata);

    }
}
