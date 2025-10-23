import java.util.Scanner;

public class TP03 {

    public static String persegi(int  dataIn) {
        int rumusKeliling, rumusLuas;
        //tes
        rumusLuas = dataIn * dataIn;
        rumusKeliling = 4 * dataIn;
        System.out.println(rumusLuas + " " + rumusKeliling);
        return rumusLuas + " " + rumusKeliling;
    }

    public static String persegiPanjang(int dataA, int dataB) {
        int rumusKeliling, rumusLuas;

        rumusLuas = dataA * dataB;
        rumusKeliling = 2 * (dataA + dataB);
        System.out.println(rumusLuas + " " + rumusKeliling);
        return rumusLuas + " " + rumusKeliling;
    }

    public static String segitiga(int dataA, int dataB) {
        int rumusKeliling, rumusLuas;

        rumusLuas = (dataA * dataB) / 2;
        double sisiMiring = Math.sqrt(Math.pow(dataA, 2) + Math.pow(dataB, 2));
        rumusKeliling = dataA + dataB + (int) Math.round(sisiMiring);
        System.out.println(rumusLuas + " " + rumusKeliling);
        return rumusLuas + " " + rumusKeliling;
    }

    public static String lingkaran(int data) {
        double phi = 3.14;
        double kelilingLing, luasLing;

        double jariJari = data / 2.0;
        luasLing = phi * jariJari * jariJari;
        kelilingLing = phi * data;
        System.out.printf( "%.2f %.2f", luasLing, kelilingLing);
        return String.format("%.2f %.2f", luasLing, kelilingLing);
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String bangunDatar = input.nextLine();

        int sisi, panjang, lebar, alas, tinggi, diameter;
        switch (bangunDatar) {
            case "Persegi":
                sisi = input.nextInt();
                persegi(sisi);
                break;

            case "Persegi Panjang":
                panjang = input.nextInt();
                lebar = input.nextInt();
                persegiPanjang(panjang, lebar);
                break;

            case "Segitiga":
                alas = input.nextInt();
                tinggi = input.nextInt();
                segitiga(alas, tinggi);
                break;

            case "Lingkaran":
                diameter = input.nextInt();
                lingkaran(diameter);
                break;

            default:
                System.out.println("Data tidak valid");
        }
    }
}