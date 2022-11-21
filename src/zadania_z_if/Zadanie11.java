package zadania_z_if;

import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź nazwisko 1. biegacza");
        String biegacz1 = klawiatura.nextLine();
        System.out.println("Podaj czas w którym przybiegł na metę");
        double czas1 = klawiatura.nextDouble();

        klawiatura.nextLine();

        System.out.println("Wprowadź nazwisko 2. biegacza");
        String biegacz2 = klawiatura.nextLine();
        System.out.println("Podaj czas w którym przybiegł na metę");
        double czas2 = klawiatura.nextDouble();

        klawiatura.nextLine();

        System.out.println("Wprowadź nazwisko 3. biegacza");
        String biegacz3 = klawiatura.nextLine();
        System.out.println("Podaj czas w którym przybiegł na metę");
        double czas3 = klawiatura.nextDouble();

        klawiatura.nextLine();

        if (czas1 < czas2 && czas1 < czas3) {
            System.out.println("1. " + biegacz1 + " czas: " + czas1);
            if(czas2 < czas3) {
                System.out.println("2. " + biegacz2 + " czas: " + czas2);
                System.out.println("3. " + biegacz3 + " czas: " + czas3);
            } else {
                System.out.println("2. " + biegacz3 + " czas: " + czas3);
                System.out.println("3. " + biegacz2 + " czas: " + czas2);
            }
        } else if (czas2 < czas1 && czas2 < czas3) {
            System.out.println("1. " + biegacz2 + " czas: " + czas2);
            if(czas1 < czas3) {
                System.out.println("2. " + biegacz1 + " czas: " + czas1);
                System.out.println("3. " + biegacz3 + " czas: " + czas3);
            } else {
                System.out.println("2. " + biegacz3 + " czas: " + czas3);
                System.out.println("3. " + biegacz1 + " czas: " + czas1);
            }
        } else if (czas3 < czas1 && czas3 < czas2) {
            System.out.println("1. " + biegacz3 + " czas: " + czas3);
            if(czas1 < czas2) {
                System.out.println("2. " + biegacz1 + " czas: " + czas1);
                System.out.println("3. " + biegacz2 + " czas: " + czas2);
            } else {
                System.out.println("2. " + biegacz2 + " czas: " + czas2);
                System.out.println("3. " + biegacz1 + " czas: " + czas1);
            }
        }




    }
}
