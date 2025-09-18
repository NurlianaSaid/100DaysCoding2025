import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Nim Anda : ");
        int nim = input.nextInt();
        
        System.out.print("Masukkan JK L/P : ");
        char jk = input.next().charAt(0);
        
        System.out.println("===========================");
        System.out.println("Nama Anda : "+ nama);
        System.out.println("Nim Anda : "+ nim);
        System.out.println("Jk anda : "+jk);
        
    }
    
}
