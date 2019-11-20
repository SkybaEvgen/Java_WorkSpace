import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
      /*
        Animal animal1 = new Animal("elephant", 6000, "gray");
        Animal animal2 = new Animal("giraffe", 800, "yellow");
        Animal animal3 = new Animal("lion", 190, "brown");
        Animal animal4 = new Animal("rhinoceros", 2300, "gray brown");
        Animal animal5 = new Animal("crocodile", 300, "green");
        Animal animal6 = new Animal("zebra", 400, "black white");
        Animal animal7 = new Animal("bear", 500, "brown");
        Animal[] animals = {animal1, animal2, animal3, animal4, animal5, animal6, animal7};
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by name~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(animals, new ComparatorByName());
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by color~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(animals, new ComparatorByColor());
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by weight~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(animals, new ComparatorByWeight().reversed());
        for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i]);
        }
*/
        Person per1 = new Person("Mik");
        Person per2 = new Person("Tom");
        Person per3 = new Person("Bob");
        Pet pet1 = new Pet("dog", 50, "black", per1);
        Pet pet2 = new Pet("cat", 2, "white", per1);
        Pet pet3 = new Pet("turtle", 4, "green", per2);
        Pet pet4 = new Pet("horse", 350, "brown", per3);
        Pet[] pets = {pet1, pet2, pet3, pet4};
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by name~~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(pets, new ComparatorByName());
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by color~~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(pets, new ComparatorByColor());
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by weight~~~~~~~~~~~~~~~~~~~");
        Arrays.sort(pets, new ComparatorByWeight().reversed());
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~by person~~~~~~~~~~~~~~~~~~~");
        Comparator comp = new ComparatorByPerson();
        Arrays.sort(pets, comp);
        for (int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }
    }
}
