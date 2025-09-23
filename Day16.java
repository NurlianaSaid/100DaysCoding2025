import java.util.Scanner;
public class Aritmatika1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai a = ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai b = ");
        int b = in.nextInt();
        System.out.println("Hasil Perkalian "+(a*b));
        System.out.println("Hasil Pembagian "+(a/b));
    }
    
}
