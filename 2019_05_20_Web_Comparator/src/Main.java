import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("animal1we", 10, "black");
        Animal a2 = new Animal("animal2df", 8, "red");
        Animal a3 = new Animal("animal3bv", 19, "white");
        Animal a4 = new Animal("animal4jk", 3, "blue");

        Animal[] animals = {a1, a2, a3, a4, new Animal("animal5", 13, "red")};

        printArray(animals);
        Arrays.sort(animals);
        printArray(animals);
        Arrays.sort(animals, new ComparatorByName().reversed());
        printArray(animals);
        Arrays.sort(animals, new ComparatorByLastName());
        printArray(animals);

    }
    public static void printArray(Animal[] animals){
        for(Animal a:animals){
            System.out.println(a);
        }
        System.out.println("-------------------------------------");
    }


}
