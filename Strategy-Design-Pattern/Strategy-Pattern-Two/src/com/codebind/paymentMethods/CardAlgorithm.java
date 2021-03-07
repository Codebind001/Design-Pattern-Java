package com.codebind.paymentMethods;

import com.codebind.repository.Payment;

public class CardAlgorithm implements Payment {

    private String cardNumber;
    private int pin;

    public CardAlgorithm(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with card");
    }
}
