package klasuraufgabe.tanteemmaladen;

public abstract class Product {

    private final String description;
    private final double price;
    private final String currency;

    public Product(String description, double price, String currency) {
        this.description = description;
        this.price = price;
        this.currency = currency;
    }

    public String description() {
        return description;
    }

    public double price() {
        return price;
    }

    public String currency() {
        return currency;
    }

}