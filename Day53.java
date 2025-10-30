package isc100dayscooding;
import java.util.Scanner;

public class keyboardBreak {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int total = 0;
        while (true) {
            System.out.print("Masukkan angka  : ");
            int a = in.nextInt();
        //    System.out.println(a);
            if (a == 0) {
                break;
            }
            total += a;
        }
        System.out.println("Total angka adalah "+total);
        in.close();
    }
}
