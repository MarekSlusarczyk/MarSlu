package zadania_z_if;

import java.util.Scanner;
public class Zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Wprowadź ilość kalorii w produkcie");
        int iloscKalorii = klawiatura.nextInt();

        System.out.println("Wprowadź ilość gramów tłuszczu");
        int iloscGramowTluszczu = klawiatura.nextInt();


        int wagaGramuTluszczu = 9;
        double kalorieZtluszczu = (double)iloscGramowTluszczu * wagaGramuTluszczu;
        double procentKaloriiZtluszczu = (double)kalorieZtluszczu / iloscKalorii;

        if (kalorieZtluszczu > iloscKalorii) {
            System.out.println("Wprowadzono błędne dane");
        } else {
            System.out.println("Procent kalorii pochodzących z tłuszczu: " + procentKaloriiZtluszczu * 100 + "%");
            if(procentKaloriiZtluszczu < 0.3) {
                System.out.println("Produkt jest niskotłuszczowy");
            }
        }
    }
}
