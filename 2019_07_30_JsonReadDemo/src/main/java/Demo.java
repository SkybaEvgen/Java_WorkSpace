import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

        Person person = mapper.readValue(new File("person.json"), Person.class);

        System.out.println(person);

        //Прочитать массив Person2
        Person[] person2 = mapper.readValue(new File("person2.json"), Person[].class);
        System.out.println(Arrays.asList(person2));


    }
}
