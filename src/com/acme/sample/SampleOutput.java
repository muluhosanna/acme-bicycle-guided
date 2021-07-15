package com.acme.sample;

import com.acme.model.*;
import java.util.ArrayList;
public class SampleOutput {
    public static void main(String[] args){
        //testingModel();
        //testingSerialNumberGen();
        //testingCustomOption();
        //testingCustomOption2();
       // testPrepForSale();
       // testInventory();
        testList();
    }
    public static void testList(){
        ArrayList<BikeInterface> bike = new ArrayList<>();
        SampleInventory inventory = new SampleInventory();
        bike.add(inventory.getTouringList().get(0));
        bike.add(inventory.getCrossCountryList().get(3));

        SampleReceipt test = new SampleReceipt(bike);
    }
    public static void testInventory() {
        SampleInventory inventory = new SampleInventory();
        for(TouringBike bike : inventory.getTouringList()) {
            System.out.println(bike.getSerialNumber());
        }
        System.out.println("");
        for(VintageBike bike2 : inventory.getVintageList()) {
            System.out.println(bike2.getSerialNumber());
        }
        System.out.println("");
        for(CrossCountryBike bike3 : inventory.getCrossCountryList()) {
            System.out.println(bike3.getSerialNumber());
        }
        System.out.println("");
        for(DownhillBike bike4 : inventory.getDownHillList()) {
            System.out.println(bike4.getSerialNumber());
        }


    }

    public static void testPrepForSale(){
        BikeFacade myFacade = new BikeFacade();
        myFacade.prepareForSale(new VintageBike(new NormalWheel()));
    }
    public static void testingCustomOption2(){
       BikeInterface ccBike = new CrossCountryBike(new WideWheel());
       System.out.println(ccBike);
       //a+=b which is a= a+b
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
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        generator.setModelAndStart(bike.getModel(),bike.getStartNumber());
        bike.setSerialNumber(generator.getNextSerial());

        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("Next serial is " + generator.getNextSerial());
        System.out.println("My bike serial number is "+bike.getSerialNumber());


       SerialNumberGenerator myGen = SerialNumberGenerator.getInstance();
       generator.setModelAndStart(bike.getModel(),generator.getRecentNumber());
        System.out.println("Next serial is " + myGen.getNextSerial());
        System.out.println("Next serial is " + myGen.getNextSerial());
        System.out.println("Next serial is " + myGen.getNextSerial());

       // myGen.testObject();
    }
    public static void testingModel(){
        VintageBike myBike = new VintageBike(new NormalWheel());
        System.out.println(myBike.getModel());
        System.out.println(myBike.getStartNumber());
    }
}
