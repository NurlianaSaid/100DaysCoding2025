import java.util.Scanner;
public class Nsampai1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = in.nextInt();
        int genap = 0;
        int ganjil = 0;
        
        for (int i = N; i > 0; i--) {
            
           
                if (i % 2 == 1) {
                    ganjil++;
                }else{
                    genap++;
                }
            
        }
        
        System.out.println("Angka ganjil dari "+ N +" hingga 1 : ");
        for (int i = N; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
        System.out.println("Angka genap dari "+ N +" hingga 1 : ");
        for (int i = N; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
}
