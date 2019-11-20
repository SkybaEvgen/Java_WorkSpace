import de.telran.tracker.gateway.WeatherGateway;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeatherGatewayTest {

    @Test
    public void tesGetWoeid() {
        WeatherGateway gateway = new WeatherGateway();

        String berlin = gateway.findWoeid("Berlin");

        assertEquals("638242", berlin);
    }
}
