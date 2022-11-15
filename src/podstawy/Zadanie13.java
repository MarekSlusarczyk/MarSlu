package podstawy;

import java.util.Scanner;
public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj wynik pierwszego testu: ");
        double wynik1 = klawiatura.nextDouble();

        System.out.println("Podaj wynik drugiego testu: ");
        double wynik2 = klawiatura.nextDouble();

        System.out.println("Podaj wynik trzeciego testu: ");
        double wynik3 = klawiatura.nextDouble();

        double suma = wynik1 + wynik2 + wynik3;
        int iloscWynikow = 3;
        double srednia = (double)suma / iloscWynikow;
        System.out.println("Średnia twoich wyników to: " + srednia);
    }
}
