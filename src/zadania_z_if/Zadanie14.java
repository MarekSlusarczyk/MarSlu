package zadania_z_if;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj jaki pakiet posiadasz (A, B lub C)");
        String pakiet = klawiatura.nextLine();


        System.out.println("Podaj czas rozmów w minutach");
        int iloscWykorzystanychMinut = klawiatura.nextInt();

        double cena = 0.0;
        int iloscDarmowychMinut;
        double kosztNastepnejMinuty;
        double cenaZaMinuty = 0;
        double wartosc = 0.0;

        if (pakiet.equalsIgnoreCase("A")) {
            cena = 39.99;
            iloscDarmowychMinut = 450;
            kosztNastepnejMinuty = 0.450;

            if (iloscWykorzystanychMinut > iloscDarmowychMinut) {
                cenaZaMinuty = (iloscWykorzystanychMinut - iloscDarmowychMinut) * kosztNastepnejMinuty;
            }
            wartosc = cena + cenaZaMinuty;

            // PAKIET B
            double cenaB = 59.99;
            int iloscDarmowychMinutB = 900;
            double kosztNastepnejMinutyB = 0.400;
            double cenaZaMinutyB = 0.0;

            if(iloscWykorzystanychMinut > iloscDarmowychMinutB) {
                cenaZaMinutyB = (iloscWykorzystanychMinut - iloscDarmowychMinutB) * kosztNastepnejMinutyB;
            }
            double wartoscB = (double)cenaB + cenaZaMinutyB;
            if (wartosc > wartoscB) {
                double oszczednosc = wartosc - wartoscB;
                System.out.println("Wybierając pakiet B zaoszczędziłbyś: " + oszczednosc + " zł. Zapłaciłbyś: " +
                        (wartosc - oszczednosc));
            }

            // PAKIET C
            double cenaC = 69.990;
            if(wartosc > cenaC) {
                double oszczednoscC = wartosc - cenaC;
                System.out.println("Wybierając pakiet C zaoszczędziłbyś: " + oszczednoscC + " zł. Zapłaciłbyś: " +
                        (wartosc - oszczednoscC));
            }
        } else if (pakiet.equalsIgnoreCase("B")) {
            cena = 59.99;
            iloscDarmowychMinut = 900;
            kosztNastepnejMinuty = 0.400;

            if(iloscWykorzystanychMinut > iloscDarmowychMinut) {
                cenaZaMinuty = (iloscWykorzystanychMinut - iloscDarmowychMinut) * kosztNastepnejMinuty;
            }
            wartosc = cena + cenaZaMinuty;

            double cenaC = 69.990;
            if(wartosc > cenaC) {
                double oszczednoscC = wartosc - cenaC;
                System.out.println("Wybierając pakiet C zaoszczędziłbyś: " + oszczednoscC + " zł. Zapłaciłbyś: " +
                        (wartosc - oszczednoscC));
            }
        } else if (pakiet.equalsIgnoreCase("C")) {
            cena = 69.990;

            wartosc = cena;

        }

        BigDecimal zaokraglenie = new BigDecimal(wartosc).setScale(2, RoundingMode.HALF_UP);
        double wartoscZaokraglona = zaokraglenie.doubleValue();
        System.out.println("-----------RACHUNEK-----------\nAbonament............" + cena + " PLN\nOpłata za minuty....."
                + cenaZaMinuty + " PLN\nSUMA PLN: " + wartoscZaokraglona);
    }
}
