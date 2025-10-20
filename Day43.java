import java.util.Scanner;
public class kelipan {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Angka : ");
        int a = in.nextInt();
        
        if(a%3==0 && a%5==0){
            System.out.println("Kelipatan 3 & 5");
        }else if(a%3==0){
            System.out.println("Kelipatan 3 ");
        }else if(a%5==0){
            System.out.println("Kelipatan 5 ");
        }else{
            System.out.println("Bukan kelipatan 3 & 5");
        }
    }
    
}
