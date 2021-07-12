package com.acme.model;

public class SampleOutput {
    public static void main(String[] args){
        //testingModel();
        //testingSerialNumberGen();
        //testingCustomOption();
        testingCustomOption2();
    }
    public static void testingCustomOption2(){
       BikeInterface ccBike = new CrossCountryBike(new WideWheel());
       System.out.println(ccBike);
       ccBike = new WhiteTireOption(ccBike);
       System.out.println(ccBike);
       ccBike = new GoldFrameOption(ccBike);
       System.out.println(ccBike);
    }
    public static void testingCustomOption(){
        BikeInterface touring = new TouringBike(new NormalWheel());
        System.out.println(touring);
        touring = new LeatherSeatOption(touring);

        System.out.println(touring);
        //ensure the frame color does not change
        //AbstractBikeOption is set to CHROME
        //touring.paint(BikeColor.BLUE);

        System.out.println(touring.getModel() + " good");//testing other methods
        touring = new LeatherGripsOption(touring);
        System.out.println(touring);
        //Todo May need to add a method for original price for receipt print out
    }
    /*
     * SerialNumberGenerator work as expected. For us to use these changing
     * serial numbers, our inventory could created using a HashMap
     * HashMap takes a key-value-pair. key would be the serial number value would
     * be the object instance of the bike.
     * */
    public static void testingSerialNumberGen(){
        DownhillBike bike = new DownhillBike(new WideWheel());
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance(bike.getModel(), bike.getStartNumber());
        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());
      /* SerialNumberGenerator myGen =
                SerialNumberGenerator.getInstance(bike.getModel(), generator.getRecentNumber());
        System.out.println("Next serial is " + myGen.getNextSerial());
        System.out.println("Next serial is " + myGen.getNextSerial());
        System.out.println("Next serial is " + myGen.getNextSerial());*/

       // myGen.testObject();
    }
    public static void testingModel(){
        VintageBike myBike = new VintageBike(new NormalWheel());
        System.out.println(myBike.getModel());
        System.out.println(myBike.getStartNumber());
    }
}
