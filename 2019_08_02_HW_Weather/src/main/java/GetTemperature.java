import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class GetTemperature {
    public static void main(String[] args) throws Exception {
        readTemperature();
    }

    public static void readTemperature() throws Exception {
        URL url = new URL("https://www.metaweather.com/api/location/638242");
        try (InputStream inputStream = url.openStream();
             FileOutputStream outputStream = new FileOutputStream("weather.json")) {
            int in = 0;
            byte[] buf = new byte[1024];
            while ((in = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, in);
            }
        }
        ObjectMapper mapper = new ObjectMapper();

        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
//        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        Weather[] weather = mapper.readValue(new File("weather.json"), Weather[].class);

        System.out.println(Arrays.asList(weather));
    }
}
