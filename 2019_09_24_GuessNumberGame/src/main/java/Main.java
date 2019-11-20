import de.telran.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        GuessSource getSource1 = context.getBean("getSource", GuessSource.class);
        System.out.println(getSource1);
        GuessSource getSource2 = context.getBean("getSource", GuessSource.class);
        System.out.println(getSource2);
        GuessSource getSource3 = context.getBean("getSource", GuessSource.class);
        System.out.println(getSource3);


        /*String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String s : beanDefinitionNames){
            System.out.println(s);
        }

        GuessNumberGame game = context.getBean("getGame", GuessNumberGame.class);

        game.play();*/
    }


}