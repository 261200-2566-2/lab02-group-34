// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Use the methods to interact with the AirPurifier object
        AirPurifier f47 = new AirPurifier("Promax","077707",9000);
        f47.turnOn();
        f47.PMcheck();
        f47.turnOff();
        f47.PMcheck();
        AirPurifier.totalAir();
        AirPurifier.totalsales();
        System.out.println();

        AirPurifier f48 = new AirPurifier("Pro", "0888088");
        f48.turnOn();
        f48.PMcheck();
        f48.turnOff();
        f48.PMcheck();
        // Accessing class methods
        AirPurifier.totalAir();
        AirPurifier.totalsales();
        System.out.println();

        AirPurifier f49 = new AirPurifier("0888088");
        f49.turnOn();
        f49.PMcheck();
        f49.turnOff();
        f49.PMcheck();
        // Accessing class methods
        AirPurifier.totalAir();
        AirPurifier.totalsales();
    }
}