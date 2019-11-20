import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Consolidated_weather {
    private int the_temp;

    public Consolidated_weather(int the_temp) {
        this.the_temp = the_temp;
    }

    public Consolidated_weather() {
    }

    public void setThe_temp(int the_temp) {
        this.the_temp = the_temp;
    }

    @Override
    public String toString() {
        return "Consolidated_weather{" +
                "the_temp=" + the_temp +
                '}';
    }
}

