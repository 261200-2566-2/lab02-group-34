// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public class AirPurifier{
//        instance variables
        String model;
        String serialNo;
        Double PMscore;
        Double Pricemodel;
        boolean Airworking;
//        instance methods
        void turnOn() { Airworking = true; System.out.println("AirPurifier" + serialNo + "is turn on");}
        void turnOff() { Airworking = false; System.out.println("AirPurifier" + serialNo + "is turn off");}
        void PMcheck(){System.out.println("PM 2.5 is " + PMscore);}
//        class variables
        static int total;
        static double totalprice;
//        class methods
        static void totalAir(){ System.out.println("Total  AirPurifier is " + total); }
        static void totalsales(){System.out.println("Total sales of AirPurifier is " + totalprice);}
        AirPurifier(String model,
                    String serialNo,double price) {
            this.model = model;
            this.serialNo = serialNo;
            this.Pricemodel = price;
            this.PMscore = 0.0;
            this.Airworking = false;
            totalprice += price;
            total++;
        }
        AirPurifier(String model, String serialNo) {
            this(model, serialNo, 2600.0); // Use the other constructor with a default price
        }

        AirPurifier(String serialNo) {
            this("Pro", serialNo, 2600.0); // Use the other constructor with a default model and price
        }
    }

    public static void main(String[] args) {
       AirPurifier f47 = new AirPurifier("Promax","077707",9000);

    }
}