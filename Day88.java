import java.util.*;
public class ArrayForEach {
    
    public static void main(String[] args) {
        int[] a = {1,10,3,4,8,7,2,9};
        
        Arrays.sort(a);
        System.out.print("Terkecil ke terbesar : ");
        for(int b : a) System.out.print(b+" ");
        
        String tam = "";
        for(int i = a.length-1 ; i >= 0 ; i--){
            tam += a[i] + " ";
        }
        System.out.print("\nTerbesar ke terkecil : "+tam);
            
    }
    
}
