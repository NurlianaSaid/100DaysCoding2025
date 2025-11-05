import java.util.Scanner;
public class ArrayGG {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = in.nextInt();
        int angka[] = new int[N];
        int genap = 0;
        int ganjil = 0;
        
        for (int i = 0; i < N; i++) {
            
            angka[i] = i + 1;
                if (angka[i] % 2 == 1) {
                    ganjil++;
                }else{
                    genap++;
                }
            
        }
        
        System.out.println("Angka ganjil dari 1 hingga " + N + ":");
        for (int i = 0; i < N; i++) {
            if (angka[i] % 2 == 1) {
                System.out.print(angka[i]+ " ");
            }
        }
        System.out.println();
        
        System.out.println("Angka genap dari 1 hingga " + N + ":");
        for (int i = 0; i < N; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println();
    }
}
