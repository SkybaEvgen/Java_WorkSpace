public class Pet extends Animal {
    Person person;

    public Pet(String name, int weight, String color, Person person) {
        super(name, weight, color);
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Pet name - " + getName() + " weight - " + getWeight() +
                " color - " + getColor() + " owner is - " + person.getName();
    }

}

