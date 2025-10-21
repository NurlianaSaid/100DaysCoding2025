import java.util.Scanner;
public class kategori {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = in.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Grade A");
        } else if (nilai >= 75 ) {
            System.out.println("Grade B");
        } else if (nilai >= 60) {
            System.out.println("Grade C");
        } else if (nilai >= 40 ) {
            System.out.println("Grade D");
        } else if (nilai >= 0 ) {
            System.out.println("Grade E");
        } else {
            System.out.println("Nilai Tidak Valid");

        }
        
    }
    
}
