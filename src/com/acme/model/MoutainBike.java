package com.acme.model;

public abstract class MoutainBike extends AbstractBike{
    protected MoutainBike(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    }
    @Override
    public String getStyle(){
        return "Mountain Bike";
    }
}
