public class primitifkeString {
    
    public static void main(String[] args) {
        
        //metode tostring
        int angkaInt = 54321;
        String konversi = Integer.toString(angkaInt);
        
        //metode velueof
        short nilai =555; 
        String teks = String.valueOf(nilai);
        
        //metode operator 
        long angka = 777;
        String ukuran = angka + "";
        
        System.out.println("int ke String: " +konversi);
        System.out.println("short ke string: "+teks);
        System.out.println("long ke String: "+ukuran);
    }
    
}
