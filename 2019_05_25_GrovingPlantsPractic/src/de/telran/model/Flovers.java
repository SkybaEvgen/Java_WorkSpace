package de.telran.model;

public class Flovers extends Plant {
    private static int GROW_PRE_SEASON = 10;

    public Flovers(String name, int height) {
        super(name, height);
    }

    @Override
    public int getGrowPerSeason() {
        return GROW_PRE_SEASON;
    }

    @Override
    protected void doSummer() {
        System.out.println("Plant " + getName() + " height " +getHeight() + "(not qrowing in Summer)");
    }

    @Override
    protected void doFall() {
        setHeight(0);
        System.out.println("Plant " + getName() + " height " + getHeight() + " (down to zero)");
    }

}
