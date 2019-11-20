import java.util.Arrays;
import java.util.Comparator;

public class CarsMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2015, 15000);
        Car car2 = new Car("Ford", 2010, 25000);
        Car car3 = new Car("Chevrolet", 1998, 6500);
        Car car4 = new Car("BMW", 2018, 33000);
        Car car5 = new Car("Porsche", 2019, 90000);
        Car car6 = new Car("Chevrolet", 1998, 6000);
        Car[] cars = {car1, car2, car3, car4, car5, car6};

        Arrays.sort(cars);

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("-------------------------------------------");
        Comparator<Car> comp = new ComparatorByModel();
        Arrays.sort(cars, comp.thenComparing(new ComparatorByPrice()));

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println("-------------------------------------------");

        Arrays.sort(cars, new ComparatorByPrice());

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
