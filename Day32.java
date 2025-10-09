import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Join UTS ? (true/false) ");
        boolean a = in.nextBoolean();
        System.out.print("Join UAS ? (true/false) ");
        boolean b =in.nextBoolean();

        if (a == true || b == true) {
            System.out.println("Ket : Lulus");
        } else {
            System.out.println("Ket : Tidak Lulus");
        }
        
    }
    
}
