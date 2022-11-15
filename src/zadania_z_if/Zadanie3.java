package zadania_z_if;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj swoją masę w kg");
        double masa = klawiatura.nextDouble();

        System.out.println("Podaj wzrost w metrach");
        double wzrost = klawiatura.nextDouble();

        double bmi = (double)masa / Math.pow(wzrost, 2);

        System.out.println("BMI wynosi: " + bmi);
        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Masz optymalną wagę");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę");
        } else {
            System.out.println("Masz nadwagę");
        }
    }
}
