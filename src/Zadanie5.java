public class Zadanie5 {
    public static void main(String[] args) {
        int dwaMetry = 2;
        int trzyMetry = 3;
        int czteryMetry = 4;
        int powierzchniaPomieszczeniaPierwszegoiDrugiego = 2* (trzyMetry*czteryMetry);
        int powierzchniaPomieszczeniaTrzeciego = dwaMetry*trzyMetry;
        int powierzchniaPomieszczeniaCzwartego = dwaMetry*dwaMetry;
        int powierzchniaCalkowita = powierzchniaPomieszczeniaPierwszegoiDrugiego + powierzchniaPomieszczeniaTrzeciego + powierzchniaPomieszczeniaCzwartego;
        System.out.println("Powierzchnia pierwszego i drugiego pomieszczenia: " + powierzchniaPomieszczeniaPierwszegoiDrugiego + " m2");
        System.out.println("Powierzchnia trzeciego pomieszczenia: " + powierzchniaPomieszczeniaTrzeciego + " m2");
        System.out.println("Powierzchnia czwrtego pomieszczenia: " + powierzchniaPomieszczeniaCzwartego + " m2");
        System.out.println("Powierzchnia całkowita mieszkania: " + powierzchniaCalkowita + " m2");
    }
}
