package zadania_z_if;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int oplataBanku = 10;
        double oplataZaCzeki = 0.0;

        System.out.println("Podaj ilość czeków");
        int iloscCzekow = klawiatura.nextInt();

        if(iloscCzekow < 20) {
            oplataZaCzeki = 0.10 * iloscCzekow;
        } else if (iloscCzekow >= 20 && iloscCzekow <= 39) {
            oplataZaCzeki = 0.08 * iloscCzekow;
        } else if (iloscCzekow >= 40 && iloscCzekow <= 59) {
            oplataZaCzeki = 0.06 * iloscCzekow;
        } else {
            oplataZaCzeki = 0.04 * iloscCzekow;
        }

        double oplataLaczna = oplataBanku + oplataZaCzeki;
        System.out.println("Opłaty łączne: " + oplataLaczna);
    }
}
