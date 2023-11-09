import java.util.Scanner;

public class SegitigaAngka07 {
     public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan tinggi segitiga: ");
        int N = scan.nextInt();

        for(int i = 1; i <= N; i++){

            for(int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <=  i; k++){
                System.out.print(k);
            }

            System.out.println();

        }
     }
    
}
