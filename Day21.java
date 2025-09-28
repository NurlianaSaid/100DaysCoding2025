public class menukarduanilai {
    
    public static void main(String[] args) {
  
        int a = 4;
        int b = 2;

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sesudah ditukar: a = " + a + ", b = " + b);
    }
}
