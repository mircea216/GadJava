package com.company.threads.game;

import java.util.List;
import java.util.Random;

public class Player extends Thread {
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private final String move;

    public Player() {
        List<String> moves = List.of(ROCK, PAPER, SCISSORS);
        Random random = new Random();
        this.move = moves.get(random.nextInt(moves.size()));
    }

    public String getMove() {
        return move;
    }

    @Override
    public void run() {
        System.out.println("Move: " + move);
    }
}
