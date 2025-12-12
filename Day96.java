import java.util.Scanner;

public class ParameterNonVoid {
    static int oper(int a, int b, char c) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Error: Pembagian dengan nol!");
                return 0; // atau throw exception
            }
        }
        return 0; // atau throw exception jika operator tidak valid
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char c = in.next().charAt(0);
        System.out.print("Masukkan angka: ");
        int b = in.nextInt();
        System.out.println("Hasil: " + oper(a, b, c));
    }
}
