package besprechungen.lists;

import java.util.List;

public class NonChangeableLists {
    public static void main(String[] args) {
        /*
         * Die of()-Methode ist eine statische Methode der Klasse List, die eine Liste
         * erstellt, die nicht verändert werden kann. Dem Attribut List wird der Typ
         * String zugewiesen, da als Übergabe-Parameter Strings übergeben werden.
         */
        List<String> list = List.of("Hans", "Peter", "Lisa");

        /* Die Methode size() gibt die Anzahl der Elemente in der Liste zurück. */
        System.out.println(list.size());
        /*
         * Die Methode get(index: int) gibt das Element an der Stelle der übergebenen
         * Zahl zurück.
         */
        System.out.println(list.get(0));
        /*
         * Da die Liste nicht verändert werden kann, führen die folgenden Methoden zu
         * Laufzeitfehlern.
         */
        list.set(0, "Max");
        list.add("Heidi");
        list.remove(0);
    }
}
