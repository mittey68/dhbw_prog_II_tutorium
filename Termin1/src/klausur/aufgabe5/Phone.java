package klausur.aufgabe5;

public abstract class Phone {
    private final String description;
    private final Brand brand;
    private final double valueInEuro;

    public Phone(String description, Brand brand, double valueInEuro) {
        this.description = description;
        this.brand = brand;
        this.valueInEuro = valueInEuro;
    }

    public String description() {
        return description;
    }

    public Brand brand() {
        return brand;
    }

    public double valueInEuro() {
        return valueInEuro;
    }
}
