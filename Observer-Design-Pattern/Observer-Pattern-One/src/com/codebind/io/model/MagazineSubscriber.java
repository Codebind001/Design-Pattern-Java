package com.codebind.io.model;

import com.codebind.io.repository.Observer;
import com.codebind.io.repository.Subject;

public class MagazineSubscriber implements Observer {

    private String name;

    private Subject subject;

    public MagazineSubscriber(String message) {
        name = message;
    }

    @Override
    public void update() {

        String msg = (String)subject.getUpdate(this);
        if(msg==null)
            System.out.println(name + " No new update on Magazine!");
        else
            System.out.println(name + " Retrieving message: "+msg);

    }

    @Override
    public void setSubject(Subject subject) {
        this.subject=subject;
    }
}
