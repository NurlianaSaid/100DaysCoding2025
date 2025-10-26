import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai A : ");
        int x = in.nextInt();
        System.out.print("Nilai B : ");
        int y = in.nextInt();
        String hasil = x > y ? "A lebih besar B" : "A lebih kecil B";
        System.out.println(hasil); // Output
    }
}
