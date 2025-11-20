import java.util.Scanner;

public class doWhile2 {
    public static void garis(){
    System.out.println("========================");
}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        
        
        do{
            System.out.println("Selamat datang di Restorant NNNJ");
            garis();
            System.out.println("1. Makanan ");
            System.out.println("2. Minuman ");
            System.out.println("3. Keluar ");
            System.out.print("Silahkan pilih (1/2/3): ");
            int a = in.nextInt();
            
            
            if(a == 1){
                System.out.println("1. Pangsit");
                System.out.println("2. Nasgor Spesial");
                System.out.println("3. Kembali");
                System.out.print("Silahkan pilih (1/2/3): ");
                int b = in.nextInt();
                
                if(b == 3){
                    continue;
                    //langsung ke menu awal
                }
                else if(b == 1){
                    System.out.println("Anda memesan pangsit, silahkan tunggu");
                }
                else if(b == 2){
                    System.out.println("Anda memesan nasi goreng spesial, silahkan tunggu");
                }
                else{
                    System.out.println("Harap masukkan inputan yang benar");
                }
            }
            else if(a == 2){
                System.out.println("1. Es jeruk");
                System.out.println("2. Air mineral");
                System.out.println("3. Kembali");
                System.out.print("Silahkan pilih (1/2/3): ");
                int b = in.nextInt();
                
                if(b == 3){
                    continue;
                    //langsung kembali ke awal
                }
                else if(b == 1){
                    System.out.println("Anda memesan es jeruk, silahkan tunggu");
                }
                else if(b == 2){
                    System.out.println("Anda memesan air mineral, silahkan tunggu");
                }
                else{
                    System.out.println("Harap masukkan inputan yang benar");
                }
            }
            else if(a == 3){
                System.out.print("Anda keluar!");
                break;
            }
            else{
                System.out.println("Harap masukkan inputan yang benar");
                continue;
            }
            
        }while(true);
    }
    
}
