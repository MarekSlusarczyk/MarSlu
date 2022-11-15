package podstawy;

import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj liczbę kilometrów którą przejechałeś: ");
        double iloscKilometrow = klawiatura.nextDouble();

        System.out.println("Podaj ilość litrów zużytego paliwa: ");
        double iloscPaliwa = klawiatura.nextDouble();

        double kilometryNaLitrze = (double)iloscKilometrow / iloscPaliwa;

        System.out.println("Ilość kilometrów przejechanych na jednym litrze paliwa to: " + kilometryNaLitrze + " l");
    }
}
