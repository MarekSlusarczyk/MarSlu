package podstawy;

import java.util.Scanner;
public class Zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String firstName;
        System.out.println("Podaj swoje pierwsze imie: ");
        firstName = klawiatura.nextLine();

        String middleName;
        System.out.println("Podaj swoje drugie imie: ");
        middleName = klawiatura.nextLine();

        String lastName;
        System.out.println("Podaj swoje nazwisko: ");
        lastName = klawiatura.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);
        System.out.println("Twoje inicjały to: " + firstInitial + middleInitial + lastInitial );
    }
}
