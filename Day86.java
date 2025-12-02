import java.util.*;
public class MinArray {
    
    public static void main(String[] args) {
        int a[] = {6,4,3,2,9,8,50};
        int min = a[0];
        for(int i = 1; i <a.length ; i++){
            if(a[i] < min) min = a[i];
        }
        System.out.println("Min : "+min);
  }
}
