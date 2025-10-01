

import java.util.Scanner;

public class lingkaran{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double phi = 3.14;
        double luas, keliling, r;

        System.out.print("Masukkan jari-jari (r): ");
        r = input.nextDouble();

        luas = phi * r * r;
        //keliling = 2 * phi * r;

        System.out.println("Luas lingkaran: " + luas);
        //System.out.println("Keliling lingkaran: " + keliling);
    }
}
