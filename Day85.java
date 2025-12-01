import java.util.*;
public class MaxArray {
    
    public static void main(String[] args) {
        int a[] = {6,4,3,2,9,8,50};
        int max = a[0];
        for(int i = 1; i <a.length ; i++){
            if(a[i] > max) max = a[i];
        }
        System.out.println("Max : "+max);
  }
}
