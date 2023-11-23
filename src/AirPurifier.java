public class AirPurifier {
//    instance variables : model, serialNo, PMscore, Pricemodel, Airworking
    String model; // AirPurifier model name
    String serialNo; //AirPurifier's serialNo
    Double PMscore; //PM 2.5 value
    Double Pricemodel;// AirPurifier model price
    boolean Airworking;//AirPurifier working status

    //        instance methods: turnOn, turnoff, PMcheck
    void turnOn() { Airworking = true; System.out.println("AirPurifier " + serialNo + " is turn on");}
    // turn on AirPurifier
    void turnOff() { Airworking = false; System.out.println("AirPurifier " + serialNo + " is turn off");}
    // turn off AirPurifier
    void PMcheck(){
        System.out.println( (Airworking ? "PM 2.5 is " + PMscore : "Air purifier is turned off" ) );
    } //Check PM 2.5 value

    //        class variables: total, totalprice
    static int total; //Total number of air purifiers
    static double totalprice; //Total amount of air purifiers sold
    //        class methods: totalAir, totalsales
    static void totalAir(){ System.out.println("Total  AirPurifier is " + total); }
    // Show Total number of air purifiers
    static void totalsales(){System.out.println("Total sales of AirPurifier is " + totalprice);}
    // Show Total amount of air purifiers sold
    AirPurifier(String model,
                String serialNo,double price) {
        this.model = model;
        this.serialNo = serialNo;
        this.Pricemodel = price;
        this.PMscore = 0.0;
        this.Airworking = false;
        totalprice += price;
        total++;
        System.out.println("AirPurifier model " + model + " serialNo " + serialNo + " price " + price);
    }
    AirPurifier(String model, String serialNo) {
        this(model, serialNo, 2600.0); // Use the other constructor with a default price
    }
    AirPurifier(String serialNo) {
        this("Pro", serialNo, 2600.0); // Use the other constructor with a default model and price
    }
}
