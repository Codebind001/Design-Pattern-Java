package com.codebind.io.model;

import com.codebind.io.repository.Observer;
import com.codebind.io.repository.Subject;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OnlineMagazine implements Subject {

    private List<Observer> observers;
    String message;

    public OnlineMagazine() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if(observer==null) throw new NullPointerException("Null Object/Observer");

        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }
    public void postMessage(String msg){
        System.out.println("Message posted to my magazine : "+msg);
        this.message = msg;
        notifyObservers();
    }
}
