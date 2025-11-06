import java.util.Scanner;
public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumFactorials = 0;
        int digit;
        do{
            digit = number % 10;
            sumFactorials += factorial(digit);
            number /= 10;
        } while (number > 0);
        if(sumFactorials == originalNumber){
            System.out.println("YA");
        }else{
            System.out.println("BUKAN");
        }
    }
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
