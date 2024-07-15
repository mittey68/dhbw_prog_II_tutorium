package klasuraufgabe.tanteemmaladen;

public enum ClassOfGoods {

    BAKERY_PRODUCTS("Backwaren"), DAIRY_PRODUCTS("Milchprodukte"), FRUITS("Obst"), VEGETABLES(
            "Gemuese");

    private final String description;

    /*
     * Kein public Konstruktor, da Enums nicht von außen instanziiert werden sollen.
     * Private muss nicht explizit angegeben werden, da es der Standardwert ist.
     */
    ClassOfGoods(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }

}
