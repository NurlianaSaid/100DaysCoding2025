import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();

        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
