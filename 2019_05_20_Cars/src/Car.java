public class Car implements Comparable<Car> {

    private String model;
    private int year;
    private double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Car arg){
        return (this.year - arg.year);
    }

    @Override
    public String toString() {
        return "Car: model - " + model + ", year - " + year + ", price - " + price;
    }
}
