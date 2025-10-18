import java.util.Scanner;
public class evaluasi2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("=== Program Evaluasi Mentor ===");
        System.out.print("Masukkan nilai teori \t:");
        int a = in.nextInt();
        System.out.print("Masukkan nilai praktik \t:");
        int b = in.nextInt();
        System.out.println("==============================================");
        
        System.out.println("Nilai teori \t:" +a);
        System.out.println("Nilai praktik \t:"+b);
        
        String predikat = "";
        String keterangan = "";
        
        if(a>100 || a<0 || b>100 || b<0){
            System.out.print("Nilai tidak valid! Harus antara 0 - 100.");
            return;
        }else if(a>=90 && b>=90){ 
            predikat = "A";
            keterangan = "Lulus dengan Predikat Sangat Baik";
        }else if(a>=80 && b>=75){
            predikat = "B";
            keterangan = "Lulus dengan Predikat Baik";
        }else if(a>=70 && b>=70){
            predikat = "C";
            keterangan = "Lulus dengan Predikat Cukup";
        }else {
            predikat = "D";
            keterangan = "Tidak Lulus";
        }
        
        System.out.println("Predikat \t:"+predikat);
        System.out.println("Keterangan \t:"+keterangan);
        
    }
    
}
