
import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukkan nilai a     = ");
        int a = input.nextInt();
        System.out.print("masukkan nilai b    = ");
        int b = input.nextInt();
        
        System.out.print("pilih operator (+,-,*,/,%) = ");
        char operator = input.next().charAt(0);
        
        if (operator == '+' ) {
            System.out.println("hasil : "+(a + b));
        }else if (operator == '-' ) {
            System.out.println("hasil : "+(a - b));
        }else if (operator == '*' ) {
            System.out.println("hasil : "+(a * b));
        }else if (operator == '/' ) {
            System.out.println("hasil : "+(a / b));
        }else if (operator == '%' ) {
            System.out.println("hasil : "+(a % b));
        }
        else{
            System.out.println("operator tidak valid");
        }
        
        
    }
}
