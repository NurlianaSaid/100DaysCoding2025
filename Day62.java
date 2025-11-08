package Days;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai batas : ");
        int n = in.nextInt();
        int total = 0;
        
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        for (int i = 1; i <= n; i++) {
            if(i == n){
                System.out.print(i);
            }else{
            System.out.print(i +"+ ");
        }
        }
        System.out.println(" = "+total);
    }
}
