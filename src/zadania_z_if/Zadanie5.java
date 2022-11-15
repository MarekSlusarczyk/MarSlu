package zadania_z_if;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj masę obiektu");
        double masa = klawiatura.nextDouble();

        double przyspieszenieZiemskie = 9.8;

        double ciezar = masa * przyspieszenieZiemskie;

        System.out.println("Ciężar wynosi: " + ciezar + "N");
        if (ciezar > 1000) {
            System.out.println("Obiekt jest zbyt ciężki");
        } else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki");
        }
    }
}
