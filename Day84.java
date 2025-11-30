
import java.util.Scanner;

public class StringCantik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int posI = -1, posS = -1, posC = -1;

        // Cari huruf I
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                posI = i;
                break;
            }
        }

        // Cari huruf S setelah I
        if (posI != -1) {
            for (int i = posI + 1; i < s.length(); i++) {
                if (s.charAt(i) == 'S') {
                    posS = i;
                    break;
                }
            }
        }

        // Cari huruf C setelah S
        if (posS != -1) {
            for (int i = posS + 1; i < s.length(); i++) {
                if (s.charAt(i) == 'C') {
                    posC = i;
                    break;
                }
            }
        }

        // Hasil
        if (posI != -1 && posS != -1 && posC != -1) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}
