package zadania_z_if;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj pierwszy wynik testu");
        double wynik1 = klawiatura.nextDouble();

        System.out.println("Podaj drugi wynik testu");
        double wynik2 = klawiatura.nextDouble();

        System.out.println("Podaj trzeci wynik testu");
        double wynik3 = klawiatura.nextDouble();

        double iloscWynikow = 3;
        double srednia = (wynik1 + wynik2 + wynik3) / iloscWynikow;

        System.out.println("Średnia wynosi: " + srednia);
        if (srednia >= 90 && srednia <= 100) {
            System.out.println("Ocena: 5");
        } else if (srednia >= 80 && srednia <= 89) {
            System.out.println("Ocena: 4");
        } else if (srednia >= 70 && srednia <= 79) {
            System.out.println("Ocena: 3");
        } else if (srednia >= 60 && srednia <= 69) {
            System.out.println("Ocena: 2");
        } else {
            System.out.println("Ocena: 1");
        }
    }
}
