// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public class AirPurifier{
        String model;
        String serialNo;
        Double PMscore;
        boolean Airworking;
        void turnOn() { Airworking = true; System.out.println("AirPurifier" + serialNo + "is turn on");}
        void turnOff() { Airworking = false; System.out.println("AirPurifier" + serialNo + "is turn off");}
        void PMcheck(){System.out.println("PM 2.5 is " + PMscore);}
        static int total;
        static void totalAir(){ System.out.println("Total  AirPurifier is" + total); }
        AirPurifier(String model,
                    String serialNo) {
            this.model = model;
            this.serialNo = serialNo;
            total++;
        }
        AirPurifier(String serialNo) {
            model = "Pro";
            this.serialNo = serialNo;
            total++;
        }
    }

    public static void main(String[] args) {


    }
}