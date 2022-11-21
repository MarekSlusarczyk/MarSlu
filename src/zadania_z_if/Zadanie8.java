package zadania_z_if;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź liczbę zakupionych sztuk  oprogramowania");
        int iloscSztuk = klawiatura.nextInt();

        double cena = 99.0;
        double cenaZrabatem = 1.0;

        if(iloscSztuk < 10) {
            System.out.println("Nie pzyznano rabatu");
            cenaZrabatem = 1.0;
        } else if (iloscSztuk >= 10 && iloscSztuk <= 19) {
            System.out.println("Przyznano rabat w wysokości 20%");
            cenaZrabatem = 0.80;
        } else if (iloscSztuk >= 20 && iloscSztuk <= 49) {
            System.out.println("Przyznano rabat w wysokości 30%");
            cenaZrabatem = 0.70;
        } else if (iloscSztuk >= 50 && iloscSztuk <= 99) {
            System.out.println("Przyznano rabat w wysokości 40%");
            cenaZrabatem = 0.60;
        } else {
            System.out.println("Przyznano rabat w wysokości 50%");
            cenaZrabatem = 0.50;
        }

        double wartoscBezRabatu = (double)cena * iloscSztuk;
        double kwotaZakupu = wartoscBezRabatu * cenaZrabatem;

        System.out.println("Kwota przed rabatem: " + wartoscBezRabatu);
        System.out.println("Kwota po rabacie: " + kwotaZakupu);
    }
}
