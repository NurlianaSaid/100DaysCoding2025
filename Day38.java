import java.util.Scanner;
public class positifnegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan angka = ");
        int angka = input.nextInt();
        
        if (angka == 0){
            System.out.println("ini adalah bilangan nol");
        }else if (angka < 0){
            System.out.println("ini adalah bilangan negatif");
        }else if (angka > 0){
            System.out.println("ini adalah bilangan positif");
        }
    }
}
