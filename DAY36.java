import java.util.Scanner;

public class DAY36{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Nilai ujian : ");
        int a = in.nextInt();
        System.out.print("Kehadiran : ");
        int b = in.nextInt();

        if (a >= 85) {
            if (b >= 8) {
                System.out.println("Predikat : Sangat Baik");
            } else {
                System.out.println("Nilai Sangat Baik namun kehadiran kurang ");
            }
        }
        else if (a >= 70) {
            if (b >= 8) {
                System.out.println("Predikat : Baik");
            } else {
                System.out.println("Nilai Baik namun kehadiran kurang ");
            }
        }
        else {
            System.out.println("Anda dinyatakan mengulang..");
        }

    }

}
