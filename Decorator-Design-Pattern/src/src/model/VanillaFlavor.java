package model;

import repository.IceCreamDecorator;
import repository.Icecream;

public class VanillaFlavor extends IceCreamDecorator {
    public VanillaFlavor(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        System.out.println("Vanilla Ice-cream price BDT: ");
        return 18+super.cost();
    }
}
