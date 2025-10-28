import java.util.Scanner;
public class perulanganFor {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Lama berjalan : ");
        int jalan = in.nextInt();
        int pertama = 10;
        int totalJalan = 0;
        for (int i = 1 ; i <=jalan; i++){
            System.out.printf("Menit %d = Jaraknya %d cm. \n",i,pertama);
            totalJalan += pertama;
            pertama += 5;
        }
        System.out.println("Total Jarak adalah "+totalJalan);
    }
    
}
