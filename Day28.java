import java.util.Scanner;
public class persamaan {
  
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("REGISTER");
System.out.print("Buat Username : ") ;
int a = in.nextInt() ;
System.out.print("Buat Password : ") ; 
 int b = in.nextInt();
System.out.println("SIGN IN");
System.out.print("Masukkan Username : ") ;
int c = in.nextInt() ;
System.out.print("Masukkan Password : ") ; 
int d = in.nextInt();

if(a == c && b==d){
    System.out.print("Login");
}else if(a != c && b!=d){
    System.out.print("Tidak bisa login");
}
  
        
    }
    
}
