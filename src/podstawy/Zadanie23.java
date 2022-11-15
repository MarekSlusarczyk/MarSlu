package podstawy;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj dlugosc rzedu w metrach");                                //(R)
        double dlugoscRzedu = klawiatura.nextDouble();

        System.out.println("Podaj ilosc miejsca zajmowanego przez okratowanie w metrach");  //(E)
        double okratowanie = klawiatura.nextDouble();

        System.out.println("Podaj odległość między sadzonkami w metrach");                  //(S)
        double odlegloscMiedzySadzonkami = klawiatura.nextDouble();


        double iloscSadzonekKtoreMoznaPosadzic = (dlugoscRzedu - 2 * okratowanie) / odlegloscMiedzySadzonkami;

        System.out.println("W rzędzie można posadzić: " + iloscSadzonekKtoreMoznaPosadzic);
    }
}
