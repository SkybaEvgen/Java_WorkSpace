package de.telran;

import org.springframework.stereotype.Component;

import java.util.Scanner;

public class KeyboardGuess implements GuessSource {
    private int couter = 0;

    Scanner scanner = new Scanner(System.in);
    @Override
    public int guess() {
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Hello from KeyboardGuess" + ++couter;
    }
}