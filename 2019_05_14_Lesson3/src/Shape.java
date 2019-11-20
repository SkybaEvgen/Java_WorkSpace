public abstract class Shape {
    private String name;

    public Shape (String name){
        this.name = name;
    }

    public abstract double calculateShape();

    public String getName(){
        return name;
    }
}
