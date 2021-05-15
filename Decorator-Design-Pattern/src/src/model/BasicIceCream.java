package model;

import repository.Icecream;

public class BasicIceCream implements Icecream {

    //empty constructor
    public BasicIceCream(){

    }

    @Override
    public double cost() {
        return 15;
    }
}
