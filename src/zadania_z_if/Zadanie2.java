package zadania_z_if;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wpisz dzień miesiąca");
        int dzien = klawiatura.nextInt();

        System.out.println("Wpisz numer miesiąca");
        int miesiac = klawiatura.nextInt();

        System.out.println("Wpisz dwie ostatnie cyfry roku");
        int rok = klawiatura.nextInt();

        if (dzien * miesiac == rok) {
            System.out.println("Data jest magiczna");
        }
        else {
            System.out.println("Data nie jest magiczna");
        }
    }
}
