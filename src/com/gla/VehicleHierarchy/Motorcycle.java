package com.gla.VehicleHierarchy;
class Motorcycle extends Vehicle {
    boolean hasABS;

    Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("ABS: " + hasABS);
    }
}
