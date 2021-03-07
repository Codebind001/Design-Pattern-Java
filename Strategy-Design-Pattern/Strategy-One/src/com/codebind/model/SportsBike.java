package com.codebind.model;

import com.codebind.controller.ScoreAlgorithmBase;

public class SportsBike extends ScoreAlgorithmBase{

    @Override
    public int calculateScore(int gears, int accelerator) {
        return (gears+accelerator)*5;
    }
}
