package de.telran;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GameConfig {

    @Bean
    public ResultOutput getOutput(){
        return new ConsoleOutput();
    }

    @Bean
//    @Scope("prototype")
    public GuessSource getSourse(){
        return new KeyboardGuess();
    }

    @Bean
    public GuessNumberGame getGame(GuessSource source, ResultOutput output){
        return new GuessNumberGame(source, output);
    }
}
