package chapter2.exercices.exercice3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    private Bus bus;

    public void launchMenu() {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------ TEST ------");
            System.out.println("1: Create bus");
            System.out.println("2: Move the bus");
            System.out.println("3: Add traveller");
            System.out.println("4: Remove traveller");
            System.out.println("5: Show bus informations");
            System.out.println("5: Quit");
            System.out.println("---------------------");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createBus();
                    break;
                case 2:
                    moveBus();
                    break;
                case 3:
                    addTraveller();
                    break;
                case 4:
                    removeTraveller();
                    break;
                case 5:
                    showBusInformations();
                    break;
                default:
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
        while (true);
    }

    private void addTraveller() {
        if (bus != null)
            bus.addTravellers(1);
        else
            System.out.println("Bus doesn't exists yet.");
    }

    private void removeTraveller() {
        Scanner sc = new Scanner(System.in);
        int numberOfTravellersToRemove;
        System.out.println("How much traveller do you want to remove ?");
        if (bus != null)
            bus.removeTravellers(1);
        else
            System.out.println("Bus doesn't exists yet.");
    }

    private void showBusInformations() {
        if (bus != null)
            System.out.println(bus.toString());
        else
            System.out.println("No information to show since no Bus was created.");
    }

    private void moveBus() {
        bus.travel();
    }

    private void createBus() {
        ArrayList<String> stopNames = new ArrayList<>();
        stopNames.add("La Défense");
        stopNames.add("Caron");
        stopNames.add("Faubourg de l’Arche");
        stopNames.add("Normandie");
        stopNames.add("Marceau D’Estienne d’Orves");
        stopNames.add("République – Colombes");
        stopNames.add("Europe");
        stopNames.add("Moulin des Bruyères");
        stopNames.add("Chevreul");
        stopNames.add("Balzac");
        stopNames.add("Chanzy");
        stopNames.add("Gare de Bois-Colombes");
        stopNames.add("La Paix");
        stopNames.add("Cayron – Chefson");
        stopNames.add("Abbé Glatz");
        stopNames.add("Bourguignons");
        stopNames.add("Ménil");
        stopNames.add("Les Agnettes");
        stopNames.add("Couture d’Auxerre");
        stopNames.add("Jaurès – Camélinat – Mairie");
        stopNames.add("Deslandes – Cabœufs");
        stopNames.add("Moulin de Cage");
        stopNames.add("Rond-Point – P. Timbaud J. Larose");
        stopNames.add("Gennevilliers RER");
        bus = new Bus(178, "La Défense", "Gennevilliers RER / Gennevilliers", 50, true, stopNames);
    }


}
