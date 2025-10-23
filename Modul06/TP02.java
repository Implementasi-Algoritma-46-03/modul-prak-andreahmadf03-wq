import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        input.close();
        //tes
        String hasil = hapusVokal(kalimat);

        System.out.println(hasil);
    }

    
    private static String hapusVokal(String teks) {
        return teks.replaceAll("[AIUEOaiueo]", "");
    }
}