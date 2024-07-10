package klausur.aufgabe5;

public class MobilePhone extends Phone {
    // -os: OS {final} aus UML-Diagramm
    private final OS os;

    /*
     * +MobilePhone(description: String, brand: Brand, valueInEuro: double, os: OS)
     * aus UML-Diagramm
     */
    public MobilePhone(String description, Brand brand, double valueInEuro, OS os) {
        /*
         * Aufruf des Konstruktors der Oberklasse, um description, brand und valueInEuro
         * zu setzen. Diese Attribute können nicht direkt in der Unterklasse gesetzt
         * werden. super-Konstruktor muss immer als erstes in der
         * Konstruktor-Implementierung aufgerufen werden
         */
        super(description, brand, valueInEuro);
        // Setzen des os-Attributs der Unterklasse
        this.os = os;
    }

    /* +os(): OS aus UML-Diagramm und die Getter-Methode für das os-Attribut */
    public OS os() {
        return os;
    }
}
