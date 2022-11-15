package printFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Zadanie19 {
    public static void main(String[] args) {
        int liczbaKonsumentow = 12467;
        double procentKupujacychTygodniowo = 0.14;
        double procentPreferującychSmakCytrynowy = 0.64;
        double liczbaKupujacychTygodniowo= liczbaKonsumentow * procentKupujacychTygodniowo;
        double liczbaKupujacychCytrynowy = liczbaKonsumentow * procentPreferującychSmakCytrynowy;

        BigDecimal tygodniowo = new BigDecimal(liczbaKupujacychTygodniowo).setScale(0, RoundingMode.HALF_UP);
        double liczbaZaokroglonaTygodniowo = tygodniowo.doubleValue();

        BigDecimal cytrynowy = new BigDecimal(liczbaKupujacychCytrynowy).setScale(0, RoundingMode.HALF_UP);
        double liczbaZaokroglonaNapojCytrynowy = cytrynowy.doubleValue();



        System.out.println("Przybliżona ilość kupujących przynajmniej jeden napój tygodniowo " + liczbaZaokroglonaTygodniowo);
        System.out.println("Przybliżona ilość kupujących napój cytrynowy " + liczbaZaokroglonaNapojCytrynowy);
    }


}
