package day35;

import java.util.Scanner;

public class DAY35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.print("TUGAS : ");
        double a = in.nextInt();
        System.out.print("UTS   : ");
        double b = in.nextInt();
        System.out.print("UAS   : ");
        double c = in.nextInt();
        
        double d = (a+b+c)/3.0;
        System.out.println("Nilai akhir : "+d);
        
        if(d>= 85){
             System.out.println("Kategori: A");
        }else if(d >= 70 && d<=84 ){
             System.out.println("Kategori: B");
            
        }else if(d >= 55 && d<=69 ){
             System.out.println("Kategori: C");
            
        }else {
            System.out.println("Kategori: D");
        }
        
                
    }
    
}
