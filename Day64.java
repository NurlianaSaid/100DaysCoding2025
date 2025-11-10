package Days;

import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan M : ");
        int m = in.nextInt();
        System.out.print("Masukkan pangkat N : ");
        int n = in.nextInt();
        
        int hasil = 1; // mulai dari 1, karena 1 × m tetap m

        for (int i = 1; i <= n; i++) {
            hasil *= m; // sama seperti hasil = hasil * m
        }
        System.out.println(hasil);
    }
}
