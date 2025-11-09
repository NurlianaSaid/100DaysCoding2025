
package Days;

import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tampilkan perkalian : ");
        int a = in.nextInt();
        
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= 10; j++) {
                    System.out.println(i +" X "+ j+" = "+(i*j));
               
            }
               System.out.println("");
        }
     
    }
}
