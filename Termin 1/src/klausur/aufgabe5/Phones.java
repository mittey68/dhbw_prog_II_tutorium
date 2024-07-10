package klausur.aufgabe5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phones {
    // Die Methode List<Phone> getAllPhones(file: File) soll alle Telefone der eingehenden Datei zurückgeben
    // Deklaration als stattic, sodass die Methode ohne Instanzierung der Klasse aufgerufen werden kann
    // Throws FileNotFoundException, da die Methode eine Datei einliest und diese Datei nicht existieren könnte --> Fehler muss abgefangen werden
    public static List<Phone> getAllPhones(File file) throws FileNotFoundException {
        // Erzeugen einer neuen ArrayList vom Typ Phone (ArrayList ist eine veränderbare Liste, die Elemente hinzufügen und entfernen kann)
        List<Phone> phones = new ArrayList<>();
        // Erzeugen eines neuen Scanner-Objekts, das die Datei als Übergebenes Argument erhält
        Scanner scanner = new Scanner(file);
        // Solange der Scanner eine neue Zeile hat, wird die Schleife durchlaufen
        while (scanner.hasNextLine()) {
            // Einlesen der aktuellen Zeile und speichern in der Variable line
            String line = scanner.nextLine();
            // Aufteilen der Zeile in einzelne Unter-Strings, die durch ein Semikolon getrennt sind. Speichern in einem String-Array names tokens
            // split ist eine Standardmethode der Klasse String, die einen String in mehrere Teile aufteilt und ein Array zurückgibt
            String[] tokens = line.split(";");
            // Speichern des driiten Elements des tokens-Arrays in der Variable description (siehe phones.txt-Datei)
            String description = tokens[2];
            // Speichern des zweiten Elements des tokens-Arrays in der Variable brand (siehe phones.txt-Datei)
            // valueOf ist eine Standardmethode, die die Eingabe in ein Objekt einer anderen Klasse umwandelt. In diesem Fall wird der String in ein Objekt der Klasse Brand umgewandelt
            Brand brand = Brand.valueOf(tokens[1]);
            // Speichern des vierten Elements des tokens-Arrays in der Variable valueInEuro (siehe phones.txt-Datei)
            // valueOf-Methode, wie oben. In diesem Fall wird der String in ein Objekt der Klasse Double umgewandelt
            double valueInEuro = Double.valueOf(tokens[3]);
            // Überprüfen, ob das erste Element des tokens-Arrays der String "MOBILE" ist
            if (tokens[0].equals("MOBILE")) {
                // Wenn ja, wird das fünfte Element des tokens-Arrays in der Variable os gespeichert
                // valueOf-Methode, wie oben. In diesem Fall wird der String in ein Objekt der Klasse OS umgewandelt
                OS os = OS.valueOf(tokens[4]);
                // Erstellen und Hinzufügen eines neuen MobilePhone-Objekts zur in Zeile 15 erstellten phones-Liste
                phones.add(new MobilePhone(description, brand, valueInEuro, os));
            } else {
                // Wenn das erste Element des tokens-Arrays nicht "MOBILE" ist, wird ein neues WiredPhone-Objekt erstellt und zur phones-Liste hinzugefügt
                phones.add(new WiredPhone(description, brand, valueInEuro));
            }
        }
        // Schließen des Scanners (Code funktioniert auch ohne diese Zeile, aber sie gibt Bonuspunkte bei Daniel)
        scanner.close();
        // Rückgabe der phones-Liste
        return phones;
    }

    // Die Methode List<MobilePhone> getMobilePhonesFromSamsung(file: File) soll mit Hilfe der Methode List<Phone> getAllPhones(file: File) alle Mobiltelefone der Marke Samsung zurückgeben
    // Deklaration als stattic, sodass die Methode ohne Instanzierung der Klasse aufgerufen werden kann
    // Throws FileNotFoundException, da die Methode eine Datei einliest und diese Datei nicht existieren könnte --> Fehler muss abgefangen werden
    public static List<MobilePhone> getMobilePhonesFromSamsung(File file) throws FileNotFoundException {
        // Erzeugen einer neuen ArrayList, die nur den Typ MobilePhone enthalten kann und nicht alle Phones-Objekte
        List<MobilePhone> mobilePhonesFromSamsung = new ArrayList<>();
        // Aufruf der oben programmierten Methode getAllPhones, um alle Telefone aus der Datei zu erhalten. Abspeichern des Rückgabewerts der Methode in einer Liste namens allPhones
        List<Phone> allPhones = getAllPhones(file);
        // Durchlaufen der allPhones-Liste, um alle Mobiltelefone der Marke Samsung zu finden
        for (Phone p : allPhones) {
            // Überprüfen, ob das aktuelle Phone-Objekt ein MobilePhone ist
            // instanceof ist ein Operator, der überprüft, ob ein Objekt einer bestimmten Klasse angehört. Für alle Objekte, die von der Klasse MobilePhone sind, wird true zurückgegeben
            if (p instanceof MobilePhone) {
                // Wenn ja: Casten des Phone-Objekts in ein MobilePhone-Objekt, um auf die Methoden der Klasse MobilePhone zugreifen zu können
                // Casten ist eine Umwandlung eines Objekts in ein anderes Objekt. In diesem Fall wird das Phone-Objekt in ein MobilePhone-Objekt umgewandelt
                // Casten ist nur möglich, wenn das Objekt auch wirklich von der Klasse ist, in die es gecastet werden soll, daher die vorherige Überprüfung. Ansonten gibt es eine Exception und das Programm stürzt ab
                MobilePhone m = (MobilePhone) p;
                // Überprüfen, ob das Brand-Attribut des MobilePhone-Objekts "SAMSUNG" ist
                // Da Brand ein Enum ist, wird die equals-Methode verwendet, um die Gleichheit zu überprüfen und es muss mit dem Enum-Wert verglichen werden. Ein Vergleich mit einem String würde nicht funktionieren und ein Vergleich mit == würde auch nicht funktionieren
                if (m.brand().equals(Brand.SAMSUNG)) {
                    // Wenn ja: Hinzufügen des MobilePhone-Objekts zur mobilePhonesFromSamsung-Liste
                    mobilePhonesFromSamsung.add(m);
                }
            }
        }
        // Rückgabe der mobilePhonesFromSamsung-Liste
        return mobilePhonesFromSamsung;
    }
}