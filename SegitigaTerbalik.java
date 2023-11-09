import java.util.Scanner;

public class SegitigaTerbalik {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N;
        int i;
        int j;

        System.out.print("Masukan tinggi segitiga: ");
        N = scan.nextInt();

        for(i = 0; i < N; i++){
            for(j = 1; j <= N - i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
