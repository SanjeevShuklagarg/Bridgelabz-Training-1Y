package logestic;

class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    String getType() {
        return "Rest";
    }
}