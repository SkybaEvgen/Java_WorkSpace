public class Animal implements Comparable<Animal>{

    private String name;
    private int weight;
    private String color;

    public Animal (String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.weight-o.weight;
    }
}
