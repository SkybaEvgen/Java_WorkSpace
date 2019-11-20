import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import telran.GuessNumberGame;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        GuessNumberGame game = context.getBean("game", GuessNumberGame.class);

        game.play();
    }


}