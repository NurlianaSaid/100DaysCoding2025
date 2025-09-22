import java.util.Scanner;
public class aritmatika {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Penjumlahan Aritmatika");
        System.out.print("Masukkan Nilai pertama = ");
        int a = input.nextInt();
        System.out.print("Masukkan Nilai kedua = ");
        int b = input.nextInt();
        //int jumlah = a+b;
        System.out.println("Hasil penjumlahan adalah = "+(a+b));
        System.out.println();
        System.out.println();
      
        System.out.println("Pengurangan Aritmatika");
        System.out.print("Masukkan Nilai pertama = ");
        int c = input.nextInt();
        System.out.print("Masukkan Nilai kedua = ");
        int d = input.nextInt();
        System.out.println("Hasil Pengurangan = "+ (c-d));
    }
    
}
