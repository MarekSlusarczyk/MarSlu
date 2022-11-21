package zadania_z_if;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wpisz: powietrze lub woda lub stal");
        String nosnik = klawiatura.nextLine();

        //System.out.println("Podaj odległość (w metrach)");
        int odleglosc; // = klawiatura.nextInt();
        double time = 0.0;

        if (nosnik.equalsIgnoreCase("powietrze")) {
            System.out.println("Podaj odległość (w metrach)");
            odleglosc = klawiatura.nextInt();
            time = (double)odleglosc / 343;
        } else if (nosnik.equalsIgnoreCase("woda")) {
            System.out.println("Podaj odległość (w metrach)");
            odleglosc = klawiatura.nextInt();
            time = (double)odleglosc / 1490;
        } else if (nosnik.equalsIgnoreCase("stal")) {
            System.out.println("Podaj odległość (w metrach)");
            odleglosc = klawiatura.nextInt();
            time = (double)odleglosc / 5100;
        } else {
            System.out.println("Wprowadzono błędne dane");
            return;
        }

        System.out.println("Czas potrzebny na przebycie " + odleglosc + " metrów wynosi: " + time + " sekund");
    }
}
