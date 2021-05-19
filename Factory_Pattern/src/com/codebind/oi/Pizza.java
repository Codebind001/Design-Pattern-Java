package com.codebind.oi;

import com.codebind.oi.model.BangliPizzaBurgStore;
import com.codebind.oi.model.CheesePizza;
import com.codebind.oi.model.PizzaBurg;
import com.codebind.oi.structure.PizzaBurgStore;

public class Pizza {
    public static void main(String[] args) {
        CheesePizza cheesePizza = new CheesePizza();

        PizzaBurgStore bangladeshiPizzaStore = new BangliPizzaBurgStore();

        PizzaBurg pizzaBurg = bangladeshiPizzaStore.orderPizzaBurg("cheese");
        System.out.println("James Bond ordered: "+pizzaBurg.getName());
    }
}
