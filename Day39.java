import java.util.Scanner;

public class menumakanan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ulang = true;
        while (ulang) {
            System.out.print("Masukkan Menu (makanan/minuman/keluar) : ");
            String a = in.nextLine();
            
            if(a.equalsIgnoreCase("makanan")){
                System.out.println("1.Nasi Goreng");
                System.out.println("2.Nasi Kuning");
                System.out.println("3.Bakso Mie");
                System.out.println("4.Cancel");
                System.out.print("Pilih menu (1/2/3/4) : ");
                int b = in.nextInt();
                in.nextLine(); // tambahkan ini untuk menghilangkan newline
                if(b==1){
                    System.out.println("Pesanan nasi goreng berhasil.");
                }else if(b==2){
                    System.out.println("Pesanan nasi kuning berhasil.");
                }else if(b==3){
                    System.out.println("Pesanan mie bakso berhasil.");
                }else if(b==4){
                    System.out.println("Pesanan dibatalkan.");
                }else{
                    System.out.println("Pilihan tidak valid.");
                }
            } else if(a.equalsIgnoreCase("minuman")){
                System.out.println("1.Pop Ice");
                System.out.println("2.Es Teh");
                System.out.println("3.Kopi");
                System.out.println("4.Cancel");
                System.out.print("Pilih menu (1/2/3/4) : ");
                int b = in.nextInt();
                in.nextLine(); // tambahkan ini untuk menghilangkan newline
                if(b==1){
                    System.out.println("Pesanan pop ice berhasil.");
                }else if(b==2){
                    System.out.println("Pesanan es teh berhasil.");
                }else if(b==3){
                    System.out.println("Pesanan kopi berhasil.");
                }else if(b==4){
                    System.out.println("Pesanan dibatalkan.");
                }else{
                    System.out.println("Pilihan tidak valid.");
                }
            } else if(a.equalsIgnoreCase("keluar")){
                ulang = false;
                System.out.println("Terima kasih!");
            } else {
                System.out.println("Menu tidak valid.");
            }
        }
    }
}
