package besprechungen.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        /*
         * Sowohl Zeile 14 als auch Zeile 15 ergeben ausführbaren korrekten Code. Wenn man
         * sich jedoch im NAchhinein umetscheiden sollte, welche Art von Liste man
         * verwenden möchte (siehe Termin 1/src/besprechungen/lists), ist dies in Zeile 18 aufgrund von Ploymorphie möglich, in Zeile 15 allerdings nicht.
         */
        private List<String> list;
        private ArrayList<String> arrayList;

        list = List.of("Hallo", "Welt");
        arrayList =  List.of("Hallo", "Welt");
    }

}
