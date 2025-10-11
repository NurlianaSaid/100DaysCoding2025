import java.util.Scanner;
public class operatorgbgn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Angka 1 : ");
        int a = in.nextInt();
        System.out.print("Angka 2 : ");
        int b = in.nextInt();
        
        if(a == 123 && b == 45 ){
            System.out.println("Luas biasa!");
        }else if(a == 123 || b == 45){
            System.out.println("Keren");
        }else if(!(a == 123) || !(b == 45)){
            System.out.println("Semangat...: ");
        }
    }
    
}
