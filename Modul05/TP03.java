import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        String bangunDatar = in.nextLine().toLowerCase();


        switch (bangunDatar) {
            case "persegi":
                int sisi = in.nextInt();
                int luas = sisi * 3;
                int keliling = sisi * 4;
                System.out.println(luas);
                System.out.println(keliling);
                break;
            case "persegi panjang":
                int panjang = in.nextInt();
                int lebar = in.nextInt();
                int luasp = panjang * lebar;
                int kelilingp = 2 * (panjang + lebar);
                System.out.println(luasp);
                System.out.println(kelilingp);
                break;
            case "segitiga":
                int alas = in.nextInt();
                int tinggi = in.nextInt();
                double luass = 0.5 * alas * tinggi;
                int luas1 = (int) luass;
                int sisiMiring = (alas * alas) + (tinggi * tinggi);

                int angka = 1;
                int akar = -1;
                while (angka * angka <= sisiMiring) {
     
                    if (angka * angka == sisiMiring) {
                        akar = angka;
                        break;
                    }
                    angka++;
                }

                if (akar != -1){
                    int kelilings = alas + tinggi + akar;
                    System.out.println(luas1);
                    System.out.println(kelilings);
                }else{
                    System.out.println(""); 
                }
            case "lingkaran":
                int diameter = in.nextInt();
                double jari_jari = diameter / 2;
                double pi = 3.14;
                double luasl = pi * (jari_jari * jari_jari);
                double kelilingl = 2 * pi * jari_jari;
                System.out.printf("%.2f", luasl );
                System.out.println();
                System.out.printf("%.2f", kelilingl);
        }

    }
}