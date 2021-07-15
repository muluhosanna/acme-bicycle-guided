package com.acme.model;

public abstract class MountainBike extends AbstractBike{
    protected MountainBike(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    }
    public final String getOptionType(){return null;};
    public final float getOptionAmount(){return 0;};
    @Override
    public String getStyle(){
        return "Mountain Bike";
    }
}
