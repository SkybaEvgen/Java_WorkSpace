package telran;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class KeyboardGuess implements GuessSource {
    Scanner scanner = new Scanner(System.in);
    @Override
    public int guess() {
        return scanner.nextInt();
    }
}
