package Codingan;

public class Day10 {
    
    //Berikut adalah contoh kode program Java yang menggunakan konstanta (final variabel):

    public static void main(String[] args) {
        // Deklarasi konstanta
        final double PI = 3.14159;
        final int TAHUN_LAHIR = 2006;

        // Menggunakan konstanta
        double luasLingkaran = PI * 5 * 5;
        int umur = 2023 - TAHUN_LAHIR;

        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Umur: " + umur);

        // Mencoba mengubah nilai konstanta
        //PI = 2.5; // Error! Konstanta tidak dapat diubah
    }
}
//Dalam contoh di atas, `PI` dan `TAHUN_LAHIR` adalah konstanta yang dideklarasikan dengan menggunakan kata kunci `final`. Nilai konstanta tidak dapat diubah setelah diinisialisasi.

//Konstanta sangat berguna ketika kamu ingin mendefinisikan nilai yang tidak berubah dalam program, seperti konstanta matematika atau nilai konfigurasi yang tidak dapat diubah. Dengan menggunakan konstanta, kamu dapat membuat kode program lebih readable dan maintainable. 😊
    
