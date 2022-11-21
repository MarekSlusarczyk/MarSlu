package zadania_z_if;

import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ilość książek");
        int iloscKsiazek = klawiatura.nextInt();

        if(iloscKsiazek == 0) {
            System.out.println("Nie otrzymujesz żadnych punktów");
        } else if (iloscKsiazek == 1) {
            System.out.println("Otrzymujesz 5 punktów");
        } else if (iloscKsiazek == 2) {
            System.out.println("Otrzymujesz 15 punktów");
        } else if (iloscKsiazek == 3) {
            System.out.println("Otrzymujesz 30 punktów");
        } else if (iloscKsiazek >= 4) {
            System.out.println("Otrzymujesz 60 punktów");
        }
    }
}
