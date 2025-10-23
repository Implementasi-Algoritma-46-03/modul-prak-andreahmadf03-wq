import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double in1 = input.nextDouble();
        double in2 = input.nextDouble();
        double in3 = input.nextDouble();
        //tes
        System.out.print("Celcius: ");
        System.out.printf("%.1f %.1f %.1f", selsius(in1), selsius(in2), selsius(in3));
        System.out.print("\nReamur: ");
        System.out.printf("%.2f %.2f %.2f,", reamur(in1), reamur(in2), reamur(in3));
    }

    public static double selsius(double a) {
        double rumus = (a - 32) * 5/9;
        return rumus;
    }

    public static double reamur(double a) {
        double hasil = (a - 32) * 4/9;
        return hasil;
    }
}