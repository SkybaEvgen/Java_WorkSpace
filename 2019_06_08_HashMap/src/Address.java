public final class Address {
    public final String adress;
    public final int number;

    public Address(String adress, int number) {
        this.adress = adress;
        this.number = number;

    }
    @Override
    public String toString() {
        return "Address{" +
                "adress='" + adress + '\'' +
                ", number=" + number +
                '}';
    }
}
