import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int counter = 0;
        int hasilAkhir = 0;
        int modus = 0;
        int a;
        ArrayList<Integer> arr = new ArrayList<>();
        do {
            a = s.nextInt();
            if(a != -1) {
                arr.add(a);
            }
        } while (a != -1);

        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    counter++;
                }
            }
            if(counter >= hasilAkhir) {
                modus = arr.get(i);
                hasilAkhir = counter;
            } 
        }
        System.out.println(modus);
    }
}