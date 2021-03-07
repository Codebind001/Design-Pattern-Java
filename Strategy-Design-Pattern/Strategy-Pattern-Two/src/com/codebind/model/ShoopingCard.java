package com.codebind.model;

import com.codebind.repository.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShoopingCard {
    List<Product> productList;

    public ShoopingCard() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public int calculateTotal(){
        int sum = 0;
        for (Product product : productList){
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
