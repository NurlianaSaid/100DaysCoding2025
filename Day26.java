import java.util.Scanner;
public class penugasan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int x = in.nextInt();

        x += 3; // x = x + 3
        System.out.println("x += 3: " + x);

        x -= 2; // x = x - 2
        System.out.println("x -= 2: " + x);

        x *= 4; // x = x * 4
        System.out.println("x *= 4: " + x);

        x /= 2; // x = x / 2
        System.out.println("x /= 2: " + x);

        x %= 3; // x = x % 3
        System.out.println("x %= 3: " + x);
    }
}
