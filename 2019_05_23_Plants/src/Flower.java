public class Flower extends Plant {
    private static int GROWSOWERSEASON = 10;

    public Flower(int age, int height, int grouthRate, String displayName) {
        super(age, height, grouthRate, displayName);
    }

    public int getGROWSOWERSEASON() {
        return GROWSOWERSEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName() + " не растет летом. Высота остаётся прежней " + getHeight());
    }

    @Override
    public void doFall() {
        setHeight(0);
        System.out.println(getName() + " срезали. Высота теперь составляет " + getHeight());

    }
}
