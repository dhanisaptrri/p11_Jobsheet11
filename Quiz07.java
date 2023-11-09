import java.util.Scanner;
import java.util.Random;

public class Quiz07 {
    
    public static void main(String [] args){

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("Tebak angka (1-10): ");
                int answer = scan.nextInt();
                scan.nextLine();

                if(answer < number){
                    System.out.println("Yah tebakan ini terlalu kecil, ayo coba lagi!");
                } else if(answer > number){
                    System.out.println("Yah tebakan ini telalu besar, ayo coba lagi!");
                } else{
                    System.out.println("YEAYY! Tebakan ini sesuai!");
                }
                
                success = (answer == number);
            }while(!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = scan.nextLine().charAt(0);
        }while (menu=='Y' || menu =='y');
    }
}
