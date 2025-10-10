import java.util.Scanner;

public class not {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Angka Favorit : ");
        int a = in.nextInt();
        
        if(a!=0){
            System.out.println("angka favorit anda adalah " +a);
        }else{
            System.out.println("Angka Nol");
        }
    }
    
}
