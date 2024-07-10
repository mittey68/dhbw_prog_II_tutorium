package uebungsaufgaben.tiefgarage;

public class ParkingGarage {
    private final ParkingSpot[] parkingSpots;

    public ParkingGarage(int numberOfParkingSpots) {
        parkingSpots = new ParkingSpot[numberOfParkingSpots];
    }

    /*
     * Die Methode String parkIn(car: Car, parkingSpotNumber: int) soll das
     * eingehende Fahrzeug dem Parkplatz mit der eingehenden Parkplatznummer
     * zuweisen und eine enstprechende Erfolgsmeldung zurückgegeben. Für den Fall,
     * dass der Parkplatz bereits besetzt ist, oder dass es sich bei dem eingehenden
     * Fahrzeug um ein Auto handelt, der Parkplatz aber nur für Busse ist, oder dass
     * der Parkplatz zu klein ist, soll eine entsprechende Fehlermeldung
     * zurückgegeben werden
     */
    public String parkIn(Vehicle vehicle, int number) {
        /*
         * Überprüfen, ob der Parkplatz der eingehenden Parkplatznummer bereits belegt
         * ist. Belegt wäre, wenn er ungleich null ist, also irgend ein Vehicle-Objekt
         * enthält.
         */
        if (parkingSpots[number].vehicle() != null) {
            return "Dieser Parkplatz ist bereits besetzt";
        }

        /*
         * Überprüfen, ob der Parkplatz nur für Busse ist und das eingehende Fahrzeug
         * ein Auto ist. instanceof ist ein Operator, der überprüft, ob ein Objekt einer
         * bestimmten Klasse angehört. Für alle Objekte, die von der Klasse Car sind,
         * wird true zurückgegeben.
         */
        if (parkingSpots[number].isForBusesOnly() && vehicle instanceof Car) {
            return "Dieser Parkplatz ist nur fuer Busse";
        }

        /*
         * Überprüfen, ob das Fahrzeug zu groß für den Parkplatz ist. Sowoohl die Länge
         * als auch die Höhe des Fahrzeugs müssen kleiner oder gleich der Länge und Höhe
         * des Parkplatzes sein.
         */
        if (parkingSpots[number].lengthInM() <= vehicle.lengthInM()
                || parkingSpots[number].heightInM() <= vehicle.heightInM()) {
            return "Dieser Parkplatz ist zu klein";
        }

        /*
         * Wenn alle Überprüfungen erfolgreich waren, wird das Fahrzeug auf dem
         * Parkplatz geparkt. Da return die Methode beendet, wird der Code nur bis
         * hierhin ausgeführt, wenn die Methode nicht durch ein vorheriges return
         * beendet wurde, also wenn kein if-Block zutrifft.
         */
        parkingSpots[number].setVehicle(vehicle);
        return "Fahrzeug erfolgreich eingeparkt";
    }

    /*
     * Die Methode String parkOut(car: Car) soll das eingehende Fahrzeug "ausparken"
     * und eine enstsprechende Erfolgsmeldung zurückgeben. Für den Fall, dass das
     * Fahrzeug in der Tiefgarage nicht vorhanden ist, soll eine entsprechende
     * Fehlermeldung zurückgegeben werden
     */
    public String parkOut(Vehicle vehicle) {
        // Durchlaufen aller Parkplätze
        for (int i = 0; i < parkingSpots.length; i++) {
            /*
             * Nutzung einer Hilfsvariablen tmp, um den Code übersichtlicher zu gestalten.
             * Es wäre auch möglich, das tmp in der Zeile darunter durch
             * parkingSpots[i].vehicle() zu ersetzen.
             */
            Vehicle tmp = parkingSpots[i].vehicle();
            // Überprufung ob das Fahrzeug auf dem tmp-Parkplatz steht
            if (tmp.equals(vehicle)) {
                /*
                 * Wenn ja, wird das Fahrzeug aus der Variable in der Parkplatzliste auf null
                 * gesetzt, also "ausgeparkt".
                 */
                parkingSpots[i].setVehicle(null);
                return "Fahrzeug erfolgreich ausgeparkt";
            }
        }
        /*
         * Wenn das Fahrzeug nicht gefunden wurde, also die komplette Schleife
         * durchgelaufen ist, ohne, dass der if-Block einmal zugetroffen hat, wird eine
         * Fehlermeldung zurückgegeben.
         */
        return "Fahrzeug konnte nicht gefunden werden";
    }

    /*
     * Die Methode int getNextFreeParkingSpotNumber() soll die Nummer des nächsten
     * freien Parkplatzes zurückgeben.
     */
    public int getNextFreeParkingSpotNumber() {
        // Durchlaufen aller Parkplätze der parkingSpots-Liste
        for (int i = 0; i < parkingSpots.length; i++) {
            // Überprüfen, ob der Parkplatz gleich null ist, also kein Fahrzeug enthält
            if (parkingSpots[i].vehicle() == null) {
                /*
                 * Wenn ja, wird die Nummer des Parkplatzes zurückgegeben. Die Zählvariable i
                 * ist immer die Nummer des aktuellen Parkplatzes.
                 */
                return i;
            }
        }
        /*
         * Wenn kein freier Parkplatz gefunden wurde, wird -1 zurückgegeben. -1 ist ein
         * Wert, der in der Liste nicht vorkommen kann, da die Nummern der Parkplätze
         * bei 0 beginnen.
         */
        return -1;
    }
}
