package game;

import game.io.ConsoleGameInput;
import game.io.GameInput;
import game.io.GameOutput;


public class GameApp {
    public static void main(String[] args) {
        GameInput input = new ConsoleGameInput();
        GameOutput output = s -> System.out.println(s.toUpperCase());
        GuessNumberGame game = new GuessNumberGame(input, output, 5,3);
        game.play();
    }
}
