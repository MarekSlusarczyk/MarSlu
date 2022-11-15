package podstawy;

public class Zadanie17 {
    public static void main(String[] args) {
        int iloscAkcji = 600;
        double wartoscJednejAkcji = 21.77;
        double wysokoscProwizji = 0.02;
        double wartoscWszystkichAkcji = iloscAkcji * wartoscJednejAkcji;
        double wartoscPodatku = wartoscWszystkichAkcji * wysokoscProwizji;
        double kwotaTransakcji = wartoscWszystkichAkcji + wartoscPodatku;
        System.out.println("Wartość wszystkich akcji " + wartoscWszystkichAkcji);
        System.out.println("Wysokość prowizji " + wartoscPodatku);
        System.out.println("Łączna kwota transakcji " + kwotaTransakcji);
    }
}
