import de.telran.tracker.gateway.UserGateway;
import de.telran.tracker.model.Token;
import de.telran.tracker.model.User;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserGatewayTest {

    @Test
    public void testRegisterOk() {
        User user = new User("Ivan",
                "Ivanov",
                "test",
                "ivan",
                "test");

        UserGateway gateway = new UserGateway();
        boolean register = gateway.register(user);
        assertTrue("successfully registered", register);
    }

    @Test
    public void testLoginOk(){

        User user = new User("Ivan",
                "Ivanov",
                "test",
                "ivan",
                "test");

        UserGateway gateway = new UserGateway();
        Token token = gateway.login(user);

        System.out.println(token);

    }

}
