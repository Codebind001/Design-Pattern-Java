package com.codebind.io.repository;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
