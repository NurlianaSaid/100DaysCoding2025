import java.util.Scanner;
public class Jumlah {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int total = 0;
        Boolean sta = true;
        while(sta){
            System.out.print("Input angka : ");
            int a = in.nextInt();
            
            
            if(a>0){
                total += a;
            }else{
                System.out.println("\ninput angka positif!");
                sta = false;
            }
        }
        System.out.println("Total penjumlahan: "+total);
    }
    
}
