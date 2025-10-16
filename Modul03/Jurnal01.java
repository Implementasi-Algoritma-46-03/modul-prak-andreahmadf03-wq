import java.util.Scanner;
//edit
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahuang  =  sc.nextInt();
        int lembar1000 =  jumlahuang / 1000;
        int sisa = jumlahuang % 1000;     

        System.out.println(lembar1000);
        System.out.println(sisa);


    }
}
