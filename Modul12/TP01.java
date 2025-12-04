import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[][] matriks = new int[N][N];
        int total = 0;

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                matriks[i][j] = s.nextInt();
                total += matriks[i][j];
            }

        }
        System.out.println(total);
    }
}
