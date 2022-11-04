import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę posiłku: ");
        double cenaPosilku = klawiatura.nextDouble();

        double podatek = 0.0675;
        double napiwek = 0.20;
        double wartoscPodatku = cenaPosilku * podatek;
        double suma = cenaPosilku + wartoscPodatku;
        double wartoscNapiwku = suma * napiwek;
        double kwotaDoZaplaty = suma + wartoscNapiwku;
        System.out.println("Cena posiłku: " + cenaPosilku);
        System.out.println("Wartość podatku: " + wartoscPodatku);
        System.out.println("Wysokość napiwku: " + wartoscNapiwku);
        System.out.println("Łączna kwota do zapłaty: " + kwotaDoZaplaty);
    }
}
