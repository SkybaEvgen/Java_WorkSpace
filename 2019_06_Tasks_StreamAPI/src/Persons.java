public class Persons {
    public static class Person{
        String name;
        int age;
        Address address;

        public Person(String name, int age, Address address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Address getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "name " + name + ", age " + age + ", address " + address;
        }


    }

    public static class Address{
        private String street;
        private int houseNumber;

        public Address(String street, int houseNumber) {
            this.street = street;
            this.houseNumber = houseNumber;
        }

        public String getStreet() {
            return street;
        }

        public int getHouseNumber() {
            return houseNumber;
        }

        @Override
        public String toString() {
            return "street " + street + ", houseNumber " + houseNumber;
        }
    }

    public static class BankAccount{
        private String IBANN;
        private Person owner;

        public BankAccount(String IBANN, Person owner) {
            this.IBANN = IBANN;
            this.owner = owner;
        }

        public String getIBANN() {
            return IBANN;
        }

        public Person getOwner() {
            return owner;
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "IBANN='" + IBANN + '\'' +
                    ", owner=" + owner +
                    '}';
        }
    }


}
