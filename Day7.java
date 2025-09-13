package myprogram;
import java.util.Scanner;

public class Day7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tipe data char
        System.out.print("Masukkan status jaga (A untuk aktif, N untuk tidak aktif): ");
        char statusJaga = scanner.next().charAt(0);

        // Tipe data boolean
        boolean isAktif = (statusJaga == 'A' || statusJaga == 'a');
        boolean isTidakAktif = (statusJaga == 'N' || statusJaga == 'n');

        System.out.println("Status jaga \t\t:" + statusJaga);
        System.out.println("Apakah jaga aktif? \t:" + isAktif);

        // Menggunakan boolean untuk menentukan aksi
        if (isAktif) {
            System.out.println("Anda sedang jaga aktif!");
        } else if (isTidakAktif){
            System.out.println("Anda tidak sedang jaga aktif.");
        }else {
            System.out.println("Tolong Masukkan kata yang benar");
        }
    }
}
    
