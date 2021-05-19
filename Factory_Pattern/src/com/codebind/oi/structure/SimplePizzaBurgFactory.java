package com.codebind.oi.structure;

import com.codebind.oi.model.BunLessPizza;
import com.codebind.oi.model.CheesePizza;
import com.codebind.oi.model.PizzaBurg;
import com.codebind.oi.model.VeggiePizza;

public class SimplePizzaBurgFactory {

    public PizzaBurg orderPizzaBurg(String type){
        PizzaBurg pizza = null;
        // add types of pizza
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        else if(type.equals("bunLess")){
            pizza = new BunLessPizza();
        }
        return pizza;
    }
}
