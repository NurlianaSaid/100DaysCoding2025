import java.util.Scanner;
public class ParameterVoid {
    
    static int persegi(int a){
        return a*a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan luas persegi : ");
            int a = in.nextInt();
        
        System.out.println("Luas : "+persegi(a));
    }
    
}
