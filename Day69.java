import java.util.Scanner;
public class UjiLogin {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        //ket
        int maxLogin = 3;
        int startLogin = 1;
        String user = "admin";
        String pass = "12345";
        boolean status = true;
        //boolean salah = false;
        
        while(status == true && startLogin <=maxLogin)
            
        {
            System.out.print("Masukkan Username : ");
            String use = in.nextLine();
            
            System.out.print("Masukkan Password : ");
            String pas = in.nextLine();
            
            startLogin ++;
            if(use.equals(user) && pas.equals(pass)){
                System.out.println("Login berhasil! Selamat datang.");
                status = false;
            }
            else if(!use.equals(user)|| !pas.equals(pass)){
            if(startLogin <= maxLogin){
                System.out.println("Login gagal! Coba lagi.");
            }else{
                System.out.println("Akses ditolak!");
                break;
            }
        }
        }
        
    }
    
}
