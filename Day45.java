package latihan;

import java.util.Scanner;

public class AbsensiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode kehadiran (H/I/S/A): ");
        char absen = input.next().toLowerCase().charAt(0);

        switch (absen) {
            case 'h':
                System.out.println("Hadir");
                break;
            case 'i':
                System.out.println("Izin");
                break;
            case 's':
                System.out.println("Sakit");
                break;
            case 'a':
                System.out.println("Alpa");
                break;
            default:
                System.out.println("Kode tidak valid!");
        }
        
                
    }
}
