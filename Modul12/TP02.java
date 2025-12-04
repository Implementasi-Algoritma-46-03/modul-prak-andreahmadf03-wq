import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int [][] matriks1 = new int[N][N];
        int [][] matriks2 = new int[N][N];
        int [][] hasil = new int[N][N];
        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                matriks1[i][j] = s.nextInt();
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                matriks2[i][j] = s.nextInt();
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(hasil[i][j]);
                if (j < N - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}