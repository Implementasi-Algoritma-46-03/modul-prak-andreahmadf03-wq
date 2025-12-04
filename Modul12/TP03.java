import java.util.Scanner;

public class TP03 {

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

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int total = 0;
                for (int k = 0; k < N; k++) {
                    total += matriks1[i][k] * matriks2[k][j];
                }
                hasil[i][j] = total;
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
