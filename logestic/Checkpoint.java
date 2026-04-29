package logestic;

abstract class Checkpoint {
    String id;
    String location;
    double distance;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String location, double distance, int expected, int actual) {
        this.id = id;
        this.location = location;
        this.distance = distance;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    abstract String getType();

    public void printDetails() {
        System.out.println(getType() + " | " + id + " | " + location +
                " | Distance: " + distance +
                " | Expected: " + expectedDuration +
                " | Actual: " + actualDuration);
    }

    // penalty if delayed
    public double getPenalty() {
        if (actualDuration > expectedDuration) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0;
    }
}