import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scanner = new Scanner (System.in);
        int totalrisoles = 0;
        int count = 0;
        int jumlah;

        System.out.println("masukan jumlah risoles yang di beli per orang, diakhiri dengan 0:");
        do{
            jumlah = scanner.nextInt();
            if(jumlah != 0){
                totalrisoles += jumlah;
                count++;
            }
        } while (jumlah != 0);
        if(count > 0){
            double average = (double) totalrisoles / count;
            System.out.printf("%.2f\n", average);
        }else{
            System.out.println("tidak ada risoles yang terjual.");
        }
    }
}
