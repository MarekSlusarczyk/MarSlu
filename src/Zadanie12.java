import java.util.Scanner;
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int iloscCiastek = 40;
        int iloscPorcji = 10;
        int iloscKaloriiwPorcji = 300;

        System.out.println("Podaj ilość zjedzonych ciasteczek: ");
        int iloscZjedzonych = klawiatura.nextInt();

        double kalorie = (double)iloscKaloriiwPorcji / (iloscCiastek / iloscPorcji) * iloscZjedzonych;
        System.out.println("Zjadłeś " + kalorie + " kalorii");
    }
}
