import java.util.Scanner;
public class kondisi {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = 0;
        
        for(int i = 1; i <=1000;i++){
        
        String a = in.nextLine();
        if(a.equals("maju")){
            b++;
            
        }else if(a.equals("mundur")){
            b--;
        }else if(a.equals("stop")){
            System.out.print("Yah Stop Nih");
            break;
        }
        System.out.println(b);
    }
    
    
}
}
