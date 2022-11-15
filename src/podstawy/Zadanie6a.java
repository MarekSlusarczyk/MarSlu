package podstawy;

import java.util.Scanner;

public class Zadanie6a {
    public static void main(String[] args) {
        int osoby = 4;

        Scanner klawiatura = new Scanner(System.in);

        int dlugoscPierwszegoPokoju;
        System.out.println("Podaj dlugosc pierwzego pokoju: ");
        dlugoscPierwszegoPokoju = klawiatura.nextInt();

        int szerokoscPierwszegoPokoju;
        System.out.println("Podaj szerokosc pierwzego pokoju: ");
        szerokoscPierwszegoPokoju = klawiatura.nextInt();

        int dlugoscDrugiegoPokoju;
        System.out.println("Podaj dlugosc drugiego pokoju: ");
        dlugoscDrugiegoPokoju = klawiatura.nextInt();

        int szerokoscDrugiegoPokoju;
        System.out.println("Podaj szerokosc drugiego pokoju: ");
        szerokoscDrugiegoPokoju = klawiatura.nextInt();

        int dlugoscTrzeciegoPokoju;
        System.out.println("Podaj dlugosc trzeciego pokoju: ");
        dlugoscTrzeciegoPokoju = klawiatura.nextInt();

        int szerokoscTrzeciegoPokoju;
        System.out.println("Podaj szerokosc trzeciego pokoju: ");
        szerokoscTrzeciegoPokoju = klawiatura.nextInt();

        int dlugoscCzwartegoPokoju;
        System.out.println("Podaj dlugosc czwartego pokoju: ");
        dlugoscCzwartegoPokoju = klawiatura.nextInt();

        int szerokoscCzwartegoPokoju;
        System.out.println("Podaj szerokosc czwartego pokoju: ");
        szerokoscCzwartegoPokoju = klawiatura.nextInt();

        int powierzchniaPomieszczeniaPierwszego = dlugoscPierwszegoPokoju * szerokoscPierwszegoPokoju;
        int powierzchniaPomieszczeniaDrugiego = dlugoscDrugiegoPokoju * szerokoscDrugiegoPokoju;
        int powierzchniaPomieszczeniaTrzeciego = dlugoscTrzeciegoPokoju * szerokoscTrzeciegoPokoju;
        int powierzchniaPomieszczeniaCzwartego = dlugoscCzwartegoPokoju * szerokoscCzwartegoPokoju;
        int powierzchniaCalkowita = powierzchniaPomieszczeniaPierwszego + powierzchniaPomieszczeniaDrugiego + powierzchniaPomieszczeniaTrzeciego + powierzchniaPomieszczeniaCzwartego;
        double powierzchniaNaOsobe = (double)powierzchniaCalkowita / osoby;
        System.out.println("Powierzchnia pierwszego pomieszczenia: " + powierzchniaPomieszczeniaPierwszego + " m2");
        System.out.println("Powierzchnia drugiego pomieszczenia: " + powierzchniaPomieszczeniaDrugiego + " m2");
        System.out.println("Powierzchnia trzeciego pomieszczenia: " + powierzchniaPomieszczeniaTrzeciego + " m2");
        System.out.println("Powierzchnia czwrtego pomieszczenia: " + powierzchniaPomieszczeniaCzwartego + " m2");
        System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaCalkowita + " m2");
        System.out.println("Powierzchnia przypadająca na 1 osobę: " + powierzchniaNaOsobe + " m2");
    }
}
