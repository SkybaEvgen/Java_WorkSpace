public class Tree extends Plant {
    private static int GROWSOWERSEASON = 2;

    public Tree(int age, int height, int grouthRate, String displayName) {
        super(age, height, grouthRate, displayName);
    }

    public int getGROWSOWERSEASON() {
        return GROWSOWERSEASON;
    }

    @Override
    public void doSummer() {
        setHeight(getHeight() + getGROWSOWERSEASON());
        System.out.println(getName() + " летом вырос до " + getHeight() + " см");
    }

    @Override
    public void doFall() {
        System.out.println(getName() + " не растет весной. Высота остаётся прежней " + getHeight());
    }
}
