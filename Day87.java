package ddp69;

import java.util.Scanner;

public class CariArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] buah = {"apel", "mangga", "jeruk", "pisang", "anggur"};
        
        System.out.print("Cari : ");
        String b = in.nextLine();
        boolean sta = false;
        for (String n : buah) {
            if(n.equalsIgnoreCase(b)){
                sta = true;
                break;
            }
        }
        if(sta) {
                System.out.println("tersedia");
        }else{
            System.out.println("tidak tersedia");
        }
    }
}
