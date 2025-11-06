import java.util.Scanner;

public class Jurnal03 {
/// method 1 
    private static double volumeMax(double r, double h) {
        double PI = 3.14159;
        return PI * r * r * h;
    }
///method 2
    private static double volumeAir(double r, double t) {
        double PI = 3.14159;
        return PI * r * r * t;
    }
///method 3
    private static double persen(double t, double h) {
        return (t / h) * 100;
    }

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        double h = s.nextDouble();
        double t = s.nextDouble();

        double vMax = volumeMax(r, h);
        double vAir = volumeAir(r, t);
        double percent = persen(t, h);

        System.out.printf("%.2f %.2f %.1f%%", vMax, vAir, percent);
        s.close();
    }
}