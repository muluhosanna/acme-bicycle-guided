package com.acme.model;

public class GoldFrameOption extends AbstractBikeOption{
    public GoldFrameOption(BikeInterface bike){super(bike,BikeColor.GOLD);}
    @Override
    public float getPrice(){
       // decoratedBike.paint(BikeColor.GOLD);
        return decoratedBike.getPrice() + 149.99f;
    }
}
