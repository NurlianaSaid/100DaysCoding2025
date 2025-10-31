/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluasi;

import java.util.Scanner;


public class menuIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double total= 0;
        double valid = 0; 
        double tdkvalid = 0; 
        double mak = 0;
        double min = 0;
        boolean pertamaKali = true; // Flag untuk menandai input pertama
//        final int KODE_STOP = -1;
        final double KODE_STOP = -1; // Menggunakan 5.0 sebagai kode stop
        System.out.println("--- Penyaringan Nilai Mahasiswa ---");
        System.out.println("Masukkan nilai sampai " + KODE_STOP + " untuk mengakhiri input.");
        
        while(true){
            System.out.print("Masukkan Nilai : ");
            double a = in.nextDouble();
            
            // 1. KODE PENGHENTIAN
            if(a == KODE_STOP){
                break; // Keluar dari loop
            }
            // 2. KONDISI TIDAK VALID
            if(a<0 || a>100){
                tdkvalid++;
                continue;
            }
            // --- LOGIKA UTAMA (Hanya dijalankan jika nilai VALID) ---
                valid++;
                total += a;
            // 3. INISIALISASI MAKS/MIN DENGAN INPUT PERTAMA
            if(pertamaKali){
                mak = a;
                min = a;
                pertamaKali = false; // Set flag menjadi false agar blok ini tidak dijalankan lagi
            }
           if (a > mak){
            mak = a;
           }
           if (a < min){
            min = a;
           }
            
           
            
        }
       // 6. Tampilkan Hasil
        System.out.println("\n--- Hasil Analisis ---");
        System.out.printf("Jumlah Nilai Valid\t: %.0f\n", valid);
        System.out.printf("Jumlah Nilai Tidak Valid: %.0f\n", tdkvalid);
        
        if (valid > 0) {
            double rataRata = total / valid;
            System.out.printf("Total Nilai Valid\t: %.0f\n", total);
            System.out.printf("Nilai Terkecil\t\t: %.0f\n", min);
            System.out.printf("Nilai Terbesar\t\t: %.0f\n", mak);
            System.out.printf("Rata-rata Nilai Valid\t: %.0f\n", rataRata);
        } else {
            System.out.println("Tidak ada nilai valid yang dimasukkan.");
        }
        
        in.close();   
    }
}
