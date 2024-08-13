package besprechungen.lists;

import java.util.ArrayList;
import java.util.List;

public class ChangableLists {
    public static void main(String[] args) {
        /*
         * Die Klasse ArrayList ist eine Klasse, die eine Liste erstellt, die verändert
         * werden kann. Dem Attribut list wird der Typ String zugewiesen, da als
         * Übergabe-Parameter Strings übergeben werden. Statt ArrayList kann auch eine
         * LinkedList verwendet werden. Der Aufruf der Methoden ist in beiden Fällen
         * gleich: Die Erstellung der Linked List würde wie folgt aussehen: List<String>
         * list = new LinkedList<>();
         */
        List<String> list = new ArrayList<>();
        /*
         * Die Methode add(element: E) fügt das übergebene Element am Ende der Liste
         * hinzu. Im Gegensatz zu den anderen Listen-Implementierungen kann die Länge
         * der Liste verändert werden, weshalb die Elemete nicht schon bei der
         * Erstellung übergeben werden müssen.
         */
        list.add("Hans");
        list.add("Peter");
        list.add("Lisa");

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
        // add() wie oben
        list.add("Heidi");
                /*
         * Die Methode remove(index: int) entfernt das Element an der Stelle der
         * übergebenen Zahl aus der Liste.
         */
        list.remove(0);
    }
}
