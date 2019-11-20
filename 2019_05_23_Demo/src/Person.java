public abstract class Person {
    // byte, int,     long, double, float, char,      boolean
    // Byte, Integer, Long, Double, Float, Character, Boolean

    int age;
    private String name;


    public Person(){
    }

    public void speak(){
        System.out.println("Person " + name);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
