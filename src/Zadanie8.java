import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String name;
        System.out.println("Podaj imie: ");
        name = klawiatura.nextLine();

        int age;
        System.out.println("Podaj wiek: ");
        age = klawiatura.nextInt();

        double annualPay;
        System.out.println("Podaj ile chcesz zarabiać w ciągu roku: ");
        annualPay =  klawiatura.nextDouble();

        System.out.println("Nazywam się " + name + ", mam " + age + " lat. Chcę zarabiać " +
                annualPay + " zł rocznie");
    }
}
