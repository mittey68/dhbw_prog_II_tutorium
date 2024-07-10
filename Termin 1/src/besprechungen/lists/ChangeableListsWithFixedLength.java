package besprechungen.lists;

import java.util.Arrays;
import java.util.List;

public class ChangeableListsWithFixedLength {
    public static void main(String[] args) {
        /*
         * Die Methode asList() ist eine statische Methode der Klasse Arrays, die eine
         * Liste erstellt, die verändert werden kann. Dem Attribut List wird der Typ
         * String zugewiesen, da als Übergabe-Parameter Strings übergeben werden. Die
         * Liste kann allerding nicht in ihrer Länge verändert werden, da sie auf einem
         * Array basiert.
         */
        List<String> list = Arrays.asList("Hans", "Peter", "Lisa");

        /* Die Methode size() gibt die Anzahl der Elemente in der Liste zurück. */
        System.out.println(list.size());
        /*
         * Die Methode get(index: int) gibt das Element an der Stelle der übergebenen
         * Zahl zurück.
         */
        System.out.println(list.get(0));
        /*
         * Die Methode set(index: int, element: E) setzt das Element an der Stelle der
         * übergebenen Zahl auf das übergebene Element. Das Element muss dabei den Typ
         * der Liste haben, also in diesem Fall ein String sein.
         */
        list.set(0, "Max");
        /*
         * Da die Liste nicht in ihrer Länge verändert werden kann, führen die folgenden
         * Methoden zu Laufzeitfehlern.
         */
        list.add("Heidi"); // Laufzeitfehler
        list.remove(0); // Laufzeitfehler
    }
}
