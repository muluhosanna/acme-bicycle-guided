package com.acme.model;

public class LeatherSeatOption extends AbstractBikeOption{
    public LeatherSeatOption(BikeInterface bike){super(bike);}

    @Override
    public float getOptionAmount() {
        return 89.99f;
    }

    @Override
    public String getOptionType() {
        return "Leather Seat Upgrade";
    }

    @Override
    public float getPrice(){
        return decoratedBike.getPrice() ;}
}
