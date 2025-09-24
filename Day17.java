import java.util.Scanner;
public class Day17 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai ");
        int a = in.nextInt();
        if(a % 2 == 0){
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
        }
    }
    
}
