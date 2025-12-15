import java.util.Scanner;

public class Prima1N {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input nilai N: ");
        int n = in.nextInt();

        System.out.println("Bilangan prima dari 1 sampai " + n + " : ");

        for (int i = 2; i <= n; i++) {
            boolean prima = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }

}
