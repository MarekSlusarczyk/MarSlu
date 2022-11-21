package zadania_z_if;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int podstawowaKilometrow = 500;

        System.out.println("Wprowadź liczbę całkowitą liczbę kilometrów");
        int liczbaKilometrow = klawiatura.nextInt();

        System.out.println("Wprowadź wagę paczki");
        double wagaPaczki = klawiatura.nextDouble();

        if (liczbaKilometrow <= podstawowaKilometrow) {
            if(wagaPaczki <= 1) {
                System.out.println("Zapłacono 1,10 zł");
            } else if (wagaPaczki > 1 && wagaPaczki <= 3) {
                System.out.println("Zapłacono 2,20 zł");
            } else if (wagaPaczki > 3 && wagaPaczki <= 5) {
                System.out.println("Zapłacono 3,70 zł");
            } else {
                System.out.println("Zapłacono 3,80 zł");
            }
        } else {
            double przezIlePomnozyc = (double)liczbaKilometrow / podstawowaKilometrow;

            BigDecimal liczba = new BigDecimal(przezIlePomnozyc).setScale(0, RoundingMode.HALF_UP);
            int mnozonePrzez = (int)liczba.doubleValue() + 1;

            double wartosc = 0.0;
            if(wagaPaczki <= 1) {
                wartosc = (double)1.1 * mnozonePrzez;
            } else if (wagaPaczki > 1 && wagaPaczki <= 3) {
                wartosc = (double)2.2 * mnozonePrzez;
            } else if (wagaPaczki > 3 && wagaPaczki <= 5) {
                wartosc = (double)3.7 * mnozonePrzez;
            } else {
                wartosc = (double)3.8 * mnozonePrzez;
            }

            BigDecimal zaokraglenie = new BigDecimal(wartosc).setScale(1, RoundingMode.HALF_UP);
            double wartoscZaokraglona = zaokraglenie.doubleValue();
            System.out.println("Zapłacono: " + wartoscZaokraglona + " zł");

        }
    }
}
