import java.util.Scanner;

public class day25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demonstrasi Pre-Increment dan Post-Increment
        System.out.println("Demonstrasi Increment");
        System.out.print("Masukkan nilai x = ");
        int x = input.nextInt();
        System.out.println("Nilai x awal = " + x);

        int y = ++x; // Pre-Increment
        System.out.println("Nilai y (pre-increment) = " + y);
        System.out.println("Nilai x setelah pre-increment = " + x);

        System.out.print("Masukkan Nilai X baru = ");
        x = input.nextInt(); // Reset nilai x
        System.out.println("Nilai x awal = " + x);

        int z = x++; // Post-Increment
        System.out.println("Nilai z (post-increment) = " + z);
        System.out.println("Nilai x setelah post-increment = " + x);

        // Demonstrasi Pre-Decrement dan Post-Decrement
        System.out.println("\nDemonstrasi Decrement");
        System.out.print("Masukkan nilai a = ");
        int a = input.nextInt();
        System.out.println("Nilai a awal = " + a);

        int b = --a; // Pre-Decrement
        System.out.println("Nilai b (pre-decrement) = " + b);
        System.out.println("Nilai a setelah pre-decrement = " + a);

        System.out.print("Masukkan nilai a baru = ");
        a = input.nextInt(); // Reset nilai a
        System.out.println("Nilai a awal = " + a);

        int c = a--; // Post-Decrement
        System.out.println("Nilai c (post-decrement) = " + c);
        System.out.println("Nilai a setelah post-decrement = " + a);
    }
}
