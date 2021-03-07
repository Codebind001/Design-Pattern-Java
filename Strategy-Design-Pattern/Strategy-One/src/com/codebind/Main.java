package com.codebind;

import com.codebind.controller.ScoreBoard;
import com.codebind.model.AdventureBike;
import com.codebind.model.Scooter;
import com.codebind.model.SportsBike;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ScoreBoard scoreBoard = new ScoreBoard();

        System.out.print("Sports Bike Speed: ");
        scoreBoard.algorithmBase = new SportsBike();
        scoreBoard.showScore(6,120);

        System.out.print("Adventure Bike Speed: ");
        scoreBoard.algorithmBase = new AdventureBike();
        scoreBoard.showScore(4,55);

        System.out.print("Scooter Speed: ");
        scoreBoard.algorithmBase = new Scooter();
        scoreBoard.showScore(3,35);
    }
}
