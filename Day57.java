import java.util.Scanner;

public class dowhilePerkalian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        int i = 1;

        System.out.println("Tabel Perkalian dari 1 hingga " + angka);
        System.out.println("-----------------------------------");

        do {
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            } while (j <= 10);
            System.out.println();
            i++;
        } while (i <= angka);

        in.close();
    }
}
