import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int bilangan = in.nextInt();
        int bilangan1 = bilangan % 7;

        switch (bilangan1) {
            case 0:
                System.out.println("Vendredi");
                break;
            case 1:
                System.out.println("Samedi");
                break;
            case 2:
                System.out.println("Dimanche");
                break;
            case 3:
                System.out.println("Lundi");
                break;
            case 4:
                System.out.println("Mardi");
                break;
            case 5:
                System.out.println("Mercredi");
                break;
            case 6:
                System.out.println("Jeudi");
                break;
        }
    }
}
