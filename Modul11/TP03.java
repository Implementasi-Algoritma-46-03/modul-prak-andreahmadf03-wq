import java.util.*;

public class TP03 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        String kal = z.nextLine();
        kal = kal.trim();

        if(kal.equals("")){
            System.out.println(0);
        } else {
            String kata[] = kal.split(" +");
            System.out.println(kata.length);
        }
    }
}