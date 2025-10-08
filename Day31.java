
import java.util.Scanner;

public class Day31{

public static void main(String[] args) {

Scanner in = new Scanner (System.in);

System.out.print("User: ");

String a = in.nextLine();

System.out.print("Pass: ");

String b = in.nextLine();

if(a.equals("lia") && b.equals("123")){

System.out.println("Login");
    
}
else {
System.out.println("Gagal");
}
    
}
}
