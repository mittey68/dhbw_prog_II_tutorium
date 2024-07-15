package klasuraufgabe.tanteemmaladen;

public class Goods extends Product implements Comparable<Goods> {

    private final ClassOfGoods classOfGoods;
    private final String unit;

    public Goods(String description, ClassOfGoods classOfGoods, double price, String unit) {
        super(description, price);
        this.classOfGoods = classOfGoods;
        this.unit = unit;
    }

    public ClassOfGoods classOfGoods() {
        return classOfGoods;
    }

    public String unit() {
        return unit;
    }

    /*
     * Die Methode int compareTo(other: Goods) soll so implementiert werden, dass
     * damit Waren aufsteigend nach ihrer Beschreibung sortiert werden können.
     */
    /*
     * Die Methode compareTo() wird von der Klasse Comparable implementiert. Sollte
     * absteigend sortiert werden wäre der Code wie folgt: return
     * other.description().compareTo(description());
     */
    @Override
    public int compareTo(Goods other) {
        return description().compareTo(other.description());
    }
}
