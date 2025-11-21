
import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukan Nama : ");
        String nama = in.nextLine();
        
        System.out.println("Panjang Nama \t: " + nama.length());
        System.out.println("Nama Besar\t: " + nama.toUpperCase());
        System.out.println("Nama kecil\t: " + nama.toLowerCase());

    }
}
