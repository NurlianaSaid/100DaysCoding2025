import java.util.Scanner;
public class ParameterVoid {
    
    static void cek(int a){
        if(a % 2 == 0){
            System.out.println(a+" adalah bilang genap");
        }else{
            System.out.println(a+" adalah bilang ganjil");
        }
    }
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan nilai : ");
            int a = in.nextInt();
            
            cek(a);
    }
    
}
