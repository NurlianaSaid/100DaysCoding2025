import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = in.nextInt();

        // Mencetak angka 1 sampai N
        System.out.println("Angka 1 - N:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Mencetak angka N-1 (angka N dalam urutan terbalik)
        System.out.println("Angka N - 1:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
