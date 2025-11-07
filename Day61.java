import java.util.Scanner;

public class NilaiM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input N : ");
        int a = in.nextInt();
        System.out.print("Input M : ");
        int b = in.nextInt();

        for (int i = 1; i <= a; i++) {
            int kelipatan = b * i;
            if (kelipatan <= a) {
                System.out.println(kelipatan);
            } else {
                break;
            }
        }
    }
}
