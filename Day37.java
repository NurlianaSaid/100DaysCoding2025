import java.util.Scanner;
public class ganjilgenap {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int a = in.nextInt();
        
        if(a%2==0){
            System.out.println(a+" adalah bilangan genap");
        }else{
            System.out.println(a+" adalah bilangan ganjil");
        }
    }
    
}
