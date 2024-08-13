package uebungsaufgaben.tiefgarage;

public class Vehicle {
    private final String make;
    private final String model;
    private final double lengthInM;
    private final double heightInM;

    public Vehicle(String make, String model, double lengthInM, double heightInM) {
        this.make = make;
        this.model = model;
        this.lengthInM = lengthInM;
        this.heightInM = heightInM;
    }

    public String make() {
        return make;
    }

    public String model() {
        return model;
    }

    public double lengthInM() {
        return lengthInM;
    }

    public double heightInM() {
        return heightInM;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + lengthInM + "m x " + heightInM + "m)";
    }
}
