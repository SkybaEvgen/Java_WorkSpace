import gateway.UserGateway;
import org.junit.jupiter.api.Test;
import tracker.User;

import static junit.framework.TestCase.assertTrue;

public class UserGatewayTest {
    @Test
    public void testRegisterOk(){
        User user = new User ("Ivan",
                "Ivanov",
                "test",
                "ivan",
                "test");
        UserGateway gateway = new UserGateway();
        boolean register = gateway.register(user);
        assertTrue("successfully registered", register);
    }
}
