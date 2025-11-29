import java.util.*;
public class Day83 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[a];
        int jum = 0;
        for(int i = 0; i< a; i++){
            b[i] = in.nextInt();
            jum += b[i];
        }
        System.out.println("Hasil : "+jum);
    }
    
}
