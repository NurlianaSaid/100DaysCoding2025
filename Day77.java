package Days;
import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input kata
        System.out.print("Masukkan kata: ");
        String kata = in.nextLine();

        // 1. Trim
        String kataTrim = kata.trim();
        System.out.println("Hasil trim: '" + kataTrim + "'");

        // 2. Substring
        System.out.print("Masukkan indeks mulai substring: ");
        int start = in.nextInt();
        System.out.print("Masukkan indeks akhir substring: ");
        int end = in.nextInt();
        String sub = kataTrim.substring(start, end);
        System.out.println("Hasil substring: " + sub);

        in.nextLine(); // bersihkan buffer

        // 3. Replace
        System.out.print("Masukkan teks yang ingin diganti: ");
        String lama = in.nextLine();
        System.out.print("Masukkan teks pengganti: ");
        String baru = in.nextLine();
        String hasilReplace = kataTrim.replace(lama, baru);
        System.out.println("Hasil replace: " + hasilReplace);
    }
}
