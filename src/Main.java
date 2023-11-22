// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AirPurifier f47 = new AirPurifier("Promax","077707",9000);

        // Use the methods to interact with the AirPurifier object
        f47.turnOn();
        f47.PMcheck();
        f47.turnOff();
        f47.PMcheck();
        AirPurifier.totalAir();
        AirPurifier.totalsales();

        AirPurifier f48 = new AirPurifier("Pro", "0888088", 1000);
        f48.turnOn();
        f48.PMcheck();
        f48.turnOff();
        f48.PMcheck();
        // Accessing class methods
        AirPurifier.totalAir();
        AirPurifier.totalsales();
    }
}