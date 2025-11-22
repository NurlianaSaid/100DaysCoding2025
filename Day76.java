package latihanArray;

import java.util.Scanner;

public class LatihanLengkap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] data = new String[5];

        // Mengisi array
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan kata ke-" + (i+1) + ": ");
            data[i] = input.nextLine();
        }

        System.out.println("\n=== PENGECEKAN ===");

        // 1. isEmpty → cek apakah ada elemen yang kosong
        System.out.println("\nCek elemen kosong (isEmpty):");
        for (int i = 0; i < data.length; i++) {
            if (data[i].isEmpty()) {
                System.out.println("Index " + i + " kosong!");
            }
        }

        // 2. equals → mencari kata yang sama persis
        System.out.print("\nCari kata (equals): ");
        String cariExact = input.nextLine();

        for (String d : data) {
            if (d.equals(cariExact)) {
                System.out.println("Ditemukan kata yang sama persis: " + d);
            }
        }

        // 3. equalsIgnoreCase → mencari tanpa peduli huruf besar kecil
        System.out.print("\nCari kata (equalsIgnoreCase): ");
        String cariCase = input.nextLine();

        for (String d : data) {
            if (d.equalsIgnoreCase(cariCase)) {
                System.out.println("Ditemukan tanpa lihat huruf besar-kecil: " + d);
            }
        }

        // 4. contains → cari kata yang ada di dalam teks
        System.out.print("\nCari kata yang mengandung (contains): ");
        String cariBagian = input.nextLine();

        for (String d : data) {
            if (d.contains(cariBagian)) {
                System.out.println("Ditemukan kata yang mengandung '" + cariBagian + "': " + d);
            }
        }
    }
}
