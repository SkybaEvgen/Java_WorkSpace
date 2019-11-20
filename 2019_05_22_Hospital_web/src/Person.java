public abstract class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public  int getAge(){
        return 2019 - yearOfBirth;
    }

    @Override
    public String toString() {
        return name +"("+getAge()+" years old)";
    }
}
