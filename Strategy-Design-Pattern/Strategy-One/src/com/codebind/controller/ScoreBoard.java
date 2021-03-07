package com.codebind.controller;

public class ScoreBoard {

    public ScoreAlgorithmBase algorithmBase;

    public void showScore(int gears, int accelerator){
        System.out.println(algorithmBase.calculateScore(gears, accelerator));
    }
}
