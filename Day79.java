package Belajar;

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String username = "";
        String password = "";
        System.out.println("=== BUAT AKUN BARU ===");
        System.out.print("Buat username: ");
        username = n.nextLine();

        System.out.print("Buat password: ");
        password = n.nextLine();

        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("---------------------------");

        String userLogin = "";
        String passLogin = "";

        while (true) {  
            System.out.println("\n=== LOGIN KE AKUN ===");
            System.out.print("Masukkan username: ");
            userLogin = n.nextLine();

            System.out.print("Masukkan password: ");
            passLogin = n.nextLine();

            if (userLogin.equals(username) && passLogin.equals(password)) {
                System.out.println("\nLogin berhasil! Selamat datang, " + username + "!");
                break; 
            } else {
                System.out.println("Username atau password salah! Silakan coba lagi.\n");
            }
        }
    }
    
}
