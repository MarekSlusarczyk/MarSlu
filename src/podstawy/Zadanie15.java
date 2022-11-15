package podstawy;

import java.util.Scanner;
public class Zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź nazwę twojego ulubionego miasta: ");
        String miasto = klawiatura.nextLine();

        int liczbaZnakow = miasto.length();
        String miastoDuzymi = miasto.toUpperCase();
        String miastoMalymi = miasto.toLowerCase();
        char pierwszaLitera = miasto.charAt(0);

        System.out.println("Liczba znaków w nazwie miasta: " + liczbaZnakow);
        System.out.println("Nazwa miasta zapisana wielkimi literami: " + miastoDuzymi);
        System.out.println("Nazwa miasta zapisana małymi literami: " + miastoMalymi);
        System.out.println("Pierwsza litera nazwy miasta: " + pierwszaLitera);
    }
}
