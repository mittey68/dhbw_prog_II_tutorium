package klausur.aufgabe5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("Termin 1\\src\\klausur\\aufgabe5\\phones.txt");
        List<Phone> phones = Phones.getAllPhones(file);
        List<MobilePhone> mobilePhonesFromSamsung = Phones.getMobilePhonesFromSamsung(file);

        System.out.println("All phones:");
        for (Phone p : phones) {
            System.out.println(p.brand() + " " + p.description());
        }

        System.out.println("\nMobile phones from Samsung:");
        for (MobilePhone m : mobilePhonesFromSamsung) {
            System.out.println(m.brand() + " " + m.description());
        }
    }
}
