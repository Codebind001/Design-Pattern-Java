package com.codebind.oi.model;

public class BangladeshiCheesePizza extends PizzaBurg{

    public BangladeshiCheesePizza(){
        name = "Bangladeshi Style Cheese Pizza";
        sauce = "Spicy bangladeshi sauce";
        buns = "Cookie dough buns";
    }

    @Override
    public void cook() {
        System.out.println("Cooking Bangladeshi style...");
    }
}
