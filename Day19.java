import java.util.Scanner;
public class konversi_manual {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
           
        System.out.print("Masukkan nilai long :");
        long a = in.nextLong();
        int b = (int)a;
        System.out.println("konversi manual long ke int  : "+b);
        
        System.out.print("Masukkan nilai short :");
        short c = in.nextShort();
        byte d = (byte)c;
        System.out.println("konversi manual short ke byte: "+d);
        
        System.out.print("Masukkan nilai double :");
        double e = in.nextFloat();
        float f = (float)e;
        System.out.println("konversi manual double ke float : "+f);
    }
    
}
