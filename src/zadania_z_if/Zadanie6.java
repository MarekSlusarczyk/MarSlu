package zadania_z_if;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź liczbę sekund");
        int liczbaSekund = klawiatura.nextInt();
        System.out.print(liczbaSekund + " sekund to ");

        int iloscDni = 0;
        int iloscGodzin = 0;
        int iloscMinut = 0;
        int iloscSekund = 0;

        if (liczbaSekund >= 86400) {
            iloscDni = liczbaSekund / 86400;
            liczbaSekund = liczbaSekund % 86400;
            System.out.print(iloscDni + " dni, ");
        }

        if (liczbaSekund >= 3600) {
            iloscGodzin = liczbaSekund / 3600;
            liczbaSekund = liczbaSekund % 3600;
            System.out.print(iloscGodzin + " godzin, ");
        }

        if (liczbaSekund >= 60) {
            iloscMinut = liczbaSekund / 60;
            liczbaSekund = liczbaSekund % 60;
            System.out.print(iloscMinut + " minut, ");
        }

        System.out.print(liczbaSekund + " sekund");
    }
}
