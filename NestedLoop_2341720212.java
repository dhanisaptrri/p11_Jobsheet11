import java.util.Scanner;

public class NestedLoop_2341720212 {
    
    public static void main(String [] args ){

        Scanner scan = new Scanner(System.in);

        double[][] temps = new double[5][7];
        double ratarata;
        double total=0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {  
                System.out.print("Hari ke-" + (j + 1) + ": ");  

            temps[i][j] = scan.nextDouble();

            }
            System.out.println(); 
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");  
             for (double temp : temps[1]) {  
                total += temp;
                System.out.print(temp + " ");
            }
            ratarata = total/7;
            System.out.println();
            System.out.println("Rata- rata : " + ratarata);
        }
    } 
}