package uebungsaufgaben.exceptions01;

public class Main {
    public static void main(String[] args) {
        TravelAgency travelAgency = new TravelAgency("Reisebuero Schmidt");
        Rental rental = new Rental("Fahrzeugvermietung Mueller");
        travelAgency.addPartner(rental);

        Car car1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
        Truck truck1 = new Truck("MAN", "TGX", Engine.DIESEL, 20);
        Car car2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

        rental.addVehicle(car1);
        rental.addVehicle(truck1);
        rental.addVehicle(car2);

        /*
         * Try-Catch-Block, um die InvalidValueException abzufangen. Try Catch ist das
         * Pendant zu Throw. Während Throw den Fehler beim Auftreten einfach nur an die
         * eins höhere Insanz weiterreicht, fängt der try catch Block sie ab und
         * bestimmt, was passieren soll, falls die Exception auftritt. Das wird im
         * Catch-Block programmiert. Throw wäre in der Main-Methode nicht möglich, da es
         * keine höhere Instanz als diese gibt. Der Try Catch Block ist auch zwingend
         * notwendig, da die Methode accelerate eine InvalidValueException wirft. Man
         * kann Exceptions in Java nicht einfach "ignorieren", sondern muss sie entweder
         * abfangen oder weiterreichen.
         */
        try {
            car1.accelerate(50);
            truck1.accelerate(30);
            car2.accelerate(-20);
            car1.brake(5);
        } catch (InvalidValueException e) {
            System.out.println("Ungueltiger Wert: der eingehende Wert muss groesser als Null sein");
        }

        travelAgency.toString();
    }
}
