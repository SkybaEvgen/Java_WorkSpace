package de.telran;

import org.springframework.stereotype.Component;

public class ConsoleOutput implements ResultOutput {

    @Override
    public void output(String result) {
        System.out.println(result);
    }
}