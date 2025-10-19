import java.util.Scanner;

public class gajibersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = in.nextLine();
        double pajak = 0.10;
        double gaji = 0;
        double gajiBersih = 0;

        if (nama.equalsIgnoreCase("Liana")) {
            gaji = 10000000;
        } else if (nama.equalsIgnoreCase("Surya")) {
            gaji = 8000000;
        } else if (nama.equalsIgnoreCase("Ahmad")) {
            gaji = 7000000;
        }

        if (gaji > 0) {
            gajiBersih = gaji - (gaji * pajak);
            System.out.printf("Gaji Bersih anda Rp%,.2f.", gajiBersih);
        } else {
            System.out.println("Nama tidak ditemukan.");
        }
    }
}
