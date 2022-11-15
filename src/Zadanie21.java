import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Ile pieniędzy chcesz zdeponować?");                     //(P)
        double iloscPieniedzy = klawiatura.nextDouble();

        System.out.println("Na ile lat?");                                          //(t)
        double iloscLat = klawiatura.nextDouble();

        System.out.println("Podaj roczną stopę oprocentowania");                    //(r)
        double stopaOprocentowania = klawiatura.nextDouble();

        System.out.println("Ile razy w roku odsetki są naliczne do kapitału?");     //(n)
        double iloscOdsetekDoKapitaluWCiaguRoku = klawiatura.nextDouble();

        double wykladnik = iloscOdsetekDoKapitaluWCiaguRoku * iloscLat;
        double liczbaPotegowana = 1 + stopaOprocentowania / iloscOdsetekDoKapitaluWCiaguRoku;
        double wynikPotegowania = Math.pow(liczbaPotegowana, wykladnik);
        double kwotaCalkowita = iloscPieniedzy * wynikPotegowania;

        System.out.println("Kwota po lokacie " + kwotaCalkowita);

    }
}
