package model;

import repository.IceCreamDecorator;
import repository.Icecream;

public class ChocolateFlavor extends IceCreamDecorator {

    public ChocolateFlavor(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        System.out.println("Chocolate Ice-cream price BDT: ");
        return 20+super.cost();
    }
}
