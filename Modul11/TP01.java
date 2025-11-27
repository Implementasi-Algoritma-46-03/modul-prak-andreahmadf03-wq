import java.util.*;

public class TP01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();
        x.nextLine();

        String arr[] = new String[n];

        for(int i=0;i<n;i++){
            arr[i] = x.nextLine();
        }

        for(int i=0;i<n;i++){
            System.out.println("Bulan " + (i+1) + ": " + arr[i]);
        }
    }
}