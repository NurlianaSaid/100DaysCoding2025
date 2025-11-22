package latihan;

import java.util.Scanner;

public class day76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nama = new String[5];

        // INPUT
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama : ");
            nama[i] = in.nextLine();
        }

        // ================================
        // CEK ELEMEN KOSONG (isEmpty)
        // ================================
        System.out.println("\nCek elemen kosong (isEmpty)");
        boolean kosong = false;

        for (int i = 0; i < nama.length; i++) {
            if (nama[i].isEmpty()) {
                System.out.println("Index " + i + " kosong");
                kosong = true;
            }
        }

        if (!kosong) {
            System.out.println("Semua index terisi!");
        }

        // ================================
        // equals
        // ================================
        System.out.println("\nCari kata (equals)");
        System.out.print("Masukkan nama : ");
        String cari1 = in.nextLine();

        boolean ditemukan1 = false;
        for (String d : nama) {
            if (d.equals(cari1)) {
                System.out.println("Ditemukan kata yang sama persis: " + d);
                ditemukan1 = true;
            }
        }
        if (!ditemukan1) {
            System.out.println("Tidak ada yang sama persis.");
        }

        // ================================
        // equalsIgnoreCase
        // ================================
        System.out.println("\nCari kata (equalsIgnoreCase)");
        System.out.print("Masukkan nama : ");
        String cari2 = in.nextLine();

        boolean ditemukan2 = false;
        for (String d : nama) {
            if (d.equalsIgnoreCase(cari2)) {
                System.out.println("Ditemukan tanpa lihat huruf besar/kecil: " + d);
                ditemukan2 = true;
            }
        }
        if (!ditemukan2) {
            System.out.println("Tidak ada kata yang cocok (ignore case).");
        }

        // ================================
        // contains
        // ================================
        System.out.println("\nCari elemen dalam kata (contains)");
        System.out.print("Masukkan kata : ");
        String kata = in.nextLine();

        boolean ditemukan3 = false;
        for (String d : nama) {
            if (d.contains(kata)) {
                System.out.println("Ada kata yang mengandung '" + kata + "': " + d);
                ditemukan3 = true;
            }
        }
        if (!ditemukan3) {
            System.out.println("Tidak ada kata yang mengandung itu.");
        }
    }
}
