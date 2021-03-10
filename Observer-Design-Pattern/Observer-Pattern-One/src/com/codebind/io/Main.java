package com.codebind.io;

import com.codebind.io.model.MagazineSubscriber;
import com.codebind.io.model.OnlineMagazine;
import com.codebind.io.repository.Observer;

public class Main {

    public static void main(String[] args) {
        OnlineMagazine magazine = new OnlineMagazine();

        //create Observer
        Observer firstObserver = new MagazineSubscriber("FirstObserver");
        Observer secondObserver = new MagazineSubscriber("SecondObserver");
        Observer thirdObserver = new MagazineSubscriber("ThirdObserver");

        //register them
        magazine.register(firstObserver);
        magazine.register(secondObserver);
        magazine.register(thirdObserver);

        //Attaching observer to subject
        firstObserver.setSubject(magazine);
        secondObserver.setSubject(magazine);
        thirdObserver.setSubject(magazine);

        //check for updates
        firstObserver.update();

        //Provider /Subject (Broadcaster)
        magazine.postMessage("Hello Subscribers !");

        magazine.unRegister(firstObserver);

        magazine.postMessage("Hello Subscribers !");

    }
}
