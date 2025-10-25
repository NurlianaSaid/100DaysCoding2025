import java.util.Scanner;

public class PerulanganKalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ulang;

        
            System.out.println("===== Kalkulator Sederhana =====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");
            int pilihan = in.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator!");
               // break; // keluar dari perulangan
            }

            System.out.print("Masukkan angka pertama: ");
            double a = in.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double b = in.nextDouble();

            double hasil = 0;

            switch (pilihan) {
                case 1:
                  hasil=(a+b);// tambahkan logika penjumlahan
                    break;
                case 2:
                    hasil = (a-b);// tambahkan logika pengurangan
                    break;
                case 3:
                    hasil = (a*b);// tambahkan logika perkalian
                    break;
                case 4:
                     hasil = (a/b);// tambahkan logika pembagian
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    //continue; // lanjut ke awal loop
            }

            System.out.printf("Hasil: %.0f",hasil);
        
    }
}
