public abstract class Plant {

    private int age;
    private int height;
    private int grouthRate;             // коэффициент роста в см
    private String Name;                // название растения

    public Plant(int age, int height, int grouthRate, String displayName) {
        this.age = age;
        this.height = height;
        this.grouthRate = grouthRate;
        this.Name = displayName;
    }

    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getGrouthRate() {
        return grouthRate;
    }
    public String getName() {
        return Name;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void growInSeasons(){
        doSpring();
        doSummer();
        doFall();
        doWinter();
    }

    private void doSpring(){
        this.age ++;
        setHeight(getHeight() + getGROWSOWERSEASON());
        System.out.println(getName() + " весной вырос до " + getHeight() + " см");
    }
    protected abstract void doSummer();
    protected abstract void doFall();

    private void doWinter(){
        System.out.println(getName() + " не растет зимой. Высота остаётся прежней " + getHeight());
    }

    public abstract int getGROWSOWERSEASON() ;

}
