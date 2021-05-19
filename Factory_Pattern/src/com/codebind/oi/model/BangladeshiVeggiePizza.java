package com.codebind.oi.model;

public class BangladeshiVeggiePizza extends PizzaBurg{

    public BangladeshiVeggiePizza(){
        name = "Bangladeshi Style Veggie Pizza";
        sauce = "Spicy bangladeshi sauce";
        buns = "Lettuce wrap";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Bangladeshi style...");
    }
}
