package gateway;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import tracker.User;

public class UserGateway {

    RestTemplate rest = new RestTemplate();
    public boolean register(User user){
        String userRegisterURL = "http://localhost:8080/user/register";

        System.out.println(user);

        HttpEntity<User> entity = new HttpEntity<User>(user);

        ResponseEntity<Void> response = rest.exchange(userRegisterURL,
               HttpMethod.POST,
               entity,
               Void.class);

        System.out.println(response.getStatusCode());

        return response.getStatusCode() == HttpStatus.OK;
    }
}
