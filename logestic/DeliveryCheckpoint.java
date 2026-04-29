package logestic;


class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    String getType() {
        return "Delivery";
    }
}