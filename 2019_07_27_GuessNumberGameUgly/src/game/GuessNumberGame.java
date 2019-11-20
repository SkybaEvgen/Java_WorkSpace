package game;

import game.io.GameInput;
import game.io.GameOutput;

public class GuessNumberGame {
    private GameInput input;
    private GameOutput output;
    private int secret;
    private int attempts;

    public GuessNumberGame(GameInput input,
                           GameOutput output,
                           int secret,
                           int attempts) {
        this.input = input;
        this.output = output;
        this.secret = secret;
        this.attempts = attempts;
    }
    public void play(){
        boolean guess = tryToGues();
        showGameOver(guess);
    }

    public boolean tryToGues(){
        output.print("Игра началась! У Вас есть 3 попытки. Введите число от 1 до 10");

        boolean guessedCorrectly = false;
        int attempts = 3;

        while (attempts > 0 && !guessedCorrectly) {
            int num = input.getNextNumber();
            if (num != secret) {
                attempts--;
                output.print("Вы не угадали. Попыток осталось: " + attempts);
            } else {
                guessedCorrectly = true;
            }
        }
        return guessedCorrectly;
    }

    private void showGameOver(boolean guessedCorrectly){
        if(guessedCorrectly){
            output.print("Вы выиграли");
        }else {
            output.print("Вы проиграли");
        }
    }
}
