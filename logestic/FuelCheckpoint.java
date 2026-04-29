package logestic;

class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    String getType() {
        return "Fuel";
    }
}