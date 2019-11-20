import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private Consolidated_weather consolidated_weather;

    public Weather(Consolidated_weather consolidated_weather) {
        this.consolidated_weather = consolidated_weather;
    }

    public Weather() {

    }

    public void setConsolidated_weather(Consolidated_weather consolidated_weather) {
        this.consolidated_weather = consolidated_weather;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "consolidated_weather=" + consolidated_weather +
                '}';
    }
}

