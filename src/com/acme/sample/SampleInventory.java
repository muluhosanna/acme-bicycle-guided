package com.acme.sample;
import com.acme.model.*;

import java.util.ArrayList;

/*
*Creating a sample inventory for each of the
* Bicycle .This includes the serial number.
 */
public class SampleInventory {
    private ArrayList<TouringBike> touringList;
    private ArrayList<VintageBike> vintageList;
    private ArrayList<CrossCountryBike> crossCountryList;
    private ArrayList<DownhillBike> downHillList;
    private SerialNumberGenerator generator;
    public SampleInventory(){
        generator = SerialNumberGenerator.getInstance();
        // will use this constructor to build the inventory;
        touringList = buildTouringInventory(new ArrayList<>());
        vintageList = buildVintageInventory(new ArrayList<>());
        crossCountryList = buildCrossCountryInventory(new ArrayList<>());
        downHillList = buildDownhillInventory(new ArrayList<>());
    }


    public ArrayList<TouringBike> getTouringList(){
        return touringList;
    }
    public ArrayList<VintageBike> getVintageList(){
        return vintageList;
    }
    public ArrayList<CrossCountryBike> getCrossCountryList(){
        return crossCountryList;
    }
    public ArrayList<DownhillBike> getDownHillList(){
        return downHillList;
    }
    public ArrayList<TouringBike> buildTouringInventory(ArrayList<TouringBike> bikeList) {
        TouringBike bike = new TouringBike(new NormalWheel());
        generator. setModelAndStart(bike.getModel(), bike.getStartNumber());
        for (int i = 0; i <= 10; i++) {
            bike = new TouringBike(new NormalWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }
    public ArrayList<VintageBike> buildVintageInventory(ArrayList<VintageBike>bikeList){
        VintageBike bike = new VintageBike(new NormalWheel());
        generator.setModelAndStart(bike.getModel(),bike.getStartNumber());
        for (int i = 0; i <= 10; i++){
            bike = new VintageBike(new NormalWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i,bike);
        }
        return bikeList;

    }
    public ArrayList<CrossCountryBike> buildCrossCountryInventory
            (ArrayList<CrossCountryBike> bikeList1){
        CrossCountryBike bike = new CrossCountryBike(new WideWheel());
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());

        for(int i = 0; i <= 10; i++) {
            bike = new CrossCountryBike(new WideWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList1.add(i, bike);
        }
        return bikeList1;
    }
    public ArrayList<DownhillBike> buildDownhillInventory
            (ArrayList<DownhillBike> bikeList) {
        DownhillBike bike = new DownhillBike(new WideWheel());
        generator.setModelAndStart(bike.getModel(), bike.getStartNumber());
        for(int i = 0; i <= 10; i++) {
            bike = new DownhillBike(new WideWheel());
            bike.setSerialNumber(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }

}
