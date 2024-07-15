package uebungsaufgaben.exceptions01;

public final class Car extends Vehicle {
    private final int seats;

    public Car(String brand, String model, Engine engine, int seats) {
        super(brand, model, engine);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void doATurboBoost()
    {
        speedInKmh += 100;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engine=" + getEngine() +
                ", speedInKmh=" + speedInKmh +
                '}';
    }


}
