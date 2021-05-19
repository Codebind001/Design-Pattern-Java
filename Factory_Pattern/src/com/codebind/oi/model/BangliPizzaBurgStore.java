package com.codebind.oi.model;

import com.codebind.oi.structure.PizzaBurgStore;

public class BangliPizzaBurgStore extends PizzaBurgStore {
    @Override
    public PizzaBurg cratePizzaBurg(String type) {

        if(type.equals("cheese")){
            return new BangladeshiCheesePizza();
        }
        else if(type.equals("veggie")){
            return new BangladeshiVeggiePizza();
        }
        else return null;
    }
}
