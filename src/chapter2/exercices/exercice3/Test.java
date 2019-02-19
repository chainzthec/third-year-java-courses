package chapter2.exercices.exercice3;

import java.util.Scanner;

public class Test {

    private Bus bus;

    public void launchMenu(){
        int choice;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("------ TEST ------");
            System.out.println("1: Create bus");
            System.out.println("2: Move the bus");
            System.out.println("3: Add traveller");
            System.out.println("4: Remove traveller");
            System.out.println("5: Show bus informations");
            System.out.println("5: Quit");
            System.out.println("---------------------");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1: createBus();break;
                case 2: moveBus();break;
                case 3: addTraveller();break;
                case 4: removeTraveller();break;
                case 5: showBusInformations();break;
                default: sc.close();System.exit(0);break;

            }
        }
        while(true);
    }

    private void addTraveller(){
        if(bus != null)
            bus.addTravellers(1);
        else
            System.out.println("Bus doesn't exists yet.");
    }

    private void removeTraveller(){
        if(bus != null)
            bus.removeTravellers(1);
        else
            System.out.println("Bus doesn't exists yet.");
    }

    private void showBusInformations(){
        if(bus != null)
            System.out.println(bus.toString());
        else
            System.out.println("No information to show since no Bus was created.");
    }

    private void moveBus() {
        bus.travel();
    }

    private void createBus() {
        bus = new Bus(178,"La Défense","Gennevilliers RER / Gennevilliers",50,true,28);
    }


}
