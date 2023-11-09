import java.util.Scanner;

public class BintangPersegi07 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan nilai N = ");
        int N = scan.nextInt();

        for(int iOuter=1; iOuter<=N; iOuter++){
        for(int i=0; i<=N; i++){
            System.out.print("*");
        }
        }
    }
}
