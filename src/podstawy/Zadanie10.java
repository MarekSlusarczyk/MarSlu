package podstawy;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź wartość produktu: ");
        double wartosc = klawiatura.nextDouble();
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;
        double wartoscPodatkuStanowego = wartosc * 0.04;
        double wartoscPodatkuLokalnego = wartosc * 0.02;
        double cenaSprzedazy = wartosc + wartoscPodatkuStanowego + wartoscPodatkuLokalnego;
        System.out.println("Wartość produktu wynosi: " + wartosc + " zł");
        System.out.println("Wartość podatku stanowego wynosi: " + wartoscPodatkuStanowego + " zł");
        System.out.println("Wartość podatku lokalnego wynosi: " + wartoscPodatkuLokalnego + " zł");
        System.out.println("Cena sprzedaży: " + cenaSprzedazy + " zł");
    }
}
