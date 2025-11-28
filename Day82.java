package Days;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Array : ");
        int jumlah = in.nextInt();
        int a [] = new int[jumlah];
        
        System.out.print("Isi Array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("Hasil 1-N : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nHasil N-1 : ");
        for (int i = jumlah-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nGeser 1 : ");
        String tamp = "";
        for (int i = 1; i < jumlah; i++) {
            tamp += a[i] + " ";
        }
        tamp += a[0];
        System.out.println(tamp);
    }
}
