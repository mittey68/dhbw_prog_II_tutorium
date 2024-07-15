package klasuraufgabe.tanteemmaladen;

import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public record CornerShop(String name, Map<Goods, Integer> store) {

    /*
     * Die Methode Optional<Integer> getAmountByDescription(description: String)
     * soll die Anzahl Waren zur eingehenden Warenbeschreibung als Optional
     * zurückgeben
     */
    public Optional<Integer> getAmountByDescription(String description) {
        if (getEntryByDescription(description) != null) {
            return Optional.of(getEntryByDescription(description).getValue());
        }
        return Optional.ofNullable(null);
    }

    /*
     * Identisch zu getAmountByDescription, jedoch ohne Verwendung der Hilfsmethode
     */
    public Optional<Integer> getAmountByDescription2(String description) {
        for (Entry<Goods, Integer> entry : store.entrySet()) {
            if (entry.getKey().description().equals(description)) {
                return Optional.of(entry.getValue());
            }
        }
        return Optional.ofNullable(null);
    }

    /*
     * Hilfsmethode, um den Eintrag zu einer Beschreibung zu erhalten
     */
    public Entry<Goods, Integer> getEntryByDescription(String description) {
        for (Entry<Goods, Integer> entry : store.entrySet()) {
            if (entry.getKey().description().equals(description)) {
                return entry;
            }
        }
        return null;
    }

    /*
     * Die Methode void sellGoods(goods: Goods, amount: int) soll die eingehende
     * Ware im Lager (store) um die eingehende Anzahl reduzieren. Für den Fall, dass
     * keine ausreichende Anzahl an Waren vorhanden ist, soll die Ausnahme
     * OutOfStockException ausgelöst werden
     */
    public void sellGoods(Goods goods, int amount) throws OutOfStockException {
        Entry<Goods, Integer> entry = getEntryByDescription(goods.description());
        if (entry != null) {
            entry.setValue(entry.getValue() - amount);
        }
        if (entry.getValue() < 0) {
            throw new OutOfStockException("Not enough goods in stock");
        }
    }

    /*
     * Die Methode void buyGoods(goods: Goods, amount: int) soll die eingehende Ware
     * im Lager (store) um die eingehende Anzahl erhöhen
     */
    public void buyGoods(Goods goods, int amount) {
        Entry<Goods, Integer> entry = getEntryByDescription(goods.description());
        if (entry != null) {
            entry.setValue(entry.getValue() + amount);
        } else {
            store.put(goods, amount);
        }
    }

}
