public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        for(int a=1;a<=100;a++){
            int cek = 0;

            if(a>1){
                for(int b=1;b<=a;b++){
                    if(a%b==0){
                        cek++;
                    }
                }
                if(cek==2){
                    System.out.print(a+" ");
                }
            }

        }

    }
}  
