import java.lang.Math;

public class ContohMath {
    public static void main(String[] args) {
        double angka = 4.7;

        // Method ceil
        double ceil = Math.ceil(angka);
        System.out.println("Ceil dari " + angka + " adalah " + ceil);

        // Method floor
        double floor = Math.floor(angka);
        System.out.println("Floor dari " + angka + " adalah " + floor);

        // Method round
        long round = Math.round(angka);
        System.out.println("Round dari " + angka + " adalah " + round);
    }
}
