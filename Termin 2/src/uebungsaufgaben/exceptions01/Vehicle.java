package uebungsaufgaben.exceptions01;

public abstract class Vehicle {
    private String make;
    private String model;
    private Engine engine;
    protected double speedInKmh;
    private static int numberOfVehicles;

    public Vehicle(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.speedInKmh = 0;
        numberOfVehicles++;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getSpeedInKmh() {
        return speedInKmh;
    }

    public final void accelerate(double valueInKmh) throws InvalidValueException {
        if (valueInKmh < 0) {
            throw new InvalidValueException();
        }
        speedInKmh += valueInKmh;
    }

    public final void brake(double valueInKmh) throws InvalidValueException {
        if (valueInKmh < 0) {
            throw new InvalidValueException();
        }
        speedInKmh -= valueInKmh;
    }

    public abstract String toString();

    public static int getNumberOfVehicles() {
        return numberOfVehicles;
    }
}
