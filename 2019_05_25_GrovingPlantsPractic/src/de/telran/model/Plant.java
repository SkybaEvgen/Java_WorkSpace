package de.telran.model;

public abstract class Plant {
    private String name;
    private int height;

    public Plant(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public abstract int getGrowPerSeason();

    public void doYear(){
        doSpring();
        doSummer();
        doFall();
        doWinter();
    }

    protected void doSpring(){
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println("Plant " + getName() + " height " + getHeight());
    }
    protected abstract void doSummer();
    protected abstract void doFall();

    protected void doWinter(){
        System.out.println("Plant " + getName() + " height " +getHeight() + "(not qrowing in Winter)");
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
