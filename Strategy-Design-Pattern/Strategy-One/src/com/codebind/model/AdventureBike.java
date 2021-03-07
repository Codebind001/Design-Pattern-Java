package com.codebind.model;

import com.codebind.controller.ScoreAlgorithmBase;

public class AdventureBike extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int gears, int accelerator) {
        return (gears+accelerator)*3;
    }
}
