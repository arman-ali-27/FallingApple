package com.pluralsight.fruit;

public class Pear implements IFruit {

    private static final String NAME = "Banana";
    private static final int ROLL_MULTIPLIER = 5;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getRollMultiplier() {
        return ROLL_MULTIPLIER;
    }
}
