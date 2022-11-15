package zadania_z_if;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Wpisz liczbę z zakresu od 1 do 10");
        int cyfraArabska = klawiatura.nextInt();

        switch (cyfraArabska) {
            case 1:
                System.out.println("Cyfra rzymska to: I");
                break;
            case 2:
                System.out.println("Cyfra rzymska to: II");
                break;
            case 3:
                System.out.println("Cyfra rzymska to: III");
                break;

            case 4:
                System.out.println("Cyfra rzymska to: IV");
                break;

            case 5:
                System.out.println("Cyfra rzymska to: V");
                break;

            case 6:
                System.out.println("Cyfra rzymska to: VI");
                break;

            case 7:
                System.out.println("Cyfra rzymska to: VII");
                break;

            case 8:
                System.out.println("Cyfra rzymska to: VIII");
                break;

            case 9:
                System.out.println("Cyfra rzymska to: IX");
                break;

            case 10:
                System.out.println("Cyfra rzymska to: X");
                break;

            default:
                System.out.println("Wpisano inną liczbę");
                break;
        }
    }
}
