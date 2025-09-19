import java.util.Scanner;

public class Day12{
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String Nama, Nim, Hobi;
        int Usia;
        float tinggiBadan;
        
        System.out.print("Nama \t= ");
        Nama = input.nextLine();
        System.out.print("Nim \t= ");
        Nim = input.nextLine();
        System.out.print("Hobi \t= ");
        Hobi = input.nextLine();
        System.out.print("Usia \t= ");
        Usia = input.nextInt();
        System.out.print("tinggiBadan \t= ");
        tinggiBadan = input.nextFloat();
        
        System.out.println("======[BIODATA SAYA]======");
        System.out.println("Nama \t: " + Nama);
        System.out.println("Nim \t:" + Nim);
        System.out.println("Hobi \t:" + Hobi);
        System.out.println("Usia \t:" + Usia);
        System.out.println("tinggiBadan \t:" + tinggiBadan);
        
             
                
       
    }
}
