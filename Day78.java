package pertama;

import java.util.Scanner;

public class Pertama {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        String kata = in.nextLine();

        if (kata.trim().isEmpty()) {
            System.out.println("Tidak boleh kosong");
            return;
        }

        System.out.print("Masukkan kata pembanding : ");
        String kata2 = in.nextLine();

        System.out.println("\n=== HASIL METHOD STRING ===");

        // equals()
        if (kata.equals(kata2)) {
            System.out.println("equals() : Sama persis");
        } else {
            System.out.println("equals() : Berbeda");
        }

        // equalsIgnoreCase()
        if (kata.equalsIgnoreCase(kata2)) {
            System.out.println("equalsIgnoreCase() : Sama (abaikan besar-kecil huruf)");
        } else {
            System.out.println("equalsIgnoreCase() : Berbeda");
        }

        // length()
        System.out.println("length() : " + kata.length());

        // toUpperCase()
        System.out.println("toUpperCase() : " + kata.toUpperCase());

        // toLowerCase()
        System.out.println("toLowerCase() : " + kata.toLowerCase());

        // substring
        if (kata.length() >= 3) {
            System.out.println("substring(0,3) : " + kata.substring(0, 3));
        } else {
            System.out.println("substring : kata terlalu pendek");
        }

        // replace
        System.out.println("replace('a','@') : " + kata.replace("a", "@"));

        // trim
        System.out.println("trim sebelum : [" + kata + "]");
        System.out.println("trim sesudah : [" + kata.trim() + "]");
    }
}
