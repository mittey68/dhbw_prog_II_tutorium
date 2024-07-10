package uebungsaufgaben.tiefgarage;

public class ParkingSpot {
    private Vehicle vehicle;
    private final double lengthInM;
    private final double heightInM;
    private final boolean isForBusesOnly;

    public ParkingSpot(double lengthInM, double heightInM, boolean isForBusesOnly) {
        this.lengthInM = lengthInM;
        this.heightInM = heightInM;
        this.isForBusesOnly = isForBusesOnly;
    }

    public Vehicle vehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double lengthInM() {
        return lengthInM;
    }

    public double heightInM() {
        return heightInM;
    }

    public boolean isForBusesOnly() {
        return isForBusesOnly;
    }

    @Override
    public String toString() {
        return "Parkplatz (" + lengthInM + "m x " + heightInM + "m)";
    }
}
