public class Zadanie22 {
    public static void main(String[] args) {
        int liczbaKupionychAkcji = 1000;
        double cenaZaAkcje = 32.87;

        double prowizja = 0.02;

        int liczbaSprzedanychAkcji = 1000;
        double cenaSprzedazy = 33.92;

        double kwotaZakupuAkcji = liczbaKupionychAkcji * cenaZaAkcje;
        double kwotaProwizjiPrzyZakupie = kwotaZakupuAkcji * prowizja;

        double kwotaSprzedazyAkcji = liczbaSprzedanychAkcji * cenaSprzedazy;
        double kwotaProwizjiPrzySprzedazy = kwotaSprzedazyAkcji * prowizja;

        System.out.println("Kwota zapłacona za akcje: " + kwotaZakupuAkcji + "\nKwota zapłacona brokerowi: " +
                kwotaProwizjiPrzyZakupie + "\n\nKwota otrzymana przy sprzedaży: " + kwotaSprzedazyAkcji +
                "\nKwota zapłacona brokerowi przy sprzedaży: " + kwotaProwizjiPrzySprzedazy);
    }
}
