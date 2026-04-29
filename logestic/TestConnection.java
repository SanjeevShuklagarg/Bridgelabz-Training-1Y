package logestic;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        try {
            Connection con = DBConnection.getConnection();

            if (con != null) {
                System.out.println("Connected to Database Successfully!");
            } else {
                System.out.println("Connection Failed!");
            }

        } catch (Exception e) {
            System.out.println(" Connection Failed!");
            e.printStackTrace();
        }
    }
}