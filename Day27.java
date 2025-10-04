import java.util.Scanner;
public class lianaku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String a = in.nextLine();
        System.out.print("Umur : ");
        int b = in.nextInt();
        System.out.println("Nama saya adalah: "+a);
        System.out.print("Umur saya adalah : "+b+"\n");
        System.out.printf("Umur saya 5 tahun ke depan adalah  %d tahun",(b+5));
    }
}
