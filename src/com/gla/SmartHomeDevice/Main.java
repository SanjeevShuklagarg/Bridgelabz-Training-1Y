package com.gla.SmartHomeDevice;
class Main {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T101", "ON", 24.5);
        t1.displayStatus();
    }
}
