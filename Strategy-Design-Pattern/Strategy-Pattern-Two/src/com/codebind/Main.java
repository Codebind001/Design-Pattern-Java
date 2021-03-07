package com.codebind;

import com.codebind.model.Product;
import com.codebind.model.ShoopingCard;
import com.codebind.paymentMethods.CardAlgorithm;
import com.codebind.paymentMethods.PaypalAlgorithm;

public class Main {

    public static void main(String[] args) {

        ShoopingCard shoopingCard = new ShoopingCard();

        Product pants = new Product("pt679",30);
        Product shirt = new Product("sht472", 27);

        shoopingCard.addProduct(pants);
        shoopingCard.addProduct(shirt);

        //payment decisions
        shoopingCard.pay(new PaypalAlgorithm("codebind@progammer.com", "areyoukidding!"));

        shoopingCard.pay(new CardAlgorithm("87649345767",8439));
    }
}
