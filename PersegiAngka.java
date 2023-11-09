import java.net.Socket;
import java.util.Scanner;

public class PersegiAngka {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan ukuran persegi: ");
        int N = scan.nextInt();

     
        for(int i=1; i <= N; i++) {
            for(int j=0; j <= N; j++) {
                if (i == 1 || i == N || j == 0 || j == N) {
                    System.out.print(N);
              }else{
                System.out.print(" ");
                } 
            }
            System.out.println("");
        }
    }
    
}
