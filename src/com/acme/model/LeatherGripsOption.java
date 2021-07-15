package com.acme.model;

public class LeatherGripsOption extends AbstractBikeOption{
    public LeatherGripsOption(BikeInterface bike){super(bike);}

    @Override
    public String getOptionType() {
        return "Leather Grips Upgrade";
    }

    @Override
    public float getOptionAmount() {
        return 29.99f;
    }

    @Override
    public float getPrice(){
        return decoratedBike.getPrice() + 29.99f;
    }
}
