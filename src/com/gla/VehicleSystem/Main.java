package com.gla.VehicleSystem;
class Main {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(180, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(160, "Honda City");

        ev.charge();
        pv.refuel();
    }
}
