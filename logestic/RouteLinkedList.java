package logestic;

class RouteLinkedList<T extends Checkpoint> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;


    public void addCheckpoint(T cp) {
        Node newNode = new Node(cp);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printRoute() {
        Node temp = head;
        while (temp != null) {
            temp.data.printDetails();
            temp = temp.next;
        }
    }


    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.distance;
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.getPenalty();
            temp = temp.next;
        }
        return total;
    }


    public boolean checkCritical() {
        Node temp = head;

        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // 🔥 SAVE CHECKPOINT TO DATABASE
    public void saveCheckpointToDB(Checkpoint cp, String driverId) {
        try {
            java.sql.Connection con = DBConnection.getConnection();

            String query = "INSERT INTO checkpoints VALUES (?, ?, ?, ?, ?, ?, ?)";
            java.sql.PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, cp.id);
            ps.setString(2, driverId);
            ps.setString(3, cp.getType());
            ps.setString(4, cp.location);
            ps.setDouble(5, cp.distance);
            ps.setInt(6, cp.expectedDuration);
            ps.setInt(7, cp.actualDuration);

            ps.executeUpdate();

            System.out.println("Checkpoint saved to DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}