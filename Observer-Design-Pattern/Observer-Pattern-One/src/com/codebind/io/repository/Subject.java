package com.codebind.io.repository;

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObservers();

    Object getUpdate(Observer observer);
}
