package com.codebind.oi.model;

public class PizzaBurg {
    String name;
    String sauce;
    String buns;

    public void prepare(){
        System.out.println("Preparing.. "+name);
        System.out.println("Adding sauce.. "+sauce);
        System.out.println("Adding buns.. "+buns);

    }
    public void cook(){
        System.out.println("Cooking...");
    }
    public void box(){
        System.out.println("Boxing...");
    }
    public String getName(){
        return name;
    }
}
