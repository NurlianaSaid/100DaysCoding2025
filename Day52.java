import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lama berjalan : ");
        int lamaBerjalan = scanner.nextInt();
        int jarakSaatIni = 10;
        int totalJarak = 0;
        int menit = 1;

        while (menit <= lamaBerjalan) {
            System.out.printf("Menit %d = Jaraknya %d cm.%n", menit, jarakSaatIni);
            totalJarak += jarakSaatIni;
            jarakSaatIni += 5;
            menit++;
        }

        System.out.println("Total Jarak adalah " + totalJarak);
    }
}
