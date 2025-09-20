package Codingan;
import java.util.Scanner;
public class Day13 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===SELAMAT DATANG DIPROGRAM EVALUASI JAVA===");
        System.out.println("----- SILAHKAN ISI BIODATA ANDA-----");
        System.out.print("MASUKKAN NAMA = ");
        String nama = input.nextLine();
        System.out.print("MASUKKAN NIM = ");
        String nim = input.nextLine();
        System.out.print("MASUKKAN USIA (Harus Angka) =");
        int usia = input.nextInt();
        input.nextLine(); // Tambahkan ini untuk mengonsumsi newline karakter
        System.out.print("MASUKKAN TINGGI BADAN (Angka) =");
        float tb = input.nextFloat();
        input.nextLine(); // Tambahkan ini untuk mengonsumsi newline karakter
        System.out.print("MASUKKAN HOBI = ");
        String hobi = input.nextLine();
        System.out.print("APAKAH MASIH MAHASISWA (true/false) ?");
        boolean sm = input.nextBoolean();
        
        // input.nextLine(); // Tambahkan ini untuk mengonsumsi newline karakter
        System.out.println("\n====== Lanjut ke Operasi Variabel & Update Data=======");
        int tabungan = 1000000;
        int tambahan= 500000;
        int uang1 = tabungan + tambahan;
        int pengeluaran = 200000;
        int tabungansisa = uang1 - pengeluaran;
                System.out.println("Uang Awal = "+tabungan);
                System.out.println("Uang setelah di tambah Rp.500.000 = "+uang1);
                System.out.println("Uang setelah di belanjakan Rp.200.000 = "+tabungansisa);
                //update data
                pengeluaran = 500000;
                tabungansisa = uang1 - pengeluaran;
                System.out.println("Uang setelah pengeluaran di update jadi Rp.500.000= "+tabungansisa);
                
                System.out.println();
                
                System.out.println("MENCARI LUAS LINGKARAN");
                double PHI = 3.14159;
        System.out.print("Masukan jari-jari = ");
        double r = input.nextDouble();
        float L = 0;
        L =(float)(PHI * r * r);
                
        System.out.println("\n====BIODATA " + nama + "====");
        System.out.println("NAMA LENGKAP        \t= " + nama);
        System.out.println("NIM                 \t= " + nim);
        System.out.println("UMUR                \t= " + usia + "tahun");
        System.out.println("TINGGI BADAN        \t= " + tb + "cm" );
        System.out.println("HOBI                \t= " + hobi);
        System.out.println("STATUS MAHASISWA    \t= " + sm);
        System.out.println("TABUNGAN            \t= " + tabungansisa);
        System.out.printf ("LUAS LINGKARAN      \t=%.2f ",L);
        System.out.println("\n------TERIMAKASIH---------");

    }
}
    
