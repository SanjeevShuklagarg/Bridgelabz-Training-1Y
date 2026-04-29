package logestic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Driver ID: ");
        String driverId = sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        Driver d = new Driver(driverId, name);


        d.saveDriverToDB();


        System.out.print("Enter number of checkpoints: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nCheckpoint " + (i + 1));

            System.out.print("Enter Type (Delivery/Fuel/Rest): ");
            String type = sc.nextLine();

            System.out.print("Enter Checkpoint ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Location Name: ");
            String location = sc.nextLine();

            System.out.print("Enter Distance (km): ");
            double distance = sc.nextDouble();

            System.out.print("Enter Expected Duration (min): ");
            int expected = sc.nextInt();

            System.out.print("Enter Actual Duration (min): ");
            int actual = sc.nextInt();
            sc.nextLine();

            Checkpoint cp;

            if (type.equalsIgnoreCase("Delivery")) {
                cp = new DeliveryCheckpoint(id, location, distance, expected, actual);
            } else if (type.equalsIgnoreCase("Fuel")) {
                cp = new FuelCheckpoint(id, location, distance, expected, actual);
            } else {
                cp = new RestCheckpoint(id, location, distance, expected, actual);
            }


            d.routeHistory.addCheckpoint(cp);


            d.routeHistory.saveCheckpointToDB(cp, d.driverId);
        }


        System.out.println("\n===== FINAL RESULT =====");
        d.printSummary();

        sc.close();
    }
}