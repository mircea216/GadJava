package com.company.threads.game;

import java.util.Objects;

public class Main {

    private static final String SCISSORS = "scissors";
    private static final String PAPER = "paper";
    private static final String ROCK = "rock";

    public static void main(String[] args) {
        Player player1 = new Player();
        player1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Player player2 = new Player();
        player2.start();
        try {
            player1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            player2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Objects.equals(player1.getMove(), player2.getMove())) {
            System.out.println("Retry no winner!");
        } else if ((player1.getMove().equals(SCISSORS) && player2.getMove().equals(PAPER)) ||
                (player1.getMove().equals(PAPER) && player2.getMove().equals(ROCK)) ||
                (player1.getMove().equals(ROCK) && player2.getMove().equals(SCISSORS))) {
            System.out.println("The winner is player 1");
        } else if ((player2.getMove().equals(SCISSORS) && player1.getMove().equals(PAPER)) ||
                (player2.getMove().equals(PAPER) && player1.getMove().equals(ROCK)) ||
                (player2.getMove().equals(ROCK) && player1.getMove().equals(SCISSORS))) {
            System.out.println("The winner is player 2");
        }
    }
}
