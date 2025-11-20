import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner x = new Scanner(System.in);
        //tess
        int n = x.nextInt();
        int k = 0;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || j==n-i+1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}