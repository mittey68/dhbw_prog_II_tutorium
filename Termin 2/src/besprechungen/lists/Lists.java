package besprechungen.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        /*
         * Sowohl Zeile 14 als auch Zeile 15 ergeben ausführbaren korrekten Code. Wenn
         * man sich jedoch im NAchhinein umetscheiden sollte, welche Art von Liste man
         * verwenden möchte (siehe Termin 1/src/besprechungen/lists), ist dies in Zeile
         * 18 möglich, in Zeile 15 allerdings nicht.
         */
        List<String> list;
        ArrayList<String> arrayList;

        /*
         * Kein Fehler, da ArrayList eine Liste ist und somit in eine Liste gecastet
         * werden kann
         */
        list = List.of("Hallo", "Welt");
        /*
         * Fehler, da List.of() eine unveränderliche Liste zurückgibt und keine
         * ArrayList
         */
        // arrayList = List.of("Hallo", "Welt");
    }

}
