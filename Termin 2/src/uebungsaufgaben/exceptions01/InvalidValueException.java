package uebungsaufgaben.exceptions01;

// Selbst programmierte Exception-Klasse muss immer von Exception erben
public class InvalidValueException extends Exception {
    // Konstruktor
    public InvalidValueException() {
        /*
         * Aufruf des Konstruktors der Superklasse. Hier könnte man bspw. auch eine
         * String Message übergeben, da der Konstruktor überladen ist.
         */
        super();
    }
}