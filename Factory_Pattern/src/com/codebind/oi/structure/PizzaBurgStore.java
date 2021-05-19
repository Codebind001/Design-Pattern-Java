package com.codebind.oi.structure;

import com.codebind.oi.model.PizzaBurg;

public abstract class PizzaBurgStore {

    public PizzaBurg orderPizzaBurg(String type){
        PizzaBurg pizza;

        // here, we used factory! not the if statement.
        pizza = cratePizzaBurg(type);
        pizza.prepare();
        pizza.cook();
        pizza.box();

        return pizza;
    }
    abstract public PizzaBurg cratePizzaBurg(String type);
}
