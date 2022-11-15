package zadania_z_if;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj pierwsze imię");
        String imie1 = klawiatura.nextLine();

        System.out.println("Podaj drugie imię");
        String imie2 = klawiatura.nextLine();

        System.out.println("Podaj trzecie imię");
        String imie3 = klawiatura.nextLine();

        boolean firstShown = false;
        boolean secondShown = false;
        boolean thirdShown = false;

        if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0) {
            firstShown = true;
            System.out.println(imie1);
        }
        else if (imie2.compareToIgnoreCase(imie1) < 0 && imie2.compareToIgnoreCase(imie3) < 0) {
            secondShown = true;
            System.out.println(imie2);
        }
        else if (imie3.compareToIgnoreCase(imie1) < 0 && imie3.compareToIgnoreCase(imie2) < 0) {
            thirdShown = true;
            System.out.println(imie3);
        }

        if (firstShown) {
            if (imie2.compareToIgnoreCase(imie3) < 0 && !secondShown) {
                System.out.println(imie2);
                secondShown = true;
            }
            else {
                System.out.println(imie3);
                thirdShown = true;
            }
        }

        if (secondShown) {
            if (imie1.compareToIgnoreCase(imie3) < 0 && !firstShown) {
                System.out.println(imie1);
                firstShown = true;
            }
            else {
                System.out.println(imie3);
                thirdShown = true;
            }
        }

        if (thirdShown) {
            if (imie2.compareToIgnoreCase(imie1) < 0 && !secondShown) {
                System.out.println(imie2);
                secondShown = true;
            }
            else {
                if (!firstShown) {
                    System.out.println(imie1);
                    firstShown = true;
                }
            }
        }

        if (!firstShown) {
            System.out.println(imie1);
        } else if (!secondShown) {
            System.out.println(imie2);
        } else if (!thirdShown) {
            System.out.println(imie3);
        }
    }
}
