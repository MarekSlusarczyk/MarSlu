package podstawy;

import java.util.Scanner;
public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź cenę płytki drukowanej: ");
        double cenaPlytki = klawiatura.nextDouble();

        double marza = 0.4;
        double zysk = cenaPlytki * marza;

        System.out.println("Zysk ze sprzedaży płytki: " + zysk);
    }
}
