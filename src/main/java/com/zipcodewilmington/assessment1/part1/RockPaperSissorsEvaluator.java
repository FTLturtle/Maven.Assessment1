package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    @SuppressWarnings("Duplicates")
    public String getWinningMove(String handSign) {
        String result = "invalid input";
        switch (handSign) {
            case ROCK:
                result = PAPER;
                break;
            case PAPER:
                result = SCISSOR;
                break;
            case SCISSOR:
                result = ROCK;
        }
        return result;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    @SuppressWarnings("Duplicates")
    public String getLosingMove(String handSign) {
        String result = "invalid input";
        switch (handSign) {
            case ROCK:
                result = SCISSOR;
                break;
            case PAPER:
                result = ROCK;
                break;
            case SCISSOR:
                result = PAPER;
        }
        return result;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String winningHand = "tie";
        if (handSignOfPlayer1.equals(getWinningMove(handSignOfPlayer2))) {
            winningHand = handSignOfPlayer1;
        } else if (handSignOfPlayer1.equals(getLosingMove(handSignOfPlayer2))) {
            winningHand = handSignOfPlayer2;
        }
        return winningHand;
    }
}
