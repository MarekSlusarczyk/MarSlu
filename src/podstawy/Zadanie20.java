package podstawy;

import java.util.Scanner;

import java.math.BigDecimal;
import java.math.RoundingMode;



public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double szklankiCukru = 1.5;
        double szklankiMasla = 1.0;
        double szklankiMaki = 2.75;
        int iloscCiastek = 48;

        System.out.println("Podaj liczbe ciasteczek które chcesz upiec");
        double iloscCiasteczekKtoreChceszUpiec = klawiatura.nextDouble();

        double szklankiCukruNaCalosc = (double)szklankiCukru / iloscCiastek * iloscCiasteczekKtoreChceszUpiec;
        double szklankiMaslaNaCalosc = (double)szklankiMasla / iloscCiastek * iloscCiasteczekKtoreChceszUpiec;
        double szklankiMakiNaCalosc = (double)szklankiMaki / iloscCiastek * iloscCiasteczekKtoreChceszUpiec;

        BigDecimal scz = new BigDecimal(szklankiCukruNaCalosc).setScale(2, RoundingMode.HALF_UP);
        double szklankiCukruZaokraglone = scz.doubleValue();

        BigDecimal smz = new BigDecimal(szklankiMaslaNaCalosc).setScale(2, RoundingMode.HALF_UP);
        double szklankiMaslaZaokraglone = smz.doubleValue();

        BigDecimal smaz = new BigDecimal(szklankiMakiNaCalosc).setScale(2, RoundingMode.HALF_UP);
        double szklankiMakiZaokraglone = smaz.doubleValue();

        System.out.println("Potrzebujesz:\nSzklanki cukru: " + szklankiCukruZaokraglone + "\nSzklanki masła: " + szklankiMaslaZaokraglone + "\nSzklanki maki: " +
                szklankiMakiZaokraglone);


    }
}
