package Day6;

public class Pecahan {
    public static void main(String[] args){
        // Tipe data float harus pakai huruf 'f' di akhir angkanya
      
        // Menghitung luas lingkaran menggunakan tipe data float
        float radius = 5.5f; // Jari-jari lingkaran
        float luas = 3.14f * radius * radius; // Rumus luas lingkaran: πr^2
        System.out.println("Luas lingkaran dengan radius " + radius + " adalah " + luas);  // presisi float sekitar 6-7 digit

        // Menghitung volume bola menggunakan tipe data double
        double jariJari = 4.2; // Jari-jari bola
        double volume = (4.0 / 3.0) * 3.14159 * jariJari * jariJari * jariJari; // Rumus volume bola: (4/3)πr^3
        System.out.println("Volume bola dengan jari-jari " + jariJari + " adalah " + volume); // presisi sekitar 15-16 digit
    }
}
    
