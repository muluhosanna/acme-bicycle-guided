package com.acme.model;

public class WhiteTireOption extends AbstractBikeOption{
    public WhiteTireOption(BikeInterface bike){super(bike);

    }

    @Override
    public String getOptionType() {
        return "White Tire Upgrade";
    }

    @Override
    public float getOptionAmount() {
        return 19.99f;
    }

    @Override
    public float getPrice(){
        return decoratedBike.getPrice() + 19.99f;
    }


}
