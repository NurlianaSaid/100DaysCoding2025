import java.util.Scanner;

public class Menu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Beli Makanan");
            System.out.println("2. Beli Minuman");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Beli Makanan");
                    System.out.println("Pilih jenis makanan:");
                    System.out.println("1. Nasi Goreng");
                    System.out.println("2. Mie Goreng");
                    System.out.print("Pilih jenis makanan: ");
                    int jenisMakanan = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer
                    if (jenisMakanan == 1) {
                        System.out.println("Anda memesan Nasi Goreng");
                    } else if (jenisMakanan == 2) {
                        System.out.println("Anda memesan Mie Goreng");
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                    break;
                case 2:
                    System.out.println("Anda memilih Beli Minuman");
                    System.out.println("Pilih jenis minuman:");
                    System.out.println("1. Air Mineral");
                    System.out.println("2. Jus Buah");
                    System.out.print("Pilih jenis minuman: ");
                    int jenisMinuman = scanner.nextInt();
                    scanner.nextLine(); // membersihkan buffer
                    if (jenisMinuman == 1) {
                        System.out.println("Anda memesan Air Mineral");
                    } else if (jenisMinuman == 2) {
                        System.out.println("Anda memesan Jus Buah");
                    } else {
                        System.out.println("Pilihan tidak valid");
                    }
                    break;
                case 3:
                    System.out.println("Anda memilih Keluar");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}
