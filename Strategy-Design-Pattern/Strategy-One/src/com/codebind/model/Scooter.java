package com.codebind.model;

import com.codebind.controller.ScoreAlgorithmBase;

public class Scooter extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int gears, int accelerator) {
        return (gears+accelerator)*2;
    }
}
