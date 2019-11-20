package de.telran.model;

public class Tree extends Plant {
    private static int GROW_PRE_SEASON = 2;

    public Tree(String name, int height) {
        super(name, height);
    }

    @Override
    public int getGrowPerSeason() {
        return GROW_PRE_SEASON;
    }

    @Override
    protected void doSummer() {
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println("Plant " + getName() + " height " + getHeight());
    }

    @Override
    protected void doFall() {
        System.out.println("Plant " + getName() + " height " +getHeight() + "(not qrowing in Fall)");

    }

}
