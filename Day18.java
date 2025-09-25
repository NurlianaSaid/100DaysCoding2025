import java.util.Scanner;
public class konversiOtomatis {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //konversi otomatis
        System.out.print("Masukkan nilai int :");
        int a = in.nextInt();
        long b = a;
        System.out.println("konversi int ke long : "+b);
        
        System.out.print("Masukkan nilai byte :");
        byte c = in.nextByte();
        short d = c;
        System.out.println("konversi byte ke short : "+d);
        
        System.out.print("Masukkan nilai float :");
        float e = in.nextFloat();
        double f = e;
        System.out.println("konversi float ke double : "+f);
    }
    
}
