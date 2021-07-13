package com.acme.model;

public abstract class AbstractBike implements BikeInterface {
    private WheelInterface wheel;
    private BikeColor color;

    protected String serialNumber;
    protected AbstractBike(WheelInterface wheel, BikeColor color){
        this.wheel = wheel;
        this.color = color;
    }

    public WheelInterface getWheel(){
        return wheel;

    }
    public void setSerialNumber(String serial){
        serialNumber = serial;}
    public String getSerialNumber(){
        return serialNumber;
        }
public BikeColor getColor(){return color;}
   public abstract float getPrice();
  public abstract   int getStartNumber();
   public abstract String getModel();
    public  abstract String getStyle();
    public void paint(BikeColor color){ this.color = color; }
    @Override
    public void airTires(){
        System.out.println("We air our bike tires to a consistent 32 psi.");
        System.out.println("We test each tire prior to sale for proper pressuer.");
    }
    @Override
    public void washFrame(){
        System.out.println("We wash our bike frames with non-abrasive detergent.");
        System.out.println("We rinse and dry our bike frames for a prestine shine.");
    }
    @Override
    public void testRide(){
        System.out.println("we test ride our bicycles to ensure a proper ride.");
    }
    // used for testing the objects during creation
    @Override
    public String toString(){
        return getClass().getSimpleName() + " with " + wheel + ","+
                color + " color frame at " + getPrice();
    }// VintageBike with NormalWheel at 25 inches, RED color frame at $299.99
}
