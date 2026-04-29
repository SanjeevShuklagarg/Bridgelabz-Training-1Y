package logestic;

import java.sql.Connection;
import java.sql.PreparedStatement;

class Driver {

    String driverId;
    String name;

    RouteLinkedList<Checkpoint> routeHistory = new RouteLinkedList<>();

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    // 🔥 SAVE DRIVER TO DATABASE
    public void saveDriverToDB() {
        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO drivers(driver_id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, driverId);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Driver saved to DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printSummary() {

        System.out.println("\n===== DRIVER DETAILS =====");
        System.out.println("Driver ID   : " + driverId);
        System.out.println("Driver Name : " + name);

        System.out.println("\n===== ROUTE SUMMARY =====");
        routeHistory.printRoute();

        double totalDistance = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double routeScore = totalDistance - totalPenalty;

        System.out.println("\n===== ANALYSIS =====");
        System.out.println("Total Distance : " + totalDistance + " km");
        System.out.println("Total Penalty  : " + totalPenalty);
        System.out.println("Route Score    : " + routeScore);

        if (routeHistory.checkCritical()) {
            System.out.println("Critical Route Check: ✅ OK");
        } else {
            System.out.println("Critical Route Check: ❌ Missing Delivery");
        }
    }
}