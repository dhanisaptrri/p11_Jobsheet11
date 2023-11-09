import java.util.Scanner;

public class Perulangan07{
    
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan nilai N = ");
        int N = scan.nextInt();

        for(int i=0; i<=N; i++){
            System.out.print("*");

        }
    }
}