package zadania_z_if;

import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        boolean wegetarianskie = false;
        boolean weganskie = false;
        boolean bezglutenowe = false;

        System.out.println("Czy któraś z osób jest na diecie wegetariaśnkiej?");
        String wege = klawiatura.nextLine();

        if(wege.equalsIgnoreCase("tak")) {
            wegetarianskie = true;
        }

        System.out.println("Czy któraś z osób jest na diecie wegaśnkiej?");
        String wegan = klawiatura.nextLine();

        if(wegan.equalsIgnoreCase("tak")) {
            weganskie = true;
        }

        System.out.println("Czy któraś z osób jest na diecie bezglutenowej?");
        String bezgl = klawiatura.nextLine();

        if(bezgl.equalsIgnoreCase("tak")) {
            bezglutenowe = true;
        }

        if (!wegetarianskie && !weganskie && !bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nLuksusowe burgery u Jarka\nPizzeria przy dworcowej\nKawiarnia na rogu" +
                    "\nWłoskie specjały\nKuchnia u szefa");
        } else if (!wegetarianskie && !weganskie && bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nPizzeria przy dworcowej\nKawiarnia na rogu\nKuchnia u szefa");
        } else if (!wegetarianskie && weganskie && bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nKawiarnia na rogu\nKuchnia u szefa");
        } else if (wegetarianskie && weganskie && bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nKawiarnia na rogu\nKuchnia u szefa");
        } else if (wegetarianskie && !weganskie && bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nKawiarnia na rogu\nPizzeria przy Dworcowej\nKuchnia u Szefa");
        } else if (!wegetarianskie && weganskie && !bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nKawiarnia na rogu\nKuchnia u Szefa");
        } else if (wegetarianskie && !weganskie && !bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nWłoskie Specjały\nKawiarnia na rogu" +
                    "\nKuchnia u Szefa\nPizzeria przy Dworcowej");
        } else if (wegetarianskie && weganskie && !bezglutenowe) {
            System.out.println("Możecie się wybrać do:\nKawiarnia na rogu" +
                    "\nKuchnia u Szefa");

        }
    }
}
